/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomeslugarespares;

/**
 *
 * @author Noa
 */
public class NomesLugaresPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        String nomes [] = new String [15];
        
        for (int i = 0; i < 15; i++) {
            nomes[i] = Entrada.leiaString();
        }
        
        for (int i = 0; i < 15; i = i + 2) {
                System.out.println("Nomes pares: " + nomes[i]);
            }
        
        System.exit(0);
    }
    
}
