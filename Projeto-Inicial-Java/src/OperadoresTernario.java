public class OperadoresTernario {
    public static void main(String[] args) {
        int a,b;
        a = 6;
        b = 6;

      //  String resultado = "";
        
      //  if(a==b)
      //      resultado ="verdadeiro;";                         (Toda essa questão está correta)
      //  else resultado = "falso";
      //  System.out.println("O resultado é " + resultado);    
        
        // agora será feito uma forma mais abreviada da sintaxe
        // Se a for igual a b imprima verdadeiro se não falso
        String resultado = a == b ?"verdadeira" : "falso";
        System.out.println(resultado);

        // Esse é o uso do operador ternario na linguagem, lembrando que essa operação a==b, sempre é uma expressão 
        //booleana.

    }
}
