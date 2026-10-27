// class Solution {
//     public String[] createGrid(int m, int n) {
//         String s[]=new String[m];
//         char c[][]=new char[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0){
//                     c[i][j]='.';
//                     continue;
//                 }
//                 c[i][j]='#';
//             }
//         }
//         // for(int i=0;i<n-1;i++){
//         //     c[0][i]='.';
//         // }
//         for(int i=0;i<m;i++){
//             c[i][n-1]='.';
//             s[i]=new String(c[i]);
//         }
//         return s;
//     }
// }
class Solution {
    public String[] createGrid(int m, int n) {
        var res = new String[m];
        var sb = new StringBuilder();
        for (var i = 0; i < n; i++) {
            sb.append(".");
        }
        res[0] = sb.toString();

        sb = new StringBuilder();
        for (var i = 1; i < n; i++) {
            sb.append("#");
        }
        sb.append(".");
        
        for(var i = 1; i < m; i++) {
            res[i] = sb.toString();
        }
        
        return res;
    }
}