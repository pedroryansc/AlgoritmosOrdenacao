package algoritmos;

public class ShellSort extends Algoritmo {

	public long[] ordenar(long[] array) {
		int tamanho = array.length;
		int intervalo = 1;
		int j;
		long valor;
		
		while(intervalo < tamanho)
			intervalo = 3 * intervalo + 1;
		
		while(intervalo > 1) {
			intervalo /= 3;
			for(int i = intervalo; i < tamanho; i++) {
				valor = array[i];
				j = i - intervalo;
				comparacoes++; // Contagem da primeira comparação antes de entrar (ou não) na estrutura while
				while(j >= 0 && valor < array[j]) { // Comparacao entre dois elementos do vetor
					comparacoes++;
					array[j + intervalo] = array[j]; // Início da troca de posição de dois elementos do vetor
					j -= intervalo;
					trocas++;
				}
				array[j + intervalo] = valor; // Fim da troca
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