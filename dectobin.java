import java.util.Scanner;

public class dectobin {
    public static int dtob(int n){
        int i =0;
        int b = 0;
        while(n>0){
            int r = n%2;
            b = b+(r*(int)Math.pow(10,i));
            i++;
            n/=2;
        }
        return b;

    }

    public static void main(String[] args) {
         System.out.println("enter  num");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(dtob(a));
    }
}
