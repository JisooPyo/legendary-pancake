package test2306.test230617;

public class LV2JadenCase {
    public static void main( String[] args ) {
        LV2JadenCase lv = new LV2JadenCase();
        String t1 = "3people unFollowed me";
        String t2 = "for the last week";

        System.out.println( lv.solution( t1 ) );
        System.out.println( lv.solution( t2 ) );

    }

    public String solution( String s ) {
        String[] split = s.split( " " );
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < split.length; i++ ) {
            StringBuilder temp = new StringBuilder();
            temp.append( split[i].toLowerCase() );
            if ( 97 <= temp.charAt( 0 ) && temp.charAt( 0 ) <= 122 ) {
                temp.setCharAt( 0, (char) ( temp.charAt( 0 ) - 32 ) );
            }
            sb.append( temp );
            sb.append( " " );
        }
        sb.deleteCharAt( sb.length() - 1 );
        return sb.toString();
    }

}

