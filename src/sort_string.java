import java.util.Arrays;
import java.util.Scanner;

public class sort_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.println("Enter the string to sort");
        str = sc.nextLine();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        StringBuilder sort_str = new StringBuilder();

        for (int i=0; i<arr.length; i++)
        {
            sort_str.append(arr[i]);
        }

        System.out.println(sort_str);
    }
}
