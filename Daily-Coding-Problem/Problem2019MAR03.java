/**
* Daily Coding Problem's exercise for 
* 03 March 2019. Probably brute force in my solution
* but it's been a while, and I can still improve…hopefully
*/

import java.util.List;
import java.util.ArrayList;

public class Problem2019MAR03 {

	public static List<Integer> numArgs = null;
	public static List<Integer> numArgsCopy = null;

	public static void main(String[] args){
		//call method to validate if all entered values in array args is a number
		if(validateArgs(args)){
			numArgsCopy.remove(numArgsCopy.size() - 1);
			int finalSum = numArgs.get(numArgs.size() - 1);
			numArgs.remove(numArgs.size() - 1);
			OUTER: for(int arg : numArgs){
				if(numArgs.indexOf(arg) != numArgs.size() -1){
					for(int argCopy : numArgsCopy){
						if(numArgs.indexOf(arg) != numArgsCopy.indexOf(argCopy)){
							int tempSum = arg + argCopy;
							if(tempSum == Integer.parseInt(args[args.length - 1])){
								System.out.println("TRUE");
								break OUTER;
							}
						}
					}
				}
			}
		} else {
			System.out.println("Args contains a non-number element. Exiting now.");
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