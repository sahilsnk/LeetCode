import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TakeGiftsFromtheRichestPile checker = new TakeGiftsFromtheRichestPile();
        int[] nums = {25,64,9,4,100};
        System.out.println(Arrays.toString(new int[]{(int) checker.pickGifts(nums,4)}));

    }
}