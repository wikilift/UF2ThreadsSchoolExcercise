import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

	private static final String[] steticHeader = { "\t           ,--,", "\t     _ ___/ /\\|", "\t ,;'( )__, )  ~",
			"\t//  //   '--; ", "\t'   \\     | ^", "\t     ^    ^", "\n", "\t ¡A SUS PUESTOS!" };

	public static void sleep() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void loadSteticMenu() {
		for (String e : steticHeader) {
			System.out.println(e);
			sleep();
		}

	}

	public static int giveMeTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ss");
		LocalDateTime now = LocalDateTime.now();
		return Integer.parseInt(dtf.format(now));
		
	}
	public static int tryParseInt(String value, int defaultVal) {
	    try {
	        return Integer.parseInt(value);
	    } catch (NumberFormatException e) {
	        return -1;
	    }
	}
}
