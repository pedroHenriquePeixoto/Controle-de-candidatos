package candidatos;
import java.util.concurrent.ThreadLocalRandom;
public class Main {

	public static void main(String[] args) {
		selecaoCandidato();
		imprimirSelecionados();
		
	}
	static void selecaoCandidato() {
		String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};
		int candidatosSelecionados =0;
		int candidatosAtuais =0;
		double salarioBase=2000.0;
		while(candidatosSelecionados<5) {
			String candidato=candidatos[candidatosAtuais];
			double salarioPretendido=valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
			if(salarioBase>= salarioPretendido) {
				System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
				candidatosSelecionados ++;
			}
			candidatosAtuais++;
		}
	}
	
	static void imprimirSelecionados() {
		String [] candidatos={"Felipe","Marcia","Julia","Paulo","Augusto"};
		System.out.println("Imprimindo a lista de candidatos");
		for(int i=0;i<candidatos.length;i++) {
			System.out.println("O candidato n° "+(i+1)+ " é o "+candidatos[i]);
			
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
		
	}
	
	static void analisarCandidatos(double salarioPretendido) {
		double salarioBase=2000.00;
		if(salarioBase>salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}
		else if(salarioBase==salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}
		else {
			System.out.println("Aguardando resultado dos demais candidatos");
		}
	}

}
