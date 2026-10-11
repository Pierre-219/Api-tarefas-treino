package com.pierre.apitarefas.api;
import java.util.ArrayList;
import com.pierre.apitarefas.domain.Livro;
public class LivroRepository {
   private ArrayList<Livro> biblioteca = new ArrayList<>();
   public void adicionar(Livro livro){
      biblioteca.add(livro);
   }
   public ArrayList<Livro> listarTodos(){
      return biblioteca;
   }
   public Livro find(int id){
      for (Livro livro:biblioteca){
         if((livro.getId() == id)){
            return livro;
         }
      }
      return null;
   }
    
}
