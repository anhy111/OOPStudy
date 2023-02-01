package modeling.clock;

public class Clock {
	protected int seconds;
	protected static final int HALF_DAY = 12 * 60 * 60; 
	
	public Clock(int seconds) {
		this.seconds = seconds;
	}

	public int getHours() {
		int hours = seconds / 60 / 60;
		return hours == 0 ? 12 : hours;
	}
	
	public int getMinutes() {
		return seconds / 60 % 60 ;
	}
	
	public int getSeconds() {
		return seconds % 60;
	}
	
	public void tick() {
		this.seconds = (this.seconds + 1) % HALF_DAY;
	}
	
	public void mount() {
	}
	
}
