package model;

public class Animals {
    private int age;
    private String weight;

    public Animals(int age, String weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println("running");
    }

    public void eat() {
        System.out.println("Eating");
    }
}

