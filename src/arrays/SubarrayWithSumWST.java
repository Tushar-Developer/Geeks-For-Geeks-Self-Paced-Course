package arrays;

public class SubarrayWithSumWST {

    public static void main(String[] args) {

        int arr[] = {1,8,30,-5,20,7};
        int k = 3,curr_sum = 0, sum = 45;

        for(int i =0; i<k;i++){
            curr_sum += arr[i];
        }
        if(curr_sum == sum) {
            System.out.println("Found the subarray");
        }

        for(int i =k; i<arr.length;i++){
            curr_sum += arr[i] - arr[i-k];
            if(curr_sum == sum) {
                System.out.println("Found the subarray");
                System.exit(0);
            }
        }
        System.out.println("Not Found the subarray");
    }
}
