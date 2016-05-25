package ga.geneticOperators;

import ga.GeneticAlgorithm;
import ga.RealVectorIndividual;

public class MutationUniform <I extends RealVectorIndividual> extends Mutation<I> {

	private static final double delta = 0.5;
	
    public MutationUniform(double probability/*COMPLETE?*/) {
        super(probability);
        //COMPLETE
    }

    @Override
    public void run(I ind) {
    	
    	for(int i = 0; i < ind.getNumGenes(); i++){
            if(GeneticAlgorithm.random.nextDouble() < probability){    
				ind.setGene(i, ind.getGene(i)+(GeneticAlgorithm.random.nextDouble()*2-1)*delta); 
            }
        }
    }
    
    @Override
    public String toString(){
        return "Uniform distribution mutation (" + probability /* + COMPLETE?*/;
    }
}