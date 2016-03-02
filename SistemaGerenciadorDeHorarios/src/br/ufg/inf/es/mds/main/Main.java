package br.ufg.inf.es.mds.main;

import br.ufg.inf.es.mds.atendimento.Aluno;
import br.ufg.inf.es.mds.atendimento.Dia;
import br.ufg.inf.es.mds.disciplina.Disciplina;
import br.ufg.inf.es.mds.disciplina.ListaDisciplinas;
import br.ufg.inf.es.mds.professor.ListaProfessores;
import br.ufg.inf.es.mds.professor.Professor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        ListaProfessores listaProf = new ListaProfessores();
        ListaDisciplinas listaDisc = new ListaDisciplinas();
        Scanner leitor = new Scanner(System.in);

        int op = 0;
        int operacao = 0;
        int indice = 0;
        int flag = 1;

        do {

            System.out.println("\n======== SGA SISTEMAS ========");
            System.out.println("1 - Acessar como administrador");
            System.out.println("2 - Acessar como professor");
            System.out.println("3 - Acessar como aluno");
            System.out.println("0 - SAIR");
            System.out.println("================================");

            do {
                System.out.println("Opção:");
                try {
                    operacao = Integer.parseInt(leitor.nextLine());
                    flag = 1;
                } catch (Exception ex) {
                    flag = 0;
                    System.out.println("Opção inválida, tente novamente!");
                }
            } while ((operacao > 3) && (operacao < 0) || flag == 0);
            switch (operacao) {
                case 1: {
                    do {

                        System.out.println("");
                        System.out.println("===== MENU ADMINISTRADOR =====");
                        System.out.println("1 - Adicionar professor");
                        System.out.println("2 - Remover professor");
                        System.out.println("3 - Listar professores");
                        System.out.println("4 - Atualizar professor");
                        System.out.println("5 - Adicionar disciplina");
                        System.out.println("6 - Remover disciplina");
                        System.out.println("7 - Listar disciplinas");
                        System.out.println("8 - Atualizar disciplina");
                        System.out.println("0 - SAIR");
                        System.out.println("=============================");
                        do {
                            System.out.println("Opção:");
                            try {
                                op = Integer.parseInt(leitor.nextLine());
                                flag = 1;
                            } catch (Exception ex) {
                                flag = 0;
                                System.out.println("Opção inválida, tente "
                                        + "novamente!");
                            }
                        } while ((op > 8) && (op < 0) || flag == 0);
                        switch (op) {
                            case 1:
                                adicionarProfessor(leitor, listaProf);
                                break;
                            case 2:
                                removerProfessor(leitor, listaProf,
                                        listaDisc);
                                break;
                            case 3:
                                listarProfessores(leitor, listaProf);
                                break;
                            case 4:
                                atualizarProfessor(leitor, listaProf);
                                break;
                            case 5:
                                adicionarDisciplina(leitor, listaDisc,
                                        listaProf);
                                break;
                            case 6:
                                removerDisciplina(leitor, listaDisc);
                                break;
                            case 7:
                                listarDisciplinas(leitor, listaDisc);
                                break;
                            case 8:
                                atualizarDisciplina(leitor, listaDisc,
                                        listaProf);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("\nOpção não existente!");
                                break;
                        }
                    } while (op != 0);
                }
                break;
                case 2: {
                    do {
                        System.out.println("");
                        System.out.println("========== MENU PROFESSOR ==========");
                        System.out.println("1 - Adicionar horário de atendimento");
                        System.out.println("2 - Remover horário de atendimento");
                        System.out.println("3 - Listar horários de atendimento");
                        System.out.println("4 - Atualizar horário de atendimento");
                        System.out.println("5 - Consultar lista de alunos");
                        System.out.println("6 - Apagar lista de alunos");
                        System.out.println("7 - Consultar feedbacks");
                        System.out.println("0 - SAIR");
                        System.out.println("====================================");
                        do {
                            System.out.println("Opção:");
                            try {
                                op = Integer.parseInt(leitor.nextLine());
                                flag = 1;
                            } catch (Exception ex) {
                                flag = 0;
                                System.out.println("Opção inválida, "
                                        + "tente novamente!");
                            }
                        } while ((op > 7) && (op < 0) || flag == 0);
                        switch (op) {
                            case 1:
                                adicionarHorario(leitor, listaDisc);
                                break;
                            case 2:
                                removerHorario(leitor, listaDisc);
                                break;
                            case 3:
                                listarHorarios(leitor, listaDisc);
                                break;
                            case 4:
                                atualizarHorario(leitor, listaDisc);
                                break;
                            case 5:
                                consultarLista(leitor, listaDisc);
                                break;
                            case 6:
                                limparLista(leitor, listaDisc);
                                break;
                            case 7:
                                consultarFeedbacks(leitor, listaDisc);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("\nOpção não existente!");
                                break;
                        }
                    } while (op != 0);
                }
                break;
                case 3: {
                    do {
                        System.out.println("");
                        System.out.println("======== MENU ALUNO ========");
                        System.out.println("1 - Listar disciplinas");
                        System.out.println("2 - Listar professores");
                        System.out.println("3 - Listar horários");
                        System.out.println("4 - Escolhar horário");
                        System.out.println("5 - Cancelar horário");
                        System.out.println("6 - Enviar feedback");
                        System.out.println("0 - SAIR");
                        System.out.println("============================");
                        do {
                            System.out.println("Opção:");
                            try {
                                op = Integer.parseInt(leitor.nextLine());
                                flag = 1;
                            } catch (Exception ex) {
                                System.out.println("Opção inválida, tente"
                                        + " novamente!");
                                flag = 0;
                            }
                        } while ((op > 6) && (op < 0) || flag == 0);
                        switch (op) {
                            case 1:
                                listarDisciplinas(leitor, listaDisc);
                                break;
                            case 2:
                                listarProfessores(leitor, listaProf);
                                break;
                            case 3:
                                listarHorarios(leitor, listaDisc);
                                break;
                            case 4:
                                reservarHorario(leitor, listaDisc);
                                break;
                            case 5:
                                cancelarHorario(leitor, listaDisc);
                                break;
                            case 6:
                                enviarFeedback(leitor, listaDisc);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("\nOpção não existente!");
                                break;
                        }
                    } while (op != 0);
                }
                case 0:
                    break;
                default:
                    System.out.println("\nOpcao inválida!");
                    break;
            }
        } while (operacao != 0);
        System.out.println("\nOBRIGADO POR UTILIZAR NOSSO SOFTWARE!!!");
    }

    public static void adicionarProfessor(Scanner scanner,
            ListaProfessores listaProf) throws Exception {
        System.out.println("\nEntre com o nome do Professor:");
        String nome = scanner.nextLine();
        nome = nome.toUpperCase();
        System.out.println("\nEntre com o código do professor:");
        String cod = scanner.nextLine();
        try {
            Professor novoProfessor = new Professor(nome, cod);
            listaProf.adicionarProfessor(novoProfessor);
            System.out.println("\nProfessor adicionado com êxito!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void removerProfessor(Scanner leitor,
            ListaProfessores listaProf, ListaDisciplinas listaDisc)
            throws Exception {
        int existe = 0;
        if (listaProf.verificaListaVazia() == true) {
            System.out.println("\nNenhuma professor cadastrado");
        } else {
            System.out.println("\nDigite o codigo do professor a ser removido:");
            String codigo = leitor.nextLine();
            try {
                Professor professor = listaProf.getProfessorPeloCodigo(codigo);
                if (listaProf.existeProfessor(professor) && !listaDisc.
                        verificarVazio()) {
                    for (int i = 0; i < listaDisc.getSize(); i++) {
                        if (listaDisc.getDisciplina(i).getProfessor()
                                == professor) {
                            existe = 1;
                        }
                    }
                }
                if (existe == 0) {
                    try {
                        listaProf.removerProfessor(professor);
                        System.out.println("\nProfessor removido com êxito!");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                } else {
                    System.out.println("\nESTE PROFESSOR ESTA CADASTRADO EM UMA"
                            + " DISCIPLINA!!!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void atualizarProfessor(Scanner leitor,
            ListaProfessores listaProf) throws Exception {
        if (listaProf.verificaListaVazia() == true) {
            System.out.println("\nNenhuma professor cadastrada");
        } else {
            System.out.println("\nDigite o codigo do professor a ser "
                    + "atualizado");
            String codigo = leitor.nextLine();
            try {
                Professor professor = listaProf.getProfessorPeloCodigo(codigo);
                System.out.println("\nDigite o novo nome do professor:");
                String nome = leitor.nextLine();
                System.out.println("\nDigite o novo código do professor:");
                String cod = leitor.nextLine();
                listaProf.atualizaProfessor(professor, nome, cod);
                System.out.println("\nProfessor atualizado com êxito!");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    public static void listarProfessores(Scanner leitor,
            ListaProfessores listaProf) throws Exception {
        try {
            System.out.println("\n=== PROFESSORES CADASTRADOS ===\n");
            listaProf.listarProfessores();
            System.out.println("===============================");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void adicionarDisciplina(Scanner leitor,
            ListaDisciplinas listaDisc, ListaProfessores listaProf)
            throws Exception {
        int existe = 0;
        System.out.println("\nEntre com o nome da Disciplina:");
        String nome = leitor.nextLine();
        nome = nome.toUpperCase();
        System.out.println("\nEntre com o código da Disciplinar:");
        String codigo = leitor.nextLine();
        System.out.println("\nEntre com o código do Professor:");
        String codigoProfessor = leitor.nextLine();
        try {
            Professor professor = new Professor(codigoProfessor);
            if (!listaProf.verificaListaVazia()) {
                if (listaProf.existeProfessor(professor)) {
                    existe = 1;
                }
            }
            if (existe == 1) {

                try {
                    Professor professorAlvo = listaProf.
                            getProfessorPeloCodigo(codigoProfessor);
                    Disciplina novaDisciplina = new Disciplina(nome,
                            codigo, professorAlvo);
                    listaDisc.adicinarDisciplina(novaDisciplina);
                    System.out.println("\nDisciplina adicionada com êxito!");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                System.out.println("\nNÃO EXISTE PROFESSOR "
                        + "COM O CÓDIGO INFORMADO!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void listarDisciplinas(Scanner leitor,
            ListaDisciplinas listaDisc) throws Exception {
        try {
            System.out.println("\n=== DISCIPLINAS CADASTRADAS ===\n");
            listaDisc.listarDisciplinas();
            System.out.println("===============================");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void removerDisciplina(Scanner leitor,
            ListaDisciplinas listaDisc) throws Exception {
        if (listaDisc.verificarVazio() == true) {
            System.out.println("\nNenhuma disciplina cadastrada");
        } else {
            System.out.println("\nDigite o código da disciplina a ser "
                    + "removida");
            String codigo = leitor.nextLine();
            try {
                Disciplina disciplina = listaDisc.
                        getDisciplinaPeloCodigo(codigo);
                listaDisc.removerDisciplina(disciplina);
                System.out.println("\nDisciplina removida com êxito!");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void atualizarDisciplina(Scanner leitor,
            ListaDisciplinas listaDisc, ListaProfessores listaProf)
            throws Exception {
        if (listaDisc.verificarVazio() == true) {
            System.out.println("\nNenhuma disciplina cadastrada!");
        } else {
            System.out.println("\nDigite o código da disciplina que sera "
                    + "atualizada:");
            String codigo = leitor.nextLine();
            try {
                Disciplina disciplina = listaDisc.
                        getDisciplinaPeloCodigo(codigo);
                System.out.println("\nDigite o novo código da disciplina:");
                String codigoDisciplina = leitor.nextLine();
                System.out.println("\nDigite o novo nome da disciplina:");
                String nomeDisciplina = leitor.nextLine();
                System.out.println("\nDigite o código do novo professor da "
                        + "disciplina:");
                String codigoProfessor = leitor.nextLine();
                Professor professor = listaProf.
                        getProfessorPeloCodigo(codigoProfessor);
                listaDisc.atualizaDisciplina(disciplina, codigoDisciplina,
                        nomeDisciplina, professor);
                System.out.println("\nDisciplina atualizada com êxito!");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void adicionarHorario(Scanner leitor, ListaDisciplinas listaDisc) throws Exception {
        String diaSemana = null;
        Dia novoDia;
        System.out.println("\nEntre com o código da disciplina:");
        String codigoDisicplina = leitor.nextLine();
        try {
            Disciplina disciplina = listaDisc.
                    getDisciplinaPeloCodigo(codigoDisicplina);
            System.out.println("\nEscolha o dia da semana:\n");
            System.out.println("1 - Segunda-feira\n");
            System.out.println("2 - Terça-feira\n");
            System.out.println("3 - Quarta-feira\n");
            System.out.println("4 - Quinta-feira\n");
            System.out.println("5 - Sexta-feira\n");
            System.out.println("6 - Sábado\n");
            int dia = Integer.parseInt(leitor.nextLine());
            System.out.println("\nEntre com a hora de inicio: (hh) no formato "
                    + "24");
            int horaInicio = Integer.parseInt(leitor.nextLine());
            System.out.println("\nEntre com a hora de término: (hh) no formato "
                    + "24");
            int horaFim = Integer.parseInt(leitor.nextLine());
            switch (dia) {
                case 1:
                    diaSemana = "SEGUNDA-FEIRA";
                    break;
                case 2:
                    diaSemana = "TERÇA-FEIRA";
                    break;
                case 3:
                    diaSemana = "QUARTA-FEIRA";
                    break;
                case 4:
                    diaSemana = "QUINTA-FEIRA";
                    break;
                case 5:
                    diaSemana = "SEXTA-FEIRA";
                    break;
                case 6:
                    diaSemana = "SÁBADO";
                    break;
                default:
                    break;
            }
            try {
                if (disciplina.getDia(dia) != null) {
                    System.out.println("\nJÁ EXISTE UM HORARIO DEFINIDO"
                            + " PARA ESTE DIA!");
                } else {
                    novoDia = new Dia(diaSemana, horaInicio, horaFim);
                    try {
                        if (horaInicio < horaFim) {
                            disciplina.setDia(novoDia, dia);
                            System.out.println("\nOperação realizada com sucesso!");
                        } else {
                            System.out.println("\nHora de início deve ser "
                                    + "maior que a hora de término!");
                        }
                    } catch (Exception exx) {
                        System.out.println(exx.getMessage());
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void removerHorario(Scanner leitor, ListaDisciplinas listaDisc) throws Exception {
        //String diaSemana = null;
        int existe = 0;
        System.out.println("\nEntre com o código da disciplina:");
        String codigoDisicplina = leitor.nextLine();
        try {
            Disciplina disciplina = new Disciplina(codigoDisicplina);
            if (listaDisc.existeDisciplina(disciplina)) {
                existe = 1;
            }
            if (existe == 1) {
                disciplina = listaDisc.
                        getDisciplinaPeloCodigo(codigoDisicplina);
                System.out.println("\nEscolha o dia da semana:\n");
                System.out.println("1 - Segunda-feira\n");
                System.out.println("2 - Terça-feira\n");
                System.out.println("3 - Quarta-feira\n");
                System.out.println("4 - Quinta-feira\n");
                System.out.println("5 - Sexta-feira\n");
                System.out.println("6 - Sábado");
                int dia = Integer.parseInt(leitor.nextLine());
                /*switch (dia) {
                    case 1:
                        diaSemana = "SEGUNDA-FEIRA";
                        break;
                    case 2:
                        diaSemana = "TERÇA-FEIRA";
                        break;
                    case 3:
                        diaSemana = "QUARTA-FEIRA";
                        break;
                    case 4:
                        diaSemana = "QUINTA-FEIRA";
                        break;
                    case 5:
                        diaSemana = "SEXTA-FEIRA";
                        break;
                    case 6:
                        diaSemana = "SÁBADO";
                        break;
                    default:
                        break;
                }*/
                try {
                    if (disciplina.getDia(dia) != null) {
                        disciplina.reset(dia);
                        System.out.println("\nOperação realizada com sucesso!");
                    } else {
                        System.out.println("\nNÃO EXISTE HORÁRIO DEFINIDO "
                                + "NESTE DIA!");
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                System.out.println("\nCódigo de disciplina inválido!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void listarHorarios(Scanner leitor,
            ListaDisciplinas listaDisc) throws Exception {
        int existe = 0;
        int contador = 0;
        System.out.println("\nEntre com o código da disciplina:");
        String codigoDisciplina = leitor.nextLine();
        try {
            Disciplina disciplina = new Disciplina(codigoDisciplina);
            if (listaDisc.existeDisciplina(disciplina)) {
                existe = 1;
            }
            if (existe == 1) {
                disciplina = listaDisc.
                        getDisciplinaPeloCodigo(codigoDisciplina);
                for (int flag = 1; flag <= 6; flag++) {
                    if (disciplina.getDia(flag) != null) {
                        contador++;
                        System.out.println("\n"
                                + disciplina.getDia(flag).getDiaDaSemana()
                                + "\nHora de Início: "
                                + disciplina.getDia(flag).
                                getHoraInicio() + ":00"
                                + "\nHora do Término: "
                                + disciplina.getDia(flag).
                                getHoraFim() + ":00"
                        );

                    }
                }

            } else {
                System.out.println("\nCódigo de professor inválido!");
            }
            if (contador == 0) {
                System.out.println("\nNenhum horário definido!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void atualizarHorario(Scanner leitor, ListaDisciplinas listaDisc) throws Exception {
        //Dia novoDia;
        //String diaSemana = null;
        int existe = 0;
        System.out.println("\nEntre com o código da disicplina:");
        String codigoDisciplina = leitor.nextLine();
        try {
            Disciplina disciplina = new Disciplina(codigoDisciplina);
            if (listaDisc.existeDisciplina(disciplina)) {
                existe = 1;
            }
            if (existe == 1) {
                disciplina = listaDisc.
                        getDisciplinaPeloCodigo(codigoDisciplina);
                System.out.println("\nEscolha o dia da semana:\n");
                System.out.println("1 - Segunda-feira\n");
                System.out.println("2 - Terça-feira\n");
                System.out.println("3 - Quarta-feira\n");
                System.out.println("4 - Quinta-feira\n");
                System.out.println("5 - Sexta-feira\n");
                System.out.println("6 - Sábado\n");
                int dia = Integer.parseInt(leitor.nextLine());
                System.out.println("\nEntre com a hora de inicio: (hh)");
                int horaInicio = Integer.parseInt(leitor.nextLine());
                System.out.println("\nEntre com a hora de término: (hh)");
                int horaFim = Integer.parseInt(leitor.nextLine());
                /*switch (dia) {
                    case 1:
                        diaSemana = "SEGUNDA-FEIRA";
                        break;
                    case 2:
                        diaSemana = "TERÇA-FEIRA";
                        break;
                    case 3:
                        diaSemana = "QUARTA-FEIRA";
                        break;
                    case 4:
                        diaSemana = "QUINTA-FEIRA";
                        break;
                    case 5:
                        diaSemana = "SEXTA-FEIRA";
                        break;
                    case 6:
                        diaSemana = "SÁBADO";
                        break;
                    default:
                        break;
                }*/
                try {
                    if (disciplina.getDia(dia) == null) {
                        System.out.println("\nNÃO EXISTE UM HORÁRIO DEFINIDO"
                                + " PARA ESTE DIA!");
                        //novoDia = new Dia(diaSemana, horaInicio, horaFim);
                        //disciplina.setDia(novoDia, dia);
                    } else {
                        Dia novoHorario = disciplina.getDia(dia);
                        disciplina.setDiaaa(novoHorario, horaInicio, horaFim);
                        System.out.println("\nOperação realizada com sucesso!");
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                System.out.println("\nCódigo da disciplina inválido!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void consultarLista(Scanner leitor,
            ListaDisciplinas listaDisc) throws Exception {
        System.out.println("\nEntre com o código da disciplina:");
        String codigoDisciplina = leitor.nextLine();
        try {
            Disciplina disciplina = listaDisc.
                    getDisciplinaPeloCodigo(codigoDisciplina);
            System.out.println("\nEscolha o dia da semana:\n");
            System.out.println("1 - Segunda-feira\n");
            System.out.println("2 - Terça-feira\n");
            System.out.println("3 - Quarta-feira\n");
            System.out.println("4 - Quinta-feira\n");
            System.out.println("5 - Sexta-feira\n");
            System.out.println("6 - Sábado\n");
            int dia = Integer.parseInt(leitor.nextLine());
            try {
                if (disciplina.getDia(dia) == null) {
                    System.out.println("\nNÃO EXISTE UM HORÁRIO DEFINIDO"
                            + " PARA ESTE DIA!");
                } else {
                    int horaInicio = disciplina.getDia(dia).getHoraInicio();
                    int horaFim = disciplina.getDia(dia).getHoraFim();
                    System.out.println("\n");
                    disciplina.getDia(dia).listarAlunos(horaInicio, horaFim);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void limparLista(Scanner leitor, ListaDisciplinas listaDisc)
            throws Exception {
        System.out.println("\nRecomenda-se fazer o reset da lista todo fim de "
                + "semana, sábado aós os atendimentos ou durante o domingo.");
        System.out.println("\nEntre o código da disciplina:");
        String codigoDisciplina = leitor.nextLine();
        try {
            Disciplina disciplina = listaDisc.
                    getDisciplinaPeloCodigo(codigoDisciplina);
            System.out.println("\nEscolha o dia da semana:\n");
            System.out.println("1 - Segunda-feira\n");
            System.out.println("2 - Terça-feira\n");
            System.out.println("3 - Quarta-feira\n");
            System.out.println("4 - Quinta-feira\n");
            System.out.println("5 - Sexta-feira\n");
            System.out.println("6 - Sábado\n");
            int dia = Integer.parseInt(leitor.nextLine());
            try {
                if (disciplina.getDia(dia) != null) {
                    disciplina.getDia(dia).limparListaDeAlunos();
                    System.out.println("\nOperação realizada com sucesso!");
                } else {
                    System.out.println("\nNÃO EXISTE UM HORÁRIO DEFINIDO"
                            + " PARA ESTE DIA!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void reservarHorario(Scanner leitor,
            ListaDisciplinas listaDisc) throws Exception {
        System.out.println("\nEntre com o código da disciplina:");
        String codigoDisciplina = leitor.nextLine();
        try {
            Disciplina disciplina = listaDisc.
                    getDisciplinaPeloCodigo(codigoDisciplina);
            System.out.println("\nEscolha o dia da semana:\n");
            System.out.println("1 - Segunda-feira\n");
            System.out.println("2 - Terça-feira\n");
            System.out.println("3 - Quarta-feira\n");
            System.out.println("4 - Quinta-feira\n");
            System.out.println("5 - Sexta-feira\n");
            System.out.println("6 - Sábado\n");
            int dia = Integer.parseInt(leitor.nextLine());
            System.out.println("\nEntre com seu nome:");
            String nome = leitor.nextLine();
            try {
                nome = nome.toUpperCase();
                if (disciplina.getDia(dia) == null) {
                    System.out.println("\nNÃO EXISTE HORÁRIO DEFINIDO PARA "
                            + "ESTE DIA");
                } else {
                    Aluno aluno = new Aluno(nome);
                    disciplina.getDia(dia).adicionarAluno(aluno);
                    System.out.println("\nOperação realizada com sucesso!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void cancelarHorario(Scanner leitor,
            ListaDisciplinas listaDisc) throws Exception {
        System.out.println("\nEntre com o código da disciplina:");
        String codigoDisciplina = leitor.nextLine();
        try {
            Disciplina disciplina = listaDisc.
                    getDisciplinaPeloCodigo(codigoDisciplina);
            System.out.println("\nEscolha o dia da semana:\n");
            System.out.println("1 - Segunda-feira\n");
            System.out.println("2 - Terça-feira\n");
            System.out.println("3 - Quarta-feira\n");
            System.out.println("4 - Quinta-feira\n");
            System.out.println("5 - Sexta-feira\n");
            System.out.println("6 - Sábado\n");
            int dia = Integer.parseInt(leitor.nextLine());
            System.out.println("\nEntre com seu nome:");
            String nome = leitor.nextLine();
            try {
                nome = nome.toUpperCase();
                Aluno aluno = disciplina.getDia(dia).getAlunoPeloNome(nome);
                if (disciplina.getDia(dia) == null) {
                    System.out.println("\nNÃO EXISTE HORÁRIO DEFINIDO PARA "
                            + "ESTE DIA");
                } else {
                    disciplina.getDia(dia).removerAluno(aluno);
                    System.out.println("\nOperação realizada com sucesso!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void enviarFeedback(Scanner leitor,
            ListaDisciplinas listaDisc) {
        System.out.println("\nEntre com o código da disciplina:");
        String codigoDisciplina = leitor.nextLine();
        try {
            Disciplina disciplina = listaDisc.
                    getDisciplinaPeloCodigo(codigoDisciplina);
            System.out.println("\nEscolha o dia da semana:\n");
            System.out.println("1 - Segunda-feira\n");
            System.out.println("2 - Terça-feira\n");
            System.out.println("3 - Quarta-feira\n");
            System.out.println("4 - Quinta-feira\n");
            System.out.println("5 - Sexta-feira\n");
            System.out.println("6 - Sábado\n");
            int dia = Integer.parseInt(leitor.nextLine());
            System.out.println("\nEntre com seu nome:");
            String nome = leitor.nextLine();
            System.out.println("\nEntre com seu feedback:");
            String feedback = leitor.nextLine();
            try {
                nome = nome.toUpperCase();
                if (disciplina.getDia(dia) == null) {
                    System.out.println("\nNÃO EXISTE HORÁRIO DEFINIDO PARA "
                            + "ESTE DIA");
                } else {
                    Aluno alunoAlvo = disciplina.getDia(dia).
                            getAlunoPeloNome(nome);
                    alunoAlvo.setFeedBack(feedback);
                    System.out.println("\nOperação realizada com sucesso!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void consultarFeedbacks(Scanner leitor,
            ListaDisciplinas listaDisc) {
        System.out.println("\nEntre com o código da disciplina:");
        String codigoDisciplina = leitor.nextLine();
        try {
            Disciplina disciplina = listaDisc.
                    getDisciplinaPeloCodigo(codigoDisciplina);
            System.out.println("\nEscolha o dia da semana:\n");
            System.out.println("1 - Segunda-feira\n");
            System.out.println("2 - Terça-feira\n");
            System.out.println("3 - Quarta-feira\n");
            System.out.println("4 - Quinta-feira\n");
            System.out.println("5 - Sexta-feira\n");
            System.out.println("6 - Sábado\n");
            int dia = Integer.parseInt(leitor.nextLine());
            try {
                if (disciplina.getDia(dia) == null) {
                    System.out.println("\nNÃO EXISTE UM HORÁRIO DEFINIDO"
                            + " PARA ESTE DIA!");
                } else {
                    int horaInicio = disciplina.getDia(dia).getHoraInicio();
                    int horaFim = disciplina.getDia(dia).getHoraFim();
                    System.out.println("\n");
                    disciplina.getDia(dia).listarFeesbacks(horaInicio, horaFim);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
