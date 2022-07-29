import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
  public int[][] merge(int[][] intervals) {
    // first sort by start
    Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
    // create result collector
    LinkedList<int[]> merged = new LinkedList<>();
    for (int[] interval: intervals) {
      // check if merged last overlapEnd < interval[0]
      if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
        merged.add(interval);
      } else { // still overlap
        int overlapEnd = merged.getLast()[1];
        merged.getLast()[1] = Math.max(overlapEnd, interval[1]);
      }
    }
    return merged.toArray(new int[merged.size()][]);
  }
}
