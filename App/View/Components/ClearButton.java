package App.View.Components;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import App.Controllers.ProgramController;


public class ClearButton {
  JButton button = new JButton("Limpar");

  public ClearButton(Container container){
    button.setSize(100,30);
    button.setLocation(580, 260);

    button.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        ProgramController.clear();
      }
    });
    
    container.add(button);
  }
}
