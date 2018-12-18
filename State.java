/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simujaxb;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author simu
 */


@XmlRootElement(namespace = "com.simujaxb.Country")
public class State {
    
    private String stateName;
    long statePopulation;

 public State()
 {

 }
 public State(String stateName, long statePopulation) {
  super();
  this.stateName = stateName;
  this.statePopulation = statePopulation;
 }

 public String getStateName() {
  return stateName;
 }

 public void setStateName(String stateName) {
  this.stateName = stateName;
 }

 public long getStatePopulation() {
  return statePopulation;
 }

 public void setStatePopulation(long statePopulation) {
  this.statePopulation = statePopulation;
 }
}
