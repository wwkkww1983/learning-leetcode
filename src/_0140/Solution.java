package _0140;

import java.util.*;

/**
 * 运行超时
 */
public class Solution  {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return word_Break(s, new HashSet<>(wordDict), 0);
    }

    public List<String> word_Break(String s, Set<String> wordDict, int start) {
        ArrayList<String> suffix = new ArrayList<>();
        if (start == s.length()){
            suffix.add("");
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String temp = s.substring(start, end);
            if (wordDict.contains(temp)) {
                List<String> list = word_Break(s, wordDict, end);
                for (String e :
                        list) {
                    suffix.add(s.substring(start, end) + ("".equals(e) ? "" : " ") + e);

                }

            }
        }
        return suffix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> results = solution.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
        System.out.println(results);
    }
}
