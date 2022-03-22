import java.util.Random;

public class Horse {
	//pojo class
	private String name;
	private float seconds;
	private static Random ran=new Random();	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSeconds() {
		return seconds;
	}
	public void setSeconds(float seconds) {
		this.seconds = seconds;
	}
	public Horse(String name) {
		
		this.name = name;
		
		this.seconds=ran.nextInt(10 -1 + 1) + 1;
	
	}
	
	public void startRace() {
		System.out.println("Sale el caballo "+ this.getName());
		try {
			Thread.sleep((long) (this.getSeconds()*1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Soy el caballo "+ this.getName()+ " he tardado "+this.getSeconds()+ " segundos");
		
	}

}
