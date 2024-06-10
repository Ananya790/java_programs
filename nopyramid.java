public class nopyramid {
   public static void pyramid(int n){
    //int c=1;
    for (int i=1;i<=n;i++){
        for(int j=1; j<=n-i+1;j++){
            System.out.print(" ");

        }
        for (int j=1;j<=i;j++){
            System.out.print(j +" ");
            //c++;
        }
        System.out.println();
    }
   } 
   public static void main(String[] args) {
    {
        pyramid(5);
    }
   }   
}
