import java.lang.Math;

public class Triangulo {
    private double lado;
    public Triangulo (double lado) {
        this.lado=lado;
        }

        public double getLado() {
            return this.lado;
        }

        public double getarea(){
            double area;
            area = ((Math.sqrt(3)/4)* Math.pow (this.lado,2));
            return lado;
        }

        public double getperimetro (){
            double perimetro;
            perimetro = this.lado * 3;
            return perimetro;
        }
    }


