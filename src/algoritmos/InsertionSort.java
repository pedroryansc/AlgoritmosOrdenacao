package algoritmos;

public class InsertionSort extends Algoritmo {

	public long[] ordenar(long[] array) {
		long pivo;
		int j;
		for(int i = 1; i < array.length; i++) {
			pivo = array[i];
			j = i - 1;
			comparacoes++; // Contagem da primeira comparação antes de entrar (ou não) na estrutura while
			while(j >= 0 && array[j] > pivo) { // Comparação entre dois elementos do vetor
				comparacoes++;
				array[j + 1] = array[j]; // Início da troca de posição
				j = j - 1;
				trocas++;
			}
			array[j + 1] = pivo; // Fim da troca
		}
		return array;
	}

	@Override
	public long[] ordenar(long[] array, int inicio, int fim) {
		// TODO Auto-generated method stub
		return null;
	}
	
}