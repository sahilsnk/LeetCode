import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MovePiecestoObtainaString checker = new MovePiecestoObtainaString();

        System.out.println(Arrays.toString(new boolean[]{checker.canChange("_L__R__R_","L______RR")}));
    }
}