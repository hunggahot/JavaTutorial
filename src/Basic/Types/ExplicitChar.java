package Basic.Types;

public class ExplicitChar {
    public static void main(String[] args) {
        char a = 'a';
        int b = a;
        char c = (char) b;
        System.out.println(b);
        System.out.print(c);
    }
}
