import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MaximumNumberofIntegerstoChooseFromaRangeI checker = new MaximumNumberofIntegerstoChooseFromaRangeI();

        System.out.println(Arrays.toString(new int[]{checker.maxCount(new int[]{11}, 7, 50)}));
    }
}