package trabalho;

public class Chute {
	private int força;
	private int quadrante;
	private int x;
	private int y;
	
	public void verificaQuadrante() {
		if(y>=0 && y<=7 && x>=0 && x<=4) {
			quadrante=1;
		}
		if(y>=8 && y<=16 && x>=0 && x<=4) {
			quadrante=2;
		}
		if(y>=0 && y<=7 && x>=5 && x<=8) {
			quadrante=3;
		}
		if(y>=8 && y<=16 && x>=5 && x<=8) {
			quadrante=4;
		}
	}

	public Chute(int força, int x, int y) {
		super();
		this.força = força;
		this.x = x;
		this.y = y;
	}

	public int getForça() {
		return força;
	}

	public void setForça(int força) {
		this.força = força;
	}

	public int getQuadrante() {
		return quadrante;
	}

	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
