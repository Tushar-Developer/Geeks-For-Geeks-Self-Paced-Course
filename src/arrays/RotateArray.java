package arrays;

public class RotateArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8};
        int d = 2;

        rotateTheArrayByD(arr, d);

        // Ouput the Array Rotated
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" "); //3 4 5 6 7 8 1 2
        }
    }

    static void rotateTheArrayByD(int arr[], int d){

        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length -1);
    }

    static void reverse(int arr[], int start, int end){

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
