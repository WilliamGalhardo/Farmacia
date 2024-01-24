import javax.swing.JOptionPane;

public class UseClasses{
    public static void main(String[] args) {
        String quantos;
        String horario;
        String dias;
        int q;
        float h;
        int d;

        quantos = JOptionPane.showInputDialog("Digite quantos medicamentos tomar: ");
        q = Integer.parseInt(quantos);
        horario = JOptionPane.showInputDialog("Digite o horario de tomar: ");
        h= Float.parseFloat(horario);
        dias = JOptionPane.showInputDialog("Digite os dias que tem que tomar: ");
        d = Integer.parseInt(dias);

        String nome;
        String idade;
        String altura;
        int i;
        float a;

        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = JOptionPane.showInputDialog("Sua idade :");
        i = Integer.parseInt(idade);
        altura = JOptionPane.showInputDialog("Coloque sua altura: ");
        a = Float.parseFloat(altura);
        
        String modelo;
        String alarme;
        String senha;
        float al;

        modelo = JOptionPane.showInputDialog("Qual o modelo do seu Cell: ");
        alarme = JOptionPane.showInputDialog("Horario do seu alarme: ");
        al = Float.parseFloat(alarme);
        senha = JOptionPane.showInputDialog("Senha do seu cell: ");



        JOptionPane.showMessageDialog(null, "MEDICAMENTOS"+"\nQuantos medicamtos: " + q +"\nHorarios que tem que tomar: " + h + "\nDias que tem que tomar: " +d+ "\n---------------"+"\nCLIENTE"+"\nNome: " +nome+ "\nidade: " +i+ "\nAltura: "+a+"\n-------------"+"\nCELULAR"+"\nModelo do cell: " +modelo+ "\nAlarme do cell: " +al+ "\nSenha do cell: " +senha);
    }
}