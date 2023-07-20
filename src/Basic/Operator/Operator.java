package Basic.Operator;

public class Operator {
    public static void main(String[] args) {
        int a = 1;
        //In rồi mới tăng
        System.out.println("In rồi mới tăng");
        System.out.println("a = " + a);
        System.out.println(a++);
        System.out.println("a = " + a);
        System.out.println("-----------------------------");

        // Tăng rồi mới in
        System.out.println("Tăng rồi mới in");
        System.out.println("a = " + a);
        System.out.println(++a);
        System.out.println("a = " + a);
        System.out.println("-----------------------------");

        // Cộng 1 và in ra rồi mới tăng
        System.out.println("Cộng 1 và in ra rồi mới tăng");
        System.out.println("a = " + a);
        System.out.println(a+++1);
        System.out.println("a = " + a);
        System.out.println("-----------------------------");

        // Tăng rồi mới cộng 1 và in ra
        System.out.println("Tăng rồi mới cộng 1 và in ra");
        System.out.println("a = " + a);
        System.out.println(++a+1);
        System.out.println("a = " + a);
        System.out.println("-----------------------------");

//        // Số a cuối cùng là 7
//        System.out.println("Số a cuối cùng là 7");
//        System.out.println("a = " + a);
//        System.out.println("-----------------------------");
    }
}
