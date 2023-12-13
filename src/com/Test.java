package com;

import java.util.ArrayList;
import java.util.List;

public class Test {
	String s="Amit";
	int j;
	double k;
	float f;

	public static void main(String[] args) {
		
		Test t=new Test();
		List l=new ArrayList<>();
		
		l.add(t.s);
		l.add(t.j);
		l.add(t.k);
		l.add(t.f);
		
		for(Object o : l)
		{
			if(o instanceof String)
				System.out.println(o+" "+"String");
			else if(o instanceof Integer)
				System.out.println(o+" "+"Integer");
			else if(o instanceof Double)
				System.out.println(o+" "+" Double");
			else if(o instanceof Float)
				System.out.println(o+" "+" float");
				
				
			
		}
	}
}
