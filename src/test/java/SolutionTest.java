import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  private final Solution sol = new Solution();

  @Test
  void mergeExample1() {
    // [[1,3],[2,6],[8,10],[15,18]]
    assertArrayEquals(new int[][]{
        {1, 6}, {8, 10}, {15, 18}
    }, sol.merge(new int[][]{
        {1, 3}, {2, 6}, {8, 10}, {15, 18}
    }));
  }
  @Test
  void mergeExample2() {
    // [[1,4],[4,5]]
    assertArrayEquals(new int[][]{
        {1,5}
    }, sol.merge(new int[][]{
        {1,4}, {4,5}
    }));
  }
  @Test
  void mergeExample3() {
    // [[1,4],[0,4]]
    assertArrayEquals(new int[][]{
        {0,4}
    }, sol.merge(new int[][]{
        {1,4}, {0,4}
    }));
  }
}