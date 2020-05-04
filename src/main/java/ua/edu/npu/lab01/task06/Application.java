package ua.edu.npu.lab01.task06;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        StringRed Redact = new StringRed();
        System.out.println("Enter String");
        str = input.nextLine();
        Redact.Redact(str);
    }
}
