public class AverageArray {
  public static void main(String[] args) {
    int arr[] = { 3, 4, 5, 7, 6, 8, 9 };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("Average is: " + sum / arr.length);
  }

}

// TC = O(n)
