package classAndObject1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter player name: ");
		String  playerName = s.next();
		System.out.print("Enter player position: ");
		String  playerPosition = s.next();
		Player pl = new Player();
		pl.display(playerName,playerPosition);
	}

}
