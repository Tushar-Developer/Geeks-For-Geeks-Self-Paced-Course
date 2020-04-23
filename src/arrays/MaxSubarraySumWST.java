package arrays;

public class MaxSubarraySumWST {

    public static void main(String[] args) {

        int arr[] = {1,8,30,-5,20,7};
        int k = 3,curr_sum = 0, max_sum =0;

        for(int i = 0; i < k; i++){
            curr_sum += arr[i];
        }

        max_sum = curr_sum;

        for (int i = k; i < arr.length; i++){
            curr_sum += arr[i] - arr[i-k];
            if(max_sum < curr_sum){
                max_sum = curr_sum;
            }
        }
        System.out.println("Maximum sum of a subarray of size "+ k +": "+ max_sum);
    }
}
