package org.writexml;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.xmlread.Address;
import org.xmlread.EmpDetails;
import org.xmlread.Employee;
import org.xmlread.Employee1;
import org.xmlread.Mail;
import org.xmlread.Product;

public class WriteXML {
	public static void main(String[] args) throws JAXBException {
		
	//	XMLWrite();
	//	XMLWrite1();
		EmpDetails();
		
	}
	
	public static void XMLWrite() throws JAXBException {
	
         //XMLWrite
	    JAXBContext jb = JAXBContext.newInstance(Employee.class);
	    
	    //create marsheller
	    Marshaller mr = jb.createMarshaller();
	    
	    //File name
	    File loc=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\APITesting\\src\\test\\resources\\XML\\new.xml");
	    
	    //set the values
	    
	    Employee e1=new Employee();
	    
	    e1.setId(100);
	    e1.setName("Sathyamoorthi");
	    e1.setPhno(8675800209l);
	    e1.setAddress("Chenaai");
	    
	    //convert to marshell
	    
	    mr.marshal(e1, loc);
	    System.out.println(".....Done........");    
	}

	public static void XMLWrite1() throws JAXBException {
		JAXBContext jb1 = JAXBContext.newInstance(Product.class);
            Marshaller mrr = jb1.createMarshaller();
         File loc1=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\XML\\product.xml");
           Product em=new Product();
         em.setProductname("vivoving");
         em.setModel("V9090");
         em.setOrderid(26263362);
         em.setLoc("viyasarPoby");
         em.setEfficient(2838282.9f);
          //convert to marshell
           mrr.marshal(em, loc1);
           System.out.println("..........DoneProduct....");
	}
	
	public static void EmpDetails() throws JAXBException {

		JAXBContext jbd = JAXBContext.newInstance(org.xmlread.EmpDetails.class);
		Marshaller mrd = jbd.createMarshaller();
		File fd=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\XML\\EmpDetails.xml");
		EmpDetails emd=new EmpDetails();
	
		//address
		Address ad=new Address();
		ad.setCity("Madurai");
		ad.setState("TamilNadu");
		ad.setStreet("Mariyamman kovilStreet");
		//mail
		Mail md=new Mail();
		md.setOfficial("vivoth@gmail.com");
		md.setPersonal("vivonivetha@gmail.com");
		
		Employee1 e1=new Employee1();
		e1.setId(423);
		e1.setName("vinoth");
		e1.setPhno(6626267271l);
		e1.setAddress(ad);
		e1.setMail(md);
		
		List<Employee1> li =new LinkedList<Employee1>();
		li.add(e1);
		
		//add to Empdetails
		emd.setEmployee1(li);
		
		mrd.marshal(emd, fd);	
		System.out.println("......done EmpDetails.....");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
