package Principal;

/**
 *
 * @author Guzman
 */
public class Operaciones {
    /**
     * Realiza una suma de las dos fraciones que le pasas por parametro.
     * @param rac1 objeto con  variables que tiene los valores del numero y del denominador deuna fraccion.
     * @param rac2 objeto con  variables que tiene los valores del numero y del denominador deuna fraccion.
     * @return Objeto de tipo Racional con los valores equivalentes a la suma de las dos fracciones pasadas por parametro.
     */
    
    public Racional suma(Racional rac1, Racional rac2){
        Racional rac= new Racional();
        if(rac1.getB()==rac2.getB()){
            rac.setA(rac1.getA()+rac2.getA());
            rac.setB(rac1.getB());
        }else{
            rac.setA((rac1.getA()*rac2.getB()) + (rac1.getB()*rac2.getA()));
            rac.setB(rac1.getB()*rac2.getB());
            
        }
        return simplificar(rac);
    }
    /**
     * Realiza una resta de las dos fracciones que le pasas por parametro.
     * @param rac1 objeto con  variables que tiene los valores del numero y del denominador deuna fraccion.
     * @param rac2 objeto con  variables que tiene los valores del numero y del denominador deuna fraccion.
     * @return Objeto de tipo Racional con los valores equivalentes a la resta de las dos fracciones pasadas por parametro.
     */
    public Racional resta(Racional rac1, Racional rac2){
        Racional rac= new Racional();
        if(rac1.getB()== rac2.getB()){
            rac.setA(rac1.getA()-rac2.getA());
            rac.setB(rac1.getB());
        }else{
            rac.setA((rac1.getA()*rac2.getB()) - (rac1.getB()*rac2.getA()));
            rac.setB(rac1.getB()*rac2.getB());
            
        }
        return simplificar(rac);
    }
    /**
     * Realiza una multiplicacion de las dos fracciones que le pasas por parametro.
     * @param rac1 objeto con  variables que tiene los valores del numero y del denominador deuna fraccion.
     * @param rac2 objeto con  variables que tiene los valores del numero y del denominador deuna fraccion.
     * @return Objeto de tipo Racional con los valores equivalentes a la multiplicacion de las dos fracciones pasadas por parametro.
     */
    public Racional multiplica(Racional rac1, Racional rac2){
        Racional rac= new Racional();
            if(rac1.getB()<0 || rac2.getB()<0){
                rac.setA(rac1.getA()*(-rac2.getA()));
                rac.setB(rac1.getB()*(-rac2.getB()));               
            }else{
                rac.setA(rac1.getA()*rac2.getA());
                rac.setB(rac1.getB()*rac2.getB());
            }
            
            
        return rac;
    }
    /**
     *Realiza una division de las dos fracciones que le pasas por parametro.
     * @param rac1 objeto con  variables que tiene los valores del numero y del denominador deuna fraccion.
     * @param rac2 objeto con  variables que tiene los valores del numero y del denominador deuna fraccion.
     * @return Objeto de tipo Racional con los valores equivalentes a la divison de las dos fracciones pasadas por parametro.
     */
    public Racional divide(Racional rac1, Racional rac2){
        Racional rac= new Racional();
                rac.setA(rac1.getA()*rac2.getB());
                rac.setB(rac1.getB()*rac2.getA());
            
            
        return rac;
    }

    /**
     * Obtiene la fraccion mas simplificada de las fraccion que se le pasa por parametro.
     * @param rac objeto con  variables que tiene los valores del numero y del denominador deuna fraccion.
     * @return Objeto de tipo raccional con atrivutos equivalentes a los valores de la fraccion simplifficada
     */
    public Racional simplificar(Racional rac) {
        int n = mcd(rac.getA(),rac.getB()); //se calcula el mcd de la fracción
        rac.setA( rac.getA() / n);
        rac.setB( rac.getB() / n);
        return rac;
    }
    
    /**
     * Obtine el Maximo Comun Divisor de los numero enteros que se le pasa como parametro.
     * @param num Entero que equivale al numerador de la fraccion.
     * @param den Entero que equivale a denominador de la fraccion.
     * @return Etecro con el valor del Maximo Comun Divisor
     */
    private int mcd(int num,int den){
         int u=Math.abs(num);
         int v=Math.abs(den);
         if(v==0){
              return u;
         }
         int r;
         while(v!=0){
              r=u%v;
              u=v;
              v=r;
         }
         return u;
    }

}