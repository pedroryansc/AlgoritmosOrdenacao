package main;

import algoritmos.*;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int TAM = 1000000;
		
		long[] array = new long[TAM];
		
		for(int i = 0; i < TAM; i++) {
			array[i] = i + 1; // Vetor ordenado
			// array[i] = TAM - i; // Vetor invertido
			// array[i] = rand.nextLong(1, TAM + 1); // Vetor aleatório
		}
		
		long inicio, fim;
		double tempoExecucao;
		
		Algoritmo algoritmo = new ShellSort();
		
		inicio = System.nanoTime();
		
		algoritmo.ordenar(array);
		
		fim = System.nanoTime();
		
		tempoExecucao = (fim - inicio) / 1000000.0;
		
		for(long num : array) {
			System.out.println(num);
		}
		
		System.out.println("Shell Sort");
		System.out.println("- Comparações: " + algoritmo.getComparacoes());
		System.out.println("- Trocas: " + algoritmo.getTrocas());
		System.out.println("- Tempo: " + tempoExecucao + " ms");
		
	}
}