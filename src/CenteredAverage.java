public class CenteredAverage {
    public static void main(String[] args) {

    }
    public int centeredAverage(int[] nums) {
        int minValue = nums[0];
        int minValuePosition = 0;
        int maxValue = nums[0];
        int maxValuePosition = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
                minValuePosition = i;
            }


        }
        nums[minValuePosition] = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                maxValuePosition = i;
            }


        }
        for (int i = 0; i<nums.length;i++){
            sum+=nums[i];
        }
        nums[maxValuePosition] = 0;
        return sum / (nums.length - 1);
    }
}
