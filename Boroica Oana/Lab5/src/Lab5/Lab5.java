package Lab5;

class Masina{
	int rezultat;
	Motor m;
	
	public int pornire() {
		m.pornireMotor();
		this.autotestare();
		return rezultat;
	};
	
	//@SuppressWarnings("unused")
	private int rezultat() {
		return 0;
	}
	
	private void autotestare() {		
	};
	
	public int oprire() {
		return rezultat;
	}
	
}

class Motor{
	int rezultat;
	public int pornireMotor() {
		return rezultat;
	};
	public int stingereMotor() {
		return rezultat;
	};
}

class Usa{
	int rezultat;
	public int deschidereUsi() {
		return rezultat;
	};
	public int inchidereUsi() {
		return rezultat;
	};
	
}


public class Lab5 {
	public static void main(String[] args) {
		Usa u=new Usa();
		Motor n=new Motor();
		Masina m=new Masina();
		u.deschidereUsi();
		n.pornireMotor();
		m.pornire();
	}
}
