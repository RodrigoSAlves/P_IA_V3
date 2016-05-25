/* Rodrigo Alves
 * Andr� Roque
 */

package controllers;


import java.util.ArrayList;
import pursuitDomain.Agent;
import pursuitDomain.Environment;

import java.util.Random;

import pursuitDomain.Action;

public class RandomController extends Controller {
	
	protected Random random;
	
	public RandomController(long seed) {
		super();
		random = new Random(seed);
	}
	
	@Override
	public Action act(Environment environment) {
		int index = random.nextInt(availableActions.size());
		return availableActions.get(index);
	}
	
}
