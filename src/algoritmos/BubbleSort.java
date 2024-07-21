package algoritmos;

public class BubbleSort extends Algoritmo {
	
	public long[] ordenar(long[] array) {
		long aux;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				comparacoes++;
				if(array[j] > array[j + 1]) { // Comparação entre dois elementos do vetor
					aux = array[j];
					array[j] = array[j + 1]; // Início da troca de posição de dois elementos
					array[j + 1] = aux; // Fim da troca
					trocas++;
				}
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