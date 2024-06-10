import java.util.*;
class prime{
    public static void main(String[] args) {
        System.out.println("enter no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c++;
            }
            
            }
            if(c==1){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }


    }

