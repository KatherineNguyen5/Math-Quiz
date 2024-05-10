//Import Library
import javax.swing.JOptionPane;
//Class Name
public class MathQuiz {
    
    //method for the math quiz
    public void solve(){
        //declare variables
        String message = "Start Quiz!";
        String title = "Simple intro quiz for Linear Functions";
        String notice = "Answer here, numbers only or program wont run";
        String question1 = "Find the value of 'x' in the equation f(x)= 2x-8, x=?";
        JOptionPane.showMessageDialog(null, title, message, 0);
        int solve = Integer.parseInt(JOptionPane.showInputDialog(question1, notice));

        //while loop - instructing until the user solves the equation
        while(solve!= 4){
            message = "Incorrect.Think again. ";
            notice = "hint: Try isolating the x on one side";
            //read user next answer
            JOptionPane.showMessageDialog(null, message);   
            solve = Integer.parseInt(JOptionPane.showInputDialog( question1, notice));
        }
        //Message when correct
        message = "Excellent! bravo!";
        JOptionPane.showMessageDialog(null, message);
        message = "Next Question";
        JOptionPane.showMessageDialog(null, message);

        String question2 = "Find the valuse of 'x' in the equation = 3(x+21)+6x=10-2(x+4), to the nearest hundredth value";
        solve = Integer.parseInt(JOptionPane.showInputDialog( question2, notice));

    //while loop - instructing until the user solves the equation
    while(solve!= -5.55){
        message = "Incorrect.Think again. ";
        notice = "hint: Expand and isolating the x on one side";
        //read user next answer
        JOptionPane.showMessageDialog(null, message);   
        solve = Integer.parseInt(JOptionPane.showInputDialog( question2, notice));
    }
    //Message when correct
    message = "Excellent! bravo!";
    JOptionPane.showMessageDialog(null, message);

    //Ending message
    message = "End of quiz! Congrats";
    JOptionPane.showMessageDialog(null, message);
    }
}
