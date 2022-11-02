package App.View.Components;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Registradores {
  public JTextField regA = new JTextField();
  public JTextField regB = new JTextField();
  public JTextField regX = new JTextField();

  public Registradores(Container container){
    JLabel labelA = new JLabel("Reg. A:");
    labelA.setSize(100, 30);
    labelA.setFont(new Font("Serif", Font.BOLD, 20));
    labelA.setLabelFor(regA);
    labelA.setLocation(20,15);

    regA.setSize(100,30);
    regA.setLocation(100+20, 15);
    regA.setEditable(false);
    regA.setText("0");

    JLabel labelB = new JLabel("Reg. B:");
    labelB.setSize(100, 30);
    labelB.setFont(new Font("Serif", Font.BOLD, 20));
    labelB.setLabelFor(regB);
    labelB.setLocation(240,15);

    regB.setSize(100,30);
    regB.setLocation(320+20, 15);
    regB.setEditable(false);
    regB.setText("0");

    JLabel labelX = new JLabel("Reg. X:");
    labelX.setSize(100, 30);
    labelX.setFont(new Font("Serif", Font.BOLD, 20));
    labelX.setLabelFor(regX);
    labelX.setLocation(460,15);

    regX.setSize(100,30);
    regX.setLocation(540+20, 15);
    regX.setEditable(false);
    regX.setText("0");


    container.add(labelA);
    container.add(regA);
    container.add(labelB);
    container.add(regB);
    container.add(labelX);
    container.add(regX);
  }
}
