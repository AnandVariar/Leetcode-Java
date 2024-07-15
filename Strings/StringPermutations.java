package Strings;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        permutations(str.toCharArray(), 0);
    }

    public static void permutations(char[] arr, int fi) {
        if (fi == arr.length - 1) {
            System.out.println(arr);
            return;
        }

        for (int i = fi; i < arr.length; i++) {
            swap(arr, i, fi);
            permutations(arr, fi + 1);
            swap(arr, i, fi);
        }
    }

    public static void swap(char[] arr, int i, int fi) {
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }

}
