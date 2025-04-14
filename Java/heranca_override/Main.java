public class Main {
	public static void main(String[] args) {
		Carro carro = new Carro();//Objeto carro
		Moto moto = new Moto();//Objeto carro 

		carro.Acelerar();//Chama o metodo acelerar para o objeto carro 
		moto.Acelerar();//Chama o metodo acelerar para o objeto moto
	}
}
    // Classe modelo para as demais 
        abstract class Veiculo { 
	        int modelo;
	        String marca;

	    public void Acelerar() {
		    System.out.println("Acelerando");
	    }
    }
    // Esta classe emite um alerta e mostra a velocidade do carrro
        class Carro extends Veiculo {
    
    // Sobrescreve o Acelerar metodo da superclasse Veiculo
	@Override   
	public void Acelerar() {
		System.out.println("Alerta:\nVoce possui quatro rodas e precisa estar atento ao uso do cinto de segurança \nVelocidade do seu carro: ");
		for (double speed = 0; speed < 100; speed += 20) {
			System.out.println(speed + " Km/h");
		}
	}
}
    //Esta classe somente envia um alerta!
        class Moto extends Veiculo {
    
    // Sobrescreve o Acelerar metodo da superclasse Veiculo
	@Override   
	public void Acelerar() {
		System.out.println("Alerta:\n você possui duas rodas e necessita de um capacete");
	}
}
