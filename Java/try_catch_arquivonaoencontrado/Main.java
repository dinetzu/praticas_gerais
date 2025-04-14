
/*Bibliotecas*/
import java.io.File;//  Permite obter o caminho de um determinado arquivo
import java.io.FileReader;// Permite acessar o conteúdo de um arquivo
import java.io.FileNotFoundException;// Permite lançar uma exceção quando o arquivo não é encontrado

public class Main {
    public static void main(String[] args) {
        try {
            
            // Cria um objeto File com um caminho definido: arquivo.txt inexistente
            File file = new File("C:\\Users\\Olimpo\\Desktop\\arquivo.txt"); 
            
            // Cria o objeto FileReader que permite ler o conteúdo do  arquivo
            FileReader fr = new FileReader(file);
            
            
            // Outras operações com o arquivo
        } catch (FileNotFoundException e) {
            
            //Define o tipo de exeção como FileNotFoundException e mostra uma mensagem
            System.out.println("Arquivo não encontrado. Por favor, verifique o caminho do arquivo.");
        }
    }
}
