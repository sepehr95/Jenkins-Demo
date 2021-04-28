import java.util.ArrayList;
import java.util.HashMap;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
		String[] cars = {"Toyota","BMW","Audi"};
		System.out.println(cars[0]);
		
		int[] numbers= {1,2,3,54,5};
		
		System.out.println(numbers.length);
		*/
		
		/*
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(numbers);
		
		// to update an index or value we will use set method.
		
		numbers.set(0, 10);
		numbers.set(1, 20);
		System.out.println(numbers);
		
		// to remove an element from our list we will use the remove method 
		
		numbers.remove(0);
		numbers.remove(1);
		
		System.out.println(numbers);*/
		
		// hash map 
		
		HashMap<String,Integer> students = new HashMap<String,Integer>();
		
		students.put("Student A", 90);
		students.put("Student B", 80);
		students.put("Student C", 85);
		students.put("Student D", 95);
		System.out.println(students);
		
		System.out.println(students.get("Student D"));
		
		
		for (String i : students.keySet())
		{
			System.out.println("key" + i + "value"+ students.get(i));
		}
		
		for (int i : students.values())
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}

}
