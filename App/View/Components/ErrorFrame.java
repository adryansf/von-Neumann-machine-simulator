package App.View.Components;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import App.View.Window;


public class ErrorFrame {
  public ErrorFrame(String text){
    JFrame newWindow = new JFrame("Erro");
    JTextPane textArea = new JTextPane();
    
    newWindow.setLocationRelativeTo(Window.current);
    newWindow.setSize(400,70);
    newWindow.isAlwaysOnTop();    

    textArea.setText(text);
    textArea.setLocation(10,10);
    textArea.setEditable(false);

    newWindow.add(textArea);
    newWindow.setResizable(false);
    newWindow.setVisible(true);
  }
}
