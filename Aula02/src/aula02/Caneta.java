package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampado;
    void status (){
        system.out.println("modelo " + this.modelo);
        system.out.println("Uma caneta " + this.cor);
        system.out.println("Ponta " + this.ponta);
        system.out.println("carga" + this.carga);
        system.out.println("esta tampada" + this.tampada);

    }
    void rabiscar(){
        if (this.tampado == true){
            System.out.println("ERROR! Não posso rabiscar");
    } else {
          System.out.println("Estou Rabiscando");
    }
}
    
    void tampar(){
        this.tampado = true;
    }
    
    void destampar(){
        this.tampado = false;
    }
}
