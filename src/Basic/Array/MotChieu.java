package Basic.Array;

public class MotChieu {
    public static void main(String[] args) {
        // int[] a;
        // a = new int[3];
        int[] a = new int[3];

        a[0] = 5;
        a[1] = 2;
        a[2] = 1;

        /*
         a không phải kiểu dữ liệu nguyên thủy mà là kiểu dữ liệu tham chiếu
         ([i có nghĩa là mảng thuộc kiểu int (tượng trưng bằng chữ I),
         @2a139a55 thì tùy thuộc JVM đưa ra, nhưng thường là địa chỉ lưu trữ đối tượng)
         */
        System.out.println(a);

        // a.length là một thuộc tính giúp ta có thể biết kích cỡ của mảng, nó giúp ta sử dụng vòng lặp for
        for(int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
