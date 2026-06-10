

package javaapplication20;


public class ServicoNot {

    public void notificarCliente(Notificacao notificacao, String mensagem) {
        notificacao.enviar(mensagem);
    }
}
