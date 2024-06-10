import java.util.Scanner;

public class binomial {
    public static int factorial(int a){
        int fact=1;
        for(int i =1 ; i<=a;i++){
            fact *= i;
        }
        return fact;
    }

    public static int binocof(int c , int d){
        int n = factorial(c);
        int r = factorial(d);
        int nmr = factorial(c-d);

        int bc= n/(r*nmr);
        return bc;
        
    }
    public static void main(String args[]){
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int fact = factorial(b);
        System.out.println(fact) ;
       System.out.println("enter no. for binomial fact.");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int binomialcoff = binocof(n, r);
        System.out.println(binomialcoff);

    }
}

