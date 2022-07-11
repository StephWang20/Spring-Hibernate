package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String file = "src/fortune-data.txt";
	private List<String> theFortunes;
	private Random myRandom = new Random();
		
	public FileFortuneService() {
		
		System.out.println(">> FileFortuneService: inside default constructor");
		
	}
	
	@PostConstruct
	public void loadTheFortunesFile() {
		
		System.out.println(">> FileFortuneService: inside method loadTheFortunesFile");
		
		theFortunes = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String tempLine;
			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(theFortunes.size());
		
		return theFortunes.get(index);
	}

}
