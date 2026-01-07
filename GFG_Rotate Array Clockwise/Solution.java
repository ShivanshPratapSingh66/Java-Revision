class Solution {
    public void rotateclockwise(int[] arr, int k) {
        int n = arr.length;
        if (n <= 1) return;

        k = k % n; 
        
        rev(arr, 0, n - 1);
        rev(arr, 0, k - 1);
        rev(arr, k, n - 1);
    }

    public static void rev(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st++] = arr[end];
            arr[end--] = temp;
        }
    }
}
