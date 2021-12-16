package biblioteca;

import java.util.ArrayList;

public class Livraria extends Livros {
    
    private static ArrayList<Livros> verlivros = new ArrayList<>();
    
    
    static ArrayList<Livros> getverlivros(){
        
        return verlivros;
    }
    static public void adicionar(Livros a ){
             verlivros.add(a);
 
    }
    static public String ver(){
        
        String saida = "";
        int i = 1;
        for (Livros a : verlivros){
            
            
        
                   saida += "\n=======LIVRO NUMERO"+ (i++) + " ========\n";
                   saida += a.colocar() + "\n";
                  
                           
  
        }
                     return saida;
    }


    static public int verificar(String tipo){
        int quantidade = 0;
        
        for (Livros a : verlivros){
            if(a.getTipo().equalsIgnoreCase(tipo)){
                quantidade++;
            }
        }
            
            
        
        return quantidade;
    }
     static public int verificar(double começo, double fim){
         
         int quantidade = 0;
         
         for(Livros a : verlivros){
             if(a.getPreço()>= começo && a.getPreço()<= fim){
                 quantidade++;
             }
             
         }
          return quantidade;
     }
          static public boolean retirar(String titulo){
              for(Livros a : verlivros){
                  if(a.getTitulo().equalsIgnoreCase(titulo)){
                      verlivros.remove(a);
                      return true;
                  }
                  
              }
              return false;
          }
     static double analisedeestoque(){
         double total=0;
         for(Livros a : verlivros){
             total += a.getPreço();
             
         }
         
         return total;
     }     

    static void adicionar(Livraria nLivros) {
    
    }

    
        
    }

   
