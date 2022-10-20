package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do bubble sort. Você deve implementar apenas esse
	 * método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
		if(leftIndex == rightIndex || array.length <= 1) return;
		
		bubble(array, 0, array.length-1);
		
		sort(array, leftIndex+1, array.length-1);
		
	}
	
	public void bubble(T[] array, int left, int right) {
		if(left == right) return;
		
		if(array[left].compareTo(array[left+1]) > 0) Util.swap(array, left, left+1);
		
		bubble(array, left+1, array.length-1);
	}
	

}
