package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do selection sort. Você deve implementar apenas
	 * esse método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
		if(leftIndex == rightIndex || array.length <= 1) return;
		
		int menor = menor(array, leftIndex, rightIndex);
		
		if(array[leftIndex].compareTo(array[menor]) > 0 ) Util.swap(array, menor, leftIndex);
		
		sort(array, leftIndex+1, rightIndex);
	}
	
	public int menor(T[] array, int left, int right) {
		
		if(left == right) return left;
		
		int min = menor(array, left+1, right);
		
		if(array[left].compareTo(array[min]) > 0) return min;
		else return left;
		
		/* opção2
		int menor;
		
		if(left == right) menor = left;
		
		else {
			menor = left;
			int outroMenor = menor(array, left+1, right);
			if(array[menor].compareTo(array[outroMenor]) > 0) menor = outroMenor;
		}
		
		return menor;
		*/
		
	
	}

}
