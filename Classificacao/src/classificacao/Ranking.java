package classificacao;

public class Ranking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipe e = new Equipe();
        e.setNome("Barcelona");
        e.setVitoria(6);
        e.setEmpate(0);
        e.setDerrota(0);
        e.setGolMarc(21);
        e.setGolSofr(6);
        e.setDifGol(0);
        //Partida empate = null;
        //e.setPonto(19, empate);
        
        System.out.println("Equipe: "+e.getNome());
        System.out.println("Pontos: "+e.getPonto());
        System.out.println("Vitórias: "+e.getVitoria());
        System.out.println("Empates: "+e.getEmpate());
        System.out.println("Derrotas: "+e.getDerrota());
        System.out.println("Gols Marcados: "+e.getGolMarc());
        System.out.println("Gols Sofridos: "+e.getGolSofr());
        System.out.println("Diferença de Gols: "+e.getDifGol());
    }
    
}
