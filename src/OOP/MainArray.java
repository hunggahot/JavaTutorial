package OOP;

import OOP.model.Person;

public class MainArray {
    public static void main(String[] args) {
        Person[] a = new Person[2];

        for (int i = 0; i < a.length ; i++) {
            a[i] = new Person("Hung", 22, 1.77f);
            a[i].name = "Hung " + i;
//            a[i].age = i;
            a[i].height = 1.77f;

            System.out.println(a[i].name);
//            System.out.println(a[i].age);
            System.out.println(a[i].height);
            System.out.println();
        }


    }
}
