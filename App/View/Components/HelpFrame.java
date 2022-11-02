package App.View.Components;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import App.View.Window;


public class HelpFrame {
  public HelpFrame(){
    JFrame newWindow = new JFrame("Ajuda");
    JTextArea textArea = new JTextArea();
    
    newWindow.setLocationRelativeTo(Window.current);
    newWindow.setSize(500,500);
    newWindow.isAlwaysOnTop(); 
    
    JScrollPane scroll = new JScrollPane(textArea);

    scroll.setSize(480, 480);
    scroll.setLocation(10, 10);


    textArea.setText("\tCOMANDOS\n\nLDA #OP: REG.A <- OP\nLDA OP: REG.A <- MD[OP]\nLDB #OP: REG.B <- OP\nLDB OP: REG.B <- MD[OP]\nLDX #OP: REG.X <- OP\nLDX OP: REG.X <- MD[OP]\nSTA OP: MD[OP] <- REG.A\nSTB OP: MD[OP] <- REG.B\nSTX OP: MD[OP] <- REG.X\nADD: REG X <- REG A + REG B\nSUB: REG X <- REG A - REG B\nCMP: REG.X = REG.A == REG.B ? 1 : 0");
    textArea.setFont(new Font("Serif", Font.BOLD, 20));
    textArea.setEditable(false);

    newWindow.add(scroll);
    newWindow.setResizable(false);
    newWindow.setVisible(true);
  }

  public void addText(){

  }
}
