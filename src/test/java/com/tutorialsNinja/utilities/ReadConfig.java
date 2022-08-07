package com.tutorialsNinja.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src= new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserId() {
		String id=pro.getProperty("userId");
		return id;
	}
	
	public String getUserId1() {
		String id1=pro.getProperty("userId1");
		return id1;
	}
	
	public String getUserId2() {
		String id2=pro.getProperty("userId2");
		return id2;
	}
	
	public String getPassword() {
		String pw=pro.getProperty("password");
		return pw;
	}
	
	public String getPassword1() {
		String pw1=pro.getProperty("password1");
		return pw1;
	}
	
	public String getPassword2() {
		String pw2=pro.getProperty("password2");
		return pw2;
	}
	
	public String getChromePath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getEdgePath() {
		String edgepath=pro.getProperty("edgepath");
		return edgepath;
	}
}
