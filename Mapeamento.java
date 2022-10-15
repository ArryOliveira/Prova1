package trabalho;

public class Mapeamento {
	private String coordenada[][]=new String[9][17];
	
	
	public void mapeiaAreaDoGol() {
		int i,j;
		coordenada[2][2]="g";
		coordenada[2][15]="g";
		coordenada[1][1]="t";
		coordenada[1][15]="t";
			for(j=2,i=1;j<=14;j++) {
				coordenada[i][j]="t";
			}
			for(j=1,i=2;i<=8;i++) {
	
				coordenada[i][j]="t";
		}
			for(i=2,j=15;i<=8;i++) {
				coordenada[i][j]="t";
			}
			for(i=0,j=0;j<=16;j++) {
				coordenada[i][j]="t";
			}
			for(i=1,j=0;i<=8;i++) {
				coordenada[i][j]="f";
			}
			for(i=0,j=16;i<=8;i++) {
				coordenada[i][j]="f";
			}
			
			
	}

	public String lugar(int x,int y) {
		if(coordenada[x][y]==null) {
			coordenada[x][y]="d";
		}
		return coordenada[x][y];
	}
	public String[][] getCoordenada() {
		return coordenada;
	}


	public void setCoordenada(String[][] coordenada) {
		this.coordenada = coordenada;
	}
	
}
