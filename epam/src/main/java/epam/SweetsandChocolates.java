package epam;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

interface sweets{
	public void numberSweets();		
}

interface chocolates{
	public void numberChocs();	
}



class biddayGifts implements sweets,chocolates {

	
	public int number1,number2,weight;
	Map<String, Integer> dict = new HashMap<String, Integer>(); 
	
	
	
	public void numberChocs() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nenter the number of chocolates");
	
		number1 = input.nextInt();
		System.out.println("\nnumber of chocolates recieved in gift " + number1);
		
	
	}

	

	public void numberSweets() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nenter the number of sweets");
	    number2 = input.nextInt();
		System.out.println("\nnumber of Sweets recieved in gift " + number2);

		
	}
	public void totalWeight() {
		
		weight=number1*200+number2*300;
		System.out.println("\nthe total Weight of gifts is(200 gm for each chocolates and 300 gm for each sweet) "+weight+" gms \n");
	}
	
	public void Chocolates() {
        
		 Scanner int1 = new Scanner(System.in);
		 Scanner sc = new Scanner(System.in); 
		     
		for(int i=1;i<=number1;i++) {
			System.out.println("enter the name of the  chocolate"+i);
			String name = sc.nextLine();  
			System.out.println("enter the price of the  chocolate"+i);
			int a = int1.nextInt(); 
			dict.put(name,a); 	
		}
		System.out.println(dict);
		
		Map<String,Integer> sortedMap = new TreeMap<String,Integer>(dict);
        System.out.println("THe Alphabetical order of the chocolates in the gift are    : " + sortedMap);
	}
}



public class SweetsandChocolates
{
	public static void main(String[] args) {
		
		biddayGifts bG= new biddayGifts();
		bG.numberChocs();
		bG.numberSweets();	
		bG.totalWeight();
		bG.Chocolates();
		
	}
}
