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
      case "MOV_A":
        App.current.ULA.setA(App.current.MD.getData(instruction.getOP1()));
        break;
      case "MOV_B":
        App.current.ULA.setB(App.current.MD.getData(instruction.getOP1()));
        break;
      case "MOV_X":
        App.current.MD.setPosition(instruction.getOP1(), App.current.ULA.getX());
        break;
      case "MOV":
        App.current.MD.setPosition(instruction.getOP1(), instruction.getOP2());
        break;
      case "SOMA":
        App.current.ULA.run(0);
        break;
      case "SUB":
        App.current.ULA.run(1);
        break;
      case "COMP":
        App.current.ULA.run(2);
        break;
      default:
        break;
    }
  }
}
