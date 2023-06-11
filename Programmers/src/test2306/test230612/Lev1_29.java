// 신고 결과 받기
package test2306.test230612;

import java.util.Arrays;

public class Lev1_29 {
    public static void main( String[] args ) {

        Lev1_29 lev = new Lev1_29();

        String[] t1_1 = { "muzi", "frodo", "apeach", "neo" };
        String[] t1_2 = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
        int t1_3 = 2;

        String[] t2_1 = { "con", "ryan" };
        String[] t2_2 = { "ryan con", "ryan con", "ryan con", "ryan con" };
        int t2_3 = 3;

        System.out.println( Arrays.toString( lev.solution( t1_1, t1_2, t1_3 ) ) );
        System.out.println( Arrays.toString( lev.solution( t2_1, t2_2, t2_3 ) ) );

    }

    public int[] solution( String[] id_list, String[] report, int k ) {
        int[] answer = { };

        return answer;
    }
}
