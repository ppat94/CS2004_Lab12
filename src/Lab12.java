import java.util.ArrayList;

public class Lab12 
{
	public static void main(String args[])
	{
		//Read in the weights
		//Make sure you change the filename as appropriate!
		//This will only work if "c:\temp\1000 Primes.txt" exists!
		//ArrayList<Double> w = CS2004.ReadNumberFile("1000 Primes.txt");
		//Set the weights
		//OneMaxChrome.SetWeights(w);
		//Run 10 repeats
		for(int i=0;i<10;++i)
		{
			//Reset the fitness count
			OneMaxChrome.ClearFC();
			//The following parameters are not very good!
			//These are the ones you should try and optimise!
			int popsize = 100;
			double mrate = 0.1;
			double crate = 95;
			//You will not need to change the following
			SimpleGeneticAlgorithm ga = new SimpleGeneticAlgorithm(popsize,10,mrate,crate);
			//Run the GA for 10,000 function calls
			double f = ga.RunSGA(10000,true).OneMaxGetFitness();
			//System.out.println(f);
		}
	}
}
