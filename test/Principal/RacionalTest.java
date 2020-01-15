/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author munchi
 */
public class RacionalTest {
    
    public RacionalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void constructorDefecto() {
        Racional racional = new Racional();
        assertEquals(0, racional.getA());
        assertEquals(1, racional.getB());
    }
    @Test
    public void constructorConParametros1() {
        Racional racional = new Racional(5,8);
        assertEquals(5, racional.getA());
        assertEquals(8, racional.getB());
    }
    @Test
    public void constructorConParametrosNegativos() {
        Racional racional = new Racional(-1,-2);
        assertEquals(1, racional.getA());
        assertEquals(2, racional.getB());
    }
    @Test (expected = ArithmeticException.class)
    public void constructorConParametrosExcepcion() {
        Racional racional = new Racional(5,0);
    }
    @Test
    public void constructorCopia(){
        Racional racionalCopia= new Racional (4,8);
        Racional racional= new Racional (racionalCopia);
        assertEquals(4, racional.getA());
        assertEquals(8, racional.getB());
        
        
    }
    @Test
    public void sumaIgualNumerador(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,2);
        Racional racional2= new Racional (3,2);
        Racional esperado= operaciones.suma(racional1, racional2);
        assertEquals(2,esperado.getA() );
        assertEquals(1,esperado.getB() );
    }
    @Test
    public void sumaDiferenteNumerador(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,3);
        Racional racional2= new Racional (3,2);
        Racional esperado= operaciones.suma(racional1, racional2);
        assertEquals(11,esperado.getA() );
        assertEquals(6,esperado.getB() );
    }
    @Test
    public void sumaConNegativo(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,3);
        Racional racional2= new Racional (-3,2);
        Racional esperado= operaciones.suma(racional1, racional2);
        assertEquals(-7,esperado.getA() );
        assertEquals(6,esperado.getB() );
    }
    @Test
    public void restaIgualNumerador(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,2);
        Racional racional2= new Racional (3,2);
        Racional esperado= operaciones.resta(racional1, racional2);
        assertEquals(-1,esperado.getA() );
        assertEquals(1,esperado.getB() );
    }
    @Test
    public void restaDiferenteNumerador(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,3);
        Racional racional2= new Racional (2,6);
        Racional esperado= operaciones.resta(racional1, racional2);
        assertEquals(0,esperado.getA() );
        assertEquals(1,esperado.getB() );
    }
    @Test
    public void restaConNegativo(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,3);
        Racional racional2= new Racional (-3,2);
        Racional esperado= operaciones.resta(racional1, racional2);
        assertEquals(11,esperado.getA() );
        assertEquals(6,esperado.getB() );
    }
    @Test
    public void multiplicaIgualNumerador(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,2);
        Racional racional2= new Racional (3,2);
        Racional esperado= operaciones.multiplica(racional1, racional2);
        assertEquals(3,esperado.getA() );
        assertEquals(4,esperado.getB() );
    }
    @Test
    public void multiplicaDiferenteNumerador(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,3);
        Racional racional2= new Racional (3,2);
        Racional esperado= operaciones.multiplica(racional1, racional2);
        assertEquals(3,esperado.getA() );
        assertEquals(6,esperado.getB() );
    }
    @Test
    public void multiplicaConNegativo(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,3);
        Racional racional2= new Racional (-3,2);
        Racional esperado= operaciones.multiplica(racional1, racional2);
        assertEquals(-3,esperado.getA() );
        assertEquals(6,esperado.getB() );
    }
    @Test
    public void multiplicaConVariosNegativos(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,-3);
        Racional racional2= new Racional (-3,2);
        Racional esperado= operaciones.multiplica(racional1, racional2);
        assertEquals(3,esperado.getA() );
        assertEquals(6,esperado.getB() );
    }
    @Test
    public void divideDiferenteNumerador(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,3);
        Racional racional2= new Racional (3,2);
        Racional esperado= operaciones.divide(racional1, racional2);
        assertEquals(2,esperado.getA() );
        assertEquals(9,esperado.getB() );
    }
    @Test
    public void divideConNegativo(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,3);
        Racional racional2= new Racional (-3,2);
        Racional esperado= operaciones.divide(racional1, racional2);
        assertEquals(2,esperado.getA() );
        assertEquals(-9,esperado.getB() );
    }
    @Test
    public void divideConVariosNegativos(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,-3);
        Racional racional2= new Racional (-3,2);
        Racional esperado= operaciones.divide(racional1, racional2);
        assertEquals(2,esperado.getA() );
        assertEquals(9,esperado.getB() );
    }
    @Test
    public void comparaMayor(){
        Racional racional1= new Racional (2,3);
        Racional racional2= new Racional (2,4);
        assertEquals(1,racional1.equals(racional2));
    }
    @Test
    public void comparaIgual(){
        Racional racional1= new Racional (2,3);
        Racional racional2= new Racional (10,15);
        assertEquals(0,racional1.equals(racional2));
    }
    @Test
    public void comparaMenor(){
        Racional racional1= new Racional (2,3);
        Racional racional2= new Racional (7,8);
        assertEquals(-1,racional1.equals(racional2));
    }
    @Test
    public void obtenerValor1(){
        Racional racional= new Racional (3,5);
        double result=0.6;
        assertEquals(result,racional.getValor(),0);
    }
    @Test
    public void obtenerValor2(){
        Racional racional= new Racional (-3,-7);
        assertEquals(3.00/7.00,racional.getValor(),0);
    }
    
    @Test
    public void sumarInversos(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (3,2);
        Racional racional2= new Racional (5,2);
        Racional esperado= (operaciones.suma(racional1, racional2)).Invertir();
        assertEquals(1,esperado.getA() );
        assertEquals(4,esperado.getB() );    
    }
    @Test
    public void multiplicaInversos(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (1,3);
        Racional racional2= new Racional (6,2);
        Racional esperado= operaciones.simplificar(operaciones.multiplica(racional1, racional2.Invertir()));
        assertEquals(1,esperado.getA() );
        assertEquals(9,esperado.getB() );    
    }
    @Test(expected = ArithmeticException.class)
    public void ErrorInversos(){
        Operaciones operaciones =new  Operaciones();
        Racional racional1= new Racional (3,2);
        Racional racional2= new Racional (15,10);
        Racional esperado= (operaciones.resta(racional1, racional2)).Invertir();
    }
    
    
    

    
    
    
}
