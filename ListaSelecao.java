package trabalho;

import java.util.ArrayList;

public class ListaSelecao {
	private ArrayList<Selecao>lista=new ArrayList<Selecao>();

	public ArrayList<Selecao> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Selecao> lista) {
		this.lista = lista;
	}
	
	public void addSelecao(Selecao c) {
		lista.add(c);
	}
	public int GolNoAngulo(ArrayList<Selecao>lista) {
		int Contador=0;
		for(Selecao s : lista) {
			for(Goleiro g : s.getListaGoleiro()) {
				for(int i=0;i<g.getListaChute().size();i++) {
					if(g.getListaResultado().get(i)==1 && g.getListaChute().get(i).getX()==2 && g.getListaChute().get(i).getY()==2 || g.getListaResultado().get(i)==1 && g.getListaChute().get(i).getX()==2 && g.getListaChute().get(i).getY()==15) {
						Contador++;
				}
			}
		}
	}
		return Contador;
}
	public void DadosDoGoleiro(ArrayList<Selecao>lista) {
		System.out.println("\n");
		System.out.println("dados dos goleiros:");
		System.out.println();
		for(Selecao s : lista) {
			String nome=s.getNome();
			for(Goleiro g : s.getListaGoleiro()) {
				System.out.println("nome:"+g.getNome());
				System.out.println("selecao:"+nome);
				System.out.println("aag:"+g.getAag());
				System.out.println("gols defendidos:"+g.Pontuacao(g));
				System.out.println("gols levados:"+(30-g.Pontuacao(g)));
				System.out.println();
			}
		}
	}
	

}
