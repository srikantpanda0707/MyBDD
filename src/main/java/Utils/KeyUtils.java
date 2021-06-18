package Utils;

import java.awt.*;

public class KeyUtils {

    public boolean pressKey(int key) {
        boolean blKeyPressResult = false;
        try {
            Robot robot = new Robot();
            robot.keyPress(key);
            blKeyPressResult = true;
        } catch (AWTException e) {
            System.out.println("Element nor found " + e);
        }
        return blKeyPressResult;
    }

    public  boolean releaseKey(int key) {
        boolean blKeyPressResult = false;
        try {
            Robot robot = new Robot();
            robot.keyRelease(key);
            blKeyPressResult = true;
        } catch (AWTException e) {
            System.out.println("Element nor found " + e);
        }
        return blKeyPressResult;
    }

}
