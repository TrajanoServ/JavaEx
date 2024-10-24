package Ex22a25;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis", "Brasileiro");
        Autor autor2 = new Autor("Clarice Lispector", "Brasileira");
        Autor autor3 = new Autor("J.K. Rowling", "Britânica");

        Editora editora1 = new Editora("Companhia das Letras", "Rua X, 123", "12.345.678/0001-99");
        Editora editora2 = new Editora("Editora Record", "Avenida Y, 456", "98.765.432/0001-88");
        Editora editora3 = new Editora("Bloomsbury Publishing", "Rua Z, 789", "56.789.123/0001-77");

        Livro livro1 = new Livro("Dom Casmurro", 1899, autor1, editora1);
        Livro livro2 = new Livro("A Hora da Estrela", 1977, autor2, editora2);
        Livro livro3 = new Livro("Harry Potter e a Pedra Filosofal", 1997, autor3, editora3);

        System.out.println("---- Detalhes dos Livros ----");
        exibirLivro(livro1);
        exibirLivro(livro2);
        exibirLivro(livro3);
    }

    public static void exibirLivro(Livro livro) {
        System.out.println("Título: " + livro.getNome());
        System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
        System.out.println("Autor: " + livro.getAutor().getNome() + " (" + livro.getAutor().getNacionalidade() + ")");
        System.out.println("Editora: " + livro.getEditora().getNome() + " - CNPJ: " + livro.getEditora().getCnpj());
        System.out.println("------------------------");
    }
}


