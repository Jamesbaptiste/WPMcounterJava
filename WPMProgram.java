import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
	
	static String[] words = {"hello", "dad", "mom", "find", "stop", "go"};

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand =  new Random();
		
		for (int i = 0; i < 6; i++) { 
		System.out.print(words[rand.nextInt(5)] + " ");
		}
		System.out.println();
		
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typedWords = scan.nextLine();
		
		System.out.println(typedWords);
		
		double end = LocalTime.now().toNanoOfDay();
		
		double totalTime = end - start;
		double seconds = totalTime/ 1000000000.0;
		
		//System.out.print(seconds);

		// (x characters / 5) / 1 min = y WPM
		
		int numChars = typedWords.length();
		
		int WPM = (int) ((((double)numChars / 5) / seconds) * 60);
		
		System.out.print("You typed at a rate of " + (WPM) + " WPM");
		
		



	}

}
