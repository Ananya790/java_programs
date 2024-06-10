public class bubble {
    public static void bubblesort(int a[]){
     for(int i=0;i< a.length-1;i++){
        for(int j = 0;j< a.length-1-i;j++){
            if (a[j]> a[j+1]){
                int temp = a[j];
                a[j]= a[j+1];
                a[j+1]= temp;
            }
        }
     }
}
public static void printarr(int a[]){
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]+" ");
    }
    System.out.println();
}


public static void main(String[] args) {
    int a[] ={5,4,1,3,2};
    bubblesort(a);
    printarr(a);
}
}