package programmers;

public class No4 {
	public int solution(String s) {
		// 숫자 문자열과 영단어
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};  
        
        for(int i=0; i<10; i++){
            s = s.replace(num[i], Integer.toString(i));
        }
        
        int answer = Integer.parseInt(s);
        
        return answer;
    
    }
}
