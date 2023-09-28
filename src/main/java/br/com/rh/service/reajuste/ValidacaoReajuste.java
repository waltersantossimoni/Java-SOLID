package br.com.rh.service.reajuste;

import br.com.rh.model.Funcionario;

import java.math.BigDecimal;

/**
 * Essa interface implementa o último conceito do SOLID chamado DIP(Dependency Inversion
 * Principle), que determina que abstrações não devem depender de implementações. Implementações
 * devem depender de abstrações.
 *
 * Em outras palavras, todas as classes que utilizam das implementações que dependem da abstração
 * desta interface irão se comportar da seguinte forma: sempre que uma implementação for alterada,
 * excluida ou implementada (desde que a interface se mantenha), as classes que dependem das
 * implementações da interface abaixo não serão afetas, pois as mesmas dependem apenas da interface.
 */
public interface ValidacaoReajuste {
  void validar(Funcionario funcionario, BigDecimal aumento);
}
