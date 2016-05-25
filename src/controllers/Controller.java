package controllers;

import java.util.ArrayList;

import pursuitDomain.Action;
import pursuitDomain.Agent;
import pursuitDomain.Environment;
import pursuitDomain.Predator;

public abstract class Controller {
	

	protected ArrayList<Action> availableActions;
	
	public Controller() {
		availableActions = new ArrayList<Action> ();
	}
	
	public abstract Action act(Environment environment);
	
	public void setAvailableActions(ArrayList<Action> actions)
	{
		availableActions = actions;
	}


}
