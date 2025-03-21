package alura.ForumHub.infra.validacaoTopico.atualizacao;

import alura.ForumHub.dto.topico.DadosTopicoAtualizacao;
import alura.ForumHub.infra.exception.ValidacaoException;
import alura.ForumHub.model.entities.Topico;
import alura.ForumHub.repository.TopicoRepository;
import alura.ForumHub.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidacaoUsuarioAtualizacao implements ValidacaoAtualizacaoTopico{

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void validar(Long id, DadosTopicoAtualizacao dados) {
        Topico topico = topicoRepository.findById(id).orElse(null);

        if(topico.getAutor() != usuarioService.usuarioAtual()) {
            throw new ValidacaoException("Usuario nao autorizado para atualizar o topico.");
        }
    }
}
