package project003;

import java.util.Scanner;

public class Menu{
	
	private static Scanner teclado; 
	public void Menul () {
		
		teclado = new Scanner (System.in); 
		
		int opcao;		
		
		Notas notas = new Notas();
		
		while(true) {
			
		System.out.println("\n////////// MENU ////////////");
		System.out.println("1 - Inserir ");
		System.out.println("2 - Listar ");
		System.out.println("3 - Sair ");
		System.out.println("Digite o numero correspondente para opção: \n");
	
		opcao = teclado.nextInt();
		
		if (opcao == 1) {
	
				notas.InserirNotas();
			
		}else {
			
			if (opcao == 2) {
				
				notas.CalcularMedia();
				
				
				
				}else {
					
					if (opcao == 3 ) {
						
						break; 
						
					}
					
				}
			}
		}
		
	}
}