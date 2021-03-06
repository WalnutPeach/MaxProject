package ua.edu.npu.lab03.Task;

public class Fish extends Pet implements Swimming {
    @Override
    public String getType() {
        return "Fish";
    }

    public Fish(String owner, String name, int age) {
        super(owner, name, age);
    }

    public void swim() {
        System.out.println("Fish swim");
    }
}
