public class AtividadesSolo {
    public static void main(String[] args) {
        String nome  = "arilton";
        String sobreNome = " franco";

        String nomeCompleto = nomeCompleto(nome,sobreNome);

        System.out.println(nomeCompleto);
    }
        public static String nomeCompleto(String nome,String sobreNome){
            return "O meu nome é " + nome.concat(sobreNome);
        }
            
}
