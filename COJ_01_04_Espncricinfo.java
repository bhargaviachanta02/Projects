import java.text.DecimalFormat;

class Batsman {
	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int fours;
	private int sixes;

	private int id;

	private static int idGenerator = 100000;

	public Batsman() {
		this.id = ++idGenerator;
	}

	public Batsman(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		this.id = ++idGenerator;
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}

	public Batsman getData() {
		return this;
	}

	public float calcStrikeRate() {
		String outputString = new DecimalFormat("#.##").format(((float)runsScored/(float)ballsFaced)* 100);
		return Float.parseFloat(outputString);
	}

	public int calcRunsScoredInBoundaries() {
		return this.runsScored - (this.fours * 4) - (this.sixes * 6);
	}

	public String getName() {
		return name;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public int getHalfCentruries() {
		return halfCentruries;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public int getFours() {
		return fours;
	}

	public int getSixes() {
		return sixes;
	}

	public int getId() {
		return id;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	public static void setIdGenerator(int idGenerator) {
		Batsman.idGenerator = idGenerator;
	}

}

class Espncricinfo {


}

public class COJ_01_04_Espncricinfo {
	public static void main(String[] args) {
		
		Espncricinfo espncricinfo = new Espncricinfo();
		espncricinfo.addBatsman("AB de Villers", 687, 1, 6, 407, 57, 37);
		espncricinfo.addBatsman("Virak Kohli",  973, 4,7, 670, 83, 38);
		espncricinfo.updateBatsmanStats(100001, 45, 5, 1, 33);
		
		Batsman batsman = espncricinfo.getBatsman(100001);
		if(null != batsman){
			System.out.println("ID :"+batsman.getId());
			System.out.println("Name :"+batsman.getName());
			System.out.println("BallsFaced :"+batsman.getBallsFaced());
			System.out.println("Centuries :"+batsman.getCenturies());
			System.out.println("HalfCenturies :"+batsman.getHalfCenturies());
			System.out.println("Fours :"+batsman.getFours());
			System.out.println("Sixes :"+batsman.getSixes());
			System.out.println("RunsScoredInBoundaries :"+batsman.calcRunsScoredInBoundaries());
			System.out.println("RunScored :"+batsman.getRunsScored());
			System.out.println("StrikeRate :"+batsman.calcStrikeRate());
	
		} else{
			System.out.println("No Batsman found with given id !!! ");
		}
		
	}
}
