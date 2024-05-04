package com.classificador;

public class Monstro {
  public String cabeca;
  public String olhos;
  public String olhos2;
  public String boca;
  public String nariz;
  public String cabelo;
  public String orelhas;

  private String nome;

  public Monstro(String nome, String cabeca, String olhos, String olhos2, String boca, String nariz, String orelhas, String cabelo) {

    this.nome = nome;
    this.cabeca = cabeca;
    this.olhos = olhos;
    this.olhos2 = olhos2;
    this.boca = boca;
    this.nariz = nariz;
    this.orelhas = orelhas;
    this.cabelo = cabelo;
  }

  public String getNome() {
    return this.nome;
  }
}