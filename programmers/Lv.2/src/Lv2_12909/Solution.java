package Lv2_12909;
import java.util.*;
public class Solution {
    public static void main(String[] args){
        String s = "(())()";
        boolean answer = solution(s);
        System.out.println(answer);
    }
   public static boolean solution(String s){
        char[] arr = s.toCharArray(); // 매개변수로 받은 괄호 문자열을 char 배열에 하나씩 저장
        Stack<Character> stack = new Stack<>();

        for(char a : arr){
            if(a == '('){ // a가 열린 괄호라면 스택에 저장
                stack.push(a);
            }else{ // 만약 a가 닫힌 괄호가 나오고 스택이 비어있다면 짝이 맞지 안는 것이니 false를 리턴하고
                    // 그것이 아니라면 pop을 해서 괄호를 상쇄한다.
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){ //반목문이 다 끝나고 스택이 비어있지 않았다면 짝이 맞지 않는 것이니 false를 리턴하고 비어있다면 짝이 맞으니 true를 리턴
            return false;
        }else
            return true;
    }

}
