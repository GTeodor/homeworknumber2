package ro.teodor;

public class Main {
    public static void main(String[] args) {

        SalesRepresentative guy1 = new SalesRepresentative("guy 1",10, 500);//5000
        SalesRepresentative guy2 = new SalesRepresentative("guy 2",7, 800);//5600
        SalesRepresentative guy3 = new SalesRepresentative("guy 3",5,400);//2000
        SalesRepresentative guy4 = new SalesRepresentative("guy 4",7,1000);//7000


 // double[] rep = {guy1.wortOfSales(), guy2.wortOfSales(), guy3.wortOfSales()};
 //  SalesRepresentative.bubbleSort(rep);
//   for (int i = 0; i < rep.length ; i++){
//       System.out.print(rep[i] + " ");
//   }
 //
        SalesRepresentative [] reps = {guy1, guy2,guy3,guy4};
        SalesRepresentative [] sortedReps = SalesRepresentativeUtil.sort(reps);

        for (SalesRepresentative salesRepresentative: sortedReps) {
           System.out.println(salesRepresentative);
        }
    }
}
