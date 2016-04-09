package cci;
import java.util.ArrayList;

public class RLE {
	public static void main(String[] args){
		String test = "aabbccddeeffffffffgg";
		String rle = new RLE().getRLE(test);
		System.out.println(rle);
		
	}
	private String getRLE (String input){
		if(input == null || input.length()<1){
			return null;
		}
		RLEObject rle = new RLEObject();
		int outerIndex = 0;
		while(outerIndex<input.length()){
			int innerIndex=outerIndex;
			while(innerIndex <input.length() && input.charAt(innerIndex)==input.charAt(outerIndex) ){
				innerIndex++;
			}
			rle.add(input.charAt(outerIndex), innerIndex-outerIndex);
			outerIndex = innerIndex;
		}
		if(rle.getText().size()>=input.length()/2){
			return input;
		}
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<rle.getText().size();i++){
			builder.append(rle.getText().get(i)).append(rle.getLengths().get(i));
		}
		return builder.toString();
	}
}

class RLEObject{
	ArrayList<Character> text = new ArrayList<Character>();
	ArrayList<Integer> lengths = new ArrayList<Integer>();
	public void add(char c, int length){
		text.add(c);
		lengths.add(length);
	}
	public ArrayList<Character> getText(){
		return text;
	}
	public ArrayList<Integer> getLengths(){
		return lengths;
	}
}