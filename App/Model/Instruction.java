package App.Model;

public class Instruction {
  private String mnemonic;
  private int op1, op2;

  public String getMnemonic(){
    return this.mnemonic;
  }

  public void setMnemonic(String mnemonic){
    this.mnemonic = mnemonic;
  }

  public int getOP1(){
    return this.op1;
  }

  public void setOP1(int op){
    this.op1 = op;
  }

  public int getOP2(){
    return this.op2;
  }

  public void setOP2(int op){
    this.op2 = op;
  }

  public String toString(){
    return mnemonic + " " + Integer.toString(op1) + " " + Integer.toString(op2);
  }
}
