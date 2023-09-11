public class Ebook extends Livro{

  public String formato;

  public Ebook (String titulo, String autor, String formato){
    super(titulo, autor);
    this.formato = formato;
  }
  
}
