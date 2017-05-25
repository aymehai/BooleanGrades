import java.util.Scanner;

public class BooleanGrades {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your test score: ");
		int score = scan.nextInt();
		String grade = "F";// I'm not hopeful

		if (score > 89) {

			if (score >= 97 && score <= 99) {
				grade = "A+";
			}

			if (score >= 93 && score <= 96) {
				grade = "A";
			}

			if (score >= 90 && score <= 92) {
				grade = "A-";
			}

		}

		else if (score > 79) {

			if (score >= 87 && score <= 89) {
				grade = "B+";
			}

			if (score >= 83 && score <= 86) {
				grade = "B";
			}

			if (score >= 80 && score <= 82) {
				grade = "B-";
			}
		}

		else if (score > 69) {

			if (score >= 77 && score <= 79) {
				grade = "C+";
			}

			if (score >= 73 && score <= 76) {
				grade = "C";
			}

			if (score >= 70 && score <= 72) {
				grade = "C-";
			}
		}

		else if (score > 59) {

			if (score >= 67 && score <= 69) {
				grade = "D+";
			}

			if (score >= 63 && score <= 66) {
				grade = "D";
			}

			if (score >= 60 && score <= 62) {
				grade = "D-";
			}
		}

		else {
			grade = "F";
		}

		System.out.println("Your grade is a(n) " + grade);
		if (score > 69)
			System.out.println("Very good! You don't have to retake the exam!");
		else
			System.out.println("Did you even look at the book?");

	}

}
