package EX03;

//@author Maria Eduarda Fodor CB3025063
//@author Pedro Xavier Oliveira CB3027376



public class TestStudent 
{

    public static void main(String[] args) 
    {
        // Testando o construtor e os getters
        Student student1 = new Student("Maria Souza", "Avenida Doutor Antônio Severiano", "Engenharia", 2023, 5000.00);
        System.out.println("Nome do(a) Estudante: " + student1.getName()); 
        System.out.println("Endereço do(a) Estudante: " + student1.getAddress()); 
        System.out.println("Programa do(a) Estudante: " + student1.getProgram());
        System.out.println("Ano do(a) Estudante: " + student1.getYear()); 
        System.out.println("Taxa do(a) Estudante: " + student1.getFee()); 

        // Testando os setters
        student1.setProgram("Ciência da Computação");
        student1.setYear(2024);
        student1.setFee(5500.00);
        System.out.println("Novo Programa do(a) Estudante: " + student1.getProgram()); 
        System.out.println("Novo Ano do(a) Estudante: " + student1.getYear()); 
        System.out.println("Nova Taxa do(a) Estudante: " + student1.getFee()); 

        // Testando o método toString()
        System.out.println(student1.toString());
        
    }
}
