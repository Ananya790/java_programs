import java.util.*;
public class largestnumber{
    public static void main(String args[]) {
        System.out.println("enter three numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.err.println(a+" is largest");

        }

        else if(b>a && b>c){ System.err.println(b+" is largest");}
        else {
            System.out.println(c+" is largest");
        }

    }
}