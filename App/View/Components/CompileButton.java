package App.View.Components;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import App.Controllers.ProgramController;
import App.View.Window;


public class CompileButton {
  JButton button = new JButton("Compilar");

  public CompileButton(Container container){
    button.setSize(100,30);
    button.setLocation(560, 620);

    button.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        ProgramController.compile(Window.current.programArea.textArea.getText());
      }
    });
    
    container.add(button);
  }
}
