/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.State;

import business.Enterprise.PHDEnterprise;

/**
 *
 * @author Abhishek
 */
public class State {
    
    
    private String name;
    private double population;
    private String region;
    private String acronym;
    private PHDEnterprise statePHD;
    public static final String NORTHEAST = "NORTHEAST";
    public static final String SOUTH = "SOUTH";
    public static final String WEST = "WEST";
    public static final String MIDWEST = "MIDWEST";

    
    public State(String stateName)
    {
    
     //  PHDEnterprise statePHD = new PHDEnterprise(stateName);
    
    }
    
    public PHDEnterprise getStatePHD() {
        return statePHD;
    }

    public void setStatePHD(PHDEnterprise statePHD) {
        this.statePHD = statePHD;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }
    
    
    
    @Override
    public String toString()
    {
        return name;
    
    }
    
    
    
    
}
