package stringpackage;

public class StringFunctions {

	public static void main(String[] args) {
		
		String s = "Harpreet Kaur Chauhan       ";
		String s1 = new String("hello");
		
		
		//Case sensitive Comparing
		
		boolean areStringsEqual = s.equals(s1);
		
		System.out.println("Two strings are equal : "+areStringsEqual);
		
		//Case in-sensitive Comparing
		
		areStringsEqual = s.equalsIgnoreCase(s1);
		System.out.println("Two strings are equal : "+areStringsEqual);
		
		//Find no of characters in the String
	    System.out.println("length of my string is : "+s.length());
	    
	    //Remove empty spaces from front and end of string
	    System.out.println("length of my string is : "+s.trim().length());
	    
	    String accountType ="Chequing      ";
	    
	    if(accountType.trim().equalsIgnoreCase("chequing")) {
	    	System.out.println("Do transaction from account : "+accountType);
	    }else {
	    	System.out.println("Account type does not match");
	    }
		
		//Find exactly where a character is located
	    System.out.println( "Index of string Kaur : "+s.indexOf("Kaur"));
	    
	    System.out.println("Index of char a after Harpreet " +s.indexOf('a', 9));
		
		//Index of a word in a statement
	    System.out.println( "Index of string Kaur : "+s.indexOf("Kaur"));
	    
	    //Find a word in statement
	    System.out.println( "s contains  string Kaur : "+s.contains("Kaur"));
	    
	    
	   String name=s;
	   System.out.println("is name string empty : "+name.isBlank());
	   
		// Replace a word/character
	   String newName=s.replace("Chauhan", "Gill");
	    
	    System.out.println("name changed to "+s);
		
		
		System.out.println("Compare : "+name.compareTo(newName));
		
		//System.out.println("Replace characters "+s.replaceAll("a","e"));
		
		System.out.println(s.substring(s.indexOf("Harpreet"), s.indexOf("Kaur")));
		
		String stmt = "Canada is best country in world";
		
		System.out.println(stmt.substring(stmt.indexOf("best"),stmt.indexOf("in")).trim());
		
	}
}
