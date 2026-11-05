class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c,s=0;
        for(int i=0;i<arr1.length;i++){
            c=1;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    c=0;
                    break;
                }
            }
            s+=c;
        }
        return s;
    }
}