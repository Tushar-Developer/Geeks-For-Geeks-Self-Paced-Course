package arrays;

public class NbonacciWST {

    public static void main(String[] args) {

        int n = 3, m = 8;
        int arr[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = 0;
        }

        arr[n-1] = 1;
        arr[n] = 1;

        for (int i = n+1; i<m ; i++){
            System.out.println(arr[i-1] + " " + arr[i-n-1]);
            arr[i] = 2*arr[i-1] - arr[i-n-1];
        }

        for(int i =0; i<m ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
