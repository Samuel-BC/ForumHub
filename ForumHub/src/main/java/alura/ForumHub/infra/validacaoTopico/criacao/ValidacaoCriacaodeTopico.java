package alura.ForumHub.infra.validacaoTopico.criacao;

import alura.ForumHub.dto.topico.DadosTopicoCadastro;

public interface ValidacaoCriacaodeTopico {

    void validar(DadosTopicoCadastro dados);
}
