package programmers;

import java.util.ArrayList;

public class No11 {
	//폰켓몬
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;
        
        ArrayList arr = new ArrayList();
        
        for(int i:nums){
            if(!arr.contains(i)){
                arr.add(i);
                cnt++;
            }
            if(cnt == nums.length/2){
                break;
            }
        }
        return arr.size();
    }
}
