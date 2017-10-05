import java.util.*;
import java.lang.*;
import java.io.*;

class KLargestElements {
    
    private static void findLargestInArray (String [] arr, Integer numOfLargest) {
        if (arr!=null && arr.length > 0 && numOfLargest > 0) {
            List<String> outValList = Arrays.asList(arr);
            List<Integer> outValIntList = new ArrayList<Integer>();
            for (String s : outValList) {
                outValIntList.add(Integer.parseInt(s));
            }
            
            Collections.sort(outValIntList, Collections.reverseOrder());
            
            for (int i = 0 ; i < numOfLargest; i++) {
                System.out.print(outValIntList.get(i)+" ");    
            }
            
            System.out.println();
            
        }
    }
    
	public static void main (String[] args) {
	    try {
	        boolean isEof = false;
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String testCaseCount = reader.readLine();
	        
	        while (!isEof) {
	            String nkArray = reader.readLine();
    	        if (nkArray != null) {
    	            
    	            String [] sArr = nkArray.split(" ");
    	            Integer nVal = Integer.parseInt(sArr[0]);
    	            Integer kVal = Integer.parseInt(sArr[1]);
    	            
    	            String inputArray = reader.readLine();
    	            String [] sInputArr = inputArray.split(" ");
    	            
                    findLargestInArray(sInputArr,kVal);
                    
    	        } else {
    	            isEof = true;   
    	        }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}