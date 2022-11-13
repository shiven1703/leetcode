import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        question q = new question();
        int k = q.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

    }
}