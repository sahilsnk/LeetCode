import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MaximumNumberofKDivisibleComponents checker = new MaximumNumberofKDivisibleComponents();
        int[][] nums = {{0,1},{0,2},{1,3},{1,4},{2,5},{2,6}};
        int[] values = {3,0,6,1,5,2,1};
        System.out.println(checker.maxKDivisibleComponents(7,nums,values,3));
    }
}