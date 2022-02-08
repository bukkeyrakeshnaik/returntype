

public class AbstractionDemo {

	public static void main(String[] args) {
		
//		Human human = new Human();//Can't do it now : abstract
		
		rakesh rakesh = new rakesh();
		
		rakesh.eat();
		rakesh.run();
		rakesh.breathe();
		
		Shuja shuja = new Shuja();
		shuja.eat();
		shuja.run();
		
	}

}

abstract class Human{
	abstract void eat();
	abstract void run();
	
	void breathe() {
		System.out.println("Generic breathe...");
	}
}

class rakesh extends Human{
	@Override
	void eat() {
		System.out.println("rakesh's own way of eating...");
		
	}
	
	@Override
	void run() {
		System.out.println("rakesh's distinguished style of running....");
		
	}
}

class Shuja extends Human{
	@Override
	void eat() {
		System.out.println("Shuja's eat...");
		
	}
	
	@Override
	void run() {
		System.out.println("Shuja runs fast...");
		
	}
}









