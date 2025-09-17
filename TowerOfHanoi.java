<<<<<<< HEAD
public class TowerOfHanoi {
    public static void solve(int n,char a, char b, char c){
        if(n==1){
            System.out.println("move disk "+n+" from "+a+" to "+c);
            return;
        }
        solve(n-1,a,c,b);
        System.out.println("move disk "+n+" from "+a+" to "+c);
        solve(n-1,b,a,c);
        
    }
    public static void main(String[] args) {
        int n=3;
        char a='s';
        char b='h';
        char c='d';
        solve(n,a,b,c);

    }
}
=======
public class TowerOfHanoi {
    public static void solve(int n,char a, char b, char c){
        if(n==1){
            System.out.println("move disk "+n+" from "+a+" to "+c);
            return;
        }
        solve(n-1,a,c,b);
        System.out.println("move disk "+n+" from "+a+" to "+c);
        solve(n-1,b,a,c);
        
    }
    public static void main(String[] args) {
        int n=3;
        char a='s';
        char b='h';
        char c='d';
        solve(n,a,b,c);

    }
}
>>>>>>> b5c8ed0afedbc5b47e37758eca13ac730a113eb5
