package com.cosacs.Utilities;

import java.io.File;
import java.io.IOException;

import com.cosacs.constants.Constants;
import com.jayway.jsonpath.JsonPath;


public class JsonParser {

	  private static File jsonFile;

	  public static String testData(String path) throws IOException   {	  
		try {
	    jsonFile=new File(Constants.Testdata);
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	    return JsonPath.read(jsonFile,"$."+path); 
	  }
	  
	  
	  public static String changetestData(String path) throws IOException   {	  
			try {
		    jsonFile=new File(Constants.Change_Testdata);
			  }catch(Exception e){
				  e.printStackTrace();
			  }
		    return JsonPath.read(jsonFile,"$."+path); 
		  }

}

