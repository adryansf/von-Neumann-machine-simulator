package App.View.Components;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ProgramArea {
  public int lines = 0;

  public JTextArea textArea = new JTextArea();

  public ProgramArea(Container container){
    JLabel label = new JLabel("Programa: ");
    label.setLabelFor(textArea);
    label.setFont(new Font("Serif", Font.BOLD, 20));
    label.setSize(150, 30);
    label.setLocation(20, 260);

    JScrollPane scroll = new JScrollPane(textArea);

    scroll.setSize(760, 300);
    scroll.setLocation(20, 300);

    container.add(label);
    container.add(scroll);
  }
}
