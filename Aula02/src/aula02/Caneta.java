package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampado;
    
    void status (){
        System.out.println("modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("esta tampada" + this.tampado);

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
