package org.projects;

public class String_Functions{
	
	public static void main(String[] args) {
		
		 String s="Welcome to Java";
		 
 //s.length---returns string length
		 int length = s.length();                   
		 System.out.println(length);
		 
//s.equals---checks condition whether T/F
		 //boolean equals = s.equals("Welcome to java");
		 //System.out.println(equals);
		 
		 boolean equals2 = s.equals("Welcome to Java");
		 System.out.println(equals2);
		 
//s.equalsIgnoreCase---ignores case		 
		 boolean equalsIgnoreCase = s.equalsIgnoreCase("welcome to java");
		 System.out.println(equalsIgnoreCase);
		 
//s.toUpperCase---to return upper case
		 String upperCase = s.toUpperCase();
		 System.out.println(upperCase);
		 
//s.toLowerCase---to return lowercase
		 String lowerCase = s.toLowerCase();
		 System.out.println(lowerCase);
		 
		 //String lower = s.toLowerCase();
         //System.out.println(s.toLowerCase());
	     //System.out.println(lower);
		 
//s.startsWith---checks if this string starts with given prefix
		 boolean startsWith = s.startsWith("W");
		 System.out.println(startsWith);
		 
		 //boolean sw = s.startsWith("Welc");
		 //System.out.println(sw);
		 
//s.endsWith---checks if this string ends with given suffix
		 boolean endsWith = s.endsWith("a");
		 System.out.println(endsWith);
		 
		 //boolean ew = s.endsWith("Java");
		 //System.out.println(ew);
		 
//s.contains---method searches the sequence of characters in this string
		 boolean contains = s.contains("to");
		 System.out.println(contains);
		 
//s.indexOf---value method returns index of given character value		 
		 int indexOf = s.indexOf("o");
		 System.out.println(indexOf);      //takes 1st character of index value
		 
//s.lastIndexOf---value returns last index of the given character value	 
		 int lastIndexOf = s.lastIndexOf("o");
		 System.out.println(lastIndexOf);  //takes last character of index value
		 
//s.charAt---index returns a char value at the given index number
		 char charAt = s.charAt(12);
		 System.out.println(charAt);
		 
//s.replace---returns a string replacing all the old character to new character
		 String replace = s.replace("to", "TO");
		 System.out.println(replace);
		 
		 //String replace2 = s.replace("o", "O");
		 //System.out.println(replace2);
		 
//s.substring---removes a string
		 String substring = s.substring(3);
		 System.out.println(substring);
  
		 //String substring2 = s.substring(1, 5);
		 //System.out.println(substring2);
		 
//s.isEmpty---checks whether the string is empty or not		 
		 boolean empty = s.isEmpty();
		 System.out.println(empty);
		 
//s.split---split the word
		 String[] split = s.split(" ");
		 //System.out.println(split);      //error occurs
		 for (String spl : split) {
			System.out.println(spl);
		}
		 
		 //String[] split2 = s.split("");
		 //for (String spl : split2) {
			//System.out.println(spl);
	 //}
		
		 //String[] split2 = s.split("o");
		 //for (String spl : split2) {
			//System.out.println(spl);
	//}
//s.trim---removes unwanted spaces
		 
		 String s1 = "java   world";  //removes front & back spaces only
		 String trim = s1.trim();
		 System.out.println(trim);
		 
//s.concat---combines the values
		 //String s2 = "Java";
		 String concat = s.concat(s1);
		 System.out.println(concat);
		 //String concat2 = s.concat(s2);
		 //System.out.println(concat2);
		 //String concat2 = s.concat(s1).concat("world");
		 //System.out.println(concat2);
		 
//s.compareTo---compare two values		 
		 int compareTo = s.compareTo(s1);     //ASCII Values  W=87,j=106
		 System.out.println(compareTo);
		 //String s3 = "java";
		 //String s4 = "jeva";
		 //int compareTo2 = s3.compareTo(s4);
		 //System.out.println(compareTo2);
		 
		 //String s3 = "java";               //same value then zero
		 //String s4 = "java";
		 //int compareTo2 = s3.compareTo(s4);
		 //System.out.println(compareTo2);
		
	}
}
