package trabalho;

public class Chute {
	private int força;
	private int quadrante;
	private int x;
	private int y;
	

	public Chute(int força, int x, int y) {
		super();
		this.força = força;
		this.x = x;
		this.y = y;
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
	public int SorteiaX(int quadrante) {
		int i=0;;
		if(quadrante==1) {
			i=sortear(0,4);
		}
		if(quadrante==2) {
			i=sortear(0,4);
		}
		if(quadrante==3) {
			i=sortear(5,8);
		}
		if(quadrante==4) {
			i=sortear(5,8);
		}
		return i;
	}
	public int SorteiaY(int quadrante) {
	int j=0;
	if(quadrante==1) {
		j=sortear(0,7);
	}
	if(quadrante==2) {
		j=sortear(8,16);
	}
	if(quadrante==3) {
		j=sortear(0,7);
	}
	if(quadrante==4) {
		j=sortear(8,16);
	}
	return j;
}
	 public int sortear(int minimo, int maximo) {
	        Random random = new Random();
	        return random.nextInt((maximo - minimo) + 1) + minimo;
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
