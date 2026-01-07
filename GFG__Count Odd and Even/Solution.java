class Solution {
    public int[] countOddEven(int[] arr) {
      int even=0,odd=0;
      for(int a: arr)
      {
          if(a%2==0)
          even++;
          else
          odd++;
      }
      return new int[]{odd,even};
        
    }
}
