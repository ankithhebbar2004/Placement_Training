import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StackOpsFrame extends JFrame {
    private JTextField pushField;
    private JButton pushButton, popButton, peekButton;
    private JTextArea stackData;

    public StackOpsFrame(){
        initComponents();
    }

    private void initComponents(){
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pushField = new JTextField(20);
        setLayout(new FlowLayout());
        add(pushField);
        pushButton = new JButton("PUSH");
        pushButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        popButton = new JButton("POP");
        popButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = 0;
                n++;
                System.out.println(n + " clicked");
            }
        });
        peekButton = new JButton("PEEK");
        peekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JPanel panel = new JPanel();
        panel.add(pushField);
        panel.add(pushButton);
        panel.add(popButton);
        panel.add(peekButton);
        stackData = new JTextArea();

        add(panel, BorderLayout.NORTH);
        add(pushField, BorderLayout.NORTH);
        add(pushButton, BorderLayout.EAST);
        add(popButton);
        add(peekButton);
        add(stackData, BorderLayout.CENTER);
    }
}

