
public class MyAwesomeThread implements Runnable{
	
	private Horse myHorse;
	

	public MyAwesomeThread(Horse myHorse) {
		
		this.myHorse = myHorse;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		myHorse.startRace();
	}

}
