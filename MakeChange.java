import java.util.Set;
import java.util.TreeSet;

public class MakeChange {
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {

        int[] numberOfWays = new int[n+1];
        numberOfWays[0] = 1;
        for(int eachDenom : denoms){
            if(eachDenom <= n){
                for(int i = eachDenom; i < n+1; i++){
                    numberOfWays[i] += numberOfWays[i-eachDenom];
                }
            }
        }
        return numberOfWays[n];
    }

    public static void main(String... args){
        System.out.println(numberOfWaysToMakeChange(6, new int[]{1,5}));
    }

}
