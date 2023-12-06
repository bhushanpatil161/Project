package com.Lambda.imperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1,2,3,4,3,5,6,7,8,9,0,10,10);
		
		/*
		 * Impreative
		 */
		
		List<Integer> uniqueList = new ArrayList<>();
		
		for(Integer integer : integers) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println("UniqueList : "+ uniqueList);
		
		/*
		 * Declarative
		 */
		
		List<Integer> collect = integers.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("Using Declarative approach : "+ collect);
	}

	
	
	
	
}
