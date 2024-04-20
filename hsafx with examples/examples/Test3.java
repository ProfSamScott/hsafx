package examples;

import hsafx.*;

/**
 * Input test.
 *
 * @author Sam Scott, Mohawk College
 */
public class Test3 extends ConsoleView {

    @Override
    public void run() {
        // You can tweak the numbers and text on the line below. They are:
        //      width, height, font size for println, title
        c = new Console(600, 300, 12, "HSA FX Console Template", this);

        c.print("Enter a double: ");
        double d = c.nextDouble();
        d = d / (d * d);

        c.print(d, 10, 2);
        c.sleep(1000);
        c.quit();
    }

    Console c;
    public static void main(String[] args) {
        launch(args);
    }
}
