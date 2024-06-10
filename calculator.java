import java.util.*;
public class calculator{
    public static void main(String args[]){
        System.out.println("enter numbers");
        Scanner sc = new Scanner(System.in);
       
        Scanner s = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter operation to perform");
        String operator = s.nextLine();
         
        switch(operator){
            case "add": System.out.println(a+b);
                        break;
            case "sub": System.out.println(a-b);
                        break;
            case "mul": System.out.println(a*b);
                        break;
            case "div": System.out.println(a/b);
                        break;
            case "mod": System.out.println(a%b);
                        break;
            default: System.out.println("invalid");
        }
    }
}