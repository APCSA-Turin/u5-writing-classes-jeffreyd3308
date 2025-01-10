public class AdditionPattern {
	private int start;
	private int current;
	private int multiplier;
	
	public AdditionPattern(int start, int multiplier) {
		this.start = start;
		this.multiplier = multiplier;
		current = start;
	}

	public int currentNumber() {
		return current;
	}

	public void next() {
		current += multiplier;
	}
	
	public void prev() {
		if (current != start) {
			current -= multiplier;
		}
	}
}
