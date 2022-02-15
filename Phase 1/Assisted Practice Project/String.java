package com.javatraining;

public class String {

	public static void main(String[] args) {
		
		String name = new String("Saurabh");
        String name = "Saurabh";
        System.out.print("The name is: ");
        System.out.print(name);
        int a = 6;
        float b = 5.6453f;
        System.out.printf("The value of a is %d and value of b is %f", a, b);
        System.out.format("The value of a is %d and value of b is %f", a, b);

      Scanner sc = new Scanner(System.in);
      String st = sc.nextLine(); // Used for print all words
      System.out.println(st);
      
      //String Method
      
//    String name = "Saurabh";
//    System.out.println(name);

//     // for length
//    int value = name.length();
//    System.out.println(value);
//
//    // for lower case
//    String lstring = name.toLowerCase();
//    System.out.println(lstring);
//
//    // for upper case
//    String ustring = name.toUpperCase();
//    System.out.println(ustring);

    // for trim
//    String nonTrimmedString = "      Saurabh     ";
//    System.out.println(nonTrimmedString);
//
//    String trimmedString = nonTrimmedString.trim();
//    System.out.println(trimmedString);

    // substring (int start)
//    System.out.println(name.substring(3)); // rabh
//    System.out.println(name.substring(1)); // aurabh
//
//
//    System.out.println(name.substring(1,4)); //  saurabh = aur

    // replace
//    System.out.println(name.replace('u', 'o')); // Saurabh = Saorabh

    // startsWith returns true or false
//    System.out.println(name.startsWith("Ka")); // Print false because name Starts with Sa
//    System.out.println(name.startsWith("Sa")); // true

    // endswith
//    System.out.println(name.endsWith("bh")); // true

    // returns character at a given index position
//    System.out.println(name.charAt(3));  // Saurabh = return r at index position 3

//    System.out.println(name.indexOf("u")); // tell the position of letter in a word.. ans is 2
//    System.out.println(name.indexOf("u", 2));

//    String modifiedName = "Aarryrry";
//   System.out.println(modifiedName.indexOf("rry"));
//   System.out.println(modifiedName.indexOf("rryddw")); // returns -1

//    System.out.println(modifiedName.indexOf("rry", 4));
//    System.out.println(modifiedName.indexOf("rry1", 4)); // returns -1

    // last index of
//    System.out.println(name.lastIndexOf("bh")); // 5

//    String modifiedName = "Saurabh"; // 2
//   System.out.println(modifiedName.lastIndexOf("b", 5));

    // equals then true
//    System.out.println(name.equals("Saurabh"));

    // equals ignore case
//    System.out.println(name.equalsIgnoreCase("Saurabh")); // true
//    System.out.println(name.equalsIgnoreCase("Saurtbh")); // false


	}

}
