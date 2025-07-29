import javax.swing.*;
import java.awt.*;

public class Swings {
    public static void main(String[] args) {
        StackOpsFrame frame = new StackOpsFrame();
        frame.setVisible(true);
    }
}
class StackOpsFrame extends JFrame{
    private JTextField pushField;
    private JButton pushbutton,popbutton,peekButton;
    private JTextArea stackData;
    
    public StackOpsFrame(){
        initComponets();
    }

    private void initComponets() {
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pushField = new JTextField(20);
        pushbutton = new JButton("Push");
        popbutton = new JButton("Pop");
        peekButton = new JButton("Peek");
        stackData = new JTextArea();

        setLayout(new FlowLayout());

        add(pushField,BorderLayout.NORTH);
        add(pushbutton,BorderLayout.SOUTH);
        add(popbutton,BorderLayout.EAST);
        add(peekButton,BorderLayout.WEST);
        add(stackData,BorderLayout.CENTER);
        stackData = new JTextArea();

//        add(panel,)
    }
}