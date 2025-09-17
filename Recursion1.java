public class Recursion1{
    
    
        public static void subsequence(String str,int index,String newString){
            if(index==str.length()){
            System.out.println(newString);
            return;

        }
        char current=str.charAt(index);

        // to be
        subsequence(str,index+1,newString+current);
        // not to be
        subsequence(str,index+1,newString);
        }
    
        
        
        

    }
    public static void main(String[] args){
        str="abc";
        index=0;
        newString="";
    }
