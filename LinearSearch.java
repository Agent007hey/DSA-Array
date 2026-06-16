public class LinearSearch {
  public static void main(String[] args) {
    int arr[] = { 3, 4, 10, 40, 2, 5 };
    int key = 20;
    boolean isFound = false;
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        isFound = true;
      }
    }
    if (isFound) {
      System.out.println("Found");

    } else {

      System.out.println("Not Found");
    }
  }
}

// TC = O(n)
