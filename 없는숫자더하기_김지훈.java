package programmers;

public class Solution { //없는숫자더하기 
	public int solution(int[] numbers) {
        int answer = 45;
        for (int i : numbers){
            answer -= i;
        }

        return answer;
    }
}
