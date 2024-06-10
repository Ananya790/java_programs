public class binarysearch {
    public static int bs(int num[] , int k){
        int start =0;
        int end = num.length -1;
        
        while (start<=end){
            int mid= (start+end)/2;
            if(num[mid]== k){
                return mid;
            }
            else if(num[mid]>k){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
             
        }
        return -1;

    }

    public static void main(String[] args) {
        int num[] ={1,4,8,14,22,25};
        int k = 22;
         int a =bs(num , k);
         System.out.println("index is "+ a);    }
}
