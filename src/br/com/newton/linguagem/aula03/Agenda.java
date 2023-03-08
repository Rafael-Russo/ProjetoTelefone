package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        Contato contato = new Contato();

        contato.nome = "Rafaela";
        contato.telefone = "222255";

        telefone.contato = contato;

        Telefone tel1 = new Telefone();
        tel1.marca = "iPhone";
        tel1.cor = "branco";
        Contato contato1 = new Contato();
        contato1.telefone = "318989952";
        contato1.nome = "João";
        tel1.contato = contato1;

        Telefone tel2 = new Telefone();
        tel2.marca = "S20";
        tel2.cor = "preto";
        Contato contato2 = new Contato();
        contato2.telefone = "3189871147";
        contato2.nome = "Carmen";
        tel2.contato = contato2;

        telefone.Tocar("Sertanejo");
        tel1.Tocar("Rock");
        tel2.Tocar("Rap");

        System.out.println(telefone.contato.nome);
    }
}
