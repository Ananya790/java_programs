public class subarray {
    
    public static void printsub(int a[]){
        int k;
        int maxsumm= Integer.MIN_VALUE;
        
        for(int i=0;i< a.length;i++){
            for(int j =i;j< a.length;j++){
                int sum=0;
                for(k=i;k<=j;k++){
              
                    System.out.print(a[k]+" ");
                    sum = sum +a[k];    
                }
                System.out.println(sum);
                if(maxsumm< sum){
                    maxsumm = sum;
                }
            }

        }
        System.out.println("max sum "+ maxsumm);
    }

        

    public static void main(String args[]){
        int a[]  ={2,6,7,9,4,6};
        printsub(a);
    }
    
}
