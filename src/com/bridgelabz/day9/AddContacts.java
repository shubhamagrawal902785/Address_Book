package com.bridgelabz.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class AddContacts extends CreateData {

	 public static void main(String[] args) {


	        int exit = 8;

	        while (exit == 8) {
	            System.out.println("Please enter the following details: ");
	            System.out.println("1. Create Addressbook");
	            System.out.println("2. Edit Addressbook");
	            System.out.println("3. Delete Addressbook");


	            CreateData ob4 = new CreateData();

	            Scanner sc3 = new Scanner(System.in);
	            int inp = sc3.nextInt();

	            if (inp == 1) {
	              //  ob4.check();
	                ob4.Create();
	            } else if (inp == 2) {

	                ob4.EditAddressbook();

	            } else if (inp == 3) {

	                ob4.DeleteAddressbook();
	            } else {
	                System.out.println("Enter the valid input");
	            }

	        }
	    }
	}