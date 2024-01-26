import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

// gui extends frame and inherits all its methods (e.g., for setting
// size, adding components)

public class GUI extends JFrame {
    // constructor will create all GUI components and set their properties
    public GUI() {
        super("A simple GUI demo");

        // frame properties
        setSize(400, 300);
        setLayout(new FlowLayout());
        setVisible(true);


        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener((ActionEvent e) -> System.exit(0));
        fileMenu.add(quitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);


        TextField textField = new TextField(10);


        JProgressBar progressBar= new JProgressBar(0, 10);
        progressBar.setString("progress");
        while (true){
            progressBar.setValue(getFilledColumns(textField));
        }




    }
    public static int getFilledColumns(TextField textField) {
        return textField.getText().length();
    }
}