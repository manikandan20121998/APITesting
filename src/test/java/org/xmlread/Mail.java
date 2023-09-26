package org.xmlread;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder= {"personal","official"})
public class Mail {

	
	private String personal;
	public String getPersonal() {
		return personal;
	}
	public void setPersonal(String personal) {
		this.personal = personal;
	}
	public String getOfficial() {
		return official;
	}
	public void setOfficial(String official) {
		this.official = official;
	}
	private String official;
}
