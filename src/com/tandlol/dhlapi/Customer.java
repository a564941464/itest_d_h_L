package com.tandlol.dhlapi;  
import java.util.Set;

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  

@XmlRootElement  
public class Customer {  
    String name;  
    int age;  
    int id;  
    Set<Book> bookSet;
    @XmlElement  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
      
    @XmlElement  
    public int getAge() {  
        return age;  
    }  
    public void setAge(int age) {  
        this.age = age;  
    }  
      
    @XmlAttribute  
    public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
      
    @Override  
    public String toString() {  
        return "Customer [id=" + id + ",name=" + name + ",age=" + age + "]";  
    }

	public Set<Book> getBookSet() {
		return bookSet;
	}
    @XmlElement  
	public void setBookSet(Set<Book> bookSet) {
		this.bookSet = bookSet;
	}  
}  