class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int x=Math.max(x1,Math.min(xCenter,x2));
        int y=Math.max(y1,Math.min(yCenter,y2));
        int d=(int)Math.pow((xCenter-x),2)+(int)Math.pow((yCenter-y),2);
        if(d<=Math.pow(radius,2))return true;
        return false;
    }
}