package javaDSA.ARRAY;



public class Array_Trapped_Rain_Water {

    public static int Trapped_Rain_Water(int height[]){
        //to calculate left max boundary
        int n =height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for (int i= 1; i<n; i++){
            leftMax[i]= Math.max(height[i] , leftMax[i-1]);

        }
        // calculate right max boundary - array
        int rightMax[]= new int [n];
        rightMax[n-1]=height[n-1];
        for (int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        // loop
        int trappedWater = 0;
        for (int i=0; i<n; i++){
            // waterLevel= min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // traped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }


    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(Trapped_Rain_Water(height));
    }
    
}
