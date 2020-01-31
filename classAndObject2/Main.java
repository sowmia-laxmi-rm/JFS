package classAndObject2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter matches: ");
		byte matchesPlayed = s.nextByte();
		
		System.out.print("Enter wins: ");
		byte  numOfWins = s.nextByte();
		
		System.out.print("Enter losses: ");
		byte numOfLosses= s.nextByte();
		
		System.out.print("Enter avg lap speed:");
		float avgLapSpeed = s.nextFloat();
		
		System.out.print("Enter max lap speed: ");
		float maxLapSpeed= s.nextFloat();
		
		System.out.print("Enter avg throw distance: ");
		float avgThrowDistance= s.nextFloat();
		
		System.out.print("Enter max throw distance: ");
		float maxThrowDistance= s.nextFloat();
		
		PlayerRecord p = new PlayerRecord();
		p.display(matchesPlayed,numOfWins,numOfLosses,avgLapSpeed,maxLapSpeed,avgThrowDistance,maxThrowDistance);
	}

}
