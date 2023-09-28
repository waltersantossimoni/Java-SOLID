package br.com.rh.service.reajuste;

import br.com.rh.exception.ValidacaoException;
import br.com.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {
  public void validar(Funcionario funcionario, BigDecimal aumento) {
    LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
    LocalDate dataAtual = LocalDate.now();
    long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

    if (mesesDesdeUltimoReajuste < 6) {
      throw new ValidacaoException("Intervalo entre reajustes deve ser de no mínimo 6 meses!");
    }
  }
}
