package OOP;

import OOP.model.Person;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Hung", 22, 1.77f);

//        a.name = "Hung";
//        a.age = 22;
//        a.height = 1.77f;

        System.out.println(a.name);
//        System.out.println(a.age);
        System.out.println(a.height);
        System.out.println();

        int age = a.getAge();
        System.out.println("His age: " + age);

        a.eat("Burger");

    }
}
