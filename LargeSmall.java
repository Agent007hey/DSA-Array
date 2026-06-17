public class LargeSmall {

  public static void Ans(int arr[]) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      min = Math.min(min, arr[i]);
      max = Math.max(max, arr[i]);

    }
    System.out.println("Largest element in the array is : " + max);
    System.out.println("Smallest element in the array is : " + min);

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 7, 3, 9, 8, 9 };

    Ans(arr);

  }
}
