
package fonaments.models.entitats;

public class Square {
    
//<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
        public double  side;
//</editor-fold>
        
//<editor-fold defaultstate="collapsed" desc="Metodes">

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
            public double getSide(){
                return side;
            }
            public void setSide(double side) {
                if(side <= 0.0){
                    throw new IllegalArgumentException(String.format("Valor %.2f no valid.", side));
                }
                this.side = side;
            }

    //</editor-fold>
            
    //<editor-fold defaultstate="collapsed" desc="Constructores">
            
            public Square(double side){
                this.setSide(side);
            }
            
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
        public double getArea(){
            return Math.pow(getSide(), 2);
        }
        public double getPerimeter(){
            return getSide() * 4;
        }
    //</editor-fold>
        
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Informació">
            public void info(){
                System.out.printf("El costat del Cuadrat es: %.2f %n", getSide());
                System.out.printf("L'area del Cuadrat es: %.2f %n", getArea());
                System.out.printf("El perimetre del Cuadrat es: %.2f %n", getPerimeter());
            }
        
//</editor-fold>
}
