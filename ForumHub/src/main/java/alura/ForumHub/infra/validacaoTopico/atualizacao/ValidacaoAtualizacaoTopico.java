package alura.ForumHub.infra.validacaoTopico.atualizacao;

import alura.ForumHub.dto.topico.DadosTopicoAtualizacao;

public interface ValidacaoAtualizacaoTopico {
    void validar(Long id, DadosTopicoAtualizacao dados);
}