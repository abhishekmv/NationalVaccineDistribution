/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Network;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class StateNetworkDirectory {
    
     private ArrayList<StateNetwork> stateNetwork;
    
    public StateNetworkDirectory(){
        stateNetwork = new ArrayList<StateNetwork>();
    }

    public ArrayList<StateNetwork> getStateNetwork() {
        return stateNetwork;
    }
    
    public StateNetwork createNetwork(String statename){
        StateNetwork stateNetworkObj = null;
        boolean flag = false;
        for(StateNetwork s : stateNetwork){
            if(s.getState().getName().equals(statename)){
               flag =true;
            }
        }
        if(!flag){
            stateNetworkObj= new StateNetwork(statename);
            stateNetwork.add(stateNetworkObj); 
        }
        return stateNetworkObj;
    }
    
    
}
