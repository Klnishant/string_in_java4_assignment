public class reverse_string {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("PWSKILLS");
        str.insert(2," ");
        StringBuilder rev_str = new StringBuilder("");

        String word = str.toString();
        String[] arr = word.split(" ");

        for (int i= arr.length-1; i<=1; i++)
        {
            char[] arr2 = arr[i].toCharArray();
            for (int j=arr2.length-1; j>=0; j--)
            {
                rev_str.append(arr2[j]);
            }
        }
        rev_str.append(arr[0]);
        System.out.println(rev_str);
    }
}
