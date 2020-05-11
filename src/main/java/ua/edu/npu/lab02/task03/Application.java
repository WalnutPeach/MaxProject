package ua.edu.npu.lab02.task03;

public class Application {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Jack", 4);
        Dog dog2 = new Dog();
        System.out.println("Name: " + dog1.name + "   Age: " + dog1.age);
        dog1.voice();
        System.out.println("Name: " + dog2.name + "   Age: " + dog2.age);
        dog2.voice();
    }
}
