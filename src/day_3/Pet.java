package day_3;

import day_2.Person;

public class Pet {
    private String name;
    private PetType type;
    private int age;
    private String owner;

    public Pet(String name, PetType type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public PetType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }
}
