package pursuitDomain;

import ga.RealVectorIndividual;

public class PredatorIndividual extends RealVectorIndividual<GeneticAProblem, PredatorIndividual> {

    public PredatorIndividual(GeneticAProblem problem, int size /*COMPLETE?*/) {
        super(problem, size);
        //COMPLETE?
    }

    public PredatorIndividual(PredatorIndividual original) {
        super(original);
        //COMPLETE
    }

    @Override
    public double computeFitness() {
        
        return 0;
    }

    public double[] getGenome(){
    	return genome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nfitness: ");
        sb.append(fitness);
        //COMPLETE
        return sb.toString();
    }

    /**
     *
     * @param i
     * @return 1 if this object is BETTER than i, -1 if it is WORST than I and
     * 0, otherwise.
     */
    @Override
    public int compareTo(PredatorIndividual i) {
    	double fitness = i.computeFitness();
    	if(fitness > this.fitness)
    	{
    		return 1;
    	}else{
    		if(fitness < this.fitness)
    			return -1;
    	}
    	return 0;
    	
    }

    @Override
    public PredatorIndividual clone() {
        return new PredatorIndividual(this);
    }
}
