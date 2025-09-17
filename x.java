public class x {
    public static int calcPow(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xpnm1=calcPow(x,n-1);
        int xpn=x*xpnm1;
        return xpn;
    }
    public static void main(String[] args) {
        int n=5;
        int x=2;
        System.out.println(calcPow(x,n));
    }
}
