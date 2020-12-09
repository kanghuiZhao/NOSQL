package Rank;

import java.util.Arrays;

public class Rank {
	public static String[] rerank(String[] input) {
		return new String[0];
	}
	public static String[] reRank(String[] input) {
		 if(input == null || input.length==0){
	            return new String[0];
	        }
	        int i = 0;
	        int left = 0;
	        int right = input.length - 1;
	        while (i <= right){
	            if(input[i].equals("r")){
	                String t1 = input[i];
	                input[i] = input[left];
	                input[left] = t1;
	                i++;
	                left++;
	            }
	            else if(input[i].equals("g")){
	                i++;
	            }
	            else if(input[i].equals("b")){
	                String t2 = input[i];
	                input[i] = input[right];
	                input[right] = t2;
	                right--;
	            }
	        }
	        return input;
	}
	public static void main(String[] args){
	        String[] input = new String[]{"r","r","b","g","b","r","g"};
	        Arrays.asList(reRank(input)).forEach(e->System.out.println(e));
	}
}
