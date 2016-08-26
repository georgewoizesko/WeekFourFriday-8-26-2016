package com.zooanimals;

public class Animals {
	
	public String animalsID = null;
	public String species = null;
	public String name = null;
	public String habitat = null;
	public int age = 0;
	public double weight = 0.00;
	
	
	public Animals() {
		super();
	}


	public String getAnimalsID() {
		return animalsID;
	}


	public void setAnimalsID(String animalsID) {
		this.animalsID = animalsID;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Animals [animalsID=" + animalsID + ", species=" + species + ", name=" + name + ", habitat=" + habitat
				+ ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	
	
	
	
}
