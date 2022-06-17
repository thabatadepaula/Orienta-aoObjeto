package br.com.generation.atividades;

public class Aviao {
	// declarar os atributos classe

		private String nomeProprietario; //get proprietario  | set define 
		private String modelo;
		private String codigo;
		private int ano;
		private boolean licenciado;

		// criar um metodo especial construtor
		public Aviao (String nomeProprietario, String modelo, String codigo, int ano, boolean licenciado) {
			this.nomeProprietario = nomeProprietario;
			this.modelo = modelo;
			this.codigo = codigo;
			this.ano = ano;
			this.licenciado = licenciado;
		}

		// declarar demais metodos da classe

		public void imprimirInfo() {
			System.out.println("\n" + nomeProprietario + " possui um  " + modelo + " da coleção de código " + codigo + " ano " + ano
					+ ", licenciamento para colecionador " + licenciado);
		}

		public String getNomeProprietario() {
			return nomeProprietario;
		}

		public void setNomeProprietario(String nomeProprietario) {
			this.nomeProprietario = nomeProprietario;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public boolean isLicenciado() {
			return licenciado;
		}

		public void setLicenciado(boolean licenciado) {
			this.licenciado = licenciado;
		



	

	}}


