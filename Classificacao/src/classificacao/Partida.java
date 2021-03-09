
package classificacao;

public class Partida {
    private Equipe principal;
    private Equipe adversaria;
    private String resultado;

    public String Partida(Equipe adversaria, Equipe principal){
        if(principal.getDifGol()>0){
            System.out.println("Placar: "+principal.getGolMarc()+"X"+principal.getGolSofr());
            principal.setVitoria(principal.getVitoria()+1);
            adversaria.setDerrota(adversaria.getDerrota()+1);
            principal.setPonto(principal.getPonto()+3, this);
        }
        else if(principal.getDifGol()==0){
            System.out.println("Placar: "+principal.getGolMarc()+"X"+principal.getGolSofr());
            principal.setEmpate(principal.getEmpate()+1);
            adversaria.setEmpate(adversaria.getEmpate()+1);
            principal.setPonto(principal.getPonto()+1, this);
            adversaria.setPonto(adversaria.getPonto()+1, this);
        }
        else{
            System.out.println("Placar: "+principal.getGolSofr()+"X"+principal.getGolMarc());
            principal.setDerrota(principal.getDerrota()+1);
            adversaria.setVitoria(adversaria.getVitoria()+1);
            adversaria.setPonto(adversaria.getPonto()+3, this);
        }
        return resultado;
    }
}
