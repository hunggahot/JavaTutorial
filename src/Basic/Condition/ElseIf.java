package Basic.Condition;

public class ElseIf {
    public static void main(String[] args) {
        String job = "Hoc Sinh";

        if(job.equals("Hoc Sinh"))
            System.out.print("Hoc Sinh thi cut");
        else if (job.equals("Sinh Vien"))
            System.out.print("Sinh Vien thi vao");
        else
            System.out.print("That nghiep thi cut");
    }
}
