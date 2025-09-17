public class reverseString {
    public static void reverse(String s, int idx){
        if(idx==-1){
            return;
        }
        System.out.print(s.charAt(idx));
        reverse(s,idx-1);
    }
    public static void main(String[] args) {
        reverse("abcd", 3);
    }
}
