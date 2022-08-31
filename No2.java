package programmers;

public class No2 {
	public int solution(int[] absolutes, boolean[] signs) {
		//음양더하
        int answer = 0;
        for(int i=0;i<signs.length;i++){
            if (signs[i] == true){
                answer += absolutes[i];
            }
            else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
