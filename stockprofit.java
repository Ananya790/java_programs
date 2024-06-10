public class stockprofit {
    public static int stock(int prices[]){
    int buyprice = Integer.MAX_VALUE;
    int maxprofit=0;
    for(int i=0;i<prices.length;i++){
        if(buyprice > prices[i]){
            buyprice = prices[i];
        }
        else{
            int sellingprice = prices[i];
            int profit = sellingprice- buyprice;
            maxprofit = Math.max(profit , maxprofit);
        }
    }
    return maxprofit;
}
    
public static void main(String[] args) {
     int prices[]= {7,1,5,3,6};
     System.out.println(stock(prices));
}
}
