public class ATMTransactionChecker {
    public static int funds(int m){
        int s=0;
        int available= ATMAvailableFunds.fundsAvailable(s);
        if(m>available || m < 0){
            return 0;
        }else{
            ATMAvailableFunds.fundsAvailable(m);
            return m;
        }
    }
}
