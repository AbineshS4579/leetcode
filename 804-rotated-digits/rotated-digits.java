class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        
        for(int i=2;i<=n;i++){
            boolean v=true,d=false;
            int k=i;
            while(k>0){
                int r=k%10;
                if(r==3||r==4||r==7){
                    v=false;
                    break;
                }
                if(r==2||r==6||r==5||r==9){
                    d=true;
                }
                k/=10;
            }
            if(v&&d)c++;
        }
        return c;
    }
}