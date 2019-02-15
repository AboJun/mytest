package com.heima.StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        String str = "abcdghjirnbajiknbanba";
        String key = "nba";
        String str2 = "abafd";
        int count = getKeyStringCount(str, key);
        System.out.println(count);

        System.out.println(getMaxSubString(str, str2));
    }

    public static int getKeyStringCount(String str, String key) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(key, index)) != -1) {
            index += key.length();
            count++;
        }
        return count;
    }

    public static String getMaxSubString(String str1, String str2) {
//      找到长度较短的字符串
        String max = null;
        String min = null;
        max = (str1.length() > str2.length()) ? str1 : str2;
        min = max.equals(str1) ? str2 : str1;
        for (int i = 0; i < min.length(); i++){

            for (int a = 0, b = min.length() - a; b != min.length() + 1; b++, a++) {
                String sub = min.substring(a, b);
                if (max.contains(sub)) {
                    return sub;
                }
            }
        }
        return  null;
    }
}
