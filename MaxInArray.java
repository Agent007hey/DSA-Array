public class MaxInArray {
  public static void main(String[] args) {
    int arr[] = { 100, 3, 6, 2, 8, 87, 10, 54 };
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
    }

    System.out.println("Max Element in Array : " + max);
  }
}

// TC = O(n)