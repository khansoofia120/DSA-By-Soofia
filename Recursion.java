public class Recursion {
    public static void fibb(int a, int b,int n){
    if(n==0 ){
        System.out.println(b);
        return ;
    }
    int c=a+b;
    
    fibb(b,c,n-1);
}
public static void main(String[] args) {
        int n=7;
        System.out.println("We are fibonacci number"+n);
        int a=0;
        int b=1;
    // 0 1 1 2 3 5 8
    fibb(a,b,n-2);
    }
}
