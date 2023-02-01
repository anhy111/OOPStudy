package modeling.waterTheFlowers;

public final class WaterSpray {
	private int capacity;
	private int currentWater;
	private int amount;
	
	public WaterSpray(int capacity, int amount) {
		this.capacity = capacity;
		this.amount = amount;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getCurrentWater() {
		return currentWater;
	}

	public void fillUp() {
		this.currentWater = capacity;
	}

	public int getAmount() {
		return amount;
	}
	
	public int spray() {
		int amountToSpary = Math.min(currentWater, amount);
		currentWater -= amountToSpary;
		return amountToSpary;
	}
	
}
