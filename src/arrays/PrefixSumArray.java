package arrays;

public class PrefixSumArray {

    public static void main(String[] args) {

        int arr[] = {1,8,30,-5,20,7};
        int pre_sum[] = new int[arr.length];


        pre_sum[0] = arr[0];
        for(int i =1;i<pre_sum.length;i++){
            pre_sum[i] = pre_sum[i-1] + arr[i];
        }

        int l = 1, r = 4,sum=0;

        if(l != 0){
            sum = pre_sum[r] - pre_sum[l-1];
        }
        else{ // l =0 && r >=0
            sum = pre_sum[r];
        }

        System.out.println("Prefix Sum Array for "+l+" to "+r+" = "+sum);
    }
}
