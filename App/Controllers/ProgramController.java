package App.Controllers;

import App.Model.Instruction;
import App.View.Window;

public class ProgramController  {
  public static void compile(String program){
    App.App app = App.App.current;
    app.UC.resetPC();
    app.MP.reset();

    app.program = program.split("\n");

    Window.current.stepByStep.setTotalSteps(app.program.length);
  }

  public static void run(){
    App.App app = App.App.current;
    Window window = Window.current;

    try{
      for(String line: app.program){
        String commands[] = line.split("\\s+");
  
        if(commands.length == 0 || commands[0].length() < 3) continue;
  
        Instruction instruction = new Instruction();
  
        instruction.setMnemonic(commands[0].toUpperCase());
        
        if(commands.length > 1){
          int op1 = Integer.parseInt(commands[1]);
          instruction.setOP1(op1);
        }
        
        if(commands.length > 2){
          int op2 = Integer.parseInt(commands[2]);
          instruction.setOP2(op2);
        }
  
        app.MP.addInstruction(instruction);
        if((app.UC.getPC() > app.MP.getTotal()) || app.MP.getTotal() == 0) return;
        app.UC.fetch(App.App.current.UC.getPC());
        app.UC.parse(app.UC.getRI());

        for(int i = 0; i < app.MD.qtPos; i++){
          window.MDArea.setPosition(i, Integer.toString(app.MD.getData(i)));
        }

        app.UC.IncPC();
        window.stepByStep.setCurrentStep(app.UC.getPC());
        window.stepByStep.setCurrentInstruction(app.UC.getRI().toString());
        window.registradores.regA.setText(Integer.toString(app.ULA.getA()));
        window.registradores.regB.setText(Integer.toString(app.ULA.getB()));
        window.registradores.regX.setText(Integer.toString(app.ULA.getX()));
      }
    }catch(Exception err){
      window.createError("Ocorreu um erro na execução! Verifique o código na linha " + Integer.toString(App.App.current.UC.getPC() + 1) + ".");
    }
  }

  public static void runStep(){
    App.App app = App.App.current;
    Window window = Window.current;
    
    try{
      if(app.UC.getPC() >= app.program.length) return;

      String line = app.program[app.UC.getPC()];
      String commands[] = line.split("\\s+");

      if(commands.length == 0 || commands[0].length() < 3) return;


      Instruction instruction = new Instruction();

      instruction.setMnemonic(commands[0].toUpperCase());

      if(commands.length > 1){
        int op1 = Integer.parseInt(commands[1]);
        instruction.setOP1(op1);
      }

      if(commands.length > 2){
        int op2 = Integer.parseInt(commands[2]);
        instruction.setOP2(op2);
      }

      app.MP.addInstruction(instruction);
      if((app.UC.getPC() > app.MP.getTotal()) || app.MP.getTotal() == 0) return;
      app.UC.fetch(App.App.current.UC.getPC());
      app.UC.parse(app.UC.getRI());

      for(int i = 0; i < app.MD.qtPos; i++){
        window.MDArea.setPosition(i, Integer.toString(app.MD.getData(i)));
      }

      app.UC.IncPC();
      window.stepByStep.setCurrentStep(app.UC.getPC());
      window.stepByStep.setCurrentInstruction(app.UC.getRI().toString());
      window.registradores.regA.setText(Integer.toString(app.ULA.getA()));
      window.registradores.regB.setText(Integer.toString(app.ULA.getB()));
      window.registradores.regX.setText(Integer.toString(app.ULA.getX()));
    }catch(Exception err){
      window.createError("Ocorreu um erro na execução! Verifique o código na linha " + Integer.toString(App.App.current.UC.getPC() + 1) + ".");
    }
  }

  public static void clear(){
    App.App app = App.App.current;
    Window window = Window.current;
    
    app.ULA.setA(0);
    app.ULA.setB(0);
    app.ULA.setX(0);

    window.registradores.regA.setText(Integer.toString(app.ULA.getA()));
    window.registradores.regB.setText(Integer.toString(app.ULA.getB()));
    window.registradores.regX.setText(Integer.toString(app.ULA.getX()));
    
    for(int i = 0; i < app.MD.qtPos; i++){
      app.MD.setPosition(i, 0);
      window.MDArea.setPosition(i, Integer.toString(app.MD.getData(i)));
    }
  }
}
