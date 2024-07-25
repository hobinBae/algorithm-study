package Lv1_12910;
import java.util.*;
public class Solution {
    public static void main(String[] args){
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        int[] answer = solution(arr, divisor);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] arr, int divisor){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            int[] a = {-1};
            return a;
        }else{
            return list.stream().sorted((a,b) -> a - b).mapToInt(Integer::intValue).toArray();
        }
    }
}
