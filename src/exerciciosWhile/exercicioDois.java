package exerciciosWhile;

import java.util.Scanner;
/*
	Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
	um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
	4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
	que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
	mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
	exemplo.
 */

public class exercicioDois {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int combustivel = sc.nextInt();
		
		while(combustivel != 4) {
			if (combustivel == 1) {
				System.out.println("Você escolheu Álcool");
			} else if (combustivel == 2) {
				System.out.println("Você escolheu Gasolina");
			} else if (combustivel == 3) {
				System.out.println("Você escolheu Diesel");
			} else {
				System.out.println("Voce informou um número inválido, porfavor, escolha 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
			}
			combustivel = sc.nextInt();
		}
		
		System.out.println("Fim do algoritmo");
		
		sc.close();
	}
}
