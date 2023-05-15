// 숫자 짝꿍
package test230515;

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
        String ans = "";
        char[] ch_x = X.toCharArray();
        char[] ch_y = Y.toCharArray();
        Arrays.sort( ch_x );
        Arrays.sort( ch_y );
        X = new String( ch_x );
        Y = new String( ch_y );
        for ( int i = 0 ; i < X.length() ; i++ ) {
            for ( int j = 0 ; j < Y.length() ; j++ ) {
                if ( X.charAt( i ) == Y.charAt( j ) ) {
                    ans += X.charAt( i );
                    Y = Y.substring( j + 1 );
                }
            }
        }
        if ( ans.length() == 0 ) {
            return "-1";
        }
        String answer = "";
        for ( int i = ans.length() - 1 ; i >= 0 ; i-- ) {
            answer += ans.charAt( i );
        }
        return Integer.toString( Integer.parseInt( answer ) );
    }

}
