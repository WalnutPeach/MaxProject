package ua.edu.npu.lab02.task04;

public class Dog {
    int age;
    String name = "";
    static int count = 0;

    public static int getCount() {
        return count;
    }

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
        System.out.println("Created dog");
        count++;
    }

    public Dog(){
        name = "Undefined";
        age = 0;
        count++;
        System.out.println("Created dog");
    }

    public void voice () {
        System.out.print(name + ": ");
        for(int i=0; i<age; i++){
            System.out.print("Bark ");
        }
        System.out.println("");
    }
}
