import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class CyclicRotation{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your array elements (separated by commas): ");
		String[] numArray = reader.readLine().split(",");
		ArrayList<Integer> inputArray = new ArrayList<Integer>();

		for(String num : numArray){
			inputArray.add(Integer.parseInt(num));
		}

		System.out.println("Enter your number of rotations: ");
		int rots = Integer.parseInt(reader.readLine());

		for(int rotation = 1; rotation <= rots; rotation++){
			inputArray = cycle(inputArray);
			System.out.println("Rotation " + rotation + ": " + inputArray);
		}
	}

	public static ArrayList<Integer> cycle(ArrayList<Integer> elements){
		ArrayList<Integer> retVal = new ArrayList<Integer>();
		retVal.add(elements.get(elements.size() - 1));
		for(int index = 0; index < elements.size(); index++){
			if(index == elements.size() - 1){
				continue;
			} else {
				retVal.add(index + 1, elements.get(index));
			}
		}

		return retVal;
	}
}