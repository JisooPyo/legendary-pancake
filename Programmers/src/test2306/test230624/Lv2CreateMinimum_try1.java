package test2306.test230624;

import java.util.Arrays;

public class Lv2CreateMinimum_try1 {
    public static void main(String[] args) {
        Lv2CreateMinimum_try1 lv = new Lv2CreateMinimum_try1();

        int[] t1_1 = {1, 4, 2};
        int[] t1_2 = {5, 4, 4};

        int[] t2_1 = {1, 2};
        int[] t2_2 = {3, 4};

        System.out.println(lv.solution(t1_1, t1_2));
        System.out.println(lv.solution(t2_1, t2_2));
    }

    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - 1 - i];
        }
        return answer;
    }

}
