package ua.edu.npu.lab02.task03;

public class Application {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Jack", 4);
        Dog dog2 = new Dog();
        dog1.showDogData();
        dog1.voice();
        dog2.showDogData();
        dog2.voice();
    }
}
