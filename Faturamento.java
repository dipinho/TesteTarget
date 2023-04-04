package dipinho;

/*
 * 4a Questão
 * Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado: 
SP – R$67.836,43 
RJ – R$36.678,66 
MG – R$29.229,88 
ES – R$27.165,48 
Outros – R$19.849,53 
Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada 
estado teve dentro do valor total mensal da distribuidora. 
 */

public class Faturamento {
    public static void main(String[] args) {
        double faturamentoTotal = 0;
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double OUTROS = 19849.53;
        
        // Calculo do faturamento total mensal da distribuidora
        faturamentoTotal = SP + RJ + MG + ES + OUTROS;
        
        // Calculo do percentual de cada estado 
        double percentualSP = (SP / faturamentoTotal) * 100;
        double percentualRJ = (RJ / faturamentoTotal) * 100;
        double percentualMG = (MG / faturamentoTotal) * 100;
        double percentualES = (ES / faturamentoTotal) * 100;
        double percentualOutros = (OUTROS / faturamentoTotal) * 100;
        
        // Percentual cada estado no faturamento total
        System.out.printf("Percentual de representação de SP: %.2f%%\n", percentualSP);
        System.out.printf("Percentual de representação de RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de representação de MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de representação de ES: %.2f%%\n", percentualES);
        System.out.printf("Percentual de representação de Outros: %.2f%%\n", percentualOutros);
    }
}
