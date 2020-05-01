package arrays;

public class EquilibiriumPointPrefixSumArray {

    public static void main(String[] args) {

        int arr[] = {3,4,8,-9,20,6};
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        System.out.println("The Equilibrium point is "+ isEquilibrium(arr,sum));
    }

    public static int isEquilibrium(int arr[], int sum){

        int left_sum=0;

        for(int i=0;i<arr.length;i++){

            if(left_sum == sum-arr[i]){
                return i;
            }
            left_sum += arr[i];
            sum -= arr[i];
        }

        return -1;
    }
}
