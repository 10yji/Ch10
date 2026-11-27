import java.util.Scanner;
import java.util.Random;

public class FractionQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
        String input = "";
        int numCorrect = 0;
        int numWrong = 0;
        while (!input.equals("quit")){
            Fraction fraction1 = Fraction.randomF();
            Fraction fraction2 = Fraction.randomF();
            int randomOperator = random.nextInt(4)+1;
            String operator = "";
            String answer = "";
            if (randomOperator == 1){
				operator += "+";
				answer += Fraction.add(fraction1, fraction2).toString();
			} else if (randomOperator == 2){
				operator += "-";
				answer += Fraction.subtract(fraction1, fraction2).toString();
			} else if (randomOperator == 3){
				operator += "x";
				answer += Fraction.mult(fraction1, fraction2).toString();
			} else if (randomOperator == 4){
				operator += "/";
				answer += Fraction.divide(fraction1, fraction2).toString();
        }
        System.out.print(fraction1.toString() +" "+ operator +" "+ fraction2.toString() + " = ");
        input = scanner.nextLine();
        if (!input.equals("quit")){
			if (input.equals(answer)){
				System.out.println("Correct!");
				System.out.println();
				numCorrect++;
			}else{
				System.out.println("Wrong, the answer was " + answer);
				System.out.println();
				numWrong++;
			}
		}
    }if (input.equals("quit")){
		int totalQ = numCorrect+numWrong;
		int percentage = 0;
		if(numWrong==0&&numCorrect==0){
			percentage += 0;
		}else{
			percentage += ((double)numCorrect/(totalQ))*100+0.5;
		}
		System.out.println();
		System.out.println("You answered " + numCorrect + "/" + totalQ + " correctly, for a score of " + percentage + " percent!");
		}
	}
}
