package dk.itu.mario.engine.level;

import java.util.Random;
import java.util.*;

//Make any new member variables and functions you deem necessary.
//Make new constructors if necessary
//You must implement mutate() and crossover()


public class MyDNA extends DNA
{
	
	public int numGenes = 0; //number of genes

	// Return a new DNA that differs from this one in a small way.
	// Do not change this DNA by side effect; copy it, change the copy, and return the copy.
	public MyDNA mutate ()
	{
		MyDNA copy = new MyDNA();
		//YOUR CODE GOES BELOW HERE
		Random rand = new Random();
		int gene = rand.nextInt(this.numGenes);
		char oldType = this.getChromosome().charAt(gene * 2);
		char oldNum = this.getChromosome().charAt((gene * 2) + 1);
		boolean b = rand.nextBoolean();
		String newGene = "";
		if (b) {
			int newType = rand.nextInt(5);
			switch(newType) {
				case 0: newGene = "G"; break; // gap
				case 1: newGene = "S"; break; // straight
				case 2: newGene = "C"; break; // coins
				case 3: newGene = "H"; break; // hill
				case 4: newGene = "M"; break; // monsters
			}
			newGene = newGene + oldNum;
		}
		else {
			int newNum = rand.nextInt(9) + 1;
			newGene = newGene + oldType + newNum;
		}
		String newChromosome = "";
		for (int i=0; i < this.numGenes; i++) {
			if (i == gene) {
				newChromosome = newChromosome + newGene;
			}
			else {
				oldType = this.getChromosome().charAt(i * 2);
				oldNum = this.getChromosome().charAt((i * 2) + 1);
				newChromosome = newChromosome + oldType + oldNum;
			}
		}
		copy.setChromosome(newChromosome);
		copy.setNumGenes(this.numGenes);
		//YOUR CODE GOES ABOVE HERE
		return copy;
	}
	
	// Do not change this DNA by side effect
	public ArrayList<MyDNA> crossover (MyDNA mate)
	{
		ArrayList<MyDNA> offspring = new ArrayList<MyDNA>();
		//YOUR CODE GOES BELOW HERE
		Random rand = new Random();
		int crosspoint1 = rand.nextInt(this.numGenes-1) + 1;
		int crosspoint2 = this.numGenes - crosspoint1;
		String s1 = "";
		String s2 = "";
		for (int i=0; i < this.numGenes*2; i++) {
			if (i <= (crosspoint1*2)+1) {
				s1 = s1 + this.getChromosome().charAt(i);
			}
			else {
				s1 = s1 + mate.getChromosome().charAt(i);
			}
			if (i <= (crosspoint2*2)+1) {
				s2 = s2 + mate.getChromosome().charAt(i);
			}
			else {
				s2 = s2 + this.getChromosome().charAt(i);
			}
		}
		MyDNA child1 = new MyDNA();
		child1.setChromosome(s1);
		child1.setNumGenes(this.numGenes);
		MyDNA child2 = new MyDNA();
		child2.setChromosome(s2);
		child2.setNumGenes(this.numGenes);
		offspring.add(child1);
		offspring.add(child2);
		//YOUR CODE GOES ABOVE HERE
		return offspring;
	}
	
	// Optional, modify this function if you use a means of calculating fitness other than using the fitness member variable.
	// Return 0 if this object has the same fitness as other.
	// Return -1 if this object has lower fitness than other.
	// Return +1 if this objet has greater fitness than other.
	public int compareTo(MyDNA other)
	{
		int result = super.compareTo(other);
		//YOUR CODE GOES BELOW HERE
		
		//YOUR CODE GOES ABOVE HERE
		return result;
	}
	
	
	// For debugging purposes (optional)
	public String toString ()
	{
		String s = super.toString();
		//YOUR CODE GOES BELOW HERE
		
		//YOUR CODE GOES ABOVE HERE
		return s;
	}
	
	public void setNumGenes (int n)
	{
		this.numGenes = n;
	}

}

