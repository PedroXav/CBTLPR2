package EX03;

//@author Maria Eduarda Fodor CB3025063
//@author Pedro Xavier Oliveira CB3027376



public class TestStaff 
{
    public static void main(String[] args) 
    {
        // Testando o construtor e os getters
        Staff staff1 = new Staff("João Silva", "R. Estela, 64, Vila Mariana, São Paulo ", "Escola Belas Artes", 2500.00);

        System.out.println("Nome do(a) Funcionário(a): " + staff1.getName()); 
        System.out.println("Endereço do(a) Funcionário(a): " + staff1.getAddress()); 
        System.out.println("Escola do(a) Funcionário(a): " + staff1.getSchool()); 
        System.out.println("Salário do(a) Funcionário(a): " + staff1.getPay()); 

        // Testando os setters
        staff1.setSchool("Escola Méliès");
        staff1.setPay(3000.00);
        System.out.println("Nova Escola do(a) Funcionário(a): " + staff1.getSchool()); // Esperado: Escola ABC
        System.out.println("Novo Salário do(a) Funcionário(a): " + staff1.getPay()); // Esperado: 3000.00

        // Testando o método toString()
        System.out.println(staff1.toString());
      
    }
}

