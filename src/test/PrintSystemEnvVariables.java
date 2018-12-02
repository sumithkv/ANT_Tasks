package test;

import java.util.Map;
import java.util.Set;

public class PrintSystemEnvVariables {
	
	// Class created to print all the Environment Variables using System class

	public static void main(String[] args) {
		Map<String, String> envMap = System.getenv();
		Set<String> keySet1 = envMap.keySet();
		for(String key : keySet1){
		    System.out.println("Key = "+key+",   Value = "+envMap.get(key));
		    System.out.println();
		}
		 
		//Get Specific environment variable
		String pathValue = System.getenv("PATH");
		System.out.println("$PATH="+pathValue);

	}

}
