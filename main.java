package trabalho;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		Mapeamento m=new Mapeamento();
		m.mapeiaAreaDoGol();
	System.out.println(	m.lugar(2, 3));
		
	}
	
	public static int SorteiaX(int q) {
		int x=0, y;
		if(q==1) {
			x=sortear(0,4);
			//y=sortear(0,7);
		}
		if(q==2) {
			x=sortear(0,4);
			//y=sortear(8,16);
		}
		if(q==3) {
			x=sortear(5,8);
			//y=sortear(0,7);
		}
		if(q==4) {
			x=sortear(5,8);
			//y=sortear(8,16);
		}
		return x;
	}
	public static int SorteiaY(int q) {
		int x, y=0;
		if(q==1) {
			//x=sortear(0,4);
			y=sortear(0,7);
		}
		if(q==2) {
			//x=sortear(0,4);
			y=sortear(8,16);
		}
		if(q==3) {
			//x=sortear(5,8);
			y=sortear(0,7);
		}
		if(q==4) {
			//x=sortear(5,8);
			y=sortear(8,16);
		}
		return y;
	}
	 public static int sortear(int minimo, int maximo) {
	        Random random = new Random();
	        return random.nextInt((maximo - minimo) + 1) + minimo;
	    }
}
