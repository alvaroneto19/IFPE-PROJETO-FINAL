package biblioteca;


public class Livros extends Biblioteca{
    
    private String titulo;
    private String autor;
    private String tipo;
    private float preço;
    private int chave;
    
    public Livros(){}
    
    public Livros(String titulo,String autor,String tipo,float preço,float chave){
       this.titulo=titulo;
       this.autor=autor;
       this.tipo=tipo;
       this.preço=preço;
       this.chave=(int) chave; 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public int getChave() {
        return (int) chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
    
    
    //public void setpreço( float preço)//**
   
    {        
        //if (preço < 0)
           // this.preço = 0;
        //else
            //this.preço = preço;
        
    }

    public String colocar() {
        
        
        return "Titulo: " + titulo + "\nautor: " + autor + "\ntipo: " + tipo  + String.format("\npreço R$ %.2f: ",preço) + "\nchave" + chave;
    }
        
        
    
    


}
