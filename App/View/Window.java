package App.View;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

import App.View.Components.CompileButton;
import App.View.Components.ErrorFrame;
import App.View.Components.HelpButton;
import App.View.Components.MDArea;
import App.View.Components.ProgramArea;
import App.View.Components.Registradores;
import App.View.Components.RunButton;
import App.View.Components.SaveButton;
import App.View.Components.StepByStep;

public class Window extends JFrame {
  public static Window current = null;

  public ProgramArea programArea;
  public Registradores registradores;
  public SaveButton saveButton;
  public MDArea MDArea;
  public StepByStep stepByStep;
  public RunButton runButton;
  public CompileButton compileButton;
  public HelpButton helpButton;

  public Window(){
    this.setLayout(null);
    this.setTitle("Simulador de Máquina de Von Neumann");
    this.setSize(800,750);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setVisible(true);
    Container container = this.getContentPane();
    container.setBackground(Color.LIGHT_GRAY);

    registradores = new Registradores(container);
    saveButton = new SaveButton(container);
    programArea = new ProgramArea(container);
    MDArea = new MDArea(container);
    stepByStep = new StepByStep(container);
    runButton = new RunButton(container);
    compileButton = new CompileButton(container);
    helpButton = new HelpButton(container);


    container.revalidate();
    container.repaint();

    Window.current = this;
  }

  public void createError(String text){
    new ErrorFrame(text);
  }
}