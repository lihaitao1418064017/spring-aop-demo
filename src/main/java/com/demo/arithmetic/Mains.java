package com.demo.arithmetic;

/**
 * @author LiHaitao
 * @description Mains:
 * @date 2019/10/17 9:02
 **/

import java.util.HashSet;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Mains {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(lengthOfLongestSubstring("ftmupfnqqtwxyixmga"));
        System.out.println(System.currentTimeMillis() - start);//2231908103
    }

    public static boolean isRepeat(String str) {
        HashSet<Character> hashSet = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            hashSet.add(str.charAt(i));
        }
        return hashSet.size() == str.length();
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        if (isRepeat(s)) {
            return s.length();
        }

        if (lengthOfLongestSubstring(s.substring(0, s.length() - 1)) >= lengthOfLongestSubstring(s.substring(1, s.length()))) {
            return lengthOfLongestSubstring(s.substring(0, s.length() - 1));
        }
        return lengthOfLongestSubstring(s.substring(1, s.length()));
    }

}



