class Solution {
    public int compareVersion(String version1, String version2) {
       String a[]=version1.split("\\."),b[]=version2.split("\\.");
       int i=0,j=0;
       while(i<a.length||j<b.length){
        int x=0,y=0;
        if(i<a.length){
            x=Integer.parseInt(a[i]);
        }
        if(j<b.length){
            y=Integer.parseInt(b[j]);
        }
        if(x<y)return -1;
        if(x>y)return 1;
        i++;
        j++;
       }
       return 0;
    }
}