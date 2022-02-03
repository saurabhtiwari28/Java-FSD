package com.javatraining;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Implicit Type Casting
        char c = 'A';
        System.out.println("before conversion char value "+c);

        int i = c;
        System.out.println("char converts into int "+i);

        int a = 9;
        long l = a;
        System.out.println("int converts into long "+l);

        float b = l;
        System.out.println("long converts into float "+b);

        float d = 6.6f;
        double e = d;
        System.out.println("float converts into double "+e);
        
        
        // Explicit Type Casting
        double d1 = 67.7778899909;
        long l1 = (long) d1;
        System.out.println("double converts into long "+l1);
        
        float f1 = 76.44f;
        int i1 = (int) f1;
        System.out.println("float converts into int "+i1);
	}

}
