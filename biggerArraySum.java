package cursoDeJava.exercicios.exercicios;

import javax.swing.*;

public class biggerArraySum {
    public static double[] createSubArr() {
        int subArrayLength = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do subArray"));
        double[] oneSubArray = new double[subArrayLength];

        for (int i = 0; i < oneSubArray.length; i++) {
            String numberToArray = JOptionPane.showInputDialog(null, "Digite o valor a ser inserido no subArray na posição " + i + ":");
            oneSubArray[i] = Double.parseDouble(numberToArray);
        }

        return oneSubArray;
    }

    // --------------------------------------------------------------------------------------

    public static double[][] createArr() {
        int arrayLength = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do array"));
        double[][] oneArray = new double[arrayLength][];


        for (int i = 0; i < oneArray.length; i++) {
            oneArray[i] = createSubArr();

        }

        return oneArray;
    }

    // --------------------------------------------------------------------------------------

    public static void subArrayWithHigherSum (double[][] array) {

        double[] arraySumList = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            double sum = 0;


            for (double num: array[i]) {

             sum += num;

            }

            arraySumList[i] = sum;
        }

        double num = arraySumList[0];
        int maxSumIndex = 0;

        for (int i = 1; i < arraySumList.length; i++) {

            if (arraySumList[i] > num) {

                num = arraySumList[i];
                maxSumIndex = i;

            }

        }

        System.out.println("O subArray com a maior soma é o de índice: " + maxSumIndex);
    }


    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {

        double[][] twoDimensionalArray = createArr();

        subArrayWithHigherSum(twoDimensionalArray);
    }
}

