package com.week1.day5.lambdas;

import java.math.BigDecimal;
import java.security.interfaces.RSAKey;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.week1.day4.singleton.SingletonClass;

public class SingletonFIx {
	
	// public static class SampleSingleton 
	
	private static Connection CONNECTION = null;
	
	private static volatile SingletonFIx instance = null;
	
	// private constructor for Singleton class - mandatory! 
	private SingletonFIx() {
		
	}
	
	public static SingletonFIx createInstance() {
		if (instance == null) {
			// placing thread inside of synchronization block
			// it will handle a thread safe environment and only one thread in a time will
			// be executed
			synchronized (SingletonClass.class) {
				if (instance == null) {
					instance = new SingletonFIx();
				}
			}
		}
		return instance;
	}
	
	public static void databaseQuery(BigDecimal input) {
		
		try (Connection connection = DriverManager.getConnection("URL", "USERNAME", "PASSWORD")) {
			
			String sql = "SELECT id from table";
	
			PreparedStatement preparedStatements = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatements.executeQuery();
			
			int x = 0; 
			while(resultSet.next()) {
				x = resultSet.getInt(1) * input.intValue();
				
			};

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
