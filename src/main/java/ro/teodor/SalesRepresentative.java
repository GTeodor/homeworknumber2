package ro.teodor;

public class SalesRepresentative {
    private int numberOfSales;
    private double quotaPerSales;
    private String name;


   public SalesRepresentative(String name, int numberOfSales, double quotaPerSales){
        this.numberOfSales = numberOfSales;
        this.quotaPerSales = quotaPerSales;
        this.name = name;
    }
    public double wortOfSales () {
       return numberOfSales * quotaPerSales;
    }

    @Override
    public String toString() {
        return "Sales " + name +" has " + numberOfSales +" sales with a quota of " + quotaPerSales +"$. He has achieved " + wortOfSales() +"$ worth of sales.";
    }
    // Testing commit
//   static void bubbleSort(double[] arr) {
//        int n = arr.length;
//        double temp = 0;
//        for(int i=0; i < n; i++){
//            for(int j=1; j < (n-i); j++){
//                if(arr[j-1] < arr[j]){
//                    //swap elements
//                    temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//        }
//
//
//    }
}




