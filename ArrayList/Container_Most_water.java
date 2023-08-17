package javaDSA.ArrayList;
import java.util.ArrayList;

public class Container_Most_water {
    public static int StoreWater(ArrayList<Integer>height){
        int maxWater=0;
        // brute force 
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht=Math.min(height.get(i), height.get(j));
                int width= j-i;
                int currWater=ht*width;
                maxWater=Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    // Optimized approach
    public static int StoreWaterOP(ArrayList<Integer>height){
        int maxWater=0;
        int lp =0;
        int rp =height.size()-1;
        
        while(lp<rp){
            //calculate water area 
            int ht=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater,currWater);

            if(height.get(lp)>height.get(rp)){
                rp--;
            }
            else{
                lp++;
            }
            
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //1 8 6 2 5 8 3 7
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(7);
        
        //System.out.println(StoreWater(list));
        System.out.println(StoreWaterOP(list));
        
    }
    
}
