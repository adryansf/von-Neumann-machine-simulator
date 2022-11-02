package App.View.Components;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextPane;

import App.Controllers.ProgramController;


public class StepByStep {
  private int currentStep = 0;
  private int totalSteps = 0;

  JButton button = new JButton(">>>");
  JTextPane steps = new JTextPane();
  JTextPane currentInstruction = new JTextPane();

  public StepByStep(Container container){
    steps.setText("0/0");
    steps.setLocation(200, 620);
    steps.setSize(100,50);
    steps.setBackground(Color.LIGHT_GRAY);
    steps.setFont(new Font("Serif", Font.BOLD, 20));
    steps.setEditable(false);

    currentInstruction.setText("");
    currentInstruction.setLocation(200, 650);
    currentInstruction.setSize(500,50);
    currentInstruction.setBackground(Color.LIGHT_GRAY);
    currentInstruction.setEditable(false);

    button.setSize(70,30);
    button.setLocation(300, 620);

    button.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        ProgramController.runStep();
      }
    });
    
    container.add(button);
    container.add(steps);
    container.add(currentInstruction);
  }

  private void refresh(){
    steps.setText(Integer.toString(currentStep) + "/" + Integer.toString(totalSteps));
  }

  public void setCurrentStep(int step){
    currentStep = step;
    refresh();
  }

  public void setTotalSteps(int steps){
    totalSteps = steps;
    currentStep = 0;
    refresh();
  }

  public void setCurrentInstruction(String instruction){
    currentInstruction.setText(instruction);
  }
}
