package alura.ForumHub.dto.topico;

import alura.ForumHub.dto.resposta.DadosRespostaResponse;
import alura.ForumHub.model.entities.Resposta;
import alura.ForumHub.model.entities.Topico;
import alura.ForumHub.model.enums.StatusTopico;

import java.util.List;

public record DadosTopicoDetalhado(
        Long id,
        String titulo,
        String mensagem,
        String nomeAutor,
        StatusTopico status,
        List<DadosRespostaResponse> respostas
) {
    public DadosTopicoDetalhado(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getAutor() == null ? null : topico.getAutor().getNome(),
                topico.getStatus(),
                topico.getRespostas()
        );
    }
}
