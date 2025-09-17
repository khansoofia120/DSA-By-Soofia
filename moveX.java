public class moveX {
    public static void moveAllX(String s, int idx,int count, String newString){
        if(idx==s.length()-1){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char curr=s.charAt(idx);
        if(curr=='x'){
            count++;
            moveAllX(s,idx+1,count,newString);
        }
        else{
            newString+=curr;
            moveAllX(s,idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String s="axbxcxxd";
        String newString=" ";
        int count=0,idx=0;
        moveAllX(s, idx, count, newString);
    }
}
