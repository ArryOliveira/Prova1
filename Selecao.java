package trabalho;

import java.util.ArrayList;

public class Selecao {

		private String nome;
		private ArrayList<Goleiro> listaGoleiro;

		public Selecao(String nome) {
			this.nome = nome;
			listaGoleiro = new ArrayList<Goleiro>();
		}

		public void addGoleiro(Goleiro g) {
			listaGoleiro.add(g);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public ArrayList<Goleiro> getListaGoleiro() {
			return listaGoleiro;
		}

		public void setListaGoleiro(ArrayList<Goleiro> listaGoleiro) {
			this.listaGoleiro = listaGoleiro;
		}

	}


