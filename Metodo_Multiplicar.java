import javax.swing.JOptionPane;

class Metodo_Multiplicar{
    
    static double valor1 = 0, valor2 = 0, multiplicacao = 0;
    
    public static void main(String args[])
    {
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        multiplicar_valores();
        
        JOptionPane.showMessageDialog(null, "A multiplicação dos valores é : " + multiplicacao);
        
    }
        public static void multiplicar_valores()
        {
            multiplicacao = valor1 * valor2;
        }
}