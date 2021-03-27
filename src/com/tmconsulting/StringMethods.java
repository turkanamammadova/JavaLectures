package com.tmconsulting;

public class StringMethods {

    public static void main(String[] args) {

        String str = "This is test string";

        String str1 = "hello";
        String str2 = "hello";
        String str3 = "Welcome";

        String str4 = "";
        String str5 = "  heey  ";
        String str6 = "Hello";

        System.out.println(str.length()); //length of the string


        //charAt() returns a char value at the given index number
        System.out.println(str.charAt(2));

        //concat() combines specified string at the end of this string
        System.out.println(str.concat("appended string"));

        //contains() returns true if chars are found in the string
        System.out.println(str.contains("is"));
        System.out.println(str.contains("si")); //false

        //startsWith() checks if this string starts with given prefix
        System.out.println(str.startsWith("This"));
        System.out.println(str.startsWith("tur"));

        //endsWith() checks if this string ends with given suffix
        System.out.println(str.endsWith("ing"));

        //equals() compares the content of two given strings
        System.out.println(str1.equals(str2));
        System.out.println(str.equals(str3)); //false

        //indexOf() returns index of given character value or substring
        System.out.println(str.indexOf('h')); //if not exist char -1

        //isEmpty() checks if this string is empty
        System.out.println(str.isEmpty());

        //replace() returns a string replacing all the old char to a new char
        System.out.println(str6.replace('e', 'a'));

        //substring() returns a part of string
        System.out.println("Substring example 1: " + str.substring(5));
        System.out.println("Substring example 2 " + str.substring(5, 10) );

        //toCharArray() it coverts the string to character array
        char[] charArray =  str.toCharArray();
        for(int i = 0; i<charArray.length; i++){
            System.out.println("Index " + i + " is " + charArray[i]);
        }

        //toLowerCase()
        System.out.println(("Lower case " + str.toLowerCase()));

        //toUpperCase() each character to lower case
        System.out.println("Upper case" + str.toUpperCase());

        //trim() eliminates leading and trailing spaces
        System.out.println(str5.trim());


    }
}
