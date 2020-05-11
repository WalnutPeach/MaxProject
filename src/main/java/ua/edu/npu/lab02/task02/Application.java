package ua.edu.npu.lab02.task02;

public class Application {
    public static void main(String[] args) {
        Dog First = new Dog("Alex", 3);
        Dog Second = new Dog("Mike", 5);
        First.voice();
        Second.voice();
    }
}
