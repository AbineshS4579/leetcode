class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1,w=0,l=0,r=0;
        while(i<j){
            if(height[i]<=height[j]){
                if(height[i]>=l)l=height[i];
                else w+=l-height[i];
                i++;
            }
            else {
                if(height[j]>=r)r=height[j];
                else w+=r-height[j];
                j--;
            }
        }
        return w;
    }
}