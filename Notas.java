package project003;



import javax.swing.JOptionPane; 

public class Notas {
	

	private Double notas[] = new Double[3];
	
	double  media = 0, rec_final; 
	
	public void InserirNotas() {	
		
		
		for (int i = 0; i < notas.length; i++) {
			
			notas[i]= Double.parseDouble(JOptionPane.showInputDialog("Informe a nota "));
					
		}		
		
		
	}

	
	public void CalcularMedia() {
		media = 0;
		
		for (double nota: notas) {
			
			
			media = nota + media;
			
		}

		media = media / 3;
			
		if (media >= 7) {
						
			System.out.println("\n===== APROVADO =====\n");
			
			for (int i = 0; i < notas.length; i++) {
				
				System.out.println("Nota "+(i+1)+" :" + notas[i]);	
			}

			System.out.println("Media: "+media);	
			
		}else { 
			
			if(media <= 3) {
				
				System.out.println("\n===== REPROVADO =====\n");
				
				for (int i = 0; i < notas.length; i++) {
					
					System.out.println("Nota "+(i+1)+" :" + notas[i]);	
				}

				System.out.println("Media: "+media);
				
			}else {
				
				System.out.println("\n===== NA FINAL =====\n");
				
				for (int i = 0; i < notas.length; i++) {
					
					System.out.println("Nota "+(i+1)+" :" + notas[i]);	
				}
				
				System.out.println("Media: "+media);
				
				rec_final =(10 * 5) - (media * 7);
				rec_final = rec_final /3;
				
				System.out.println("Nota para passar na final: "+rec_final);
				
			}
		}
	}			
	
}
