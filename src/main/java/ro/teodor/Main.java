package ro.teodor;

public class Main {
    public static void main(String[] args) {

        SalesRepresentative guy1 = new SalesRepresentative(10, 500);//5000
        SalesRepresentative guy2 = new SalesRepresentative(7, 800);//5600
        SalesRepresentative guy3 = new SalesRepresentative(5,400);//2000


   double[] rep = {guy1.wortOfSales(), guy2.wortOfSales(), guy3.wortOfSales()};
   SalesRepresentative.bubbleSort(rep);
   for (int i = 0; i < rep.length ; i++){
       System.out.print(rep[i] + " ");
   }






    }
}
