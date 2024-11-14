// Practice Question (Easy Level):

// Implement a generic class called `Box` that represents a simple box that can hold an object of any type. 
// The class should have one private field of generic type `T`, representing the object inside the box.

// Your `Box` class should provide the following functionalities:

// 1. A constructor that takes a parameter of type `T` and initializes the field.
// 2. Getter and setter methods to access and update the object inside the box.

// Additionally, write a Java program to demonstrate the usage of your `Box` class with examples of different data types.

// Here's a step-by-step guide to help you:

// 1. Implement the `Box` class with the specified functionalities.
// 2. Create instances of the `Box` class with different data types.
// 3. Use getter and setter methods to manipulate the objects inside the boxes.
// 4. Demonstrate how your `Box` class can hold objects of various types.

// Once you've written your implementation, submit it, and I'll check it for you!
import java.util.*;
class Box<T>{
    private T field;
    Box(T field){
        this.field=field;
    }

    public T getField(){
        return field;
    }

    public void setField(T field){
        this.field=field;
    }
}
public class Generics {
    public static void main(String[] args) {
        // Create instances of the Box class with different data types
        Box<Integer> integerBox = new Box<>(10);
        Box<String> stringBox = new Box<>("Hello");
        Box<Double> doubleBox = new Box<>(3.14);

        // Use getter and setter methods to manipulate the objects inside the boxes
        System.out.println("Integer value inside the box: " + integerBox.getField());
        System.out.println("String value inside the box: " + stringBox.getField());
        System.out.println("Double value inside the box: " + doubleBox.getField());

        // Update the objects inside the boxes
        integerBox.setField(20);
        stringBox.setField("World");
        doubleBox.setField(6.28);

        // Print the updated values
        System.out.println("Updated integer value inside the box: " + integerBox.getField());
        System.out.println("Updated string value inside the box: " + stringBox.getField());
        System.out.println("Updated double value inside the box: " + doubleBox.getField());
    }
}

