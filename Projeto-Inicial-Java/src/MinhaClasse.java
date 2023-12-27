public class MinhaClasse { // corpo da classe 
    public static void main(String[] args) { // Corpo do metodo, aqui é o que vai ser executado
        //System.out.print("olá pessoal");
        
        String primeiroNome = " é Arilton";
        String segundoNome = "Franco";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
// Essa instrução é a variavél // e esse é metodo
// qual a diferença , todo metodo tem os seus parametros 
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome,String segundoNome){
        return "resultado do metodo" + primeiroNome.concat(" ").concat(segundoNome);
    }
}


/*/
Toda Classe precisa existir dentro do diretorio "src que é o diretorio de recurso do meu projeto"
O nome do arquivo precisa estar em camel case, pra uma boa nomenclatura.
*/

/* Declaração de Metodo
 *  Estrutura 
 * 
 * TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
 * 
 * Exemplo
 * 
 * int somar (int numeroUm, int numero2)
 * (Esse é um metodo com a finalidade de somar e ele vai retornar um int
 * e pra realizar uma soma, eu tenho que no minimo dois parametros)
 * 
 * String formatarCep (Long cep)
 * (Esse outro metodo, chama formatarCep)
 * 
 * 
 * (somar, formatar, adicionar, calcular, incluir, processar
 * esses são nomeObjetivo no infinitivo )
 * 
 * Todo metodo retorna um tipo como, String, Int,  
 * 
 * Um metodo recebe parametros de tipos diferentes 
 * 
 * RESULTADO 
 * FOI FEITO UMA CHAMADA DE UM METODO QUE FOI ATRIBUIDO A UMA VARIVEL
 * ENTÃO FOI IMPRIMIDO O NOME COMPLETO QUE FOI JUNTADO PELO METODO QUE FOI 
 * GUARDADO DENTRO DA VARIAVEL 
 * 
 * 
 * Foi feito criar um metodo, sabendo que ele tem um tipo de retorno, esse tipo 
 * de retorno pode ser qualquer valor, pode ser int,boolean.
 */