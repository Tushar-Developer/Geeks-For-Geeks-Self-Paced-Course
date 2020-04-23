package arrays;

public class SubarraySumWOwindowWST {

    public static void main(String[] args) {

        int arr[] = {1,4,20,3,10,5};
        int sum = 33, curr_sum = arr[0], start = 0;

        if(curr_sum == sum){
            System.out.println("Sum found in a subarray");
            return;
        }

        for(int end = 1; end<arr.length; end++){


            while(curr_sum > sum && start < end-1){
                curr_sum -= arr[start];
                start++;
            }
            if(curr_sum == sum) {
                System.out.println("Sum found in a subarray");
                return;
            }
            if(end < arr.length-1)
                curr_sum += arr[end];
        }

        if(curr_sum == sum)
            System.out.println("Sum found in a subarray");
        else
            System.out.println("Sum Not found in a subarray");

    }
}
