public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.almentarVolume();
        System.out.println("Volume atual é : " + smartTv.volume);

        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar(); // Aqui o objeto chama o metodo ligar() e execulta o mesmo.
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar(); // Aqui é execultado o metodo desligar
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);
    }
}

// Aqui na classe usuario, vai ser como se fosse um controle remoto, que vai
// interagir sobre uma televisão, e estou usando o usuario como controle remoto
// para a Classe smartTv, e vou
// fazer a mudança de estado dessa minha smartTv, através da classe usuario.
// esse metodo main ele é o metodo que executa a minha aplicação que no caso
// aqui é a classe Usuario que
// mudamos o nome.

// São duas etapas a tv que é um objeto e o usuario interagindo sobre o objeto

/* RESULMO 
    OS NOMES DOS METODOS SÃO LEGIVEIS 
    NEM TODOS OS METODOS PRECISAM ME DAR RETORNO
    ALGUNS METODOS TERÃO PARAMETOS 
    E ESSES METODOS PODEM MANIPULAR AS VARIAVEIS OU AS CARACTERISTICAS DOS OBJETOS PRINCIPAL.
 * 
 */
