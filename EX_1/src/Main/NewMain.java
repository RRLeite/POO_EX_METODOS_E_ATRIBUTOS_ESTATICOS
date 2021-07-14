/*
[1 ponto]A área de um campo de futebol é de 8.250 metros quadrados. Usando a classe ConversaoDeUnidadesDeArea, 
escreva um programa em Java que mostre qual é a área de um campo de futebol em pés quadrados, acres e centímetros quadrados. 
Escreva métodos adicionais para a classe  ConversaoDeUnidadesDeArea, se necessário.
 */
package Main;

import ConversaoMedidas.ConversaoDeUnidadesDeArea;


/**
 *
 * @author Roberto Leite
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double campo = 0;
         campo = 8250.0;
        
       // ConversaoDeUnidadesDeArea converte = new ConversaoDeUnidadesDeArea ();
        
       System.out.println( ConversaoDeUnidadesDeArea.metroQuadradoPeQuadrado(campo));
       
       System.out.println( ConversaoDeUnidadesDeArea.metroQuadradoAcre(campo));
       
      System.out.println( ConversaoDeUnidadesDeArea.metroQuadradoCmquadrado(campo));
    }
    
}
