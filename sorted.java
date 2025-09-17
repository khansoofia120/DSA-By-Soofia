public class sorted {
    public static boolean isSorted(int [] arr, int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        else{
            return isSorted(arr,idx+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,9,4,5};
        int idx=0;
        System.out.print(isSorted(arr, idx));
    }
}
