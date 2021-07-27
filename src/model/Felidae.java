package model;

public class Felidae extends Animals {
    public Felidae(int age, String weight) {
        super(age, weight);
    }

    public void meow() {
        System.out.println("Meowing meowing sound");
    }
}
