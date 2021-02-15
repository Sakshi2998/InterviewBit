public class Solution {
  public int sqrt(int A) {
    if (A == 1) return 1;
    long low = 0;
    long high = A / 2;
    long mid = 0;
    int ans = 0;
    while (low <= high) {
      mid = (low + high) / 2;
      long sq = mid * mid;
      if (sq == A) 
        return (int) mid;
      if (sq > A) {
        high = mid - 1;
      }
      else {
        ans = (int) mid;
        low = mid + 1;
      }
    }
    return ans;
  }
}
