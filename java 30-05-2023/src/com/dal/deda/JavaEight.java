package com.dal.deda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class OuterClass { 


	void names ( ) {
		System.out.println("Hey Rithick");
	}
	
 class InnerClass{ 
		void names2( ) { 
			System.out.println("Yes its me Rithick");
		}
	}
}


public class JavaEight {
List<Integer> list = new ArrayList<Integer>();

	
	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(1,2,3,4,5);
		Consumer<Integer> con = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		
		list.forEach(con);
		
		OuterClass obj = new OuterClass();
		obj.names();
		
	
		
		OuterClass.InnerClass obj2 = obj.new InnerClass();
		obj2.names2();
		
		
		
		}

}
