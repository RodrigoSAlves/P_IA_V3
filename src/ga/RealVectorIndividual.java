package ga;

public abstract class RealVectorIndividual <P extends GAProblem, I extends RealVectorIndividual> extends Individual<P, I>{

    //TODO: GENOME DEFINITION;
	//DONE? RA - 25 - 05 - 2016
	protected double[] genome; //vetor de pesos;
	
    
    public RealVectorIndividual(P problem, int size) {
        super(problem);
        genome = new double[size];
        for(int g = 0; g < genome.length; g++)
        	genome[g] = (GeneticAlgorithm.random.nextDouble() * 2-1);   
    }

    public RealVectorIndividual(RealVectorIndividual<P, I> original) {
        super(original);
        this.genome = new double[original.genome.length];
        System.arraycopy(original.genome, 0, genome, 0, genome.length);
        
    }
    
    @Override
    public int getNumGenes() {
        return genome.length;
    }
    
    public double getGene(int index) {
        return genome[index];
    }
    
    public void setGene(int index, double newValue) {
        genome[index] = newValue;
    }

    @Override
    public void swapGenes(RealVectorIndividual other, int index) {
    	double aux = genome[index];
    	genome[index] = other.getGene(index);
    	other.setGene(index, aux);
    }
}
