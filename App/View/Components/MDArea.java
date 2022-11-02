package App.View.Components;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MDArea {
  int qtPos = App.App.current.MD.qtPos;
  private ArrayList<JTextField> textsField = new ArrayList<JTextField>();

  public MDArea(Container container){
    JPanel box = new JPanel();
    box.setLocation(10, 60);
    box.setSize(780, 190);
    
    box.setBorder(BorderFactory.createLineBorder(Color.RED));

    JLabel title = new JLabel();
    title.setText("Memória de Dados");
    title.setLocation(310, 55);
    title.setSize(500, 50);
    title.setFont(new Font("Serif", Font.BOLD, 18));

    for(int i = 0 ; i < qtPos; i++){

      int limitPerRow = 11;

      int x = 20 + (i < limitPerRow ? (i * 70) : ((i - limitPerRow) * 70));
      int y = i < limitPerRow ? 100 : 180;

      
      JTextField textField = new JTextField();
      textField.setSize(60, 30);
      textField.setLocation(x, y + 15 + 10);
      textField.setText("0");
      textField.setEditable(false);
      textsField.add(i, textField);

      JLabel label = new JLabel(Integer.toString(i));
      label.setLabelFor(textsField.get(i));
      label.setFont(new Font("Serif", Font.BOLD, 18));
      label.setSize(30, 25);
      label.setLocation(x + 15, y);

      container.add(label);
      container.add(textsField.get(i));
    }
    container.add(title);
    container.add(box);
  }

  public void setPosition(int pos, String value){
    this.textsField.get(pos).setText(value);
  }
}
