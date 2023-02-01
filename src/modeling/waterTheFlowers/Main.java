package modeling.waterTheFlowers;

public class Main {
	public static void main(String[] args) {
		WaterSpray waterSpray = new WaterSpray(300, 5);
		waterSpray.fillUp();
		Flower flower = new Flower(20);
		
		System.out.println("flower is alive? " + flower.isAlive());
		
		for(int i=0; i<5; i++) {
			System.out.println("pumping!!");
			flower.recieveSpary(waterSpray);
		}
		
		flower.nextDay();
		System.out.println("------------------------------------------");
		System.out.println("flower is alive? " + flower.isAlive());
		
		for(int i=0; i<3; i++) {
			System.out.println("pumping!!");
			flower.recieveSpary(waterSpray);
		}
		
		flower.nextDay();
		System.out.println("------------------------------------------");
		System.out.println("flower is alive? " + flower.isAlive());
	}
}
