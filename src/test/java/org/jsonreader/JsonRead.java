package org.jsonreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {
	public static void main(String[] args) throws IOException, ParseException {
		json2read();
	}
	
	public static void readJson() throws IOException, ParseException {

		//mention file location
		
		FileReader f=new FileReader("C:\\Users\\MANI MADDY\\eclipse-workspace\\APITesting\\src\\test\\resources\\JSON\\simple.json");
	
	//parse the json file
		
		JSONParser p=new JSONParser();
		Object obj = p.parse(f);
	JSONObject jb=(JSONObject)obj;
	Object o1 = jb.get("username");
//	String st = o1.toString();
	//type casting pannalam.............
	String s=(String)o1;
	System.out.println(s);
	System.out.println(jb.get("password").toString());
	System.out.println(jb.get("phoneno").toString());
	System.out.println(jb.get("address").toString());
	
	//get values
	Object objsk = jb.get("skills");
	System.out.println(objsk);
	
	//to get particular data from list of values
	
	JSONArray ar=(JSONArray)objsk;
	Object oj = ar.get(0);
	//type casting
	String s1=(String)oj;
	System.out.println(s1);
	System.out.println(ar.get(1).toString());
	System.out.println(ar.get(2).toString());
	System.out.println(ar.get(3).toString());
	System.out.println("looping................");
	for (Object x : ar) {
		System.out.println(x);
	}
	
	}
public static void json2read() throws IOException, ParseException {
	//mention file location
	
	FileReader f=new FileReader("C:\\Users\\MANI MADDY\\eclipse-workspace\\APITesting\\src\\test\\resources\\JSON\\employee.json");

//parse the json file
	
	JSONParser p=new JSONParser();
	Object obj = p.parse(f);
JSONObject jb=(JSONObject)obj;
Object objem = jb.get("employee");
String s = objem.toString();
System.out.println(s);
//json array to get particuklar value

JSONArray ar1=(JSONArray)objem;
Object objmk = ar1.get(1);
System.out.println(objmk);

JSONObject j=(JSONObject)objmk;
System.out.println(j.get("efirstname").toString());
System.out.println(j.get("elastname").toString());

//looping..............
System.out.println(".............looping.............");
Object objemm=jb.get("employee");
JSONArray ar2=(JSONArray)objemm;


for (Object x : ar2) {
	System.out.println(x);
	System.out.println();
	JSONObject jm=(JSONObject)x;
	System.out.println(jm.get("efirstname").toString());
	System.out.println(jm.get("elastname").toString());
	System.out.println("...............");
}




}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
