package test2306.test230602;

import java.util.ArrayList;

public class Test01 {
    public static void main( String[] args ) {
        String[] a = new String[] { "a", "b", "c", "d" };
        String[] b = new String[] { "a", "b", "c", "d" };
        String c = "a";
        String d = "a";
        System.out.println( a.equals( b ) );
        System.out.println( c.equals( d ) );


        ArrayList< String[] > list = new ArrayList<>();
        list.add( new String[] { "a", "b", "c", "d" } );
        System.out.println( list.contains( a ) );   // false

    }
}
