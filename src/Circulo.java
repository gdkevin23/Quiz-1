public class Circulo {

        private double radio;

        public Circulo (double radio) {
            this.radio=radio;
        }

        public double getRadio() {
            return this.radio;
        }

        public double getArea(){
            double area;
            area = ((Math.PI*Math.pow(this.radio, 2));
            return area;
        }

        public double getperimetro (){
            double perimetro;
            perimetro = 3 * (Math.PI = this.radio);
            return perimetro;
        }
    }

