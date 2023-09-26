package org.jsonwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWrite {
	public static void main(String[] args) throws FileNotFoundException {
		writeJson();
	}
	 
	public static  void writeJson() throws FileNotFoundException {

		JSONObject j=new JSONObject();
		j.put("username", "manikandan");
		j.put("password", "787878");
		j.put("browser", "chrome");
		
		System.out.println(j);
		
		JSONArray a=new JSONArray();
		a.add("chrome");
		a.add("firefox");
		a.add("internetExplorer");
		a.add("safari");
		a.add("opera");
		System.out.println(a);
		
		//add to json object
		j.put("browsername", a);
		System.out.println(j);
		
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\JSON\\precheck.json");
		
		PrintWriter p=new PrintWriter(loc);
		p.write(j.toJSONString());
		p.flush();
		
		
		
	}
	
	
	public static void writeJson1() throws FileNotFoundException {

		Map mp1=new LinkedHashMap();
		
		mp1.put("efirstname", "Jhon");
		mp1.put("elastname", "peter");
		
		
	Map mp2=new LinkedHashMap();
		
		mp2.put("efirstname", "mani");
		mp2.put("elastname", "kumar");
		
		
		
	Map mp3=new LinkedHashMap();
		
		mp3.put("efirstname", "maari");
		mp3.put("elastname", "selvam");
		
		System.out.println(mp1);
		System.out.println(mp2);
		System.out.println(mp3);
		
		JSONArray a=new JSONArray();
		a.add(mp1);
		a.add(mp2);
		a.add(mp3);
		System.out.println(a);
		
		//json object
		
		JSONObject j=new JSONObject();
		j.put("employee", a);
		System.out.println(j);
		
		//manager
Map m1=new LinkedHashMap();
		
		m1.put("efirstname", "Jhon");
		m1.put("elastname", 6765);
		
		
	Map m2=new LinkedHashMap();
		
		m2.put("efirstname", "mani");
		m2.put("elastname", 564655);
		
		
		
	Map m3=new LinkedHashMap();
		
		m3.put("efirstname", "maari");
		m3.put("elastname", 565758);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		JSONArray a1=new JSONArray();
		a1.add(m1);
		a1.add(m2);
		a1.add(m3);
		System.out.println(a1);
		
		//json object
		
		JSONObject j1=new JSONObject();
		
		j1.put("employee", a);
	
		j1.put("Manager", a1);
		System.out.println(j1);
		
		File loc=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\APITesting\\src\\test\\resources\\JSON\\new.json");
		
		PrintWriter p=new PrintWriter(loc);
		
		p.write(j1.toJSONString());
		p.flush();
		System.out.println("done.................");
		
		
		
		
	}
	
	

}
