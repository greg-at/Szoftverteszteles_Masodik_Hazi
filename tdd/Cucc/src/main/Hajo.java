package main;

public class Hajo {
	private Tomeg weight;
	private Sebesseg speed;
	private Hossz length;
	private Pozicio pozicio;
	
	
	public Pozicio getPozicio() {
		return pozicio;
	}

	public void setPozicio(Pozicio pozicio) {
		this.pozicio = pozicio;
	}

	public int getIrany() {
		return pozicio.getIrany();
	}
	
	public Tomeg getWeight() {
		return weight;
	}

	public void setWeight(Tomeg weight) {
		this.weight = weight;
	}

	public Sebesseg getSpeed() {
		return speed;
	}

	public void setSpeed(Sebesseg speed) {
		this.speed = speed;
	}

	public Hossz getLength() {
		return length;
	}

	public void setLength(Hossz length) {
		this.length = length;
	}


	
	public Hajo(Tomeg w, Hossz length, Sebesseg s, Pozicio p) {
		this.weight = w;
		this.length = length;
		this.speed = s;
		this.pozicio = p;
	}

	public boolean gonnaCrashTo(Hajo otherShip, int irany, Pozicio pos) {
		return false;
	}
}
