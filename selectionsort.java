public class selectionsort{

    public static void selection(int a[]){
        for(int i=0;i<a.length;i++){
            int min=i;
            for ( int j=i+1;j< a.length;j++){
                if(a[min]> a[j]){
                    min =j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i]= temp;


        }
    }


    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int a[]= { 5,2,4,1,3};
        selection(a);
        printarr(a);
    }
}
