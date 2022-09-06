package programmers;

import java.util.HashMap;
import java.util.Map;

public class No14 {
	public String solution(String[] participant, String[] completion) {
		// 완주하지 못한 선수 
		String answer = "";

		Map<String, Integer> hm = new HashMap<>();

		for (String p : participant) {
			hm.put(p, hm.getOrDefault(p, 0)+1);
		}

		for (String c : completion) {
			hm.put(c, hm.get(c) - 1);
		}

		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
				break;
			}
		}

		return answer;
	}
}

