package com.training.adijava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.training.adi.Employee;

public class StreamDemo {   //Stream divides large operation into fragments,i.e., multiple intermediary streams and
                            //one terminating stream
	public static void main(String[] args) {
		
		//entering list of ints, displaying sq of nos > 15
		List <Integer> numbers = Arrays.asList(10,20,12,15,27);
		//Stream <Integer> numStream = numbers.stream();   No need to give name to stream, do directly
		numbers.stream().filter(x -> x >15).map(n -> n*n).forEach(System.out::println);  //another way to terminate
		
		//entering list of names, filter by first letter S, add surname, sort and display
		List <String> names = Arrays.asList("Harshit", "Sid","Sam","Hardik");
		Stream <String> nameStream = names.stream();
		nameStream.filter(x -> x.startsWith("S")).map(n -> n.concat(" Arora")).sorted().forEach(t -> System.out.println(t));
		
		
		//create product class, create a collection, using stream filter toys and ones w price > 500, collect this other collection
		//remove duplicates and print (override hashCode and equals in product class for considering duplicates
		List <Product> prodList = new ArrayList <> ();
		prodList.add(new Product(101, "Laptop", "Electronics", 65000));
		prodList.add(new Product(102, "Doll", "Toys", 5000));
		prodList.add(new Product(103, "Basketball", "Sports", 3000));
		prodList.add(new Product(104, "RC Car", "Toys", 6000));
		prodList.add(new Product(104, "RC Car", "Toys", 6000));

		List <Product> newList = prodList.stream().filter(x -> x.getPrice() > 500).filter(y -> y.getProdCategory()=="Toys").collect(Collectors.toList());
		newList.stream().distinct().forEach(System.out::println);
	}

}
