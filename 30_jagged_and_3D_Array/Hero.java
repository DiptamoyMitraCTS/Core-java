// JAGGED ARRAY
// in each row of multidimentional array may vary no of columns
public class Hero {
  public static void main(String[] args) {
    int nums[][] = new int[3][]; // jagged array
    // specify all different no of columns in each row
    nums[0] = new int[3];
    nums[1] = new int[4];
    nums[2] = new int[2];

    // input values
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        nums[i][j] = (int) (Math.random() * 10);
      }
    }

    // print method
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }

  }
}
//output jagged array
/*
   2 4 3
   8 3 9 2
   4 5
 */
