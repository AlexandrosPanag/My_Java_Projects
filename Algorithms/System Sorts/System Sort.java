//By Alexandros Panagiotakopoulos - alexandrospanag.github.io
// Example of using a Java system sort



import java.util.Arrays;
  
class Mavenproject1 {
    public static void main(String args[])
    {
        int[] arr = { 1, -2, 3, 7, 87, -42, 509 };
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}