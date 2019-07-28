package co.d;

public class CricketPlayer extends Player {
	private double averageRuns;
	public double getAverageRuns() {
		return averageRuns;
	}
	public void setAverageRuns(double averageRuns) {
		this.averageRuns = averageRuns;
	}

	public CricketPlayer(String firstName, String lastName, double averageRuns) {
		super(firstName, lastName);
		this.averageRuns = averageRuns;
	}

	@Override
	public int getRating() {
		if(averageRuns>55) {
			return 7;
		}
		if(averageRuns>50 && averageRuns<=55) {
			return 6;
		}
		if(averageRuns>40 && averageRuns<=50) {
			return 5;
		}
		if(averageRuns>30 && averageRuns<=40) {
			return 3;
		}
		if(averageRuns>20 && averageRuns<=30) {
			return 2;
		}
		if(averageRuns<=20) {
			return 1;
		}
		return 0;
	}

}
