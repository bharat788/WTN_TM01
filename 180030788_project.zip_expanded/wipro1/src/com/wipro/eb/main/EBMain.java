package com.wipro.eb.main;

import com.wipro.eb.service.ConnectionService;

public class EBMain {
		public static void main(String args[])
		{
			System.out.println(new ConnectionService().generateBill(120,100,"Commercial"));
			System.out.println(new ConnectionService().generateBill(-250,0,"Commercial"));
			System.out.println(new ConnectionService().generateBill(250, 130,"Domestic"));
			System.out.println(new ConnectionService().generateBill(250, 130,"Commercial"));
		}
}
