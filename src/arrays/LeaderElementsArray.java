package arrays;

public class LeaderElementsArray {

    public static void main(String[] args) {

        int arr[] = { 7,8,2,6,4,5,1};
        int max = 0;

        for(int i = arr.length - 1; i >= 0; i--){

            if(max < arr[i]){
                max = arr[i];
                System.out.print(max+" "); //1 5 6 8
            }
        }
    }
}
