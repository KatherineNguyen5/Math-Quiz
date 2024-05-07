//Import Library
import javax.swing.JOptionPane;
//Class Name
public class MathQuiz {
    
    //method for the math quiz
    public void solve(){
        //declare variables
        String message = "Start Quiz!";
        String title = "Simple functions";
        int solve = Integer.parseInt(JOptionPane.showInputDialog(message, title));

        //while loop - instructing until the user solves the equation
        String question1 = "Find the value of 'x' in the equation f(x)= 2x-8";
        while(solve!= 4){
                message = "Incorrect.Think again. ";
                message = "hint: Try isolating the x on one side";
            } //read user next answer
            solve = Integer.parseInt(JOptionPane.showInputDialog( message, title));
            JOptionPane.showMessageDialog(null, question1);
        }
        //Message when correct
        message = "Excellent! bravo!";
        message = "Next question";
        JOptionPane.showMessageDialog(null, message);

        //Second question
        String question2 = "";
        while(solve!= 4){
                message = "Incorrect.Think again. ";
                message = "hint: Try isolating the x on one side";
            } //read user next answer
            solve = Integer.parseInt(JOptionPane.showInputDialog( message, title));
            JOptionPane.showMessageDialog(null, question1);
    }


}
