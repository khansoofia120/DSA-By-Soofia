

public class Javadsa {

    public static void printPerm(String str,int idx,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPerm(newStr,idx+1,perm+currChar);
        }
    }
    public static void main(String[] args) {
        printPerm("abc", 0, "");
    }
}
