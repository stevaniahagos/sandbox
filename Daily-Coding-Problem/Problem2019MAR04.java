/**
* Daily Coding Problem's exercise for 04 March 2019
* PROBLEM: 
* Given an array of integers, return a new array such that each element at index i of 
* the new array is the product of all the numbers in the original array except
* the one at i.
* 
* For example, if our input was [1, 2, 3, 4, 5], the expected output would be 
* [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be 
* [2, 3, 6].
* 
* Utilizing the same approach from yesterday's problem.
*/

import java.util.*;

public class Problem2019MAR04 {

	public static List<Integer> numArgs = null;
	public static List<Integer> numArgsCopy = null;

	public static void main(String[] args){
		//call to validateArgs to check if all values entered in String[] args
		//is a number. if not, display message and exit
		if(validateArgs(args)){
			//initialize list that will contain products
			List<Integer> numArgsProducts = new ArrayList<Integer>();
			for(int arg: numArgs){
				//initialize product variable with value 1 for multiplication
				int prod = 1;

				//iterate through numArgsCopy
				for(int argCopy : numArgsCopy){
					//check if elements are at the same index
					//if not, multiply int var 'prod' by current argCopy value
					if(numArgs.indexOf(arg) != numArgsCopy.indexOf(argCopy)){
						prod *= argCopy;
					}
				}

				//add final prod into numArgsProducts
				numArgsProducts.add(prod);
			}

			for(int prod : numArgsProducts){
				System.out.println(prod);
			}
		}
	}

	static boolean validateArgs(String[] args){
		numArgs = new ArrayList<Integer>();
		numArgsCopy = new ArrayList<Integer>();
		for(String arg : args){
			try{
				numArgs.add(Integer.parseInt(arg));
				numArgsCopy.add(Integer.parseInt(arg));
			} catch (NumberFormatException nfe){
				System.out.printf("String %s cannot be added into numArgs\n", arg);
				return false;
			} catch (Exception e){
				System.out.printf("String %s cannot be added into numArgs\n", arg);
				return false; 
			}
		}
		return true;
	}
}