import java.util.Scanner; //Importando a biblioteca Scanner
    //Classe abstrata 
abstract class Forma {
    //m´metodo absrtato
    public abstract void CalcularArea(); 
}
    //Classe Retangulo herda de Forma
        class Retangulo extends Forma {
                private double altura;
                private double largura;
                
    //Construtor da classe Retangulo
    public Retangulo(double altura, double largura) {
                this.altura = altura;
                this.largura = largura;
    }
    
    //Implementa o método CalcularArea no Retangulo
    @Override
    public void CalcularArea() {
        double area = altura * largura;
       //Evita incongruencias matematicas 
        if(largura == altura){
            System.out.println("Não foi possível obter o valor, pois o valor da altura deve ser diferente da largura ");
        }else{
            System.out.println("A área desse retângulo é: " + area);
        }
    }
}

        class Circulo extends Forma {
                private double raio;
    
    //Construtor da classe Circulo
    public Circulo(double raio) {
                this.raio = raio;
    }
        //Implementa o método CalcularArea no Circulo
    @Override
    public void CalcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto scanner 
        // Loop para mostrar o menu sempre
        while (true) {
            System.out.println("\nMenu principal:");
            System.out.println("1. Calcular a área do retângulo");
            System.out.println("2. Calcular a área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha um número para prosseguir: ");
            int opcao = scanner.nextInt();
        //Lida com a escolha do usuário
            switch (opcao) {
                case 1:
                    // Retângulo
                    System.out.print("Escreva o valor da altura do retângulo: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Escreva o valor da largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(altura, largura);
                    retangulo.CalcularArea();
                    break;
                case 2:
                    // Círculo
                    System.out.print("Digite o valor do raio do círculo: ");
                    double raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    circulo.CalcularArea();
                    break;
                case 3:
                    // Sair
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    //Opção Inválida
                    System.out.println("Opção inválida, por favor tente novamente.");
                    break;
            }
        }
    }
}
