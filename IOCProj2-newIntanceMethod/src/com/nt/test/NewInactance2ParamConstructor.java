package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInactance2ParamConstructor {

	public static void main(String[] args) {

		Class c1 =null;
		Object obj=null;
		Constructor cons[]=null;
		try {
			//load class
			c1=Class.forName(args[0]);
			
			//get all constructor
			cons=c1.getDeclaredConstructors();
			
			//create the object
			obj= cons[1].newInstance(10,20);
			
			//instantiate the loaded class
			System.out.println(obj);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
