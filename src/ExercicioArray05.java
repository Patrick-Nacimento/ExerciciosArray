
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick
 */
public class ExercicioArray05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            nomes.add(JOptionPane.showInputDialog("Digite o " + (i+1) + "° nome"));
            
        }
        JOptionPane.showInputDialog("Procure pelo nome desejado"); 
    }
    
}
