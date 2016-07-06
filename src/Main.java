import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your text here:");
		String text = in.nextLine();
		Queue<String> words = new LinkedList<String>();

		String[] temp;
		temp = text.split(" ");
		for (String word : temp) {
			if (word.length() > 3) {
				words.offer(word);
			}
		}
		while (!words.isEmpty()) {
			System.out.println(words.poll() + " ");
		}
		in.close();

	}

}
