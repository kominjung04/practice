class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String a = my_string.substring(0,s);//시작부분 - 자르기전 부분
        my_string.substring(s,overwrite_string.length()+s); //문자열 자른 부분
        String b = my_string.substring(overwrite_string.length()+s);//자른부분부터 끝문자
        answer = a + overwrite_string + b;
        return answer;
        
    }
}