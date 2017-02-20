package main;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Main {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Test");

		System.out.print("R?");
		double r = input.nextDouble();

		System.out.print("N?");
		double n = input.nextDouble();

		System.out.print("Y?");
		double y = input.nextDouble();

		System.out.print("P?");
		double p = input.nextDouble();

		System.out.print("T?");
		boolean t = input.nextBoolean();

		input.close();
		
		System.out.print(FVfinder(r,n,y,p,t));
		System.out.print(PMTfinder(r,n,y,p,t));
	}
	
	public static double FVfinder(double r, double n, double y, double p, boolean t){
		return FinanceLib.fv(r, n, y, p, t);
	}
	public static double PMTfinder(double r, double n, double y, double p, boolean t){
		return FinanceLib.pmt(r, n, y, p, t);	
	}
	
	
}
