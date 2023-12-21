/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricante_Marvin_BSCS101;

/**
 *
 * @author maaaaarvin
 */
import java.util.Scanner;

public class PerformanceTask {
    
    public static void main(String args []) {
        quiz();
    }
    
    static void quiz() {
        Scanner userInput = new Scanner(System.in);
        int totalQuestions = 5;
        int score = 0; // Score starts from 0. this will increment when user hits the correct answer
        
        String questions[] = new String[] {"Who killed Charles Xavier (Professor X)?", "Who's ash first pokemon?", "Who's luffy's first crewmate on strawhat pirates?", "Who's the person revive madara?", "What kind of pokeball that can catch a pokemon in a single attempt?"};
        
        String choices[][] = new String[][] { {"A. Magneto", "B. Phoenix", "C. Wolverine"}, {"A. Pikachu", "B. Bulbasaur", "C. Charamander"}, {"A. Sanji", "B. Zoro", "C. Nami"}, {"A. Kabuto", "B. Kakashi", "C. Sasuke"}, {"A. Ultra Ball", "B. Cherish Ball", "C. Master Ball"} };
        
        char correctAnswers[] = new char[] {'B', 'A', 'B', 'A', 'C'};
        
        for(int i = 0; i < totalQuestions; ++i) {
            displayQuestion(i, questions, choices);
            char userAnswer = getUserAnswer(userInput);
            
            if(Character.toLowerCase(userAnswer) == Character.toLowerCase(correctAnswers[i])) { // Convert both user's answer and correct answer to lowercase for case-insensitive comparison
                System.out.println("Correct! The answer is " + choices[i][correctAnswers[i] - 'A']);
                score+= 5;// Score will incremented by 5 points
            }else {
                System.out.println("Incorrect. The answer is " + choices[i][correctAnswers[i] - 'A']);
            }
        }
        System.out.println();
        System.out.println("Your score is: " + score + "/25");
    }
    
    static void displayQuestion(int index, String questions[], String choices[][]) {
        System.out.println();
        System.out.println((index + 1) + ". " + questions[index]);
        for(String choice : choices[index]) {
            System.out.println("\t" + choice);
        }
    }
    
    static char getUserAnswer(Scanner userInput) { // passes scanner for user input
        System.out.print("Enter your answer: ");
        return Character.toLowerCase(userInput.next().charAt(0)); // Convert the user's input to lowercase for case-insensitive comparison
    }
}
