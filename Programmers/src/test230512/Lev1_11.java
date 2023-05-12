package test230512;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lev1_11 {
    public static void main( String[] args ) {
        Lev1_11 lev = new Lev1_11();

        System.out.println(lev.solution( "1S 2D* 3T" ));
        System.out.println(lev.solution( "1D 2S# 10S" ));
        System.out.println(lev.solution( "1D 2S 0T" ));
        System.out.println(lev.solution( "1S* 2T* 3S" ));
        System.out.println(lev.solution( "1D# 2S* 3S" ));
        System.out.println(lev.solution( "1T 2D 3D#" ));
        System.out.println(lev.solution( "1D 2S 3T*" ));
    }
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = {0,1,2,3,4,5,6,7,8,9,10};
        String[] bonus = {"S","D","T"};
        String[] option = {"*","#"};

        return answer;
    }

}

//    Pattern p = Pattern.compile( "^([0-9]*)[A-Z][*|#]?$" );
//        String str = "1S";
//        Matcher matcher = p.matcher( str );
//        System.out.println(matcher.find());

// ^([0-9]*)[A-Z]$  10D true
// ^([0-9]*)[A-Z][*|#]$     10D false
// ^([0-9]*)[A-Z][*|#]?$    10D true
