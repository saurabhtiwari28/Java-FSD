package com.javatraining;

public class Arrays {

	public static void main(String[] args) {
		// 1
        int [] marks; //--> Declaration
        marks = new int[50]; //--> Memory Allocation

        marks[0] = 44;
        marks[1] = 45;
        marks[2] = 43;
        marks[3] = 64;
        marks[4] = 62;
        marks[4] = 51;  //We can over write the number
        System.out.println(marks[4]);

        //2
        int [] marks = new int[5];  //--> Declaration + Memory Allocation

        marks[0] = 44;
        marks[1] = 45;
        marks[2] = 43;
        marks[3] = 64;
        marks[4] = 62;
        marks[4] = 51;  //We can over write the number
        System.out.println(marks[4]);

        //3
        int [] marks = {10, 43, 49, 39, 24}; // --> Declare + Initialise
        System.out.println(marks[4]);

        // Array length
        int [] marks = {10, 43, 49, 39, 24};
        System.out.println(marks.length);

        float [] marks = {17.4f, 43.5f, 49.34f, 39.42f, 24.53f};
        System.out.println(marks.length);
        System.out.println(marks[4]);

        String [] name = {"Saurabh", "Shubham", "Akash", "Anil", "Nilesh"};
        System.out.println(name.length);
        System.out.println(name[4]);

        // Displaying the Array (Naive Method) --> Simple method
        System.out.println("Printing using Naive Method");
        int [] marks = {10, 43, 49, 39, 24};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the array using for loop
        System.out.println("Printing Using For loop");
        int [] marks = {10, 43, 49, 39, 24};
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]); // marks[i] --> array traversal
        }

//        Quick Quiz: Display the array in Reverse Order (for loop)
        System.out.println("Printing the array Using For loop in reverse order");
        int [] marks = {10, 43, 49, 39, 24};
        for(int i=marks.length-1 ; i>=0; i--){
            System.out.println(marks[i]); // marks[i] --> array traversal
        }

//        Quick Quiz: Display the array (for-each loop)
          System.out.println("Printing the array Using For-each loop");
          int [] marks = {10, 43, 49, 39, 24};
          for(int element: marks ){
              System.out.println(element);
          }

	}

}
