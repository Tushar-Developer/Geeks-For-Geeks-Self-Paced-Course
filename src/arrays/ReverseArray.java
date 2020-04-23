package arrays;

public class ReverseArray {

    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int start = 0, end = arr.length -1, temp = 0;

        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" "); //9 8 7 6 5 4 3 2 1
        }
    }
}
