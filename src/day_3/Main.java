package day_3;

import day_2.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Martin","Sanchez", "123asd123", 26, 1.78,true);

        Pet pet1 = new Pet("Carlitos", PetType.DOG, 15);
        Pet pet2 = new Pet("Juancito", PetType.CAT, 11);

        person.addPet( pet1 );
        person.addPet( pet2 );

        person.presentation();

    }
}
