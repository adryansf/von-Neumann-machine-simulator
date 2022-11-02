package App.Model;

import App.App;

public class UC {
  private int PC;
  private Instruction RI;

  public int getPC(){
    return PC;
  }

  public void resetPC(){
    PC = 0;
  }

  public Instruction getRI(){
    return RI;
  }

  public void IncPC(){
    PC = PC + 1;
  }

  public void fetch(int pos){
    RI = App.current.MP.getInstruction(pos);
  }

  public void parse(Instruction instruction){
    switch(instruction.getMnemonic()){
      case "ADD":
        App.current.ULA.run(0);
        break;
      case "SUB":
        App.current.ULA.run(1);
        break;
      case "CMP":
        App.current.ULA.run(2);
        break;
      case "LDA":
        App.current.ULA.setA(instruction.getOP1());
        break;
      case "LDB":
        App.current.ULA.setB(instruction.getOP1());
        break;
      case "LDX":
        App.current.ULA.setX(instruction.getOP1());
        break;
      case "STA":
        App.current.MD.setPosition(instruction.getOP1(), App.current.ULA.getA());
        break;
      case "STB":
        App.current.MD.setPosition(instruction.getOP1(), App.current.ULA.getB());
        break;
      case "STX":
        App.current.MD.setPosition(instruction.getOP1(), App.current.ULA.getX());
        break;
      default:
        break;
    }
  }
}
