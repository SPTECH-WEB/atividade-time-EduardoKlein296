package school.sptech;

public class Time {

    String nome;
    Integer vitorias=0, empates=0, derrotas=0;

    public void registrarVitoria(){
        vitorias++;
    }

    public void registrarEmpate(){
        empates++;
    }

    public void registrarDerrota(){
        derrotas++;
    }

    public Integer getPontos(){
        int totalPontos=(vitorias*3)+empates;
        return totalPontos;
    }

    public  Integer getTotalPartidas(){
        int totalPartidas=vitorias+empates+derrotas;
        return totalPartidas;
    }

    public Integer getAproveitamento(){
        double Aproveitamento = ((double)vitorias / (getTotalPartidas())) * 100;
        return(int) Aproveitamento;
    }

    public void compararAproveitamento(Time adversario){
        if(this.getAproveitamento()>adversario.getAproveitamento()){
            System.out.println("O seu time tem um melhor aproveitamento");
        }
        else {
            System.out.println("O adversário tem um melhor aproveitamento");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Total vitorias: "+vitorias);
        System.out.println("Total empates: "+empates);
        System.out.println("Total derrotas: "+derrotas);
        System.out.println("Pontos: "+getPontos());
        System.out.println("Total partidas: "+getTotalPartidas());
        System.out.println("Aproveitamento: "+getAproveitamento());
    }
}
