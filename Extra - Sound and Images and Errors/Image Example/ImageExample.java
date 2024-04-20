import hsafx.*;

// You must include this import line to work with images
import javafx.scene.image.Image;

/**
 * Demonstrates how to load and display images in a console application. 
 * May 13, 2008. Modified September 15, 2008, September 23, 2009,
 * October 20, 2010, and January 16, 2019.
 *
 * @author Sam Scott
 **/
public class ImageExample extends ConsoleView {

    @Override
    public void run() {
        c = new Console(600, 550, 12, "Images", this);

        // These lines load two images and name them robotImage1 and robotImage2
        // These image files must be in the same folder as your program
        // (They won't show up in the BlueJ project window)
        Image robotImage1 = new Image("robot.jpg");
        Image robotImage2 = new Image("robot.gif");
        
        // This line displays the jpeg image at top left location 0, 0
        // Note that the image name "jpgImage" is the first parameter
        c.drawImage (robotImage1, 0, 0);

        // These lines draw some more images scaled to 100 by 100 pixels.
        c.drawImage (robotImage1, 400, 0, 100, 100);
        c.drawImage (robotImage2, 400, 100, 100, 100);
        c.drawImage (robotImage1, 400, 200, 100, 100);
        c.drawImage (robotImage2, 400, 300, 100, 100);

        // *************************************
        // THE DRAWIMAGE COMMANDS ARE
        // c.drawImage(image, x, y) OR
        // c.drawImage(image, x, y, width, height)
        // *************************************
    }

    // don't change anything below here
    Console c;
    public static void main(String[] args) {
        launch(args);
    }
}
