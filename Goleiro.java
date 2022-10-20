package trabalho;

import java.util.ArrayList;

public class Goleiro {
	private int id;
	private String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenacao;
	private int força;
	private int equilibrio;
	private ArrayList<Chute> listaChute=new ArrayList<Chute>();
	private ArrayList<Integer> listaResultado=new ArrayList<Integer>();
	public ArrayList<Integer> getListaResultado() {
		return listaResultado;
	}

	public void setListaResultado(ArrayList<Integer> listaResultado) {
		this.listaResultado = listaResultado;
	}
	private int aag;
	
	public int getAag() {
		return aag;
	}

	public void setAag(int aag) {
		this.aag = aag;
	}

	public ArrayList<Chute> getListaChute() {
		return listaChute;
	}

	public void setListaChute(ArrayList<Chute> listaChute) {
		this.listaChute = listaChute;
	}

	public Goleiro(int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenacao, int força,
			int equilibrio) {
		super();
		this.id = id;
		this.nome = nome;
		this.velocidade = velocidade;
		this.flexibilidade = flexibilidade;
		this.agilidade = agilidade;
		this.coordenacao = coordenacao;
		this.força = força;
		this.equilibrio = equilibrio;
		aag=(int)(3*velocidade)+(2*flexibilidade)+(3*agilidade)+(2*coordenacao)+(força)+(2*equilibrio);
		aag=(int)aag/8;

		if(aag<1 && aag>16) {
			aag=0;
		}
	}
	public int Pontuacao(Goleiro g) {
		int soma=0;
		for(int n : g.getListaResultado()) {
			soma=soma+n;
		}
		return soma;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getForça() {
		return força;
	}

	public void setForça(int força) {
		this.força = força;
	}

	public void addChute(Chute c) {
		listaChute.add(c);
	}
	public void AdicionarLista(ArrayList<Chute> lista) {
		listaChute=lista;
	}
	public void AddRes (int r) {
		listaResultado.add(r);
	}
}
