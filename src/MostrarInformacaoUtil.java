public class MostrarInformacaoUtil {
    public static void pularLinha() {
        imprimirTexto("");
    }

    public static void imprimirSeparadorDeConteudo() {
        imprimirTexto("-----------------------------");
    }

    public static void imprimirTexto(String conteudo) {
        System.out.println(conteudo);
    }

    public static void pularLinhaEImprimirSeparadorDeConteudo() {
        pularLinha();
        imprimirSeparadorDeConteudo();
    }
}