package com.company.java_core.homework14.task1;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Animal> animalSet = new HashSet<>();
        animalSet.add(new Animal("Tiger", 10));
        animalSet.add(new Animal("Rabbit", 4));
        animalSet.add(new Animal("Parrot", 1));
        System.out.println("Not sorted set: ");
        System.out.println(animalSet);

        TreeSet<Animal> tsOfAnimal = new TreeSet<>(new AnimalComparator());

        tsOfAnimal.add(new Animal("Tiger", 10));
        tsOfAnimal.add(new Animal("Rabbit", 4));
        tsOfAnimal.add(new Animal("Parrot", 1));

        System.out.println("Sorted set: ");

        for (Animal animal: tsOfAnimal) {
            System.out.println(animal);
        }
    }
}
