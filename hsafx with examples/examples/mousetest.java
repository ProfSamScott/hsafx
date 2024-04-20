package examples;

import hsafx.Console;

/**
 * Test of mouse input routines.
 *
 * @author Sam Scott
 */
public class mousetest extends hsafx.ConsoleView {

    @Override
    public void run() {
        // You can tweak the numbers and text on the line below. They are:
        //      width, height, font size for println, title
        c = new Console(600, 300, 12, "HSA FX Console Template", this);

        // ================= Your Code Starts Here
        c.autoRefreshOff();
        while (true) {
            c.clear();
            c.setFill("black");
            c.println(c.getMouseX() + " " + c.getMouseY());
            c.println(c.getMouseClick());
            c.println(c.getMouseButton(0) + " " + c.getMouseButton(1) + " " + c.getMouseButton(2));
            c.println(c.getMouseDX() + " " + c.getMouseDY());
            if (c.getMouseDX() != 0 || c.getMouseDY() != 0) {
                double left = c.getMouseX() - c.getMouseDX();
                double right = c.getMouseX();
                double top = c.getMouseY() - c.getMouseDY();
                double bottom = c.getMouseY();
                if (left > right) {
                    double temp = left;
                    left = right;
                    right = temp;
                }
                if (top > bottom) {
                    double temp = top;
                    top = bottom;
                    bottom = temp;
                }
                c.strokeRect(left, top, right - left + 1, bottom - top + 1);
            }
            if (c.getMouseButton(0)) {
                c.setFill("darkred");
                c.fillStar(c.getMouseX() - 10, c.getMouseY() - 10, 21, 21);
            } else {
                c.setStroke("darkred");
                c.strokeStar(c.getMouseX() - 10, c.getMouseY() - 10, 21, 21);
            }
            c.refresh();
            c.sleep(30);
        }
        // ================= Your Code Ends Here
    }
    
    Console c;
    public static void main(String[] args) {
        launch(args);
    }
}
