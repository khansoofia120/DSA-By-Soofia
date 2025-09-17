public class digitalSum {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n/10)+n%10;
    
    }
    public static int digitalSum(int n){
        int res=0;
        while(n>9){
            n=sum(n);
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(digitalSum(19));
    }
}
