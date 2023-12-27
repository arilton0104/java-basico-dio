public class SmartTv {
    boolean ligada = false;
    int canal=1;
    int volume = 25;
    // Esse metodo está disponibilizando para o usuario que ele informe o numero do canal desejado, 
    // então é preciso ter isso como um parametro
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void almentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal --;
    }

    public void almentarVolume(){
        //volume = volume +1;  Essa operação pode ser usada normalmente mais podemos usar uma operação mais abreviada.
        volume ++; // Aqui é uma variavel que recebe como incremento +1 
        System.out.println("Almentando o volume para : " + volume);
    }
    public void diminuirVolume(){
        //volume = volume -1;
        volume --;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void ligar(){         // Metodo
        ligada = true;
    } 
    public void desligar(){      // Metodo
        ligada = false;
    } 
}




// Aqui foi colocado os atributos para que possamos ter uma interação de estado
// agora será criado os metodos que manipulam esses estados.
// Agora será criado um novo metodo para almentar e diminuir o volume da tv, parecido com o metodo ligar e desligar.