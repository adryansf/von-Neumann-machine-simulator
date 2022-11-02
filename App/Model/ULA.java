package App.Model;

public class ULA {
  private int regA, regB, regX;

  public int getA(){
    return this.regA;
  }

  public void setA(int value){
    this.regA = value;
  }

  public int getB(){
    return this.regB;
  }

  public void setB(int value){
    this.regB = value;
  }

  public int getX(){
    return this.regX;
  }

  public void setX(int value){
    this.regX = value;
  }

  public void run(int op){
    switch(op){
      case 0:
        regX = regA + regB;
        break;
      case 1:
        regX = regA - regB;
        break;
      case 2:
        regX = regA == regB ? 1 : 0;
    }
  }
}
