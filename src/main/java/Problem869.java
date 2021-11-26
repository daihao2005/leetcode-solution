import java.util.*;

public class Problem869 {

    public static void main(String[] args) {

        Problem869 s = new Problem869();
        boolean r = s.reorderedPowerOf2(679213508);
        System.out.println(r);

    }

    public boolean reorderedPowerOf2(int n) {
        int tmp = n;
        int[] cnt = new int[10];

        while (tmp > 0) {
            int y = tmp % 10;
            cnt[y]++;
            tmp = tmp / 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (cnt[i] == 0) {
                continue;
            }

            sb.append(i).append(cnt[i]);
        }
        String key = sb.toString();
        Set<String> set = getAllMatchStr();
        return set.contains(key);
    }

    private Set<String> getAllMatchStr() {
        Set<String> set = new HashSet<>();
        set.add("11");
        set.add("21");
        set.add("41");
        set.add("81");
        set.add("1161");
        set.add("2131");
        set.add("4161");
        set.add("112181");
        set.add("215161");
        set.add("112151");
        set.add("01112141");
        set.add("01214181");
        set.add("01416191");
        set.add("11218191");
        set.add("1131416181");
        set.add("2131617181");
        set.add("315262");
        set.add("0112213171");
        set.add("11224261");
        set.add("22415182");
        set.add("01114151617181");
        set.add("011122517191");
        set.add("0111314391");
        set.add("01316184");
        set.add("12216273");
        set.add("21334252");
        set.add("011141627182");
        set.add("122231417281");
        set.add("213142526281");
        set.add("011121315161718191");
        return set;
    }

}
