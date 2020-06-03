package ua.edu.npu.lab02.task04;

public class Application {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 4);
        Dog dog2 = new Dog();
        System.out.println("Dogs created: " + Dog.getCount());
        Dog dog3 = new Dog("Bob", 2);
        System.out.println("Dogs created:" + Dog.getCount());
    }
}
