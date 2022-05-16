public class ATMDeduction {
    public static boolean deduct(int m){
        m= ATMTransactionChecker.funds(m);
        if(m!=0){
            return true;
        }else{
            return false;
        }
    }
}
