package org.example;        // Nov 2024

import java.util.ArrayList;

// Main class to test the interface
public class Main {

    public static void main(String[] args) {

        // Because a Dog implements the Animal interface, we can assign
        // a Dog object to a reference of type Animal.
        // (A Dog is also an Animal)

        Animal myDog = new Dog(); // Create a Dog object
        Animal myCat = new Cat();  // Create a Cat object

        // the call to method sound() will call the sound() method that
        // was declared for the class-type of the object.
        // i.e. it depends on the object (it is polymorphic)

        myDog.sound(); // Outputs: Bark
        myCat.sound(); // Outputs: Meow

        // This is useful for creating lists of objects.
        // Note that the code block below depends ONLY on the Animal type
        // even though it can deal with Dog and Cat objects.
        // i.e. the references are all of type Animal.
        // This means that the code below is dependent only on the Animal interface
        // and does not depend on Dog or Cat.  This reduced coupling between components.
        //
        ArrayList<Animal> listOfAnimals  = new ArrayList<>();
        listOfAnimals.add(myDog);
        listOfAnimals.add(myCat);
        for (Animal animal : listOfAnimals) {
            animal.sound();
        }
    }
}

//TODO
// 1. Add a new animal "Duck" class that implements the Animal interface
// 2. Create a new Duck object, and add the duck to the arraylist of animals.
// 3. Run program.  Notice that the loop to print animal sounds can deal with a duck
// because the Duck class has adhered to the contract to make an object an Animal
// (.ie. Duck has implemented the Animal interface)

//TODO
// 4. Add a new abstract method to Animal called legCount() (no implementation)
// 5. Update all classes that implement Animal so that they adhere to the new contract
//    by implementing the legCount() method in each class. (Simply print number of legs)
// 6. Update the loop so that the legCount( )is called for all animals.
// 7. Run and check output.

//TODO
// 8. Create a class called AnimalContainer that provides the following:
// - declares a field "animalsList" of type reference to list of animals
// - a constructor that instantiates the ArrayList
// - an add() method that accepts an Animal and adds it to the list
// - a printAnimals() method that will print all animals in the list showing
//   their sound() and their leg count.
// - has a getAnimal(index i) method that returns a reference to the Animal at index i,
//   or null if index is out of bounds.
//  - When you call this getAnimal() method in main() how will you determine
//   which type of animal has been returned.  (Hint: Types and casts)
// - Call getAnimal() and capture the returned value in a reference of type Animal.
// - call the sound() and numLegs() methods on that reference
// - Duck
// - Add a new Duck class that implements Animal interface but also
//  has a swim() method. Add a new duck to the AnimalContainer, and then retrieve that
//  duck with the getAnimal() method, capturing the return value.
//  Now, call the sound() method on the duck.
//  call the swim() method on the duck.  What issues are there?
//
//


