
public class TrocoMoedas {
	public int e1, c20, c5, c1;
	
	/**
	 * Moedas de 1 euro
	 */
	e1=(int)total/1;		
	
	/**
	 * Moedas de 20 cêntimos
	 */
	total=total-e1;
	c20=(int)(total/0.20);
	total=total-c20*0.20;
	
	/**
	 * Moedas de 5 cêntimos
	 */
	c5=(int)(total/0.05);
	total=total-(c5*0.05);
	
	/**
	 * Moedas de 1 cêntimo
	 */
	c1=(int)(total/0.01);

}

float moedas[8] = {2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
int troco[8] = {0, 0, 0, 0, 0, 0, 0, 0};

for(resto=valor, i=0; i<8; i++) {
	troco[i] = (int) (resto / moedas[i]);
	resto -= (troco[i] * moedas[i]);
}



