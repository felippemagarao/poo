public class Livro {

    public String titulo;
    public String autor;
    public boolean disponivel;
    public boolean reservado;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        this.reservado = false;
    }

    public String Titulo(){
        return titulo;
    }

    public String Autor(){
        return autor;
    }

    public boolean Disponivel(){
        return disponivel;

    }

    public boolean Reservado(){
        return reservado;

    }

    public static void main(String[] args) {
        LivroFisico livro1 = new LivroFisico ("Aventuras em Java", "Jão Autor");

        Ebook ebook1 = new Ebook("Programação Java Avançada", "João Autor", "PDF");

        livro1.emprestar() {
            System.out.println("O livro precisa ser reservado primeiro!");
        }
        
        livro1.reservar(){
            if (disponível && reservado){
                reservado = true;
                System.out.println ("O livro " + titulo " foi reservado com sucesso!");
            } else if (disponivel && reservado) {
                System.out.println("Livro já reservado: " + título);
            
            } else {
                System.out.println("O livro " + título " não está disponível para reserva.");
            }
        }

        ebook1.reservar();
            if (disponível && reservado){
                reservado = true;
                System.out.println ("O livro " + titulo " foi reservado com sucesso!");
            } else if (disponivel && reservado) {
                System.out.println("O livro " + título " já foi reservado.");
            
            } else {
                System.out.println("O livro " + título " não está disponível para reserva.");
            }
        }

        ebook1.cancelarReserva(){
            if (reservado){
                reservado = false;
                System.out.println("Reserva " + titulo + " cancelada com sucesso.")
            }
            else {
                System.out.println("Não há reserva para cancelar.");

            }
        }
        
        livro1.emprestar(){
            if (disponível && !reservado){
                System.out.println("Este livro já foi emprestado.");
            }
            else if (!disponivel && reservado){
                disponivel = false;
                reservado = false;
                System.out.println("Livro foi emprestado com sucesso.")
            }
            else {
                System.out.println("O livro precisa ser reservado antes do emprestimo.")
            }
        };


        livro.devolver(){
            if (!disponivel){
                disponivel = true;
                System.out.println("Livro devolvido com sucesso.")
            }

            else {
                System.out.println("O livro " + titulo + " disponível.")
            }
        }

