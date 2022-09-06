package programmers;

public class No10 {
	public int solution(int[] numbers) {
		//없는숫자더하기 
        int answer = 45;
        for (int i : numbers){
            answer -= i;
        }

        return answer;
    }
}
