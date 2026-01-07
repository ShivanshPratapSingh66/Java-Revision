class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int a: arr)
        {
          
           max=Math.max(max,a);
           min=Math.min(min,a);
          
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        return list;
        
    }
}
