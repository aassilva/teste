package br.ufg.inf.es.mds.atendimento;

public class Aluno {
    private String nomeAluno;
    private String feedBack;
    
    public Aluno(String nome) throws Exception {
        setNome(nome);
    }
    
    public String getNome() {
        return nomeAluno;
    }
    
    public void setNome(String nome) throws Exception {
        if (nome != null && !"".equals(nome)) {
          this.nomeAluno = nome;  
        } else {
            throw new Exception("\nNome inválido!");
        }
    }
    
     public String getFeedBack() {
        return feedBack;
    }
    
    public void setFeedBack(String feedBack) throws Exception {
        if (feedBack != null && !"".equals(feedBack)) {
          this.feedBack = feedBack;  
        } else {
            throw new Exception("\nFeedback inválido!");
        }
    }
}
