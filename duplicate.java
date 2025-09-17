public class duplicate {
    public static boolean[] map=new boolean[26];
    public static void removeDup(String s,int idx, String newString ){
        if(idx==s.length()){
            
            System.out.println(newString);
            return;
        }
        char curr=s.charAt(idx);
        if(map[curr-'a']){
            removeDup(s,idx+1,newString);
        }
        else{
            map[curr-'a']=true;
            newString+=curr;
            removeDup(s,idx+1,newString);
        }
    }
    public static void main(String[] args) {
        removeDup("abbccda",0, "");
    }

}
