package examples;

import hsafx.*;

/**
 * Test of keyboard input routines for animations and games.
 *
 * @author Sam Scott, Mohawk College
 */
public class keytest extends ConsoleView {

    @Override
    public void run() {
        // You can tweak the numbers and text on the line below. They are:
        //      width, height, font size for println, title
        c = new Console(600, 300, 12, "HSA FX Console Template", this);

        // ================= Your Code Starts Here
        c.autoRefreshOff();
        while (true) {
            c.clear();
            c.println(c.getKeyCode() + " " + c.getKeyChar());
            c.println(c.getLastKeyCode() + " " + c.getLastKeyChar());
            if (c.isKeyDown("Shift")) {
                c.println("+SHIFT");
            }
            c.refresh();
            c.sleep(100);
        }

        // ================= Your Code Ends Here
    }

    Console c;
    public static void main(String[] args) {
        launch(args);
    }
}
