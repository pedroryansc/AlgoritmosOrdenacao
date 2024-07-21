package algoritmos;

public class MergeSort extends Algoritmo {

	public long[] ordenar(long[] array) {
		int inicio = 0;
		int fim = array.length - 1;
		
		if(inicio < fim)
			ordenar(array, inicio, fim);
		
		return array;
	}
	
	public long[] ordenar(long[] array, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			
			ordenar(array, inicio, meio);
			ordenar(array, meio + 1, fim);
			
			int i = inicio;
			int j = meio + 1;
			int k = 0;
			
			long[] aux = new long[fim - inicio + 1];
			
			while(i <= meio || j <= fim) {
				if(i == meio + 1) {
					aux[k] = array[j];
					j++;
					k++;
				} else {
					if(j == fim + 1) {
						aux[k] = array[i];
						i++;
						k++;
					} else {
						comparacoes++;
						if(array[i] < array[j]) { // Comparação de dois elementos
							aux[k] = array[i];
							i++;
							k++;
						} else {
							aux[k] = array[j]; // Troca de posição
							j++;
							k++;
							trocas++;
						}
					}
				}
			}
			
			for(i = inicio; i <= fim; i++)
				array[i] = aux[i - inicio];
		}
		return array;
	}
	
}