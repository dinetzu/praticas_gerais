import java.util.Scanner;//importa a biblioteca Scanner

public class Main {
    public static void main(String[] args) {

    //Declaração de variaveis
        double num1, num2, resultado;
    //Instancia a classe Scanner como um objeto para ler o      teclado do usuário  
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite um numero");
        num1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero");
        num2 = scanner.nextDouble();
    // Inicia um bloco try a fim de tentar executar um codigo que lança exeções
    try{
    //Verifica se o num2 é igual a zero
        if (num2 == 0) {
    //Lança um exeção aritimética caso o divisor seja zero
            throw new ArithmeticException("Nao é possível dividir por zero");
        }
        resultado = num1 / num2;
            System.out.println("O resultado é: " + resultado);
        }catch (ArithmeticException e) { //Inicia o bloco catch que captura exceções do tipo ArithmeticException
            System.out.println(e.getMessage());// Exibe a mensagem da excecão capturada
            }
        }
}

