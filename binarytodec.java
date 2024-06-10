import java.util.Scanner;

public class binarytodec {
    public static int  bitodec(int n){
        int i =0;
        int d =0;
        int lastnum;
        while(n>0){
            lastnum = n%10;
            d = d + (lastnum*(int)Math.pow(2,  i)); 
            n = n/10;
            i++;
        }
        return d;
    }
    public static void main(String[] args) {
        System.out.println("enter binary num");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(bitodec(a));
    }
}
