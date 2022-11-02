package App.View.Components;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class HelpButton {
  JButton button = new JButton("Ajuda");

  public HelpButton(Container container){
    button.setSize(80,30);
    button.setLocation(700, 260);

    button.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        new HelpFrame();
      }
    });
    
    container.add(button);
  }
}
