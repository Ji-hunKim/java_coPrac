package programmers;

public class No6 {
	public int[] solution(int[] lottos, int[] win_nums) {
		//로또 
        int temp = 0;
        int zero = 0;
        for(int i : lottos){
            if(i == 0){
                zero ++;
            }
            for(int j : win_nums){
                if(i == j){
                    temp++;
                }
            }
        }
        if (temp == 0){
            temp = 1;
            if(zero == 6){
                zero--;
            }
        }
        
        
        int[] answer = {7-temp-zero, 7-temp};
        return answer;
    }

}
