package com.pearson.pulse.web.commanclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetTestDataFromPropertieFile {

	public static Properties prop = new Properties();
	public static FileInputStream in;
	public static String Root_File_Path;
	public static String file_Name = "testdata.properties";
	//public static String test = System.getProperty("STAGE");
	
	static {
		Root_File_Path = System.getProperty("user.dir");
		try{
		in = new FileInputStream(Root_File_Path + File.separator + file_Name);
		prop.load(in);
		}
		catch(IOException e){
			System.err.println("fail to read: " + "testdata.properties");
		}
		
	}


public static void main(String args[]){
	String test = prop.getProperty("STAGE");
	System.out.println(test);
}
}
