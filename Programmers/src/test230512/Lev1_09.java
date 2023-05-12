// 실패율
package test230512;

import java.util.Arrays;

public class Lev1_09 {
    public static void main( String[] args ) {
        Lev1_09 lev = new Lev1_09();

        int[] t1 = { 2, 1, 2, 6, 2, 4, 3, 3 };
        int[] t2 = { 4, 4, 4, 4, 4 };

        System.out.println( Arrays.toString( lev.solution( 5, t1 ) ) );
        System.out.println( Arrays.toString( lev.solution( 4, t2 ) ) );
    }

    public int[] solution( int N, int[] stages ) {
        Arrays.sort( stages );
        int[] answer = new int[N + 1];
        double[] failure_rate = new double[N + 1];
        int clear = 0;
        int unclear = 0;
        System.out.println( Arrays.toString( stages ) );
        for ( int i = 1 ; i <= N ; i++ ) {
            clear = clear - unclear;
            if ( clear == 0 ) {
                clear = stages.length;
                for ( int j = 0 ; j < stages.length ; j++ ) {

                }
            }

        }


        return answer;
    }
}


