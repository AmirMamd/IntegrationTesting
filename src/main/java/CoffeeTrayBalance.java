public class CoffeeTrayBalance {
    public static int checkBalance(int n,int m){
        if(m < 0 || n < 0){
            return 0;
        }
        if(n>m){
            return m;
        }else{
            return n;
        }
    }
}
