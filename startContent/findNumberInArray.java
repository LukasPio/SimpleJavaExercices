package cursoDeJava.exercicios.exercicios.startContent;

import javax.swing.*;

public class findNumberInArray {

    public static void main (String[] args) {

        double[] listaDeNumeros = new double[]{ 1, 2, 4.1, 5, 7, 8, 9, 11, 3, 12 };
        int numeroEncontrado = 0;
        double numeroProcurado = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o número que deve ser buscado no array"));

        boolean numeroExiste = false;

        for (int i = 0; i < listaDeNumeros.length; i++) {

            if ( numeroProcurado == listaDeNumeros[i] ) {

                numeroExiste = true;
                break;
            }

        }

        if (numeroExiste) {

            JOptionPane.showMessageDialog(null,"O número " + numeroProcurado + " está presente no array listaDeNumeros");

        }

        else {

            JOptionPane.showMessageDialog(null,"O número " + numeroProcurado + " não está presente no array listaDeNumeros");

        }



    }



}
