class Solution {
    public String[] createGrid(int m, int n) {
        String s[]=new String[m];
        char c[][]=new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    c[i][j]='.';
                    continue;
                }
                c[i][j]='#';
            }
        }
        // for(int i=0;i<n-1;i++){
        //     c[0][i]='.';
        // }
        for(int i=0;i<m;i++){
            c[i][n-1]='.';
            s[i]=new String(c[i]);
        }
        return s;
    }
}