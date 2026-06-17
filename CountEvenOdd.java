public class CountEvenOdd {

  public static void Count(int arr[]) {
    int evenCount = 0;
    int oddCount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
    }

    System.out.println("Total Even Numbers are: " + evenCount);
    System.out.println("Total Odd Numbers are: " + oddCount);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 6, 5, 4, 3, 7, 9, 8 };
    Count(arr);

  }
}
