package model;

import java.util.*;

public class Alunos extends Pessoa {
    
    private String curso;
    private int fase;
    
    public Alunos(){
       this("",0);
    }

    public Alunos(String curso, int fase) {
        this.curso = curso;
        this.fase = fase;
    }

    public Alunos(String curso, int fase, int id, String nome, int idade) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    
    public String toString(){
        return "curso= "+curso+" fase= "+fase;
    }
    
    
}
