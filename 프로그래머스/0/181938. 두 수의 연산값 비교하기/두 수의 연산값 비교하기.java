class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        //Integer.parseInt() - 정수형으로 변환
        //String.valueOf() - 문자형 변환
        int sa = Integer.parseInt(String.valueOf(a) + String.valueOf(b)); 
        int ab2 = 2 * a * b; 
        if(sa>ab2) answer = sa;
        else answer = ab2;
        return answer;
    }
}