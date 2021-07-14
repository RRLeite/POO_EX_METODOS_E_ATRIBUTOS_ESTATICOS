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
    
    private float metroQuadrado;
    private float peQuadrado;
    private float milhaQuadrada;
    private float acre;
    private float altura;
    private float largura;

    
    
    
    //SETS
    
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    // METODOS
    public static double metroQuadradoPeQuadrado(float metroQuadrado){
         
        return metroQuadrado*10.76;
        
        
     }
    
    public static double peQuadradoCmQuadrado (float peQuadrado){
        
        return peQuadrado*929;
        
    }
    
    public static double milhaQuadradaAcre(float milhaQuadrada){
        
        return milhaQuadrada * 640;
        
    }
    
    public static double acrePeQuadrado(float acre){
        
        return acre*43.560;
        
    }
    
    
    public static double metroMetroQuadrado(float altura, float largura){
        
        return altura*largura;
        
    }
    
    
}
