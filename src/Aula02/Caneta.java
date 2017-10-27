package Aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	String tentandorabisco;

	void status(){
		System.out.print("Uma caneta " + this.cor);
	}
	void rabiscar(){
		System.out.println(tentandorabisco);
	}
	
	void tampar(){
		this.tampada = true;
		tentandorabisco = "Erro! Não posso rabiscar";
	}
	
	void destampar(){
		this.tampada = false;
		tentandorabisco = "Estou rabiscando";
	}
}
