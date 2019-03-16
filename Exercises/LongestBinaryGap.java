import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
public class LongestBinaryGap{
	public static void main(String[] args){
		try{
			System.out.println(getLongestBinaryGap(Integer.parseInt(args[0])));
		} catch (NumberFormatException nfe){
			System.err.println(nfe.getMessage());
		}
	}

	public static int getLongestBinaryGap(int input){
		String inputBinary = Integer.toBinaryString(input);
		HashSet<Integer> binaryGaps = new HashSet<Integer>();

		int zeroCtr = 0;
		for(char binChar : inputBinary.toCharArray()){
			if(binChar == '0'){
				zeroCtr++;
			} else {
				binaryGaps.add(zeroCtr);
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>(binaryGaps);
		Collections.sort(list);

		System.out.println(list);

		return list.get(list.size() - 1);
	}
}