package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Lesson> list = new ArrayList<>();

		System.out.print("How many classes has the course? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			System.out.println(i + "ª class data: ");
			System.out.print("Video or task?(v/t) ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			if (ch == 'v') {
				System.out.print("Title: ");
				String title = sc.nextLine();
				System.out.print("Video URL: ");
				String url = sc.nextLine();
				System.out.print("Seconds duration: ");
				int seconds = sc.nextInt();

				Video video = new Video(title, url, seconds);
				list.add(video);
			} else {
				System.out.print("Title: ");
				String title = sc.nextLine();
				System.out.print("Description: ");
				String description = sc.nextLine();
				System.out.print("Questions quantity: ");
				int questionCount = sc.nextInt();

				Task task = new Task(title, description, questionCount);
				list.add(task);
			}
			System.out.println();

		}

		int total = 0;

		for (Lesson ls : list) {
			total += ls.duration();
		}
		System.out.println();
		System.out.println("COURSE TOTAL DURATION: " +  total+ " seconds.");

		sc.close();
		
		
		

	}
}
