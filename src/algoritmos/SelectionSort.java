package algoritmos;

public class SelectionSort extends Algoritmo {

	public long[] ordenar(long[] array) {
		int min;
		long aux;
		for(int i = 0; i < array.length - 1; i++) {
			min = i;
			for(int j = i + 1; j < array.length; j++) {
				comparacoes++;
				if(array[j] < array[min]) // Comparação entre dois elementos do vetor
					min = j;
			}
			if(i != min) {
				aux = array[i];
				array[i] = array[min]; // Início da troca de posição de dois elementos
				array[min] = aux; // Fim da troca
				trocas++;
			}
		}
		return array;
	}

	@Override
	public long[] ordenar(long[] array, int inicio, int fim) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
