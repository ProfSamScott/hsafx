import hsafx.*;

/**
 * This is a template for creating programs using hsafx. Fill in the run method
 * below with your code.
 *
 * @author YOUR NAME
 */
public class ConsoleTemplate extends ConsoleView {

    @Override
    public void run() {
        // You can tweak the numbers and text on the line below. They are:
        //      width, height, font size for println, title
        c = new Console(600, 300, 12, "HSA FX Console Template", this);

        // ================= Your Code Starts Here
        c.println("Hello, World!");

        // ================= Your Code Ends Here
    }

    // don't change anything below here
    Console c;
    public static void main(String[] args) {
        launch(args);
    }
}
