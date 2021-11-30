public class Problem389 {
    public static void main(String[] args) {
        Problem389 p = new Problem389();
        char result = p.findTheDifference("abcd", "abcde");
        System.out.println(result);

    }

    public char findTheDifference(String s, String t) {
        int[] array = new int[26];
        for (char c : s.toCharArray()) {
            array[c - 97]++;
        }
        for (char c : t.toCharArray()) {
            array[c - 97]--;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return (char) (i + 97);
            }
        }
        throw new RuntimeException();
    }

}
