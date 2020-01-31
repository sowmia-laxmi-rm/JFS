package classAndObject2;

public class PlayerRecord {
	void display(byte matchesPlayed, byte numOfWins, byte numOfLosses, float avgLapSpeed, float maxLapSpeed, float avgThrowDistance, float maxThrowDistance)
	{
		System.out.println("Player Record -");
		System.out.println("Matches Played: "+matchesPlayed);
		System.out.println("Win/Loss Ratio:"+numOfWins/2+":"+numOfLosses/2);
		System.out.println("Avg/Max Lap Speed: "+avgLapSpeed+" | "+maxLapSpeed+" min");
		System.out.println("Avg/Max Throw Distance: "+avgThrowDistance+" | "+maxThrowDistance+" m");
	}

}
