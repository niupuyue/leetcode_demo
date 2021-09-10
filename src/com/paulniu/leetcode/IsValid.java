package com.paulniu.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * <p>
 * 示例1：
 * 输入：s = "()"
 * 输出：true
 * <p>
 * 示例2：
 * 输入：s = "()[]{}"
 * 输出：true
 * <p>
 * 示例3：
 * 输入：s = "(]"
 * 输出：false
 */
public class IsValid {

    public static void main(String[] args) {
        System.out.println("result = " + isValid("()(){}[]"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>() {{
            put('{', '}');
            put('[', ']');
            put('(', ')');
            put('?', '?');
        }};
        if (s.length() > 0 && !map.containsKey(s.charAt(0)))
            return false;
        LinkedList<Character> stack = new LinkedList<>() {{
            add('?');
        }};
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c))
                stack.addLast(c);
            else if (map.get(stack.removeLast()) != c)
                return false;
        }
        return stack.size() == 1;
    }

}
