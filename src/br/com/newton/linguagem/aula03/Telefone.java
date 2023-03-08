package br.com.newton.linguagem.aula03;

public class Telefone {
    public String marca;
    public String cor;
    Contato contato;
//    Contato contato1 = new Contato();

    public void Tocar(String musica){
        if (musica.equals("pagode")){
            System.out.println("Só tocamos pagode");
        }else {
            System.out.println("Não tocamos esse estilo musical");
        }
    }

    public void Ligar(Contato recebedor){
        if (!this.cor.equals("preto") || !recebedor.nome.equals("Juliana")){
            System.out.println("Não foi possivel ligar para esse telefone");
        }else {
            System.out.println("ligando para " + recebedor.nome);
        }
    }
}
