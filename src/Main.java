public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.exibirInformacoes();

        System.out.println();

        // Instanciando um objeto da classe Aluno
        Aluno aluno = new Aluno("Maria", 20, "20231234", "Engenharia");
        aluno.exibirInformacoes();

        System.out.println();

        // Instanciando um objeto da classe Funcionario
        Funcionario funcionario = new Funcionario("Carlos", 40, 5000.00, "Gerente");
        funcionario.exibirInformacoes();
    }
}

class Pessoas1 {
    private String nome;
    private int idade;

    public Pessoas1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Alunos extends Pessoa {
    private String matricula;
    private String curso;

    public Alunos(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}

class Funcionarios extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionarios(String nome, int idade, double salario, String cargo) {
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);
    }
}
