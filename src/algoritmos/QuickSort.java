package algoritmos;

public class QuickSort extends Algoritmo {

	public long[] ordenar(long[] array) {
		int inicio = 0;
		int fim = array.length - 1;
		
		if(inicio < fim)
			ordenar(array, inicio, fim);
		
		return array;
	}
	
	public long[] ordenar(long[] array, int inicio, int fim) {
		if(inicio < fim) {
			long pivo = array[(inicio + fim) / 2];
			
			int i = inicio - 1;
			int j = fim + 1;
			
			while(i < j) {
				do {
					j = j - 1;
					comparacoes++;
				} while(array[j] > pivo); // Comparação entre dois elementos
				do {
					i = i + 1;
					comparacoes++;
				} while(array[i] < pivo); // Comparação entre dois elementos
				if(i < j) {
					long aux = array[i];
					array[i] = array[j]; // Início da troca de posição de dois elementos
					array[j] = aux; // Fim da troca
					trocas++;
				}
			}
			
			int meio = j;
			
			ordenar(array, inicio, meio);
			ordenar(array, meio + 1, fim);
		}
		return array;
	}
	
}