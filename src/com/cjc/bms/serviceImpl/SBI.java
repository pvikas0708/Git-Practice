package com.cjc.bms.serviceImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.cjc.bms.service.RBI;
public class SBI implements RBI{

	
	Scanner sc=new Scanner(System.in);
	public void createAccount() throws Exception
	 { 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_statement_crud","root","root");
	
	 } 
	 public void displayAllDetails() 
	 { 
	 } 
	 public void depositeMoney() 
	 { 
	 } 
	 public void withdrawal() 
	 { 
	 } 
	 public void balanceCheck() 
	 { 
	 }
}
