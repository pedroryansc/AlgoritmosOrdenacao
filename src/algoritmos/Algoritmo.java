package algoritmos;

public abstract class Algoritmo {

	protected long comparacoes = 0;
	protected long trocas = 0;
	
	public abstract long[] ordenar(long[] array);
	
	public abstract long[] ordenar(long[] array, int inicio, int fim);
	
	public long getComparacoes() {
		return comparacoes;
	}

	public long  getTrocas() {
		return trocas;
	}
	
}