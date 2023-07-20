package Basic.WrapperClass;

public class Wrapper {
    public static void main(String[] args) {
        // Boxing
        Integer diemWrapper = Integer.valueOf(9);
        Character chu = Character.valueOf('@');
        Boolean boo = Boolean.valueOf("true");

        // Autoboxing
        Integer diemAutoBoxing = 9;

        // Unboxing
        int diemUnboxing = diemWrapper.intValue();

        System.out.println(diemWrapper);
        System.out.println(chu);
        System.out.println(boo);
        System.out.println(diemAutoBoxing);
    }
}
