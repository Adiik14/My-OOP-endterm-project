package kz.aitu.oop.endtermProject;

import java.util.Scanner;

public class Input {
    public static String myReadLnStr() {
        Scanner str = new Scanner(System.in);
        String answer = str.nextLine();
        return answer;
    }
    public static int myReadLnInt() {
        Scanner str = new Scanner(System.in);
        int answer = str.nextInt();
        return answer;
    }
}
