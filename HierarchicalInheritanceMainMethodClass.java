package com.technoelevate.basicsofjava.assignment1;

public class HierarchicalInheritanceMainMethodClass {

	public static void main(String[] args) {
		HierarchicalInheritanceClassCat hierarchicalInheritanceClassCat= new HierarchicalInheritanceClassCat();
		hierarchicalInheritanceClassCat.Animal();
		hierarchicalInheritanceClassCat.cat();
		HierarchicalInheritanceClassDog hierarchicalInheritanceClassDog= new HierarchicalInheritanceClassDog();
		hierarchicalInheritanceClassDog.dog();
		hierarchicalInheritanceClassDog.Animal();

	}

}
