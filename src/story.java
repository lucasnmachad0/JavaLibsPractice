import javax.swing.JOptionPane;

public class story {

    public static void main(String[] args) {
        // Solicitar várias entradas do usuário
        String name = JOptionPane.showInputDialog(null, "Escolha um nome.");
        String animal = JOptionPane.showInputDialog(null, "Um animal de estimacao");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "uma idade para o " + name));
        int numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog(null, "um numero inteiro"));
        double numerodecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "um numero decimal"));
        // História interativa com partes modificadas pelo usuário
        
        String story;
        story = "Havia uma pessoa chamada " + name + ".\n";
        story += name + " tinha " + age + " anos.\n";
        story += name + " tinha um " + animal + " de estimacao.\n";
        story += "Um dia, " + name + " econtrou uma carteira.\n";
        story += "e " + name + " achou " + numeroInteiro + "," + numerodecimal + "R$ na carteira";
        // Exibir a história resultante em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, story);
    }
}
