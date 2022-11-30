package programmers.lv1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 자연수 뒤집어 배열로 만들기
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 12345	[5,4,3,2,1]
 */
public class ReverseArr {

    public static void main(String[] args) {

    }

    public int[] solution(long n) {
        String stringN = String.valueOf(n);
        String[] stringNSplit = stringN.split("");
        int[] arr = new int[stringNSplit.length];
        int j = 0;
        for (int i = stringNSplit.length - 1; i >= 0; --i) {
            arr[j++] = Integer.parseInt(stringNSplit[i]);
        }

        return arr;
    }
}
