public class prefixarr {
   
    
 public static void printsub(int a[]){
  
    int maxsumm= Integer.MIN_VALUE;
    int prefix[]= new int[a.length];

    prefix[0]= a[0];
    for(int i=1;i<prefix.length;i++){
       prefix[i]= prefix[i-1]+ a[i];
    }
    for(int i=0;i< a.length;i++){
    for(int j =i;j< a.length;j++){
        int sum=0;
        
        if (i==0) {
            sum= prefix[j];
        }
        else{
       sum = prefix[j]- prefix[i-1];
        }
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
    
