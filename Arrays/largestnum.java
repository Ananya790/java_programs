import java.util.Scanner;

public class largestnum {
    public static int getlargest(int a[]){
    int largest_num= Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
        if(a[i]> largest_num){
            largest_num= a[i];
        }
    }
    return largest_num;
}

public static void main(String[] args) {
            int a[] = new int[5];
            Scanner sc = new Scanner(System.in);
            
            for( int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            for(int i = 0; i < a.length; i++){
                System.out.print(a[i]+" ");
            }

            int large = getlargest(a);
            System.out.println(large);
}
}
