package modeling.clock;

public class Main {
	public static void main(String[] args) {
		AnalogClock analogClock = new AnalogClock(1);
		analogClock.addSeconds( 52 *60);
		System.out.println("현재시간은? " + analogClock.getHours() + "시 " + analogClock.getMinutes() + "분 " + analogClock.getSeconds() + "초");
		System.out.println("시침각도? " + analogClock.getHourHandAngle());
		System.out.println("분침각도? " + analogClock.getMinuteHandAngle());
		System.out.println("초침각도? " + analogClock.getSecondHandAngle());
	}
}
