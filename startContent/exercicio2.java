package cursoDeJava.exercicios.exercicios.startContent;

import javax.swing.*;

public class exercicio2 {

    public static void main (String[] args) {

        double mySalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu salário"));
        double taxInSalary;

        if (mySalary >= 0 && mySalary <= 34712) {
            taxInSalary = 0.097;
        }
        else if(mySalary >= 34713 && mySalary <= 68507) {
            taxInSalary = 0.3735;
        }
        else {
            taxInSalary = 0.495;
        }

        String Resultado = "A taxa a ser paga é de " + taxInSalary + " sobre o salário, logo, você terá de pagar: " + (mySalary * taxInSalary);

        JOptionPane.showMessageDialog(null, Resultado);

    }

}
