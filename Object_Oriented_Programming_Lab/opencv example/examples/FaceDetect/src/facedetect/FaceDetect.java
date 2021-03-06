package facedetect;


import static org.bytedeco.javacpp.helper.opencv_objdetect.cvHaarDetectObjects;
import static org.bytedeco.javacpp.opencv_core.CV_AA;
import org.bytedeco.javacpp.opencv_core.CvMemStorage;
import org.bytedeco.javacpp.opencv_core.CvRect;
import org.bytedeco.javacpp.opencv_core.CvScalar;
import org.bytedeco.javacpp.opencv_core.CvSeq;
import static org.bytedeco.javacpp.opencv_core.IPL_DEPTH_8U;
import org.bytedeco.javacpp.opencv_core.IplImage;
import static org.bytedeco.javacpp.opencv_core.cvClearMemStorage;
import static org.bytedeco.javacpp.opencv_core.cvGetSeqElem;
import static org.bytedeco.javacpp.opencv_core.cvLoad;
import static org.bytedeco.javacpp.opencv_core.cvPoint;
import static org.bytedeco.javacpp.opencv_core.cvRectangle;
import static org.bytedeco.javacpp.opencv_highgui.cvLoadImage;
import static org.bytedeco.javacpp.opencv_imgproc.CV_BGR2GRAY;
import static org.bytedeco.javacpp.opencv_imgproc.cvCvtColor;
import static org.bytedeco.javacpp.opencv_imgproc.cvEqualizeHist;
import org.bytedeco.javacpp.opencv_objdetect.CvHaarClassifierCascade;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;

public class FaceDetect {
    
    
    public FaceDetect() {

       fc1();
       // fc2();
    }

    /*
     * Capture from camera and detect face
     */
    private void fc2() {
        CanvasFrame frame = new CanvasFrame("Face Detector");
        frame.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);
        frame.setLocation(200, 0);


        //create camera object.
        FrameGrabber grabber = new OpenCVFrameGrabber(0);
        //start camera
        try {
            grabber.start();
        } catch (Exception ex) {
            System.out.println("No Camera");
            return;
        }


        //prepare the face detection tools.
        String face_classifier = "haarcascade_frontalface_alt.xml";
        CvHaarClassifierCascade face_cascade = new CvHaarClassifierCascade(cvLoad(face_classifier));  //detector needs classifier
        CvMemStorage storage = CvMemStorage.create();
        
        IplImage image = null;
        try {
            while ((image = grabber.grab()) != null)  {     //detect face and indicate with a rectangle

                //make a gray image.
                IplImage grayImage = IplImage.create(image.width(), image.height(), IPL_DEPTH_8U, 1);     //create grayscale image 
                cvCvtColor(image, grayImage, CV_BGR2GRAY);        //convert to gray scale image

                //sharp
                cvEqualizeHist(grayImage, grayImage);            //equalize the small gray scale

                //detect face
                CvSeq faces = cvHaarDetectObjects(grayImage, face_cascade, storage, 1.1, 1, 0);  //face detection

                //mark the faces
                for (int i = 0; i < faces.total(); i++) {
                    CvRect r = new CvRect(cvGetSeqElem(faces, i));                           //make rectangle
                    cvRectangle(image, cvPoint(r.x(), r.y()), cvPoint((r.x() + r.width()), (r.y() + r.height())), CvScalar.RED, 1, CV_AA, 0);
                }

                frame.showImage(image);
                cvClearMemStorage(storage);
            }
        } catch (Exception ex) {
        }
        //release the resources
        try {
            grabber.stop();
            storage.release();
        } catch (Exception ex) {
        }
        frame.dispose();
    }

    /*
     * Load an image and detect face
     */
    private void fc1() {
        //first load an image
        IplImage img = cvLoadImage("rr.jpg");


        //make blank gray image, gray image has 1 channel
        IplImage gray = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, 1);

        //now convert to gray iamge
        cvCvtColor(img, gray, CV_BGR2GRAY);

        //make the image sharp
        cvEqualizeHist(gray, gray);

        //now image is preprocessed for applying face detection.


        //prepare the face detection tools.
        String face_classifier = "haarcascade_frontalface_alt.xml";
        CvHaarClassifierCascade face_cascade = new CvHaarClassifierCascade(cvLoad(face_classifier));  //detector needs classifier
        CvMemStorage storage = CvMemStorage.create();

        //detect the face
        CvSeq faces = cvHaarDetectObjects(gray, face_cascade, storage, 1.1, 1, 0);  //face detection


        //now mark the faces on the original images.
        for (int i = 0; i < faces.total(); i++) {
            CvRect r = new CvRect(cvGetSeqElem(faces, i));                           //make rectangle
            cvRectangle(img, cvPoint(r.x(), r.y()), cvPoint((r.x() + r.width()), (r.y() + r.height())), CvScalar.RED, 1, CV_AA, 0);
        }

        //donw, lets show the result.

        CanvasFrame canvas = new CanvasFrame("MyImage");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);
        canvas.showImage(img);

    }

    public static void main(String[] args) throws Exception {
        FaceDetect faceDetect = new FaceDetect();
    }
}
