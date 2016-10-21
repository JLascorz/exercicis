
package fonaments.models.entitats;

public class Rectangle {
//<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
    private double  base;
    private double altura;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
        public double getBase(){
            return base;
        }
        public double getAltura(){
            return altura;
        }
        public void setBase(double base){
                if(base <= 0.0){
                    throw new IllegalArgumentException(String.format("Valor %.2f no valid.", base));
                }
            this.base = base;
        }
        public void setAltura(double altura){
                 if(base <= 0.0){
                    throw new IllegalArgumentException(String.format("Valor %.2f no valid.", altura));
                }
            this.altura = altura;
        }
        
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
            
            public Rectangle(double base, double altura){
                this.setBase(base);
                this.setAltura(altura);
            }
            
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
        public double getArea(){
            return getBase() * getAltura();
        }
        public double getPerimeter(){
            return (2 * getBase()) + (2 * getAltura());
        }
    //</editor-fold>

//</editor-fold>
        
//<editor-fold defaultstate="collapsed" desc="Informació">
        public void info(){
            System.out.printf("La base del Rectangle es: %.2f %n", getBase());
            System.out.printf("L'altura del Rectangle es: %.2f %n", getAltura());
            System.out.printf("L'area del Rectangle es: %.2f %n", getArea());
            System.out.printf("El perimetre del Rectangle es: %.2f %n", getPerimeter());
        }
        
//</editor-fold>
    
}
