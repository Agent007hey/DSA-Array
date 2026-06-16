public class SumInArray {
  public static void main(String[] args) {
    int arr[] = { 2, 3, 10, 5, 20 };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    System.out.println("Sum of element of array : " + sum);
  }
}

// TC = O(n)
