package arrays;

public class StockBuyAndSellArray {

    public static void main(String[] args) {

        int arr[] ={1,5,3,8,12};
        int profit = 0;

        for(int i = 1; i < arr.length ; i++){
            if(arr[i] - arr[i - 1] > 0){
                profit = profit + arr[i] - arr[i - 1];
            }
        }
        System.out.println(profit); //13
    }

}
