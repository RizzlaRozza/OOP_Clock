package OOP_Clock;

/**
 * References taken from https://stackoverflow.com/questions/2935232/show-animated-gif
 */

import javax.swing.*;
import java.net.URL;

    // EasterEgg class runs methods that display a gif using it's URL, initialises objects
    public class EasterEgg {
        private JFrame frame;
        private JLabel label;
        private Icon icon;
        private URL url;

        // starts the media + uses properties defined in addWindowProperties()
        public EasterEgg() {
            initGUI();
            addWindowProperties();
        }

        // frame object set to catch errors to prevent program crashing/stopping
        private void initGUI() {
            frame = new JFrame("Travelling through time!!!");

            try {
                // File is also saved locally in case URL removed/changed
                url = new URL("https://thumbs.gfycat.com/BigGraciousBoutu-size_restricted.gif");
            }
            catch (Exception e) { /* IF ERROR: DON'T BOTHER TELLING ME ABOUT IT! */ }

            // create icon using the URL and create label using icon
            icon = new ImageIcon(url);
            label = new JLabel(icon);
        }

        // add properties to the JQuery frame
        private void addWindowProperties() {
            frame.add(label);
            frame.pack();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            // Could also use JFrame.EXIT_ON_CLOSE
        }

        // required to display window
        public void loadApplication() {
            frame.setVisible(true);
        }
    }