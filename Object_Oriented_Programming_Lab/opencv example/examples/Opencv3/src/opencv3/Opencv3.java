package opencv3;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.FrameGrabber;
import com.googlecode.javacv.OpenCVFrameGrabber;

import static com.googlecode.javacv.cpp.opencv_core.*;

public class Opencv3 {

    public Opencv3() {
//        doCamera1();
        doCamera2();
    }

    void doCamera1() {
        FrameGrabber grabber = null;
        try {
            // create FrameGrabber object using 0th camera
            grabber = new OpenCVFrameGrabber(0);

            //now start the camera
            grabber.start();

        } catch (Exception ex) {
            System.out.println("Camera can't start");
        }

        IplImage img = null;
        try {
            img = grabber.grab();

            //sometimes it happens that first snaped image
            // got black so, it will be safer if we snap a
            // second shot.

            img = grabber.grab();

        } catch (Exception ex) {
            System.out.println("Can't capture image");
        }

        CanvasFrame canvas = new CanvasFrame("My Camera");

//show the image.
        canvas.showImage(img);

        try {
            grabber.stop();

        } catch (Exception ex) {

            System.out.println("Error");
        }




    }

    void doCamera2() {
        FrameGrabber grabber = null;
        try {
            // create FrameGrabber object using 0th camera
            grabber = new OpenCVFrameGrabber(0);

            //now start the camera
            grabber.start();

        } catch (Exception ex) {

            System.out.println("Camera can't start");
        }




//Make a canvasframe to display image
        CanvasFrame canvas = new CanvasFrame("My Image");
        canvas.setDefaultCloseOperation(CanvasFrame.EXIT_ON_CLOSE);

//Now, capture until window is closed and show it.
        while (true) {
            IplImage img = null;
            try {
                //grab current image
                img = grabber.grab();

                //show the image
                canvas.showImage(img);
            } catch (Exception ex) {
                System.out.println("Can't capture");
                break;
            }

        }

//And Finally close it.

        try {
            grabber.stop();

        } catch (Exception ex) {
            System.out.println("Error");
        }

    }

    public static void main(String[] args) {
        Opencv3 obj = new Opencv3();
    }
}
