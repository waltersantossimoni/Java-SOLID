package br.com.rh.model;

import java.math.BigDecimal;

/**
 * O intuito da classe abaixo é trazer uma solução para classes que precisam usar herança. Um
 * dos grandes problemas ao usarmos herança é o fato de muitas vezes classes filhas herdarem
 * dados que não fazem sentido para as mesmas (ou que não desejavamos que os mesmos fossem herdados),
 * com isso, é aconselhado que ao invés da utilização da herança seja usado a composição.
 *
 * Como podemos ver, as classes que estão sendo compostas por DadosPessoais não estão herdando
 * da mesma, pois, ao usarmos a herança podemos ferir o terceiro conceito do SOLID que é o
 * LSP(Liskov Substitution Principle), que determina que objetos de uma classe derivada devem ser
 * capazes de serem substituídos por objetos da classe base sem quebrar a funcionalidade do programa.
 *
 * Em outras palavras, se uma classe A é um tipo de classe B, então os objetos da classe A devem ser
 * capazes de serem usados em qualquer lugar em que os objetos da classe B são esperados, sem afetar o
 * comportamento do programa de forma indesejada. Esse princípio é fundamental para garantir a
 * extensibilidade e a flexibilidade do código, permitindo que novas classes possam ser adicionadas sem
 * quebrar o código existente.
 */

public class DadosPessoais {
  private String nome;
  private String cpf;
  private Cargo cargo;
  private BigDecimal salario;

  public DadosPessoais(String nome, String cpf, Cargo cargo, BigDecimal salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.cargo = cargo;
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  public BigDecimal getSalario() {
    return salario;
  }

  public void setSalario(BigDecimal salario) {
    this.salario = salario;
  }
}
