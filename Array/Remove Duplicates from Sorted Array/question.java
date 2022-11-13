import java.util.Arrays;

class question {
    private int finalNumCount = 0;

    public int removeDuplicates(int[] nums) {
        for(int num: nums) {
            int isFound = this.isNumPresent(nums, 0, this.finalNumCount, num);
            if(isFound < 0) {
                nums[finalNumCount] = num;
                this.finalNumCount = this.finalNumCount + 1;
            }else {
                continue;
            }
        }
        return finalNumCount;
    }

    private int isNumPresent(int[] array, int startIndex, int endIndex, int searchNum) {
        return Arrays.binarySearch(array, startIndex, endIndex, searchNum);
    }
}