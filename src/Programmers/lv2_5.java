package Programmers;

import java.util.Stack;

public class lv2_5 {
    //올바른 괄호
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');
            }else if(s.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        System.out.println(solution("()()"));
        System.out.println(solution(")()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));

        return ;
    }
}
