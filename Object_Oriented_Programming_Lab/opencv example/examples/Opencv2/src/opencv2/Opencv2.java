package opencv2;

import com.googlecode.javacv.cpp.opencv_objdetect;
import com.googlecode.javacpp.Loader;
import com.googlecode.javacv.CanvasFrame;

import static com.googlecode.javacv.cpp.opencv_core.*;
import static com.googlecode.javacv.cpp.opencv_objdetect.*;
import static com.googlecode.javacv.cpp.opencv_imgproc.*;
import static com.googlecode.javacv.cpp.opencv_highgui.*;

/*
 * Example code for Practice_1
 */
public class Opencv2 {

    public Opencv2() {
//        doShow();
//        rgbToGray();
//        rgbToHSV();
//        doMedian();

//        doGaussian();
//        doResize();
//        doCrop();
//        doHist();
//        doTh1();
//        doTh2();
        doMorph();

    }

    private void doShow() {
        //first load an image
        IplImage img = cvLoadImage("r.jpg");

//now create a canvasframe object to display image, //note: canvasframe is similar as Jframe

        CanvasFrame canvas = new CanvasFrame("My Image");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);

//now show the image.
        canvas.showImage(img);

    }

    private void rgbToGray() {
        //First load an image.
        IplImage img = cvLoadImage("r.jpg");

//make blank gray image, gray image has 1 channel
        IplImage gray = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, 1);

//now convert to gray iamge
        cvCvtColor(img, gray, CV_BGR2GRAY);

//now gray hold the gray image of img object.
//You can show it
        CanvasFrame canvas = new CanvasFrame("My Image");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);

        canvas.showImage(gray);
    }

    private void rgbToHSV() {
        //First load an image.
        IplImage img = cvLoadImage("r.jpg");

//make a blank color image, hsv is color image, so 3 //channel
        IplImage hsv = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, 3);

//Now convert to HSV image.
        cvCvtColor(img, hsv, CV_BGR2HSV);

//now hsv hold the HSV converted image of img object.
//You can show it
        CanvasFrame canvas = new CanvasFrame("My Image");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);

        canvas.showImage(hsv);

    }

    private void doMedian() {
        IplImage img = cvLoadImage("r.jpg");

//make blank image of same type as original
        IplImage dst = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, img.nChannels());

//now do the filtering.
        cvSmooth(img, dst, CV_MEDIAN, 5);

//now dst holds the filtered image.
//lets show it.
        CanvasFrame canvas = new CanvasFrame("My Image");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);
        canvas.showImage(dst);

    }

    private void doGaussian() {
        IplImage img = cvLoadImage("r.jpg");

//make blank image of same type as original
        IplImage dst = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, img.nChannels());

//now do the filtering.
        cvSmooth(img, dst, CV_GAUSSIAN, 5);

//now dst holds the filtered image.
//lets show it.
        CanvasFrame canvas = new CanvasFrame("My Image");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);
        canvas.showImage(dst);
    }

    private void doResize() {
        IplImage src = cvLoadImage("r.jpg");

        int newWidth = 100;
        int newHeight = 110;

        IplImage dst = IplImage.create(newWidth, newHeight, src.depth(), src.nChannels());
        cvResize(src, dst);


        CanvasFrame canvas = new CanvasFrame("MyImage");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);
        canvas.showImage(dst);
    }

    private void doCrop() {


        IplImage src = cvLoadImage("r.jpg");

        int upperLeftX = 80;
        int upperLeftY = 40;
        int downRightX = 190;
        int downRightY = 160;

        int width = downRightX - upperLeftX;
        int height = downRightY - upperLeftY;

        CvRect r = new CvRect(upperLeftX, upperLeftY, width, height);//After setting ROI (Region-Of-Interest) all processing will only be done on the ROI



        cvSetImageROI(src, r);      //set region of interest
        IplImage dst = cvCreateImage(cvGetSize(src), src.depth(), src.nChannels());

        cvCopy(src, dst);//Copy original image (only ROI) to the cropped image

        cvResetImageROI(src);       //reset ROI


        CanvasFrame canvas = new CanvasFrame("MyImage");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);
        canvas.showImage(dst);
    }

    private void doHist() {
        IplImage img = cvLoadImage("s.png");

//make a blank gray image
        IplImage gray = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, 1);

//convert to gray iamge
        cvCvtColor(img, gray, CV_BGR2GRAY);

//make a blank gray image to hold the sharpen image
        IplImage sharp = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, 1);

//now do the equalization
        cvEqualizeHist(gray, sharp);

//now sharp holds the sharpen image.
//lets show it.
        CanvasFrame canvas = new CanvasFrame("MyImage");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);
        canvas.showImage(sharp);

    }

    private void doTh1() {
        IplImage img = cvLoadImage("108.jpg");

//make gray image
        IplImage gray = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, 1);

//convert to gray iamge
        cvCvtColor(img, gray, CV_BGR2GRAY);

//create a blank 1 channel image to hold the
// threshold image.
        IplImage th = IplImage.create(gray.width(), gray.height(), IPL_DEPTH_8U, 1);

//now do the threshold.
        cvThreshold(gray, th, 127, 255, CV_THRESH_OTSU);

//now th holds the thresholded image.
//lets show it.
        CanvasFrame canvas = new CanvasFrame("MyImage");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);
        canvas.showImage(th);

    }

    private void doTh2() {
        // color range of red like color
//        int hueLower = 160;
//        int hueUpper= 180;

//        int hueLower = 40;
//        int hueUpper = 90;


        int hueLower = 100;
        int hueUpper = 120;


        IplImage img = cvLoadImage("r.jpg");

//make gray image
        IplImage hsv = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, 3);

//convert to hsv iamge
        cvCvtColor(img, hsv, CV_BGR2HSV);

        //now we can apply do threshold by checking the hue range of red color

        // 8-bit 1- color = monochrome
        IplImage th = IplImage.create(hsv.width(), hsv.height(), 8, 1);
        // cvScalar : ( H , S , V, A)
        cvInRangeS(hsv, cvScalar(hueLower, 100, 100, 0), cvScalar(hueUpper, 255, 255, 0), th);
        cvReleaseImage(hsv);


        //now th holds the thresholded image.
//lets show it.
        CanvasFrame canvas = new CanvasFrame("MyImage");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);
        canvas.showImage(th);

    }

    private void doMorph() {
        CanvasFrame canvas = new CanvasFrame("image");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);

        IplImage img = cvLoadImage("108.jpg");
        cvSmooth(img, img, CV_GAUSSIAN, 3);


        IplImage gray = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, 1);  //make gray image
        cvCvtColor(img, gray, CV_BGR2GRAY);      //convert to gray iamge


        IplImage th = IplImage.create(gray.width(), gray.height(), IPL_DEPTH_8U, 1);
        cvThreshold(gray, th, 127, 255, CV_THRESH_OTSU);

        CanvasFrame canvas2 = new CanvasFrame("th");
        canvas2.showImage(th);

        IplImage dst = IplImage.create(img.width(), img.height(), IPL_DEPTH_8U, 1);  //make gray image


        cvErode(th, dst, null, 5);
        cvDilate(dst, dst, null, 7);

        canvas.showImage(dst);
    }
    
    
    public static void main(String[] args) {
        Opencv2 opencv2 = new Opencv2();
    }
}
