package trabalho;
import java.util.Random;
public class main {

		public static void Varrechute(ArrayList<Chute>lista) {
		int chutesFora=0;
		int traveDireita=0;
		int traveEsquerda=0;
		int traveCima=0;
		for(Chute c:lista) {
			if(c.getX()==0 && c.getY()>=0 && c.getY()<=16 || c.getY()==0 && c.getX()>=1 && c.getX()<=8 || c.getY()==16 && c.getX()>=0 && c.getX()<=8) {
						chutesFora++;
			}
			if(c.getY()==15 && c.getX()>=1 && c.getX()<=8) {
						traveDireita++;
					}
			if(c.getY()==1 && c.getX()>=2 && c.getX()<=8) {
				traveEsquerda++;
			}
		}
		System.out.println();
		System.out.println("Quantidade de chutes que foram para a trave direita:"+traveDireita);
		System.out.println("Quantidade de chutes que foram para a trave esquerda:"+traveEsquerda);
		System.out.println("Quantidade de chutes que foram para fora:"+chutesFora);
	}
	public static void IndicaQuadrante(Scanner ler,ListaSelecao l) {
		Goleiro i=new Goleiro(0,null,0,0,0,0,0,0);
		int q1=0,q2=0,q3=0,q4=0;
		System.out.println("digite o id do goleiro:");
		int id=ler.nextInt();
		for(Selecao s : l.getLista()) {
			for(Goleiro g : s.getListaGoleiro()) {
				if(g.getId()==id) {
				for(int x=0;x<g.getListaChute().size();x++) {
					if(g.getListaResultado().get(x)==0) {
						if(g.getListaChute().get(x).getQuadrante()==1) {
							q1++;
						}
						if(g.getListaChute().get(x).getQuadrante()==2) {
							q2++;
						}
						if(g.getListaChute().get(x).getQuadrante()==3) {
							q3++;
						}
						if(g.getListaChute().get(x).getQuadrante()==4) {
							q4++;
						}
					}
				}
			}}}
		 if(q1>q2 && q1>q3 && q1>q4) {
			 System.out.println("o quadrante em que o goleiro tomou mais gols foi o 1");
		 }
		 if(q2>q1 && q2>q3 && q2>q4) {
			 System.out.println("o quadrante em que o goleiro tomou mais gols foi o 2");
		 }
		 if(q3>q1 && q3>q2 && q3>q4) {
			 System.out.println("o quadrante em que o goleiro tomou mais gols foi o 3");
		 }
		 if(q4>q1 && q4>q2 && q4>q3) {
			 System.out.println("o quadrante em que o goleiro tomou mais gols foi o 4");
		 }
		
		}
	public static void main(String[] args) {
	Mapeamento m=new Mapeamento();
	Selecao s1=new Selecao("it??lia");
	Goleiro g1=new Goleiro(12,"Jacquin",6,8,9,10,10,8);
	Goleiro g2=new Goleiro(13," Ranglerme ",10,10,10,10,10,10);
	Goleiro g3=new Goleiro(15,"Rui Vigelis",10,4,8,8,4,6);
	Goleiro g4=new Goleiro(19,"Pinhead Cenobite",3,8,8,8,8,8);
	Goleiro g5=new Goleiro(21,"Luis Pereira",10,10,8,2,4,6);
	s1.addGoleiro(g1);
	s1.addGoleiro(g2);
	s1.addGoleiro(g3);
	s1.addGoleiro(g4);
	s1.addGoleiro(g5);
	Selecao s2=new Selecao("jap??o");
	Goleiro g6=new Goleiro(17,"Pennywise Clown",6,4,6,8,6,6);
	Goleiro g7=new Goleiro(40,"Cenobite",10,10,8,12,10,10);
	Goleiro g8=new Goleiro(28,"Jason Vorhees",10,4,8,8,6,10);
	Goleiro g9=new Goleiro(38,"Hanzo Hasashi",4,8,8,8,8,4);
	Goleiro g10=new Goleiro(53,"Bi Han",4,8,8,4,4,6);
	s2.addGoleiro(g6);
	s2.addGoleiro(g7);
	s2.addGoleiro(g8);
	s2.addGoleiro(g9);
	s2.addGoleiro(g10);
	Selecao s3=new Selecao("alemanha");
	Goleiro g11=new Goleiro(60,"Ywach Quincy",3,4,5,8,5,6);
	Goleiro g12=new Goleiro(61,"Ulquiorra Cifer",10,10,8,10,10,10);
	Goleiro g13=new Goleiro(67,"Coyote Starrk",5,5,8,8,4,5);
	Goleiro g14=new Goleiro(70,"Shunsui Kyoraku",8,8,6,8,8,8);
	Goleiro g15=new Goleiro(21,"Ukitake Kuchiki",10,10,10,10,4,6);
	s3.addGoleiro(g11);
	s3.addGoleiro(g12);
	s3.addGoleiro(g13);
	s3.addGoleiro(g14);
	s3.addGoleiro(g15);
	Selecao s4=new Selecao("egito");
	Goleiro g16=new Goleiro(100,"Mark Spector",10,4,8,8,6,6);
	Goleiro g17=new Goleiro(101,"Jon Snow",6,6,6,6,6,6);
	Goleiro g18=new Goleiro(102,"Aegon Targaryen",10,10,8,10,4,6);
	Goleiro g19=new Goleiro(103,"Jacaerys Velaryon",5,5,5,5,5,5);
	Goleiro g20=new Goleiro(104,"Harwyn Strong",10,6,8,8,4,6);
	s4.addGoleiro(g16);
	s4.addGoleiro(g17);
	s4.addGoleiro(g18);
	s4.addGoleiro(g19);
	s4.addGoleiro(g20);
	Selecao s5=new Selecao("fran??a");
	Goleiro g21=new Goleiro(91,"Alvus Dumbledore",8,4,8,8,4,4);
	Goleiro g22=new Goleiro(92,"Daemon Velaryon",10,8,10,10,10,10);
	Goleiro g23=new Goleiro(93,"Morpheus Perpetuous",10,2,8,8,2,6);
	Goleiro g24=new Goleiro(94,"Jaeherys Targaryen",2,2,8,6,2,8);
	Goleiro g25=new Goleiro(95,"Tywin Lannister",2,3,7,7,7,7);
	s5.addGoleiro(g21);
	s5.addGoleiro(g22);
	s5.addGoleiro(g23);
	s5.addGoleiro(g24);
	s5.addGoleiro(g25);
	ListaSelecao l=new ListaSelecao();
	l.addSelecao(s1);
	l.addSelecao(s2);
	l.addSelecao(s3);
	l.addSelecao(s4);
	l.addSelecao(s5);
	ArrayList<Chute>Lista=new ArrayList<Chute>();
	Chute c1=new Chute(4,2,5);
	Lista.add(c1);
	Chute c2=new Chute(6,6,6);
	Lista.add(c2);
	Chute c3=new Chute(8,2,10);
	Lista.add(c3);
	Chute c4=new Chute(6,2,12);
	Lista.add(c4);
	Chute c5=new Chute(10,2,2);
	Lista.add(c5);
	Chute c6=new Chute(4,3,9);
	Lista.add(c6);
	Chute c7=new Chute(5,6,4);
	Lista.add(c7);
	Chute c8=new Chute(5,8,8);
	Lista.add(c8);
	Chute c9=new Chute(3,6,10);
	Lista.add(c9);
	Chute c10=new Chute(3,6,11);
	Lista.add(c10);
	Chute c11=new Chute(4,3,4);
	Lista.add(c11);
	Chute c12=new Chute(4,4,3);
	Lista.add(c12);
	Chute c13=new Chute(6,3,4);
	Lista.add(c13);
	Chute c14=new Chute(9,2,5);
	Lista.add(c14);
	Chute c15=new Chute(9,3,12);
	Lista.add(c15);
	Chute c16=new Chute(9,2,9);
	Lista.add(c16);
	Chute c17=new Chute(4,2,9);
	Lista.add(c17);
	Chute c18=new Chute(10,2,5);
	Lista.add(c18);
	Chute c19=new Chute(4,2,5);
	Lista.add(c19);
	Chute c20=new Chute(7,2,15);
	Lista.add(c20);
	Chute c21=new Chute(7,7,5);
	Lista.add(c21);
	Chute c22=new Chute(4,7,5);
	Lista.add(c22);
	Chute c23=new Chute(8,2,5);
	Lista.add(c23);
	Chute c24=new Chute(10,2,5);
	Lista.add(c24);
	Chute c25=new Chute(10,4,5);
	Lista.add(c25);
	Chute c26=new Chute(3,4,5);
	Lista.add(c26);
	Chute c27=new Chute(8,8,8);
	Lista.add(c27);
	Chute c28=new Chute(8,0,8);
	Lista.add(c28);
	Chute c29=new Chute(10,7,14);
	Lista.add(c29);
	Chute c30=new Chute(4,4,4);
	Lista.add(c30);
	for(Goleiro g : s1.getListaGoleiro()) {
		g.AdicionarLista(Lista);
	}
	for(Goleiro g : s2.getListaGoleiro()) {
		g.AdicionarLista(Lista);
	}
	for(Goleiro g : s3.getListaGoleiro()) {
		g.AdicionarLista(Lista);
	}
	for(Goleiro g : s4.getListaGoleiro()) {
		g.AdicionarLista(Lista);
	}
	for(Goleiro g : s5.getListaGoleiro()) {
		g.AdicionarLista(Lista);
	}
	s1.CalculaGol(s1);
	System.out.println("O titular da selecao do(a):"+s1.getNome()+" "+"??"+" "+s1.Titular(s1));
	System.out.println();
	s2.CalculaGol(s2);
	System.out.println("O titular da selecao do(a):"+s2.getNome()+" "+"??"+" "+s2.Titular(s2));
	System.out.println();
	s3.CalculaGol(s3);
	System.out.println("O titular da selecao do(a):"+s3.getNome()+" "+"??"+" "+s3.Titular(s3));
	System.out.println();
	s4.CalculaGol(s4);
	System.out.println("O titular da selecao do(a):"+s4.getNome()+" "+"??"+" "+s4.Titular(s4));
	System.out.println();
	s5.CalculaGol(s5);
	System.out.println("O titular da selecao do(a):"+s5.getNome()+" "+"??"+" "+s5.Titular(s5));
	System.out.println();
	Varrechute(Lista);
	System.out.println();
	System.out.println("A quantidade de gols no angulo do gol:"+l.GolNoAngulo(l.getLista()));
	l.DadosDoGoleiro(l.getLista());
	Scanner ler=new Scanner(System.in);
	IndicaQuadrante(ler,l);
	}

}
