package kz.aitu.oop.endtermProject;

import kz.aitu.oop.endtermProject.Main;
import kz.aitu.oop.endtermProject.GUI;

public class LoginChecker {
    static String algorithm(String log1, String log2) {
        if (log1.equals(log2)) {
            return "the great success!";
        }
        return Main.log + " not = " + GUI.GetUserLogin();
    }
}
