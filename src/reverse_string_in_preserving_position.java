public class reverse_string_in_preserving_position {
    public static void main(String[] args) {
        String str = "Think Twice";
        str = str.toLowerCase();
        StringBuilder rev_str = new StringBuilder();
       String[] arr = str.split(" ");

        for (int i=0; i<arr.length; i++)
        {
            char[] arr2 = arr[i].toCharArray();
            for (int j=arr2.length-1; j>=0; j-- )
            {
                rev_str.append(arr2[j]);
                if (j==0)
                {
                    rev_str.append(" ");
                }
            }
        }
        System.out.println(rev_str);
    }
}
