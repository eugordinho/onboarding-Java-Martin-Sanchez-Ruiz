package day_2;

import day_3.*;

import java.util.*;

public class Person {
    private String firstName, lastName, identityCard;
    private int age;
    private double height;
    private boolean isMarried;
    private Set<Pet> petNames = new HashSet<>();


    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.isMarried = isMarried;
    }

    public void addPet(Pet pet){
        pet.setOwner( this.firstName );
        this.petNames.add( pet );
    }
    public void presentation() {
        System.out.println( this.firstName + "'s presentation: \nHi! My name is " + this.firstName + " "+this.lastName +
                "\nI am " + this.age +" years old and my height is " + this.height);
        if ( isMarried ) System.out.println( "I am married");
        else System.out.println( "i am not married" );

        System.out.println( "My DNI is " + this.identityCard );

        if ( petNames.isEmpty() ) System.out.println( "I am not a pet owner.");
        else if ( petNames.size() > 1) {
            System.out.println( "My pets' names are:" );
            for (Pet pet : petNames) {
                System.out.println( " -" + pet.getName() + " is a " + pet.getType() + " and he is " + pet.getAge() + " years old.");
            }
        } else System.out.println( "My " + petNames.iterator().next().getType() +"'s name is " + petNames.iterator().next().getName() + " and he is " +
                petNames.iterator().next().getAge() + " years old");


    }
}
