package ua.edu.npu.lab02.task02;

public class Application {
    public static void main(String[] args) {
        Dog first = new Dog("Alex", 3);
        Dog second = new Dog("Mike", 5);
        first.voice();
        second.voice();
    }
}
