package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class TestLambada {

	public static void main(String[] args) {
		List<String> pointList = new ArrayList();
		pointList.add("1");
		pointList.add("2");
		 
		pointList.forEach(p ->  {
		                            System.out.println(p);
		                        }
		                 );
	}

}
