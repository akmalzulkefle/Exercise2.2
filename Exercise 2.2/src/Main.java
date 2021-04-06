public class Main {

	public static void main(String[] args) {
		
		Motorcycle Suzuki = new Motorcycle();  
		Suzuki.printMotorcycle("Suzuki Hayabusa",1340,"Silver","Hyperbike");
		System.out.println();
		
		Suzuki.printSpeed(120, 160, 200, 240, 260, 300);
		System.out.println();
		
		Suzuki.behavior("Start Button, ABS, Throwttle");
		System.out.println();
		
		Suzuki.printPrice(99);
		System.out.println();
		
		Motorcycle Kawasaki = new Motorcycle();
		Kawasaki.printMotorcycle("Kawasaki H2R",998,"Black","Superbike");
		Kawasaki.behavior("Power On, Power Off, Brake, Accelerate, Decelerate");
		Kawasaki.printSpeed(140, 200, 240, 300, 360, 400);
		Kawasaki.printPrice(260);
	}

}