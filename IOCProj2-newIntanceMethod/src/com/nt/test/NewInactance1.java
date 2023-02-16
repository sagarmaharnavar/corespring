package com.nt.test;

public class NewInactance1 {

	public static void main(String[] args) {

		Class c1 =null;
		Class c2=null;
		Object obj=null;
		Object obj2=null;
		try {
			c1 = Class.forName(args[0]);

			obj  = c1.newInstance();
			
			System.out.println("Obje :"+obj);
			System.out.println("-------------------------------------");
			c2=Class.forName(args[1]);
			obj2=c2.newInstance();
			System.out.println(obj2);
			

		}
		catch(IllegalAccessException ie){
			System.out.println(ie);			
		}catch(ClassNotFoundException cnfe){
			System.out.println(cnfe);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
