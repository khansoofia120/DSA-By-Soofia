public class xpownNaive {
    public static int exponent(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xnm1=exponent(x, n-1);
        int xpown=x*xnm1;
        return xpown;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(exponent(x, n));
    }
}
