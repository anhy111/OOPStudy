package modeling.clock;

public class AnalogClock extends Clock {
	
	public AnalogClock(int seconds) {
		super(seconds);
	}

	public int getHourHandAngle() {
		final int HOUR_ANGLE = 360 / 12;
		return HOUR_ANGLE * getHours() + HOUR_ANGLE / 60 * getMinutes();
	}
	
	public int getMinuteHandAngle() {
		return getMinutes() * 6;
	}
	
	public int getSecondHandAngle() {
		return getSeconds() * 6;
	}
	
	public void addSeconds(int seconds) {
		while(seconds < 0) {
			seconds += HALF_DAY;
		}
		this.seconds = this.seconds + seconds % HALF_DAY;
	}
	
}
