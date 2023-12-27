public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Arilton";
        String nomeDois = "Franco";

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeDois);



        int numero1 = 3;
        int numero2 = 3;

        //boolean simNao = numero1 == numero2;
        //System.out.println("Numero um é igual a Numero dois? " + simNao);
        
        //boolean simNao = numero1 != numero2;
        
        boolean simNao = numero1 > numero2;
        // Aqui nessa condição se for igual aparece a mensagem se for diferente não aparece 
        if (numero1 == numero2) {
            System.out.println("A nossa condição é verdadeira ");
        }

    
        System.out.println(simNao);
        
    }
}

/*
 * /
 * Relacionais
 * Os operadores relacionais, avaliam a relação entre duas variáveis ou
 * expressões. Neste caso, mais precisamente,
 * definem se o operando à esquerda é igual, diferente, menor, menor ou igual,
 * maior, maior ou igual ao da direita,
 * retornando um valor booleano como resultado.
 * == Quando desejamos verificar se uma variável é IGUAL A outra.
 * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
 * > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
 * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
 * < Quando desejamos verificar se uma variável é MENOR QUE outra.
 * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
 * 
 * Os operadores relacionais, eles nos auxiliam em tomadas de decisão e consequentemente realizam 
 * fluxos na nossa aplicação, dependendo se a expressão for verdadeira (true)
 * 
 * Para numeros utilizamos operadores relacionais e para comparar objetos utilizamos 
 * o equals, esse é um metodo que compara conteudo 
 */