public class mostwater {
          public static int maxarea(int height[]){
            int max =0;
            int left_max=0;
            int right_max = height.length -1;
            while ( left_max <= right_max){
                int area =0;
                int length= Math.min(height[left_max], height[right_max] ); 
                int breadth = Math.abs (left_max-right_max); 
                area = length* breadth;
                max = Math.max(area, max);
                if (height[left_max] >= height[right_max] ){
                        right_max--;
                }
                else{
                    left_max++;
                }
            }
            return max;
          }  
          public static void main(String[] args) {
            int height[]={ 1,8,6,2,5,4,8,3,7};
            System.out.println(maxarea(height));
          }
}
