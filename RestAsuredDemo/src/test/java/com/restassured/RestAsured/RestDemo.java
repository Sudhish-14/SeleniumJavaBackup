package com.restassured.RestAsured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestDemo {
	public static String baseuri="https://reqres.in/api";
	
	@Test
	private static void getListUser() {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/api";
		Response response=RestAssured.given().when().get("users?page=2").then().log().all().extract().response();
		System.out.println(response.getStatusCode());
		System.out.println(response.asPrettyString());
		
		
	}
		private static void createSingleUser() {
			// TODO Auto-generated method stub
			Response response=RestAssured.given().body("{\r\n"
					+ "    \"name\": \"morpheus\",\r\n"
					+ "    \"job\": \"leader\",\r\n"
					+ "    \"id\": \"390\",\r\n"
					+ "    \"createdAt\": \"2025-03-12T05:50:03.794Z\"\r\n"
					+ "}").when().post(baseuri+"/users").then().log().all().extract().response();
			
			System.out.println(response.contentType());
			System.out.println(response.getStatusCode());
			System.out.println(response.asPrettyString());
		}
		
		public static void updateUser() {
			// TODO Auto-generated method stub
			
	Response res=RestAssured.given().body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}").when().put(baseuri+"/users/2").then().log().all().extract().response();
			System.out.println(res.getStatusCode());
			System.out.println(res.asPrettyString());

		}
	
		public static void partialUpdateUser() {
			// TODO Auto-generated method stub
			
		Response res=RestAssured.given().body("{\r\n"
					+ "    \"name\": \"morpheus\",\r\n"
					+ "    \"job\": \"zion resident\"\r\n"
					+ "}").when().patch(baseuri+"/users/2").then().log().all().extract().response();
				System.out.println(res.getStatusCode());
				System.out.println(res.asPrettyString());

		}
		
		public static void getSingleUser() {
			// TODO Auto-generated method stub
			Response response=RestAssured.given().when().get(baseuri+"/page/2").then().log().all().extract().response();
			System.out.println(response.getStatusCode());
			System.out.println(response.asPrettyString());
		}
	
	public static void main(String[] args) {
		
//		getListUser() ;
//		createSingleUser();
//		updateUser();
//		partialUpdateUser();
//		getSingleUser();
	}
}
