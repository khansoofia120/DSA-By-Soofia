import java.util.HashSet;

public class subset {
    public static void subsequence(String s,int idx,String newString,HashSet<String> set){
        if(idx==s.length()){
            if(set.add(newString)){
                System.out.println(newString);
                return;
            }
        else{
            return;
        }
        }
        char curr=s.charAt(idx);
        // to be
        subsequence(s, idx+1, newString+curr,set);

        // not to be
        subsequence(s, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String s="aaa";
        int idx=0;
        HashSet<String> set=new HashSet<>();
        String newString=" ";
        subsequence(s, idx, newString,set);
    }
}
