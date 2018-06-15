package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberGame {
	public static int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(B);
		List<Integer> BL = Arrays.stream(B).boxed().collect(Collectors.toList());
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < BL.size(); j++) {
				if (BL.get(BL.size() - 1) <= A[i]) {
					break;
				}
				if (BL.get(j) > A[i]) {
					BL.remove(j);
					answer++;
					break;
				}
			}
		}
		return answer;

	}
}
