
public class Circunferencia extends Figura{

	private int radio;

	public Circunferencia(int radio) {
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}

	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radio;
	}
	
	public String detalles() {
	
		return "Soy un circulo de radio "+radio;
	}
}
