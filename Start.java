import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int numberOfHorses;
		
	
		System.out.println("Introduce el número de caballos participantes");
		
		while(true) {
			int temporal=Utils.tryParseInt(sc.next(), -1);
			if(temporal!=-1) {
				numberOfHorses=temporal;
				break;
			}else {
				System.out.println("Porfavor introduzca solo números");
			}
		}
		Horse [] myHorses=new Horse[numberOfHorses];
		for(int i=0;i<numberOfHorses;i++) {
			System.out.println("Introduzca el nombre del caballo "+(i+1));
			myHorses[i]=new Horse(sc.next());
		}
		MyAwesomeThread myThreads[]=new MyAwesomeThread[numberOfHorses];
		Utils.loadSteticMenu();
		Thread runningThreads[] = new Thread[numberOfHorses];
		for(int i=0;i<numberOfHorses;i++) {
			myThreads[i]=new MyAwesomeThread(myHorses[i]);
			Thread t=new Thread(myThreads[i]);
			runningThreads[i]=t;
			t.start();
		}
		for (Thread thread : runningThreads) {
			while(thread.isAlive()) {
				Utils.sleep(1);
				System.out.println("La carrera continua...");
				
			}
		}
		   Horse winner = Arrays.stream(myHorses)
				      .min(Comparator.comparing(Horse::getSeconds))
				      .orElseThrow(NoSuchElementException::new);
		   System.out.println("Ha ganado el caballo "+winner.getName()+" con un tiempo récord de:"+winner.getSeconds()+" segundos");
		
	}
}
