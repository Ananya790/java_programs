
import java.util.*;

public class linearsrch {

    public static int linears(int num[], int k){
        for(int i=0;i<num.length;i++){
        if(num[i]== k){
            return i;
        }
    }
        return -1;
    }
     public static void main(String[] args) {
            int num[] = new int[5];
            Scanner sc = new Scanner(System.in);
            
            for( int i=0;i<num.length;i++){
                num[i]=sc.nextInt();
            }
            for(int i = 0; i < num.length; i++){
                System.out.print(num[i]+" ");
            }
            System.out.println("enter element to search");
            int k = sc.nextInt();
            int index = linears(num, k);
            if(index==-1){
                System.out.println("not found");
            }
            else{
            System.out.println("index of element "+ index);
            }
}
}
