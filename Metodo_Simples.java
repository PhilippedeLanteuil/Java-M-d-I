import javax.swing.JOptionPane;

class Metodo_Simples{
    
    static double valor1 = 0, valor2 = 0, soma = 0;
    
    public static void main(String args[])
    {
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        somar_valores();
        
        JOptionPane.showMessageDialog(null, "A soma dos valores é : " + soma);
        
    }
        public static void somar_valores()
        {
            soma = valor1 + valor2;
        }
}
