package com.accolite.concurrency.writting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritting {
	public static String path = "D:\\testing_writting.txt";    
	public static volatile File file = new File(path);
//	public static FileWriter fw= new FileWriter("D:\\abhinav_concurrent_Writting.txt",true);
	
	public static synchronized void writeContentToFile(String s){
		   
	      if(!file.exists()){
	    	  file = new File(path);
	    	  try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
        //creating file object from given path
        
         
        //FileWriter second argument is for append if its true than FileWritter will
        //write bytes at the end of File (append) rather than beginning of file
        FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(file,true);
			 BufferedWriter bufferFileWriter  = new BufferedWriter(fileWriter);
			 fileWriter.append(s);
			 fileWriter.append("\n");
			 bufferFileWriter.close();
		      
		        System.out.println("Java Program for appending content into File has been completed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      

 
	}
	public static void main(String[] args) {
		writeContentToFile("testingtestingtestingtesting");
		writeContentToFile("testingtestingtestingtesting1");
		writeContentToFile("testingtestingtestingtesting2");
		
	}

}
