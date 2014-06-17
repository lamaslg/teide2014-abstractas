
public class MainFiguras {

	public static void main(String[] args) {
		
		Figura f=new Rectangulo(5, 4);
		Figura ff=new Circunferencia(4);
		
		
		System.out.println(f.detalles());
		System.out.println(f.area());
		System.out.println(f.perimetro());

		System.out.println(ff.area());
	}

}
