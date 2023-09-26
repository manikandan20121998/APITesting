package org.xmlread;

import java.io.File;
import java.nio.charset.MalformedInputException;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.*;

public class ReadXML {
	
public static void main(String[] args) throws JAXBException {
	XMLRead1();
}
	
	public static void XMLRead() throws JAXBException {
         //create JAXBContext
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		
		//create unmarsheller
		Unmarshaller un = jb.createUnmarshaller();
		
		//mention file path
		File f=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\APITesting\\src\\test\\resources\\XML\\Employee.xml");
		
		//do unmarshell
		Object obj = un.unmarshal(f);
		
		Employee e=(Employee)obj;
		
		int id = e.getId();
		String name = e.getName();
		System.out.println("Employee id........."+id);
		System.out.println("Employee name.."+name);
		System.out.println("Employee phno..."+e.getPhno());
		System.out.println("Employee Address....."+e.getAddress());
		
		
	
	}
	public static void XMLRead1() throws JAXBException {
        //create JAXBContext
		JAXBContext jb = JAXBContext.newInstance(EmpDetails.class);
		
		//create unmarsheller
		Unmarshaller un = jb.createUnmarshaller();
		
		//mention file path
		File f=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\APITesting\\src\\test\\resources\\XML\\Sample.xml");
		
		//do unmarshell
		Object obj = un.unmarshal(f);
		
		EmpDetails e=(EmpDetails)obj;
		
		List<Employee1> ListEmp = e.getEmployee1();
		//get particular employee
		Employee1 e1 = ListEmp.get(0);
		System.out.println("id......"+e1.getId());
		System.out.println("name......"+e1.getName());
		System.out.println("phno....."+e1.getPhno());
		Address ad = e1.getAddress();
		System.out.println(".............ADDRESS.........");
		System.out.println("Street..."+ad.getStreet());
		System.out.println("State...."+ad.getState());
		System.out.println("city...."+ad.getCity());
		
		System.out.println("Address......"+e1.getAddress());
		Mail ma = e1.getMail();
		System.out.println("........MAIL.............");
		System.out.println("Personal......."+ma.getPersonal());
		System.out.println("Official....."+ma.getOfficial());
		
		System.out.println("Mail......."+e1.getMail());

		System.out.println("..........Second...........");
		Employee1 e2 = ListEmp.get(1);
		System.out.println("id.........."+e2.getId());
		System.out.println("id......"+e2.getId());
		System.out.println("name......"+e2.getName());
		System.out.println("phno....."+e2.getPhno());
		Address add = e2.getAddress();
		System.out.println(".............ADDRESS2.........");
		System.out.println("Street..."+add.getStreet());
		System.out.println("State...."+add.getState());
		System.out.println("city...."+add.getCity());
		
		System.out.println("Address......"+e2.getAddress());
		Mail maa = e2.getMail();
		System.out.println("........MAIL2.............");
		System.out.println("Personal......."+maa.getPersonal());
		System.out.println("Official....."+maa.getOfficial());
		
		System.out.println("Mail......."+e2.getMail());
		
		System.out.println(".........Enhanced for loop......");
		
		for(Employee1 x:ListEmp) {
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getPhno());
			System.out.println(x.getAddress().getCity());
			System.out.println(x.getAddress().getState());
			System.out.println(x.getAddress().getStreet());
			System.out.println(x.getMail().getOfficial());
			System.out.println(x.getMail().getPersonal());
			
		}
		
	
	}
}
