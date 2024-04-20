import hsafx.*;

// ****************************
// These lines have to be here. Cut and paste them into your code
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
// ****************************

/**
 * This file is an example of how to play a sound in Java. Any sound you want
 * to play should have a .wav or a .mid extension (no mp3 files), and it must 
 * be in the same folder as your java program (but you won't see it in BlueJ). 
 * 
 * Then cut and paste the lines that are marked above and below...
 *
 * The .mid file format is "Midi" format. Midi files play cheezy-sounding synths
 * on your sound card. If you want music in your games, Midi is a great alternative
 * to Wav files, and gives the game a vintage sound. Lots of current songs are 
 * available as Midi files, often for ringtones.
 * 
 * WARNING: Wav files are uncompressed sound. They are VERY LARGE. Midi is often
 * a better choice.
 * 
 * Created September 8, 2008. 
 * Modified September 15, 2009.
 * Converted January 11, 2019
 * 
 * @author Sam Scott
 */
public class SoundExample extends ConsoleView {

    @Override
    public void run() {
        c = new Console(350, 50, 20, "Sound Example", this);

        // FLASHES THE OPENING MESSAGE
        c.setBackground("black");
        c.setFill("white");
        c.clear();

        c.setCursor(1, 1);
        c.println("OK, here comes some music!");
        c.sleep(500);
        c.clear();
        c.sleep(500);

        c.setCursor(1, 1);
        c.println("OK, here comes some music!");
        c.sleep(500);
        c.clear();
        c.sleep(500);

        c.setCursor(1, 1);
        c.println("OK, here comes some music!");
        c.sleep(500);
        c.clear();
        c.sleep(500);

        // *****************************
        // THESE LINES PLAY THE MUSIC. 
        // Cut and paste them into your program, and change "theme.wav"
        // to the sound you want to play. You may also have to change "sounds"
        // to match your folder name.
        MediaPlayer player = new MediaPlayer(new Media("file:///"+System.getProperty("user.dir").replace('\\','/').replaceAll(" ", "%20")+"/"
                    +"theme.wav"));
        player.play();
        // *****************************

        // THE PROGRAM CONTINUES WHILE THE MUSIC PLAYS
        c.sleep(5000);
        c.setCursor(1, 1);
        c.println("Hope you like it!");
        c.sleep(500);
        c.clear();
        c.sleep(500);

        c.setCursor(1, 1);
        c.println("Hope you like it!");
        c.sleep(500);
        c.clear();
        c.sleep(500);

        c.setCursor(1, 1);
        c.println("Hope you like it!");
        c.sleep(500);
        c.clear();
        c.sleep(500);

        c.setCursor(1, 1);
        c.println("Hope you like it!");
        c.sleep(500);
        c.clear();

        c.sleep(4500);

        // ************************
        // Include this line when you want the sound to stop playing. 
        // You can also change stop to pause.
        player.stop();
        // ************************

        c.setCursor(1, 1);
        c.println("Goodbye");

        c.sleep(1000);
        c.close();
    }

    // don't change anything below here
    Console c;
    public static void main(String[] args) {
        launch(args);
    }
}
