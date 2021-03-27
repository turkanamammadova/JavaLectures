package com.tmconsulting;


public class String_1 {
    //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    //TASK4: print Salam Azerbaijan! (or any other country)

 /*
 "<i>Yay</i>".
 */

    public String makeTags(String tag, String word) {

        return "<" + tag + ">" + word + "</" + tag + ">";
    }
    //TASK3: make this tag <html>CSS</html>"

    // <<word>>
    public String makeOutWord(String out, String word) {
        //get first 2 character
        return out.substring(0, 2) + word + out.substring(2);
    }

    //Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    // The string length will be at least 2. extraEnd("Hello") → "lololo"

    public String extraEnd(String str) {
        String x = str.substring(str.length() - 2);
        return x + x + x; //}
    }

    /*
    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"
    firstTwo("ab") → "ab"
    */
    public String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }


    public static void main(String[] args) {

        String_1 obj = new String_1();
        System.out.println(obj.makeTags("i", "chicago"));
        System.out.println(obj.helloName("turkana"));
        System.out.println(obj.makeOutWord("<<", "Baku>>"));
        System.out.println(obj.extraEnd("lo"));
        System.out.println(obj.firstTwo("Hello"));

    }
}