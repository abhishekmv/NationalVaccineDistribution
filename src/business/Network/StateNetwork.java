/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Network;


 


import business.Enterprise.EnterpriseDirectory;
import business.State.State;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class StateNetwork {
    
 private String id;
    private static int count = 1;
    private State state;
    //private CityNetworkDirectory cityNetworkDirectory;
 //   private EnterpriseDirectory entDir;
    
    public StateNetwork(String name){
       // cityNetworkDirectory = new CityNetworkDirectory();
        id = String.valueOf(count++);
        state = new State(name);
      //  this.entDir = new EnterpriseDirectory();
    }

   /* public CityNetworkDirectory getCityNetworkDirectory() {
        return cityNetworkDirectory;
    }

    public void setCityNetworkDirectory(CityNetworkDirectory cityNetworkDirectory) {
        this.cityNetworkDirectory = cityNetworkDirectory;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

  /*  public EnterpriseDirectory getEntDir() {
        return entDir;
    }

    public void setEntDir(EnterpriseDirectory entDir) {
        this.entDir = entDir;
    }*/
    
    

    @Override
    public String toString() {
        return id;
    }
    
    
}
