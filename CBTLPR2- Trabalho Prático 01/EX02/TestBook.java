package EX02;

//@author Maria Eduarda Fodor CB3025063
//@author Pedro Xavier Oliveira CB3027376



import EX01.Author;

public class TestBook 
{
    public static void main(String[] args) 
    {
        // Criando dois autores para os testes
        Author author1 = new Author(" J.K. Rowling ", " jkrowling@example.com ", 'f');
        Author author2 = new Author(" Stephen King ", " sking@example.com ", 'm');
        Author[] authors = {author1, author2};


        // Testando o primeiro construtor (sem quantidade)
        Book book1 = new Book("Harry Potter", authors, 39.99);
        System.out.println(book1); // Deve chamar o método toString


        // Testando o segundo construtor (com quantidade)
        Book book2 = new Book("The Shining", authors, 49.99, 10);
        System.out.println(book2); // Deve chamar o método toString


        // Testando os Getters para book1
        System.out.println("Nome do livro: " + book1.getName());
        System.out.println("Preço do livro: " + book1.getPrice());
        System.out.println("Quantidade em estoque (default): " + book1.getQty());


        // Testando os Getters para book2
        System.out.println("Nome do livro: " + book2.getName());
        System.out.println("Preço do livro: " + book2.getPrice());
        System.out.println("Quantidade em estoque: " + book2.getQty());


        // Testando o Setter de preço
        book1.setPrice(29.99);
        System.out.println("Novo preço do livro Harry Potter: " + book1.getPrice());


        // Testando o Setter de quantidade
        book2.setQty(20);
        System.out.println("Nova quantidade de livros The Shining: " + book2.getQty());


        // Testando o método getAuthorNames
        System.out.println("Nomes dos autores: " + book1.getAuthorNames());
    }
}    
