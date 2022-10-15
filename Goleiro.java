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
	}

	public int AreaAtuacao() {
		int aag;
		aag=(int)(3*velocidade)+(2*flexibilidade)+(3*agilidade)+(2*coordenacao)+(força)+(2*equilibrio);
		aag=(int)aag/8;

		if(aag<1 && aag>16) {
			aag=0;
		}
		return aag;
	}
	public void addChute(Chute c) {
		listaChute.add(c);
	}
}
