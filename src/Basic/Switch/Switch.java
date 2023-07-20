package Basic.Switch;

public class Switch {
    public static void main(String[] args) {
        String gender = "Boy";

        switch (gender) {
            case "Boy":
                System.out.println("May la con trai");
                break;
            case "Girl":
                System.out.println("May la con gai");
                break;
            default:
                System.out.println("May bi gay");
                break;
        }
    }
}
