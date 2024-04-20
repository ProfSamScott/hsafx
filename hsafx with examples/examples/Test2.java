package examples;

import hsafx.*;

/**
 * Test of animation, etc.
 *
 * @author Sam Scott, Mohawk College
 */
public class Test2 extends ConsoleView {

    @Override
    public void run() {
        // You can tweak the numbers and text on the line below. They are:
        //      width, height, font size for println, title
        c = new Console(600, 300, 12, "HSA FX Console Template", this);

        double x = 0;
        double y = 0;
        double w = Math.random() * 100 + 100;
        double h = Math.random() * 100 + 100;
        c.println("Press any key to go!");
        c.getChar();
        c.setBackground("rgb(255,0,0)");
        c.setFill("rgba(0,255,0,1)");
        c.setFont("Trebuchet", 30);
        c.autoRefreshOff();
        while (true) {
            c.clear();
            c.setLineWidth(20);
            c.setStroke("white");
            c.strokeOval(x, y, w, h);
            c.fillText("HI THERE!", 0, 100);
            c.refresh();
            x += 5;
            c.sleep(1000 / 60);
        }
    }

    Console c;
    public static void main(String[] args) {
        launch(args);
    }
}
