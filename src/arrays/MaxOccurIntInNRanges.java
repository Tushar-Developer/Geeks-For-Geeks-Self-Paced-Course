package arrays;

public class MaxOccurIntInNRanges {

    public static void main(String[] args) {

        int[] L = {1, 4, 9, 13, 21};
        int[] R = {15, 8, 12, 20, 30};
        int n = L.length;
        System.out.println("Maximum Ocuurred integer in N ranges= "+maximumOccuredElement(L, R, n));
    }

    public static int maximumOccuredElement(int[] L, int[] R, int n){

        int arr[] = new int[10000];

        int maxI = -1;
        for (int i =0; i<n ; i++){
            arr[L[i]]++;
            arr[R[i]+1]--;
            if(maxI < R[i]){
                maxI = R[i];
            }
        }

        int mSum = arr[0], index = 0;

        for (int i=1;i<maxI+1;i++){
            arr[i] += arr[i-1];
            if(mSum < arr[i]){
                mSum = arr[i];
                index = i;
            }
        }
        return index;
    }
}
