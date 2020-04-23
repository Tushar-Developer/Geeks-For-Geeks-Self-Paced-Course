package arrays;

public class TrappingRainWaterArray {

    public static void main(String[] args) {

        int arr[] = {3,0,1,2,5};

        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int max = 0, total = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            left[i] = max;
        }
        for(int i = arr.length -1; i >= 0; i--){
            if(max < arr[i]){
                max = arr[i];
            }
            right[i] = max;
        }

        for(int i = 0; i < arr.length - 1; i++){
            total += Math.min(left[i], right[i]) - arr[i];
        }

        System.out.println("Total water trapped: "+total); //Total water trapped: 6

    }
}
