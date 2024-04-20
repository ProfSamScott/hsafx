package examples;

import hsafx.*;

/**
 * Test of print/println system
 *
 * @author Sam Scott, Mohawk College
 */
public class Test extends ConsoleView {

    @Override
    public void run() {
        // You can tweak the numbers and text on the line below. They are:
        //      width, height, font size for println, title
        c = new Console(600, 300, 12, "HSA FX Console Template", this);
        c.setBackground("black");
        c.clear();
        c.setFill("lightyellow");
        c.print("welfjdkslajfdklsjafkldsjfklsdjlk           hi there?");
        c.println("Did this work?");
        String x = c.nextLine();
        c.fillRect(100, 200, 100, 100);
        c.setFill("yellow");
        for (int i = 0; i < 100; i++) {
            c.println(i + " You entered: " + x);
            c.sleep(200);
        }
    }

    Console c;
    public static void main(String[] args) {
        launch(args);
    }
}
