public class SecondLargest {

  public static int Ans(int arr[]) {
    int largest = arr[0];
    int secondLargest = arr[0];
    for (int i : arr) {
      if (i > largest) {
        secondLargest = largest;
        largest = i;
      } else if (i > secondLargest) {
        secondLargest = i;
      }
    }
    return secondLargest;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 1, 5, 4, 0, 10 };
    System.out.println(Ans(arr));

  }
}
