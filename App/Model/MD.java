package App.Model;

import java.util.ArrayList;

public class MD {
  private ArrayList<Integer> positions = new ArrayList<Integer>();
  public int qtPos = 22;

  public MD(){
    for(int i = 0; i < qtPos; i++){
      positions.add(0);
    }
  }

  public void setPosition(int pos, int value){
    this.positions.set(pos, value);
  }

  public int getData(int pos){
    return this.positions.get(pos);
  }
}
