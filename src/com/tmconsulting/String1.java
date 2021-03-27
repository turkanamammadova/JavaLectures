package com.tmconsulting;


public class String1 {

    /*Given a string, return a a string without first and last chars
    example: Hello "ell", java "av"
     */

    public String withoutEnd(String str) {
        String lastTwo = str.substring(1, str.length()-1);
        //print from first index till one before
        if(str.length() >= 2){
            return lastTwo;
        }else {
            return str;
        }
    }

    /*
    given 2 strings, return a string of the form short+long+short
    shorter string outside, longer inside.
    example: "Hello" "Hi" --> hiHellohi, "aaa", "b", baaab
     */
   public String combineStrings(String a, String b){
       if(a.length() >= b.length()){
           return b+a+b;
       } else{
           return a+b+a;
       }
   }

   /*
   Given 2 Strings, return their concatenation, remove first char of each
       example: "Hello", "There"  --> ellohere
                "java", "code" --> avaode
    */
    public String omitFirstChar(String a, String b){
        String first = a.substring(1);
        String second = b.substring(1);
        return first+second;
    }

    /*
    given a string, return the first half
    example: "HelloThere" --> "Hello"
     */

    public String firstHalf(String a){
        String fHalf = a.substring(0, a.length()/2);
        return fHalf;
    }

    /*
    given a string of even length, return a string made of the middle 2 chars
    "string" ri, "code" od
     */

    public String middleChar(String str){
        int len = str.length()/2;
        return str.substring(len-1, str.length()-(len-1));
    }

    /*
    given a String, return a rotated left 2 version where the first 2 chars are moved to the end.
    The string length will be at least 2. "Hello --> lloHe    java --> vaja
    Hello -> llo+He

   first two char --> str.substring(0,2)
   rem string -> str.substring(2) after first 2 character
     */

    public String left2(String str){
        return str.substring(2) + str.substring(0,2);
    }

    /*
    given a String return a rotated right 2, version where the last 2 chars are moved to the start
    the string length will be at least 2
    "Hello" --> loHel
    Hello -> lo + Hel
    last two -> str.substring(str.length - 2);
    first -> str.substring(0, str.length()-1); what it could be, except last 2 characters
     */
    public String right2(String str){
        String lastTwo = str.substring(str.length()-2);
        String firstHalf = str.substring(0, str.length()-1);
        return lastTwo+firstHalf;
    }

    /*
    given a string,
    "Hello" true --> H false
    "Hello" false o last character
     */

    public String theEnd(String str, boolean front){
        if(front){
            return str.substring(0,1);

        }else {
            return str.substring(str.length()-1);
        }
    }


    public static void main(String[] args) {

        String1 obj = new String1();
//        System.out.println(obj.combineStrings("i", "chicago"));
//        System.out.println(obj.withoutEnd("turkana"));
//        System.out.println(obj.omitFirstChar("Chicago", "Baku"));
//        System.out.println(obj.firstHalf("HelloThere"));
//        System.out.println(obj.middleChar("Hellom"));
        System.out.println(obj.left2("java"));
        System.out.println(obj.right2("Hello"));
        System.out.println(obj.theEnd("Hello", true));

    }
}