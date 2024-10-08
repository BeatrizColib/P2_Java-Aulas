import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String continuar;
        Scanner sc = new Scanner(System.in); //int
        Scanner scanner = new Scanner(System.in); //Strings
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        do {
            System.out.println("---Olá, bem-vindo/a!---");
            System.out.print("Menu de opções:" +
                    "\n Cadastrar aluno (digite 1)" +
                    "\n Cadastrar professor (digite 2)" +
                    "\n Cadastrar coordenador (digite 3)" +
                    "\n Opção: ");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    String continuarAluno;
                    do {
                        aluno = new Aluno(); // Cria um novo aluno a cada loop

                        System.out.println("---------CADASTRO DE ALUNO/A-------");
                        System.out.print("Qual nome: ");
                        aluno.setNome(scanner.nextLine());
                        System.out.print("Qual a idade: ");
                        aluno.setIdade(sc.nextInt());
                        System.out.print("Qual a matrícula: ");
                        aluno.setMatricula(sc.nextInt());
                        System.out.print("Qual CPF: ");
                        aluno.setCpf(scanner.nextLine());
                        System.out.print("Qual RG: ");
                        aluno.setRg(scanner.nextLine());
                        System.out.print("Qual telefone com DDD: ");
                        aluno.setTel(scanner.nextLine());

                        System.out.println("------Dados do Aluno/a------");
                        System.out.println("-> Nome: " + aluno.getNome() +
                                "\n-> Idade: " + aluno.getIdade() +
                                "\n-> Matrícula: " + aluno.getMatricula() +
                                "\n-> CPF: " + aluno.getCpf() +
                                "\n-> RG: " + aluno.getRg() +
                                "\n-> Telefone: " + aluno.getTel());

                        System.out.print("Deseja cadastrar as notas do/a aluno/a? Sim (S) ou Não (N): ");
                        String cadastrar_nota = scanner.nextLine(); //declaro a variável e já jogo o scanner
                        if (cadastrar_nota.equalsIgnoreCase("S")) {
                            System.out.println("Quais as notas do/a aluno/a: ");
                            System.out.print("Nota 1 (0 a 100): ");
                            aluno.setNota_01(sc.nextInt());
                            System.out.print("Nota 2 (0 a 100): ");
                            aluno.setNota_02(sc.nextInt());
                            System.out.print("Nota 3 (0 a 100): ");
                            aluno.setNota_03(sc.nextInt());
                            aluno.calcularMedia();
                            aluno.verificarSituacao();
                            System.out.printf("As notas do/a aluno/a: %s são: %.1f / %.1f / %.1f\n",
                                    aluno.getNome(),
                                    aluno.getNota_01(),
                                    aluno.getNota_02(),
                                    aluno.getNota_03());
                            System.out.printf("Média: %.1f. Situação: %s\n",
                                    aluno.getMedia(),
                                    aluno.getSituacao());
                        }
                        System.out.println("Deseja cadastrar outro aluno? Sim (S) ou Não (N): ");
                        continuarAluno = scanner.nextLine();
                    } while (continuarAluno.equalsIgnoreCase("S")); //continua a cadastrar aluno enquanto quis
                    break;
                case 2:
                    String continuarProfessor;
                    do {
                        professor = new Professor();

                        System.out.println("-------CADASTRO DE PROFESSOR/A------");
                        System.out.print("Nome: ");
                        professor.setNome(scanner.nextLine());
                        System.out.print("Idade: ");
                        professor.setIdade(sc.nextInt());
                        System.out.print("Matricula: ");
                        professor.setMatricula(sc.nextInt());
                        System.out.print("CPF: ");
                        professor.setCpf(scanner.nextLine());
                        System.out.print("RG: ");
                        professor.setRg(scanner.nextLine());
                        System.out.print("Telefone: ");
                        professor.setTel(scanner.nextLine());
                        System.out.print("Quantas horas aulas são ministradas: ");
                        professor.setHoras_ministradas(sc.nextInt());
                        System.out.print("Qual o valor da hora aula: R$ ");
                        professor.setValor_hora(sc.nextInt());
                        professor.calcularSalario();

                        System.out.println("-------Dados do/a Professor/a-------");
                        System.out.println("-> Nome: " + professor.getNome() +
                                "\n-> Idade: " + professor.getIdade() +
                                "\n-> Matrícula: " + professor.getMatricula() +
                                "\n-> CPF: " + professor.getCpf() +
                                "\n-> RG: " + professor.getRg() +
                                "\n-> Telefone: " + professor.getTel() +
                                "\n----------SALÁRIO---------" +
                                "\n-> Horas ministradas: " + professor.getHoras_ministradas() +
                                "\n-> Valor da hora aula: R$ " + professor.getValor_hora() +
                                "\n----> Salário: R$ " + professor.getSalario());

                        System.out.print("Deseja cadastrar outro/a professor/a? Sim (S) ou Não (N): ");
                        continuarProfessor = scanner.nextLine();
                    } while (continuarProfessor.equalsIgnoreCase("S"));
                    break;

                case 3:
                    String continuarCoordenador;
                    do{
                        System.out.println("------CADASTRO DE COORDENADOR/A-----");
                        System.out.print("Nome: ");
                        String nomeCoordenador = scanner.nextLine(); //primeiro captura o nome corretamente
                        System.out.print("Matrícula: ");
                        int matriculaCoordenador = sc.nextInt();

                        Coordenador coordenador = new Coordenador(nomeCoordenador, matriculaCoordenador);

                        System.out.println("----Dados do/a Coordenador/a----");
                        System.out.println("-> Nome; "+ coordenador.getNome() +
                                "\n-> Matrícula: "+ coordenador.getMatricula());

                        System.out.println("Deseja cadastrar mais um/a coordenador/a? Sim (S) ou Não (N): ");
                        continuarCoordenador = scanner.nextLine();
                    } while (continuarCoordenador.equalsIgnoreCase("S"));
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println("Deseja voltar ao menu principal? Sim (S) ou Não (N): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("S"));
        System.out.println("-----------ENCERRADO-------------");
        sc.close();
        scanner.close();
    }
}


