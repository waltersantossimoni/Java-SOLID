package br.com.rh.service.reajuste;

import br.com.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {
  /**
   * O conceito desta classe poderia ser implementado diretamente na classe Funcionario, porém,
   * a mesma foi desacoplada para um serviço para que a classe Funcionario atenda melhor
   * a um dos princípios da POO que é a COESÃO.
   *
   * Ao abstrairmos esta classe como visto, fazemos com que o conteúdo no escopo
   * da classe Funcionario seja mais coeso com o seu contexto e, ao mesmo tempo, estamos
   * usando o primerio conceito do SOLID que é o SRP(Single Responsibility Principle),
   * onde é definido que uma classe deve ter UMA e apenas UMA única responsabilidade, como
   * visto abaixo:
   */

  private List<ValidacaoReajuste> validacoes;

  public ReajusteService(List<ValidacaoReajuste> validacoes) {
    this.validacoes = validacoes;
  }

  /**
   * Neste trecho podemos notar a implementação do segundo conceito do SOLID chamado
   * OCP(Open Closed Principle), este principio determina que entidades de software
   * (classes, módulos, funções, etc) devem estar ABERTAS para expansões, porém FECHADAS
   * para modificações.
   *
   * Ao utilizarmos classes específicas para cada validação e implementa-las com uma interface
   * estamos as unificando para que o método abaixo as reconheça, e mesmo que alguma validação
   * seja removida ou alterada, não irá afetar o escopo do método.
   */
  public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
    this.validacoes.forEach(validacao -> validacao.validar(funcionario, aumento));

    BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
    funcionario.atualizarSalario(salarioReajustado);
  }
}
