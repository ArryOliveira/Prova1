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
	public void CalculaGol(Selecao s) {
		for(Goleiro g : s.getListaGoleiro()) {
			System.out.print("Goleiro:"+g.getNome());
			for(Chute c : g.getListaChute()) {
				int AuxL=c.SorteiaX(c.getQuadrante());
				int AuxC=c.SorteiaY(c.getQuadrante());
				//Compara(AuxL,AuxC,g.getAag());
				//System.out.println("resultado:"+ContabilizaGol(Compara(AuxL,AuxC,g.getAag()),c,g));
				g.AddRes(ContabilizaGol(Compara(AuxL,AuxC,g.getAag()),c,g));
			}
			System.out.println();
			System.out.println("media:"+CalculaMedia(g.getListaResultado()));
		}
	}
	
	public String Titular(Selecao s) {
		int maior=0;
		String nome=null;
		for(Goleiro g : s.getListaGoleiro()) {
			if(g.Pontuacao(g)>maior) {
				maior=g.Pontuacao(g);
			}
		}
		for(Goleiro g : s.getListaGoleiro()) {
			if(g.Pontuacao(g)==maior) {
				nome=g.getNome();
			}
		}
		return nome;
	}
	public float CalculaMedia(ArrayList<Integer>lista) {
		int soma=0;
		float media=0;
		for(int n : lista) {
			soma=soma+n;
		}
		media=(float)soma/30*100;
		return media;
		
	}
	public int ContabilizaGol(String g[][],Chute c,Goleiro p) {
		int Contador=0;
		for(int i=0;i<g.length;i++) {
			for(int j=0;j<g[0].length;j++) {
				if(g[i][j]=="x" && i==c.getX() && j==c.getY()) {
					Contador++;
				}
				else if(g[i][j]=="#" && i==c.getX() && j==c.getY() && p.getForça()>=c.getForça())
				{
					Contador++;
				}
			}
		}
		return Contador;
	}
	public String[][] Compara(int x,int y,int aag) {
		int auxi= x, auxj = y,area=0;
		String Mgoleiro[][]=new String[9][17];
		Mapeamento m=new Mapeamento();
		CopiaArea( m.getCoordenada(),Mgoleiro);
		do{
			if (x >= 0 && y < Mgoleiro[0].length){
				if((x==auxi || x==auxi-3) || (y==auxj || y==auxj+3)){
					Mgoleiro[x][y] = "#";
				}
				else{
					Mgoleiro[x][y] = "x";
				}
			}
			area++;
			x--;
			if (x==auxi-4){
				x=auxi;
				y++;
			}
			
		}while (area<aag);
		/*for(int i=0;i<9;i++) {
			for(int j=0;j<17;j++) {
				System.out.print(Mgoleiro[i][j]+" ");
			}
			System.out.println();
		}*/
		return Mgoleiro;
	}
	public void CopiaArea(String x[][],String y[][]) {
		for (int i = 0; i < x.length; i++){
			for (int j = 0; j < x[0].length; j++) {
				y[i][j] = x[i][j];
			}
		}
	}

	}


