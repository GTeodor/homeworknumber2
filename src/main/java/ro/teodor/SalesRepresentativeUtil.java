package ro.teodor;

public class SalesRepresentativeUtil {
    
    public static SalesRepresentative [] sort(SalesRepresentative[] reps) {
        int n = reps.length;
        SalesRepresentative temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(reps[j-1].wortOfSales() < reps[j].wortOfSales()){
                    //swap elements
                    temp = reps[j-1];
                    reps[j-1] = reps[j];
                    reps[j] = temp;
                }

            }
        }
        return reps;
    }
}
