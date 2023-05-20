// 숫자 짝꿍
package test2305.test230516;

import java.util.Arrays;

public class Lev1_15 {
    public static void main( String[] args ) {
        Lev1_15 lev = new Lev1_15();

        System.out.println( lev.solution( "100", "2345" ) );
        System.out.println( lev.solution( "100", "203045" ) );
        System.out.println( lev.solution( "100", "123450" ) );
        System.out.println( lev.solution( "12321", "42531" ) );
        System.out.println( lev.solution( "5525", "1255" ) );
    }

    public String solution( String X, String Y ) {
        char[] ch_x = X.toCharArray();
        char[] ch_y = Y.toCharArray();
        Arrays.sort( ch_x );
        Arrays.sort( ch_y );
        StringBuilder sb_x = new StringBuilder( new String( ch_x ) );
        StringBuilder sb_y = new StringBuilder( new String( ch_y ) );
        StringBuilder ans = new StringBuilder();
        sb_x = sb_x.reverse();  //32211
        sb_y = sb_y.reverse();  //54321
        for ( int i = 0 ; i < sb_x.length() ; i++ ) {
            for ( int j = 0 ; j < sb_y.length() ; j++ ) {
                if ( sb_x.charAt( i ) == sb_y.charAt( j ) ) {
                    ans.append( sb_x.charAt( i ) );
                    sb_y = sb_y.delete( 0, j + 1 );
                }
            }
        }
        if ( ans.length() == 0 ) {
            return "-1";
        }
        int count = 0;
        for ( int i = 0 ; i < ans.length() ; i++ ) {
            if ( ans.charAt( i ) == '0' ) {
                count++;
            }
        }
        if ( count == ans.length() ) {
            return "0";
        }
        return ans.toString();
    }

}

//6, 7, 8, 9, 10 : 실패, 11, 12, 13, 14, 15 : 시간 초과
//Stringbuilder로 바꿔서 해보기
//6, 7, 8, 9, 10: 실패, 11, 12, 13, 14, 15 : 시간 초과
// 일단 방법 자체가 틀린 거 같다..ㅣ