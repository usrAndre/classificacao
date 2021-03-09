
package classificacao;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private int ponto;
    private int vitoria;
    private int empate;
    private int derrota;
    private int golMarc;
    private int golSofr;
    private int difGol;

    public ArrayList Equipe(String nome, int vitoria, int empate, int derrota, int golMarc, int golSofr, int difGol, int ponto) {
        this.nome = nome;
        this.vitoria = vitoria;
        this.empate = empate;
        this.derrota = derrota;
        this.golMarc = golMarc;
        this.golSofr = golSofr;
        this.difGol = difGol;
        this.ponto = ponto;
        return null;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto, Partida resultado) {
        if(resultado.equals(empate))
            ponto++;
        else if(resultado.equals(vitoria))
            ponto = 3;
        else
            ponto = 0;
        this.ponto = ponto;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("nome do time: ");
        this.nome = nome;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        if(golMarc > golSofr)
            vitoria++;
        this.vitoria = vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        if(golMarc == golSofr)
            empate++;
        this.empate = empate;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        if(golMarc < golSofr)
            derrota++;
        this.derrota = derrota;
    }

    public int getGolMarc() {
        return golMarc;
    }

    public void setGolMarc(int golMarc) {
        System.out.println("total de gols marcados: ");
        this.golMarc = golMarc;
    }

    public int getGolSofr() {
        return golSofr;
    }

    public void setGolSofr(int golSofr) {
        System.out.println("total de gols sofridos: ");
        this.golSofr = golSofr;
    }

    public int getDifGol() {
        return difGol;
    }

    public void setDifGol(int difGol) {
        difGol = golMarc - golSofr;
        this.difGol = difGol;
    }

}
