package com.classificador;

import java.util.Scanner;
import com.classificador.Monstro;

public class Main {
  private static String[] nomeCaracteristica = {
    "Cabeça", "Olhos", "Olhos 2", "Boca", "Nariz", "Orelhas", "Cabelo"
  };
  
  static boolean verificarCaracteristicas(Monstro monstro, String[] caracteristicas) {
    return (monstro.cabeca.equalsIgnoreCase(caracteristicas[0]) &&
        monstro.olhos.equalsIgnoreCase(caracteristicas[1]) &&
        monstro.olhos2.equalsIgnoreCase(caracteristicas[2]) &&
        monstro.boca.equalsIgnoreCase(caracteristicas[3]) &&
        monstro.nariz.equalsIgnoreCase(caracteristicas[4]) &&
        monstro.orelhas.equalsIgnoreCase(caracteristicas[5]) &&
        monstro.cabelo.equalsIgnoreCase(caracteristicas[6]));
  }

  public static void main(String[] args) {
    // Definindo os monstros A=Franken, B=Zombos, C=Happy
    Monstro Franken = new Monstro(
        "Franken",
        "Retangular",
        "Circulares",
        "Grandes",
        "AbertacomDentes",
        "ComNariz",
        "ComOrelhas",
        "ComCabelo");

    Monstro Zombos = new Monstro(
        "Zombos",
        "Retangular",
        "Circulares",
        "Grandes",
        "AbertacomDentes",
        "ComNariz",
        "SemOrelhas",
        "SemCabelo");

    Monstro Happy = new Monstro(
        "Happy",
        "Oval",
        "SemiCirculares",
        "Pequenos",
        "Aberta",
        "ComNariz",
        "ComOrelhas",
        "PoucoCabelo");

    Scanner scanner = new Scanner(System.in);
    String[] caracteristicasUsuario = new String[7];
    System.out.println("Classificador de Monstros");
    System.out.println("Insira sete características:");

    for (int i = 0; i < nomeCaracteristica.length; i++) {
      System.out.print(nomeCaracteristica[i] + ": ");
      caracteristicasUsuario[i] = scanner.nextLine();
    }

    if (verificarCaracteristicas(Franken, caracteristicasUsuario)) {
      System.out.println("Esse monstro é o: " + Franken.getNome());
    } else if (verificarCaracteristicas(Zombos, caracteristicasUsuario)) {
      System.out.println("Esse monstro é o: " + Zombos.getNome());
    } else if (verificarCaracteristicas(Happy, caracteristicasUsuario)) {
      System.out.println("Esse monstro é o: " + Happy.getNome());
    } else {
      System.out.println("Nenhuma correspondência encontrada.");
    }

    scanner.close();
  }
}