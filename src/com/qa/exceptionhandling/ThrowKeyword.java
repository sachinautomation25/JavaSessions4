package com.qa.exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		try {
			throw new Exception("NoDataFoundException"); // deliberately throwing an exception, if throwing an exception
															// then we have to catch it also
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("--------------");
		String data="";
		if (data.equals("")) {
			try {
				throw new Exception("NoDataAvailableException");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
