class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Map<Integer,List<int[]>> m=new TreeMap<>();
        int[][] a=new int[rows*cols][2];
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            int d=Math.abs(i-rCenter)+Math.abs(j-cCenter);
            if(!m.containsKey(d)){
                m.put(d,new ArrayList<int[]>());
            }
            m.get(d).add(new int[]{i,j});
        }
       }int k=0;
       for(List<int[]> l:m.values()){for(int[] i:l){
        a[k][0]=i[0];
        a[k][1]=i[1];
        k++;
       }}
       return a;
    }
}