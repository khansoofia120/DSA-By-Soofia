<<<<<<< HEAD
public class exponent {
    public static int calcPow(int x, int n){
        if(x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        int half=calcPow(x,n/2);
        if(n%2==0){
            
            return half*half;
        }
        else{
            
            return half*half*x;
        }
    }
    public static void main(String[] args) {
        int n=5;
        int x=2;
        System.out.println(calcPow(x,n))
       ;
    }
}
=======
public class exponent {
    public static int calcPow(int x, int n){
        if(x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        int half=calcPow(x,n/2);
        if(n%2==0){
            
            return half*half;
        }
        else{
            
            return half*half*x;
        }
    }
    public static void main(String[] args) {
        int n=5;
        int x=2;
        System.out.println(calcPow(x,n))
       ;
    }
}
>>>>>>> b5c8ed0afedbc5b47e37758eca13ac730a113eb5
