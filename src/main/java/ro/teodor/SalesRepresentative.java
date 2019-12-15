package ro.teodor;

public class SalesRepresentative {
    public int numberOfSales;
    public double quotaPerSales;


    SalesRepresentative(int numberOfSales, double quotaPerSales){
        this.numberOfSales = numberOfSales;
        this.quotaPerSales = quotaPerSales;
    }
    public double wortOfSales () {
       return numberOfSales * quotaPerSales;
    }


    static void bubbleSort(double[] arr) {
        int n = arr.length;
        double temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] < arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}




