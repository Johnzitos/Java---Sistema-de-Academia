package academia;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<Academia> listaAcademias = new ArrayList<>();
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Sistema de Academias ===");
            System.out.println("1 - Cadastrar Academia");
            System.out.println("2 - Cadastrar Personal");
            System.out.println("3 - Cadastrar Recepcionista");
            System.out.println("4 - Cadastrar Aluno");
            System.out.println("5 - Realizar Matrícula");
            System.out.println("6 - Registrar Anotações da Matrícula");
            System.out.println("7 - Exibir Informações");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                leitor.nextLine();
                System.out.print("Nome da Academia: ");
                String nome = leitor.nextLine();
                System.out.print("Endereço: ");
                String endereco = leitor.nextLine();
                System.out.print("CNPJ: ");
                String cnpj = leitor.nextLine();
                listaAcademias.add(new Academia(nome, endereco, cnpj));
                System.out.println("Academia cadastrada com sucesso!");

            } else if (opcao == 2) {
                if (listaAcademias.isEmpty()) {
                    System.out.println("Erro: Nenhuma academia cadastrada.");
                } else {
                    leitor.nextLine();
                    System.out.print("Nome da Academia: ");
                    String nomeAcademia = leitor.nextLine();
                    Academia academiaEncontrada = null;
                    for (Academia a : listaAcademias) {
                        if (a.getNome().equals(nomeAcademia)) {
                            academiaEncontrada = a;
                            break;
                        }
                    }

                    if (academiaEncontrada == null) {
                        System.out.println("Erro: Academia não encontrada.");
                    } else {
                        System.out.print("Nome do Personal: ");
                        String nome = leitor.nextLine();
                        System.out.print("CPF: ");
                        String cpf = leitor.nextLine();
                        System.out.print("Telefone: ");
                        String tel = leitor.nextLine();
                        System.out.print("Salário: ");
                        double salario = leitor.nextDouble();
                        leitor.nextLine();
                        System.out.print("Horário de Início: ");
                        String hInicio = leitor.nextLine();
                        System.out.print("Horário de Fim: ");
                        String hFim = leitor.nextLine();
                        Personal novoPersonal = new Personal(salario, hInicio, hFim, nome, cpf, tel);
                        System.out.print("Quantas modalidades deseja cadastrar?: ");
                        int qtd = leitor.nextInt();
                        leitor.nextLine();
                        for (int i = 0; i < qtd; i++) {
                            System.out.print("Nome da Modalidade " + (i + 1) + ": ");
                            String nomeModal = leitor.nextLine();
                            System.out.print("Nível de Dificuldade: ");
                            int nivel = leitor.nextInt();
                            leitor.nextLine();
                            novoPersonal.adicionarModalidade(new Modalidade(nomeModal, nivel));
                        }
                        academiaEncontrada.cadastrarPersonal(novoPersonal);
                        System.out.println("Personal cadastrado com sucesso!");
                    }
                }

            } else if (opcao == 3) {
                if (listaAcademias.isEmpty()) {
                    System.out.println("Erro: Nenhuma academia cadastrada.");
                } else {
                    leitor.nextLine();
                    System.out.print("Nome da Academia: ");
                    String nomeAcademia = leitor.nextLine();
                    Academia academiaEncontrada = null;
                    for (Academia a : listaAcademias) {
                        if (a.getNome().equals(nomeAcademia)) {
                            academiaEncontrada = a;
                            break;
                        }
                    }

                    if (academiaEncontrada == null) {
                        System.out.println("Erro: Academia não encontrada.");
                    } else {
                        System.out.print("Nome do Recepcionista: ");
                        String nome = leitor.nextLine();
                        System.out.print("CPF: ");
                        String cpf = leitor.nextLine();
                        System.out.print("Telefone: ");
                        String tel = leitor.nextLine();
                        System.out.print("Salário: ");
                        double salario = leitor.nextDouble();
                        leitor.nextLine();
                        academiaEncontrada.cadastrarRecepcionista(new Recepcionista(salario, nome, cpf, tel));
                        System.out.println("Recepcionista cadastrado com sucesso!");
                    }
                }

            } else if (opcao == 4) {
                if (listaAcademias.isEmpty()) {
                    System.out.println("Erro: Nenhuma academia cadastrada.");
                } else {
                    leitor.nextLine();
                    System.out.print("Nome da Academia: ");
                    String nomeAcademia = leitor.nextLine();
                    Academia academiaEncontrada = null;
                    for (Academia a : listaAcademias) {
                        if (a.getNome().equals(nomeAcademia)) {
                            academiaEncontrada = a;
                            break;
                        }
                    }

                    if (academiaEncontrada == null) {
                        System.out.println("Erro: Academia não encontrada.");
                    } else {
                        System.out.print("Nome do Aluno: ");
                        String nome = leitor.nextLine();
                        System.out.print("CPF: ");
                        String cpf = leitor.nextLine();
                        System.out.print("Telefone: ");
                        String tel = leitor.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = leitor.nextLine();
                        System.out.print("Data de Nascimento: ");
                        String dtNasc = leitor.nextLine();
                        System.out.print("Objetivo: ");
                        String objetivo = leitor.nextLine();
                        Aluno novoAluno = new Aluno(endereco, dtNasc, objetivo, nome, cpf, tel);
                        listaAlunos.add(novoAluno);
                        academiaEncontrada.cadastrarAluno(novoAluno);
                        System.out.println("Aluno cadastrado com sucesso!");
                    }
                }

            } else if (opcao == 5) {
                if (listaAcademias.isEmpty() || listaAlunos.isEmpty()) {
                    System.out.println("Erro: Academia ou alunos não cadastrados.");
                } else {
                    leitor.nextLine();
                    System.out.print("Nome da Academia: ");
                    String nomeAcademia = leitor.nextLine();
                    Academia academiaEncontrada = null;
                    for (Academia a : listaAcademias) {
                        if (a.getNome().equals(nomeAcademia)) {
                            academiaEncontrada = a;
                            break;
                        }
                    }

                    if (academiaEncontrada == null || academiaEncontrada.getRecepcionistas().isEmpty()) {
                        System.out.println("Erro: Academia não encontrada ou sem recepcionistas.");
                    } else {
                        System.out.print("CPF do Aluno: ");
                        String cpfAluno = leitor.nextLine();
                        Aluno alunoEncontrado = academiaEncontrada.buscarAluno(cpfAluno);

                        System.out.print("CPF do Recepcionista: ");
                        String cpfRecep = leitor.nextLine();
                        Recepcionista recepEncontrado = null;
                        for (Recepcionista r : academiaEncontrada.getRecepcionistas()) {
                            if (r.getCPF().equals(cpfRecep)) {
                                recepEncontrado = r;
                                break;
                            }
                        }

                        if (alunoEncontrado == null || recepEncontrado == null) {
                            System.out.println("Erro: Aluno ou recepcionista não encontrado.");
                        } else {
                            System.out.print("Data de Início: ");
                            String data = leitor.nextLine();
                            System.out.println("Tipo: 1 - Plano | 2 - Avulso");
                            int tipo = leitor.nextInt();
                            leitor.nextLine();
                            String plano = null;
                            double valor = 0.0;
                            if (tipo == 1) {
                                System.out.print("Nome do Plano: ");
                                plano = leitor.nextLine();
                            } else {
                                System.out.print("Valor da Aula: ");
                                valor = leitor.nextDouble();
                                leitor.nextLine();
                            }
                            academiaEncontrada.realizarMatricula(alunoEncontrado, recepEncontrado, data, plano, valor);
                            System.out.println("Matrícula realizada com sucesso!");
                        }
                    }
                }

            } else if (opcao == 6) {
                if (listaAcademias.isEmpty()) {
                    System.out.println("Erro: Nenhuma academia cadastrada.");
                } else {
                    leitor.nextLine();
                    System.out.print("Nome da Academia: ");
                    String nomeAcademia = leitor.nextLine();
                    Academia academiaEncontrada = null;
                    for (Academia a : listaAcademias) {
                        if (a.getNome().equals(nomeAcademia)) {
                            academiaEncontrada = a;
                            break;
                        }
                    }

                    if (academiaEncontrada == null || academiaEncontrada.getMatriculas().isEmpty()) {
                        System.out.println("Erro: Academia não encontrada ou sem matrículas.");
                    } else {
                        System.out.print("CPF do Aluno: ");
                        String cpfAluno = leitor.nextLine();
                        Matricula matriculaEncontrada = null;
                        for (Matricula m : academiaEncontrada.getMatriculas()) {
                            if (m.getAluno().getCPF().equals(cpfAluno)) {
                                matriculaEncontrada = m;
                                break;
                            }
                        }

                        if (matriculaEncontrada == null) {
                            System.out.println("Erro: Matrícula não encontrada.");
                        } else {
                            System.out.print("Ficha de Treino: ");
                            matriculaEncontrada.registrarTreino(leitor.nextLine());
                            System.out.print("Evolução do Aluno: ");
                            matriculaEncontrada.registrarEvolucao(leitor.nextLine());
                            System.out.print("Observações Gerais: ");
                            matriculaEncontrada.registrarObservacoes(leitor.nextLine());
                            System.out.println("Anotações registradas com sucesso!");
                        }
                    }
                }

            } else if (opcao == 7) {
                System.out.println("\n1 - Informações de Personal");
                System.out.println("2 - Informações de Aluno");
                System.out.println("3 - Informações de Matrícula");
                System.out.print("Opção: ");
                int subOpcao = leitor.nextInt();
                leitor.nextLine();
                System.out.print("Nome da Academia: ");
                String nomeAcademia = leitor.nextLine();
                Academia academiaEncontrada = null;
                for (Academia a : listaAcademias) {
                    if (a.getNome().equals(nomeAcademia)) {
                        academiaEncontrada = a;
                        break;
                    }
                }

                if (academiaEncontrada == null) {
                    System.out.println("Erro: Academia não encontrada.");
                } else if (subOpcao == 1) {
                    System.out.print("CPF do Personal: ");
                    String cpf = leitor.nextLine();
                    for (Personal p : academiaEncontrada.getPersonais()) {
                        if (p.getCPF().equals(cpf)) {
                            p.getInfo();
                            break;
                        }
                    }
                } else if (subOpcao == 2) {
                    System.out.print("CPF do Aluno: ");
                    String cpf = leitor.nextLine();
                    Aluno a = academiaEncontrada.buscarAluno(cpf);
                    if (a != null) {
                        a.getInfo();
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                } else if (subOpcao == 3) {
                    if (academiaEncontrada.getMatriculas().isEmpty()) {
                        System.out.println("Nenhuma matrícula registrada.");
                    } else {
                        for (Matricula m : academiaEncontrada.getMatriculas()) {
                            m.getInfo();
                        }
                    }
                }
            }
        }
        System.out.println("Sistema encerrado.");
    }
}
