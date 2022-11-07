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
    newWindow.setSize(1200,350);
    newWindow.isAlwaysOnTop(); 
    
    JScrollPane scroll = new JScrollPane(textArea);

    scroll.setSize(480, 480);
    scroll.setLocation(10, 10);


    textArea.setText("\t\t\tCOMANDOS\n\nMOV_A posição  --> o valor contido na posição da memória de dados deve ser colocado no RegA da ULA\nMOV_B posição  --> o valor contido na posição da memória de dados deve ser colocado no RegB da ULA\nMOV_X posição  --> o valor contido no RegX da ULA deve ser colocado na posição da memória de dados\nMOV posição valor  --> o valor deve ser colocado na posição da memória de dados\nSOMA   --> os valores devem ser somados utilizando a ULA\nSUB   --> os valores devem ser subtraídos utilizando a ULA\nCOMP  --> os valores devem ser comparados utilizando a ULA\nADD: REG.X <- REG.A + REG.B\nSUB: REG.X <- REG.A - REG.B\nCOMP: REG.X <- REG.A == REG.B ? 1 : 0");
    textArea.setFont(new Font("Serif", Font.BOLD, 20));
    textArea.setEditable(false);

    newWindow.add(scroll);
    newWindow.setResizable(false);
    newWindow.setVisible(true);
  }

  public void addText(){

  }
}
