public class StepTracker {
	private int days;
	private int activeDays;
	private int steps;
	private int activeSteps;
	
	public StepTracker(int activeSteps) {
		this.activeSteps = activeSteps;
		days = 0;
		steps = 0;
		activeDays = 0;
	}

	public int activeDays() {
		return activeDays;
	}

	public double averageSteps() {
		if (days > 0) {
			return (double) steps / days;
		} else {
			return 0.0;
		}
	}
	
	public void addDailySteps(int dailySteps) {
		if (dailySteps >= activeSteps) {
			activeDays++;
		}
		steps += dailySteps;
		days++;
	}
}
