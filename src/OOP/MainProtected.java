package OOP;

import OOP.model.Person;

public class MainProtected extends Person {
    protected MainProtected(String name, int age, float height) {
        // phương thức khởi tạo MainProtected sẽ gọi phương thức Person
        super(name, age, height);
    }

    public static void main(String[] args) {
        MainProtected a = new MainProtected("Hung", 22, 1.77f);
        a.eat("Rice");
    }
}
