import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;
        
        JFrame frame = new JFrame("Flying Bird");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); //Place frame in the center of the screen, not relative to any other component.
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        FlyingBird flyingBird = new FlyingBird();
        frame.add(flyingBird);
        frame.pack();  // sizes the window so that all its contents 
    // (like buttons, labels, panels) are at their preferred sizes.
         flyingBird.requestFocus();
        frame.setVisible(true);
        
    }
}
