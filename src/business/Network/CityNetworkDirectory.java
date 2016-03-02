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
public class CityNetworkDirectory {
    
     private ArrayList<CityNetwork> cityNetworkDirectory;
    
    public CityNetworkDirectory(){
        cityNetworkDirectory = new ArrayList<CityNetwork>();
    }

    public ArrayList<CityNetwork> getCityNetworkDirectory() {
        return cityNetworkDirectory;
    }
    
    public CityNetwork addCityNetwork(String name){
        CityNetwork city = new CityNetwork();
        city.setCityName(name);
        cityNetworkDirectory.add(city);
        return city;
    }
}
