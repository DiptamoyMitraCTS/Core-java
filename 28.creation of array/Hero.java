
class Hero {
  public static void main(String[] args) {
    int nums[] = { 3, 7, 2, 4 };
    System.out.println(nums[1]); // 7
    nums[1] = 6;
    System.out.println(nums[1]); // 6

    // dynamic array
    int num[] = new int[4]; // all index value initialy 0

    System.out.println(num[1]); // 0
    num[0] = 1;
    num[1] = 2;
    num[2] = 3;
    num[3] = 8;
    System.out.println(num[0]); // 1
    System.out.println(num[2]); // 3
    
    //prints all value
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]); //1 2 3 8       
    }
  }
}