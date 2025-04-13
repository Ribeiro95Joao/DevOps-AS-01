public class aluno {
    private String name;
    private String CPF;
    private int matricula;

    public aluno(String name, String CPF, int matricula) {
        this.name = name;
        this.CPF = CPF;
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
