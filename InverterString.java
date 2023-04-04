package dipinho;

/*
 * 5a Questão
 * Escreva um programa que inverta os caracteres de um string. IMPORTANTE: 
	a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; 
	b) Evite usar funções prontas, como, por exemplo, reverse; 
 */

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texto, textoInvertido = "";
        
        System.out.print("Digite um texto para ser invertido: ");
        texto = input.nextLine();
        
        // Inverte o texto
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        
        // Exibe o texto invertido
        System.out.println("Texto invertido: " + textoInvertido);
    }
}

