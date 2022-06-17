package br.com.generation.atividades;

public class TesteAviao {
	public static void main(String[] args) {

		//instanciar um objeto da classe Automovel
		//String modelo; placa; ano;licenciado
		
		Aviao aviao = new Aviao("Thabata", "Boeing 274", "274-xps73", 1973, true);
		
		aviao.imprimirInfo();
		System.out.println("\n Transferencia de proprietário");
		aviao.setNomeProprietario("Joseph");
		aviao.setCodigo("274-xps73");
		System.out.println("\n __________________________________________");
		aviao.imprimirInfo();
	}
}
