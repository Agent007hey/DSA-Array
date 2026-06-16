public class MinInArray {
  public static void main(String[] args) {
    int arr[] = { 10, 3, 1, 54, 100, 20, 4 };
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      min = Math.min(min, arr[i]);
    }

    System.out.println("Minimum element in array : " + min);
  }
}

// TC = O(n)