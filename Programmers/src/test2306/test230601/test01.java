package test2306.test230601;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test01 {
    public static void main( String[] args ) {
        List< String[] > list = new ArrayList<>();
        String[] strArr1 = { "a", "b", "c", "d" };
        String[] strArr2 = { "e", "f", "g", "h" };
        list.add( strArr1 );
        list.add( strArr2 );
        for ( int i = 0 ; i < list.size() ; i++ ) {
            System.out.println( "index : " + i + ", " + Arrays.toString( list.get( i ) ) );
        }

        System.out.println( list.contains( strArr1 ) );
        if ( list.contains( strArr1 ) ) {
            list.remove( strArr1 );
        }

        for ( int i = 0 ; i < list.size() ; i++ ) {
            System.out.println( "index : " + i + ", " + Arrays.toString( list.get( i ) ) );
        }

    }
}
