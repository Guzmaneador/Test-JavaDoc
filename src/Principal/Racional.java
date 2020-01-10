package Principal;

/**
 *
 * @author Guzman
 */
public class Racional {
    private int a,b;
    
    /**
     * Constructor por defecto el que idica que el numerodor sera 0 y el denominador 1
     */
    public Racional() {
        a=0;
        b=1;
    }

    /**
     * Contructor al cual le idicamos los valores de la fraccion como parametro
     * @param a Valor de numerador.
     * @param b Valor del denominador.
     */
    public Racional(int a, int b) {
        if(b==0){
           throw new ArithmeticException();
        }else{
            if(a<0 && b<0){
                this.a= a*-1;
                this.b = b*-1;
            }else{
                this.a = a;
                this.b = b;
            }
        }
    }
    
    /**
     * Contructor copia, Obtiene los valores de la fraccion de otra fraccion que se le pasa como parametro.
     * @param rac fraccion con los valores a copiar por la nueva.
     */
    public Racional(Racional rac){
        this.a=rac.getA();
        this.b=rac.getB();
    }

    /**
     * Devuelve el numerador.
     * @return Valor de la variable a.
     */
    public int getA() {
        return a;
    }
    /**
     * Actualiza el valor del numerador.
     * @param a Nuevo valor de la variable a;
     */
    public void setA(int a) {
        this.a = a;
    }
    /**
     * Devuelve el denominador.
     * @return Valor de la variable b.
     */
    public int getB() {
        return b;
    }
    /**
     * Actualiza el denominador.
     * @param b Nuevo valor de la varible b.
     */
    public void setB(int b) {
        this.b = b;
    }
    
    /**
     * Compara la fracciona actual con la que se le pasa por parametro indicando si es mayor, igual o menos.
     * @param rac2 objeto con  variables que tiene los valores del numero y del denominador deuna fraccion.
     * @return Devuelve 1 en caso de ser mayor, 0 en caso de ser iguales y -1 en caso de ser menor.
     */
    public int equals( Racional rac2){
        if(this.getValor() > rac2.getValor())
            return 1;
        else if (this.getValor() < rac2.getValor())
            return -1;
        else
            return 0;//son iguales
        
    }
    
     /**
      * Obtiene la diferecia del numerador y denominador de la fraccion.
      * @return Entero con el valor de la division.
      */   
    public double getValor(){
        return Double.valueOf(this.getA()) / Double.valueOf(this.getB());     
    }
}