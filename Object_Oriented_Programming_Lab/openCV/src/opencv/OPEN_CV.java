/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;



import static org.bytedeco.javacpp.opencv_core.IPL_DEPTH_8U;
import org.bytedeco.javacpp.opencv_core.IplImage;
import static org.bytedeco.javacpp.opencv_highgui.cvLoadImage;
import static org.bytedeco.javacpp.opencv_imgproc.CV_BGR2GRAY;
import static org.bytedeco.javacpp.opencv_imgproc.cvCvtColor;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.OpenCVFrameGrabber;

/**
 *
 * @author Gulam Kibria
 */
public class OPEN_CV {
    
    public OPEN_CV(){
        OpenCVFrameGrabber grabber=new OpenCVFrameGrabber(0);
        try{
            grabber.start();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        CanvasFrame cf=new CanvasFrame("my Image Viewer");
        cf.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);
        while(true){
            try{
                IplImage src= grabber.grab();
                //IplImage gray=IplImage.create(src.width(),src.height(),IPL_DEPTH_8U,1);
                //cvCvtColor(src,gray,CV_BGR2GRAY);
                cf.showImage(src);
            } catch(Exception ex){
                ex.printStackTrace();
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         OPEN_CV h =new OPEN_CV();
//        IplImage img=cvLoadImage("C:\\Users\\Gulam Kibria\\Pictures\\computer-programming-jokes-2.jpg");
//        CanvasFrame cf= new CanvasFrame("My Image viewer");
//        cf.showImage(img);
//        cf.setVisible(true);
    }
    
}