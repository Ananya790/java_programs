public class palindromepyramid {
    public static void pp(int n){
       int a=2*n-1;
        
        for(int i=1; i<=n;i++){
            int c=1;
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                
               System.out.print(c);
                if(j<=a/2){
                  c++;
                }
                else{
                    
               
                c--;
                }
             
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            int c=1;
           
            for(int j=1;j<=n-i; j++){
               
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                
             System.out.print(c);
                if(j<=a/2){
                    
                    c++;
                    }
                    else{    
                    c--;
                    }
                   
            }
            System.out.println();
        }
 }
    public static void main(String[] args) {
        {
            pp(3);
        }
    }
    
}