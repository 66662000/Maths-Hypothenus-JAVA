
public class MathsJava {

	public static void main(String[] args) {
		double x=4.13, y=-45;
		double z=Math.max(x, y);
		System.out.println("Le plus grand nombre est: "+z);
		double m= Math.min(y, z);
		System.out.println("Le plus petit nombre est: "+m);
		double u= Math.abs(y);
		System.out.println("La valeur abs de -45 est: "+u);
		double s= Math.sqrt(x);
		System.out.println("La racine carre de " +x+ " est: "+s);
		double r= Math.round(x);
		System.out.println("La valeur arrondie de " +x+ " est: "+r);
		double c= Math.ceil(x);
		System.out.println("Le plafond de " +x+ " est: "+c);
		double f= Math.floor(x);
		System.out.println("Le pieton de " +x+ " est: "+f);
		
	}

}
