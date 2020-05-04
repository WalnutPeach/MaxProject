package ua.edu.npu.lab01.task05;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String MainString;
        System.out.println("Enter your String");
        MainString = input.nextLine();
        Output out = new Output();
        out.DoubleSpace(MainString);
        out.NumberStyle(MainString);
    }
}
