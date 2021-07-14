/*
 Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão das unidades de área segundo a lista abaixo.
1 metro quadrado = 10.76 pés quadrados
1 pé quadrado = 929 centímetros quadrados
1 milha quadrada = 640 acres
1 acre = 43.560 pés quadrados 

 */
package ConversaoMedidas;

/**
 *
 * @author Roberto Leite
 */
public class ConversaoDeUnidadesDeArea {
    
    private double metroQuadrado;
    private double peQuadrado;
    private double milhaQuadrada;
    private double acre;
    private double altura;
    private double largura;

    
    
    
    //SETS
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    // METODOS
    public static double metroQuadradoPeQuadrado(double metroQuadrado){
         
        return metroQuadrado*10.76;
        
        
     }
    
    public static double peQuadradoCmQuadrado (double peQuadrado){
        
        return peQuadrado*929;
        
    }
    
    public static double milhaQuadradaAcre(double milhaQuadrada){
        
        return milhaQuadrada * 640;
        
    }
    
    public static double acrePeQuadrado(double acre){
        
        return acre*43.560;
        
    }
    
    
    public static double metroMetroQuadrado(double altura, double largura){
        
        return altura*largura;
        
    }
    
    public static double metroQuadradoAcre (double metroQuadrado){
        
        return metroQuadrado * 0.000247105;
        
    }
    
    public static double metroQuadradoCmquadrado (double metroQuadrado){
        
        return metroQuadrado * 10000;
    }
    
}
