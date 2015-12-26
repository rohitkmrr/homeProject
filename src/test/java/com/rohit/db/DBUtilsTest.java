package com.rohit.db;

import static org.testng.AssertJUnit.assertEquals;
import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DBUtilsTest {
	
	private DBUtils utils;
	
	@BeforeTest
	public void setUp() {
		utils = new DBUtils();
	}

  @Test
  public void testConnection(){
	  utils.createConnection();
  }
}
