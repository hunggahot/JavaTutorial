package Basic.WrapperClass;

public class IntegerCaching {
    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;

        if (a.equals(b)) {
            System.out.println("Giá trị bằng nhau");
        } else {
            System.out.println("Giá trị không bằng nhau");
        }


    }
}
