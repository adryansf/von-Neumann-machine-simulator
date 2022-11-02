package App.Model;

import java.util.ArrayList;

public class MP {
  private ArrayList<Instruction> positions = new ArrayList<Instruction>();

  public void addInstruction(Instruction i){
    this.positions.add(i);
  }

  public Instruction getInstruction(int pos){
    return this.positions.get(pos);
  }

  public int getTotal(){
    return positions.size();
  }

  public void reset(){
    this.positions.clear();
  }
}
