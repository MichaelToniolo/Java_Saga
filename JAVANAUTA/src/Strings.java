public class Strings {
    public static void main(String[] args) {
        String nome = "Sery";
        String sobrenome = "Vam";
        int tamanho = nome.length();
        String nome2 = "Sery";
        boolean saoIguais = nome.equals(nome2);
        String nomeCompleto = nome.concat(sobrenome);

        System.out.println("Olá " + nome.toUpperCase() + " seu nome tem " + tamanho + " Caracteres");
        System.out.println("Os nomes são Iguais?? " + saoIguais);
        System.out.println("Nome completo: " + nomeCompleto);

    }
}