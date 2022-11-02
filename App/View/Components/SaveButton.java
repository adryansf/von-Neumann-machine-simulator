package App.View.Components;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import App.View.Window;


public class SaveButton {
  JButton button = new JButton("Salvar");

  public SaveButton(Container container){
    button.setSize(100,30);
    button.setLocation(680, 15);

    button.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        JFrame secondFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Digite o nome do arquivo");
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", "txt");
        fileChooser.setFileFilter(filter);
        int userSelection = fileChooser.showSaveDialog(secondFrame);
        if(userSelection == JFileChooser.APPROVE_OPTION){
          File fileToSave = fileChooser.getSelectedFile();
          try{
            Window.current.programArea.textArea.write(new OutputStreamWriter(new FileOutputStream(fileToSave), "utf-8"));
          }
          catch(Exception error){
            JFrame errorFrame = new JFrame("Error");
            JTextPane text = new JTextPane();
            text.setText("Não foi possível salvar o arquivo!");
            text.setEditable(false);

            errorFrame.add(text);

            errorFrame.setSize(220,60);
            errorFrame.setResizable(false);
            errorFrame.setAlwaysOnTop(true);
            errorFrame.setLocationRelativeTo(container);
            errorFrame.setVisible(true);
          }
        }
      }
    });
    
    container.add(button);
  }
}
