package modeling.waterTheFlowers;

public class Flower {
	private boolean alive = true;
	private int requireWater;
	private int sprayedWater;
	
	public Flower(int requireWater) {
		this.requireWater = requireWater;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public int getRequireWater() {
		return requireWater;
	}

	public void recieveSpary(WaterSpray waterSpray) {
		sprayedWater += waterSpray.spray();
	}
	
	public void nextDay() {
		if(sprayedWater >= requireWater) {
			sprayedWater = 0;
			return;
		}
		alive = false;
	}
	
	
}
