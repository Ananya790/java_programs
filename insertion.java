public class insertion {
    public static void insertionsort(int a[]){
        for(int i=1;i<a.length-1;i++){
            int curr=a[i];
            int prev = i-1;
            while(prev>=0 && a[prev]> curr){
                a[prev+1]= a[prev];
                prev--;
            }
            a[prev+1]= curr;
        }
    }

    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
         int a[]={5,2,3,1,4};
        insertionsort(a);
        printarr(a);
    }
}
