public class CountOccurence {
  public static void main(String[] args) {
    int arr[] = { 2, 1, 2, 2, 3, 6, 10, 5, 2 };
    int key = 2;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        count++;
      }

    }

    System.out.println("occurence of " + key + " is: " + count);
  }
}
