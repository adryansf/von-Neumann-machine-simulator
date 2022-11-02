package App;

import App.Model.MD;
import App.Model.MP;
import App.Model.UC;
import App.Model.ULA;
import App.View.Window;

public class App  {
  public static App current = null;

  public String[] program;

  public MP MP = new MP();
  public MD MD = new MD();
  public ULA ULA = new ULA();
  public UC UC = new UC();
  
  public App(){
    App.current = this;
    new Window();
  }
}