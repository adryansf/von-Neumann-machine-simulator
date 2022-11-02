package App.View.Components;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import App.Controllers.ProgramController;
import App.View.Window;


public class RunButton {
  JButton button = new JButton("Executar");

  public RunButton(Container container){
    button.setSize(150,30);
    button.setLocation(390, 620);

    button.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        ProgramController.compile(Window.current.programArea.textArea.getText());
        ProgramController.run();
      }
    });
    
    container.add(button);
  }
}
