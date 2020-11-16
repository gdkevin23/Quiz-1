

public class Piramide {

    private TrianguloEquilatero TrianguloEquilatero;
    private double height;


    public Piramide(Triangulo equilatero, double height){
        this.TrianguloEquilatero=TrianguloEquilatero;
        this.height=height;
    }

    public Piramide(double lado, double height){
        this.TrianguloEquilatero = new TrianguloEquilatero(lado);
        this.height=height;
    }

    private double getVolumen(){
    }

    private double getHeight(){
    }
}

