import java.util.HashMap;
import java.util.Map;
public class OddOccurrencesInArray{
	public static void main(String[] args){
		System.out.println(oddOneOut(args));
	}

	public static int oddOneOut(String[] inputs){
		int retVal = 0;
		HashMap<Integer, Integer> inputsEntries = new HashMap<Integer, Integer>();
		for(String input : inputs){
			int numInput = Integer.parseInt(input);
			if(inputsEntries.containsKey(numInput)){
				inputsEntries.put(numInput, inputsEntries.get(numInput) + 1);
			} else {
				inputsEntries.put(numInput, 1);
			}
		}

		for(Map.Entry<Integer, Integer> value : inputsEntries.entrySet()){
			if(value.getValue() == 1){
				retVal = value.getKey();
			}
		}
		return retVal;
	}
}