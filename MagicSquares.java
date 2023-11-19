import java.util.Arrays;

public class MagicSquares {
     public int[][] generateSquares(int[][] x) {
          do {
               for (int i = 0; i < x.length; i++) {
                    for (int j = 0; j < x[i].length; j++) {
                         x[i][j] = (int) (1 + Math.random() * 50);
                    }
               }
          } while (!checkSum(calculateRowSums(x)));
          return x;
     }

     public int[] calculateRowSums(int[][] x) {
          int[] rowSums = new int[x.length];
          for (int i = 0; i < x.length; i++) {
               for (int j = 0; j < x[i].length; j++) {
                    rowSums[i] += x[i][j];
               }
          }
          return rowSums;
     }

     public boolean checkSum(int[] x) {
          for (int i = 1; i < x.length; i++) {
               if (x[i] != x[i - 1]) {
                    return false;
               }
          }
          return true;
     }

     public void printMagicSquare(int[][] x) {
          int[] rowSums = calculateRowSums(x);
          System.out.println(Arrays.deepToString(x));
          System.out.println("SUM: " + Arrays.toString(rowSums));
     }
}