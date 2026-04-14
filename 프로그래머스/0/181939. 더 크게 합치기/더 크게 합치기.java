class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sa = Integer.parseInt(String.valueOf(a) + String.valueOf(b)); //String형변환
        int sb = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        if(sa>sb) answer = sa;
        else answer = sb;
        return answer;
    }
}