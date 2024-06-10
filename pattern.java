public class pattern {
    public static void main(String[] args) {
        int n =5;
        int i;
        for( i = 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if( i>=j){
                    System.out.print("* ");
               
                }
            }
          
            System.out.println( );
        }
    }
}
//(i+j) <= (n+1)