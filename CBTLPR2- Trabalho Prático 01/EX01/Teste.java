package EX01;

//@author Maria Eduarda Fodor CB3025063
//@author Pedro Xavier Oliveira CB3027376



public class Teste
{
    public static void main(String[] args) 
    {
        Author autor = new Author("Raphael Montes", "contatoraphaelmontes@gmail.com.", 'm');

        System.out.println(autor.toString());

        System.out.println("Nome: " + autor.getName());
        System.out.println("Email: " + autor.getEmail());
        System.out.println("Gênero: " + autor.getGender());

        autor.setEmail("RaphaMont@gmail.com.");
        System.out.println("Novo Email: " + autor.getEmail());
    }
}
