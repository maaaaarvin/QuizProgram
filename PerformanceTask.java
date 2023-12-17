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
    
    private static void quiz() {
        Scanner scanner = new Scanner(System.in);
        int totalQuestions = 5;
        int score = 0; // Score starts from 0. this will increment when user hits the correct answer
        
        String questions[] = {"Which of these is not considered a programming language?", "Who is the worst professor on the entire sti branch?", "What programming language that mostly deals with web apps?", "What is the fastest vehicle right now?", "Who write the song pink + white?"};
        
        String choices[][] = {{"A. JavaScript", "B. HTML", "C. Java"}, {"A. James Mir4", "B. Norman Guererro", "C. Ethel Martinez"}, {"A. JavaScript", "B. PHP", "C. Python"}, {"A. Kawasaki Ninja H2R", "B. Bugatti Chiron", "C. Toyota Hiace"}, {"A. Frank Lake", "B. Frank Sewer", "C. Frank Ocean"}};
        
        char correctAnswers[] = {'B', 'C', 'A', 'A', 'C'};
        
        for(int i = 0; i < totalQuestions; i++) {
            displayQuestion(i, questions, choices);
            char userAnswer = getUserAnswer(scanner);
            
            if(Character.toLowerCase(userAnswer) == Character.toLowerCase(correctAnswers[i])) { // Convert both user's answer and correct answer to lowercase for case-insensitive comparison
                System.out.println("Correct! The answer is " + choices[i][correctAnswers[i] - 'A']);
                score+= 5;// Each correct answer it will increment in 5
            }else {
                System.out.println("Incorrect. The answer is " + choices[i][correctAnswers[i] - 'A']);
            }
        }
        System.out.println();
        System.out.println("Your score is: " + score + "/25");
    }
    
    private static void displayQuestion(int index, String questions[], String choices[][]) {
        System.out.println();
        System.out.println((index + 1) + ". " + questions[index]);
        for(String choice : choices[index]) {
            System.out.println("\t" + choice);
        }
    }
    
    private static char getUserAnswer(Scanner scanner) { // passes scanner for user input
        System.out.print("Enter your answer: ");
        return Character.toLowerCase(scanner.next().charAt(0)); // Convert the user's input to lowercase for case-insensitive comparison
    }
    
}
