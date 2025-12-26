public class forLoop {
    public static void main(String[] args){
        int[] nums = {12, 45, 7, 89, 23};
        int largest = nums[0];
        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        System.out.println("largest number in the array is " + largest);

    }
}
