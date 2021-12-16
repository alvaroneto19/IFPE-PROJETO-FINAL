package biblioteca;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Biblioteca {

    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);    
    Scanner tecladoString = new Scanner(System.in);     
        /**Livros livro
                = new Livros();
        
        livro.setAutor("Alvaro");
        livro.setTitulo("A menina que roubava livros");
        livro.setTipo("Suspense");
        livro.setChave(10001);
        livro.setPreço(200);
        
        System.out.println(livro.toString());**/
        
   
        int cadastramento;
        double começo,fim;
        Livros nLivros;
        
        String titulo, autor, tipo;
        float preço;
        int chave;
        
        do{
            criarcadastramento();
            cadastramento = teclado.nextInt();
            switch(cadastramento){
                case 1:
                    System.out.println(">>>>>>> ADICIONAR OBRA <<<<<<");
                    System.out.print("titulo: ");
                    titulo=tecladoString.nextLine();
                    System.out.print("Autor: ");
                    autor=tecladoString.nextLine();
                    System.out.print("Tipo: ");
                    tipo=tecladoString.nextLine();
                    System.out.print("Preço: ");
                    preço=teclado.nextFloat();
                    System.out.print("Chave: ");
                    chave=teclado.nextInt();
                    
                    nLivros = new Livros(titulo,autor,tipo,preço,chave);
                   
                        Livraria.adicionar(nLivros);
                   
                  
                    
               
                    break;
                    
                case 2:
                    System.out.println(">>>>>> VERIFICAR OBRAS <<<<<<");
                    System.out.println("---Ver todos os livros----");
                    System.out.println(Livraria.ver());
                    break;
                case 3:
                    System.out.println(">>>>> REMOVER LIVRO <<<<<   ");
                    System.out.print("Titulo do livro: ");
                    titulo=tecladoString.nextLine();
                    if (! (Livraria.getverlivros().isEmpty())){
                        if (Livraria.retirar(titulo)){
                            System.out.println("Livro retirado");
                            
                        }else{
                            System.out.println("Esse Livro nao foi encontrado");
                        }
                    }else{
                        System.out.println(" Sem livros na livraria ");
                        
                    }
                    break;
                    
                    
                case 4:
                    System.out.println(">>>>> VER POR TIPO <<<<<");
                    System.out.println("Tipo do livro;"
                            + "");
                    tipo = tecladoString.nextLine();
                    System.out.println("Há "+Livraria.verificar(tipo)+ " livros(s) do mesmo tipo ");
                    
                    break;
                    
                case 5:
                    System.out.println(">>>>> VER MELHOR OPÇÃO DE PREÇO <<<<");
                    System.out.println("Faixa de preço: ");
                    começo=teclado.nextDouble();
                    fim=teclado.nextDouble();
                    System.out.println("Ha"+Livraria.verificar(começo,fim)
                            + "livros(S) com valores entre "
                            +String.format("R$ %.2f e R$ $.2.f",começo,fim));
                    
                    
                    break;
                    
                case 6:
                    System.out.println(">>>>Avalição de estoque da livraria do if<<<<");
                    System.out.println("Avaliado em: " + String.format("R$ %.2f",Livraria.analisedeestoque()));
                    
                    break;
                    
                case 7:
                    System.out.println(">>>Ate la<<<<");
                    System.out.println("Nos vemos em um novo ano");
                    break;
                    
                default:
                    System.out.println("Não pode***");
                         
                         
            }
        }while(cadastramento != 7);
        
        
       
        
    }
        
    
  
          static void criarcadastramento(){
              
              
         System.out.println("===========BIBLIOETECA IFPE============");
          System.out.println("1 - ADICIONAR");
           System.out.println("2 - VERIFICAR");
            System.out.println("3 - REMOVER LIVRO");
             System.out.println("4 - PESQUISAR POR TIPO ");
              System.out.println("5 - PESQUISAR POR PREÇO");
               System.out.println("6 - ANALISE DE ESTOQUE");
                System.out.println(" 7 - IR EMBORA DESTA FINAL QUE NÃO QUERO FICAR ");
                 System.out.println(">>>>>>> QUAL OPCAO?<<<<<");

          }


}     
             
