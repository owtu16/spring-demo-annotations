package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FortuneCookieService implements FortuneService {
	
	
	// Add file location in String form
	private String fileName = "C:\\Users\\Melvin Cancino\\git\\spring_demo_annotation_repo\\spring-demo-annotations\\src\\com\\luv2code\\springdemo\\fortune-data.txt";
	
	// Declare a String array that will be used for the fortunes
	private List<String> fortunes;
	
	// Declare random to be used for random integer
	private Random random = new Random();
	
	public FortuneCookieService() {
		
	}
	
	// Constructor that will read from the file
//	public FortuneCookieService() {
//		
//		File file = new File(fileName);
//		
//		System.out.println("Reading fortunes from file: " + file);
//		System.out.println("File exists: " + file.exists());
//		
//		// initialize array list
//		
//		fortunes = new ArrayList<>();
//		
//		// read fortunes from the file
//		
//		try(BufferedReader br = new BufferedReader(new FileReader(file))){
//			
//			String tempLine;
//			
//			while((tempLine = br.readLine()) != null) {
//				fortunes.add(tempLine);
//			}
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//	}

	@PostConstruct
	private void loadTheFortunesFile() {
		System.out.println(">> FortuneCookieService: inside loadTheFortunesFile method");
		
		File file = new File(fileName);
		
		
		System.out.println("Reading fortunes from file: " + file);
		System.out.println("File exists: " + file.exists());
		
		// initialize array list
		
		fortunes = new ArrayList<>();
		
		// read fortunes from file
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String tempLine;
			
			while((tempLine = br.readLine()) != null) {
				fortunes.add(tempLine);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String getFortune() {
		// 
		int index = random.nextInt(fortunes.size());
		
		String tempFortune = fortunes.get(index);
		return tempFortune;
	}

}
