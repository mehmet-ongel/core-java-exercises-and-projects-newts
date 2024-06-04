package stringclassexample;

import java.util.Arrays;

public class UsefulMethodsOfString {

	public static void main(String[] args) {
		
		String s1 = "Java Developers";
		String s2 = "Hello";
		String s3 = "hello";
		
		//J a v a   D e v e l o  p  e  r  s
		//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 -> index number
		
		
		//charAt()
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(s1.length() - 1));
		
		//indexOf()
		System.out.println(s1.indexOf("p"));
		System.out.println(s1.indexOf("v",5));
		System.out.println(s1.indexOf("lop"));
		System.out.println(s1.indexOf("lop",25));
		
		//Substring()
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,12));
		
		//equalsIgnoreCase()
		System.out.println(s2.equalsIgnoreCase(s3));
		
		//startsWith()
		System.out.println(s2.startsWith("Hel"));
		
		//endsWith()
		System.out.println(s1.endsWith("ers"));
		
		//contains()
		System.out.println(s1.contains("op"));
		System.out.println(s1.contains("J".toLowerCase()));
		
		//replace()
		System.out.println(s1.replace(' ', '-'));
		
		//trim()
		System.out.println("   Hello Java World  ");
		System.out.println("   Hello Java World  ".trim());
		
		
		
		
		/*
		String str1 = "Hello Java Developers";
		String str2 = "Java is fun.";
		String[] str3;
		
		System.out.println("str1: " + str1);
		System.out.println("Length of str1: " + str1.length());
		System.out.println("The first character of str1: " + str1.charAt(0));
		System.out.println("Is str1 empty ? " + str1.isEmpty());
		System.out.println("Substring: " + str1.substring(6));
		System.out.println("str1 is equal to str2 ? " + str1.equals(str2));
		System.out.println("str1 + str2 : " + str1.concat(" " + str2));
		System.out.println("str1 in lowercase: " + str1.toLowerCase());
		System.out.println("str1 in uppercase: " + str1.toUpperCase());
		System.out.println("Replace l with L : " + str1.replace('l', 'L'));
		str3 = str1.split(" ");
		System.out.println("str3: " + Arrays.toString(str3));
		*/
		

	}

}
