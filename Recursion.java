<<<<<<< HEAD
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
=======
public class Recursion {
    public static void fibb(int a, int b,int n){
    if(n==0 ){
        return ;
    }
    int c=a+b;
    System.out.println(c);
    fibb(b,c,n-1);
}
public static void main(String[] args) {
        int n=7;
        System.out.println("We are printing fibonacci up to "+n);
        int a=0;
        int b=1;
    System.out.println(a);
    System.out.println(b);
    fibb(a,b,n-2);
    }
}
>>>>>>> b5c8ed0afedbc5b47e37758eca13ac730a113eb5
