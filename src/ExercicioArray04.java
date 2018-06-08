import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Patrick
 */
public class ExercicioArray04 {

    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "° número")));
            
        }
        for(int i = 0; i < 10; i++){
        JOptionPane.showMessageDialog(null, "\nTodos os Números: " + numeros);
        numeros.remove(numeros.get(4));
        JOptionPane.showMessageDialog(null, "\nNúmeros que restaram: " + numeros);
        numeros.remove(numeros.get(3));
        JOptionPane.showMessageDialog(null, "\nNúmeros que restaram: " + numeros);
        
        break;
        }
        
        
    }

}
