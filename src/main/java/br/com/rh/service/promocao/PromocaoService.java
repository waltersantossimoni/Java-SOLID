package br.com.rh.service.promocao;

import br.com.rh.exception.ValidacaoException;
import br.com.rh.model.Cargo;
import br.com.rh.model.Funcionario;

public class PromocaoService {
  public void promover(Funcionario funcionario, Boolean metaBatida) {
    Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();

    if (Cargo.GERENTE == cargoAtual) {
      throw new ValidacaoException("Gerentes não podem ser promovidos!");
    }

    if(metaBatida) {
      Cargo novoCargo = cargoAtual.getProximoCargo();
      funcionario.promover(novoCargo);
    } else {
      throw new ValidacaoException("Funcionário não bateu a meta.");
    }
  }
}
