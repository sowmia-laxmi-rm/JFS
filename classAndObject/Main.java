package classAndObject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter team name: ");
		String teamName = s.next();
		System.out.print("Enter city represented: ");
		String cityRepresented = s.next();
		Team te = new Team();
        te.display(teamName,cityRepresented);
	}

}
