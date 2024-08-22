package Data;

import java.util.Scanner;

public class Aniversario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String trimestre = "";
        String nome;
        System.out.println("Insira um dia: ");
        int dia = sc.nextInt();
        System.out.println("Insira o mes: ");
        int mes = sc.nextInt();
        boolean data = false;


        switch (mes) {


            case 1:
                nome = "janeiro";
                if (dia >= 1 && dia <= 31) {
                    data = true;
                    trimestre = "1 trimestre";
                }
                break;


            case 2:
                nome = "fevereiro";
                if (dia >= 1 && dia <= 28) {
                    data  = true;
                    trimestre = "1 trimestre";
                }
                break;
            case 3:
                nome = "março";
                if (dia >= 1 && dia <= 31) {
                    data = true;
                    trimestre = "1 trimestre";
                }
                break;
            case 4:
                nome = "abril";
                if (dia >= 1 && dia <= 30) {
                    data = true;
                    trimestre = "1 trimestre";
                }
                break;
            case 5:
                nome = "maio";
                if (dia >= 1 && dia <= 31) {
                    data = true;
                    trimestre = "2 trimestre";
                }
                break;
            case 6:
                nome = "junho";
                if (dia >= 1 && dia <= 31) {
                    data = true;
                    trimestre = "2 trimestre";
                }
                break;
            case 7:
                nome = "julho";
                if (dia >= 1 && dia <= 31) {
                    data = true;
                    trimestre = "3 trimestre";
                }
                break;


            case 8:
                nome = "agosto";
                if (dia >= 1 && dia <= 31) {
                    data = true;
                    trimestre = "3 trimestre";
                }
                break;
            case 9:
                nome = "setembro";
                if (dia >= 1 && dia <= 30) {
                    data = true;
                    trimestre = "3 trimestre";
                }
                break;
            case 10:
                nome = "outubro";
                if (dia >= 1 && dia <= 31) {
                    data = true;
                    trimestre = "4 trimestre";
                }
                break;
            case 11:
                nome = "novembro";
                if (dia >= 1 && dia <= 31) {
                    data = true;
                    trimestre = "4 trimestre";
                }
                break;
            case 12:
                nome = "dezembro";
                if (dia >= 1 && dia <= 31) {
                    data = true;
                    trimestre = "4 trimestre";
                }
                break;
            default:
                nome = "mes invalido";
                break;
        }
        if (data) {
            System.out.println("Data " + dia + " de " + nome + " Trimestre: " + trimestre);
        } else {
            System.out.println("Data inválida");
        }
        sc.close();

    }
}
