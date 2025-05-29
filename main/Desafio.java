package main;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salLiquido = 0.0f;

        System.out.print("Inforrme o salário bruto: R$");
        float valorSal = sc.nextFloat();
        System.out.print("Inforrme o valor de beneficio: R$");
        float valorBeneficio = sc.nextFloat();

        float imposto = 0.0f;
        if (valorSal > 0 && valorSal <= 1100.00) {
            imposto = valorSal * 0.05f;
        } 
        else if (valorSal > 1100.01 && valorSal <= 2500.00) {
            imposto = valorSal * 0.10f;
        } 
        else{
            imposto = valorSal * 0.15f;
        }

        salLiquido = valorSal - imposto + valorBeneficio;
        System.out.printf("O salário líquido é: R$%.2f%n", salLiquido);
    	}
    }	
