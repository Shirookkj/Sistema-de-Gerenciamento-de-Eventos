import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaEventos {
    private static List<Evento> eventos = new ArrayList<>();  

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean sair = false;
        
        while (!sair) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar Evento");
            System.out.println("2. Fazer Cadastro em um Evento");
            System.out.println("3. Cancelar Inscrição em um Evento");
            System.out.println("4. Verificar Lotação de um Evento");
            System.out.println("5. Gerar Relatório de Evento");
            System.out.println("6. Sair");

            int opcao = leitor.nextInt();
            leitor.nextLine(); 

            switch (opcao) {
                case 1:  
                    System.out.println("Digite o nome do evento que você deseja cadastrar:");
                    String nomeEvento = leitor.nextLine();
                    
                    System.out.println("Digite o local do evento:");
                    String nomeLocal = leitor.nextLine();
                    
                    System.out.println("Digite o endereço do local:");
                    String endereco = leitor.nextLine();
                    
                    System.out.println("Digite a capacidade máxima do local:");
                    int capacidade = leitor.nextInt();
                    leitor.nextLine();
                    
                    System.out.println("Digite a data do evento (ex: 10/10/2024):");
                    String data = leitor.nextLine();
                    
                    Local local = new Local(nomeLocal, endereco, capacidade);
                    Evento novoEvento = new Evento(nomeEvento, local, data);
                    eventos.add(novoEvento);
                    
                    System.out.println("Evento cadastrado com sucesso!");
                    break;

                case 2:  
                    if (eventos.isEmpty()) {
                        System.out.println("Não há eventos cadastrados.");
                        break;
                    }

                    System.out.println("Digite o nome do evento para cadastro:");
                    String eventoEscolhido = leitor.nextLine();
                    Evento eventoParaCadastro = buscarEventoPorNome(eventoEscolhido);

                    if (eventoParaCadastro == null) {
                        System.out.println("Evento não encontrado.");
                    } else {
                        System.out.println("Digite o seu nome:");
                        String nomeParticipante = leitor.nextLine();
                        
                        System.out.println("Digite o seu email:");
                        String emailParticipante = leitor.nextLine();
                        
                        Participante novoParticipante = new Participante(nomeParticipante, emailParticipante);
                        eventoParaCadastro.cadastrarParticipante(novoParticipante);
                        
                        System.out.println("Cadastro realizado com sucesso!");
                    }
                    break;

                case 3:  
                    if (eventos.isEmpty()) {
                        System.out.println("Não há eventos cadastrados.");
                        break;
                    }

                    System.out.println("Digite o nome do evento para cancelamento:");
                    String eventoCancelamento = leitor.nextLine();
                    Evento eventoParaCancelar = buscarEventoPorNome(eventoCancelamento);

                    if (eventoParaCancelar == null) {
                        System.out.println("Evento não encontrado.");
                    } else {
                        System.out.println("Digite o seu email para cancelar a sua inscrição:");
                        String emailCancelamento = leitor.nextLine();
                        eventoParaCancelar.cancelarInscricao(emailCancelamento);
                    }
                    break;

                case 4: 
                    if (eventos.isEmpty()) {
                        System.out.println("Não há eventos cadastrados.");
                        break;
                    }

                    System.out.println("Digite o nome do evento para verificar lotação:");
                    String eventoLotacao = leitor.nextLine();
                    Evento eventoParaVerificar = buscarEventoPorNome(eventoLotacao);

                    if (eventoParaVerificar == null) {
                        System.out.println("Evento não encontrado.");
                    } else {
                        if (eventoParaVerificar.verificarLotacao()) {
                            System.out.println("O evento está lotado. :(");
                        } else {
                            System.out.println("Ainda há vagas disponíveis! :)");
                        }
                    }
                    break;

                case 5:
                    if (eventos.isEmpty()) {
                        System.out.println("Não há eventos cadastrados.");
                        break;
                    }

                    System.out.println("Digite o nome do evento para gerar relatório:");
                    String eventoRelatorio = leitor.nextLine();
                    Evento eventoParaRelatorio = buscarEventoPorNome(eventoRelatorio);

                    if (eventoParaRelatorio == null) {
                        System.out.println("Evento não encontrado.");
                    } else {
                        eventoParaRelatorio.gerarRelatorio();
                    }
                    break;
                  

                case 6:
                    sair = true;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Método auxiliar para buscar evento por nome
    private static Evento buscarEventoPorNome(String nomeEvento) {
        for (Evento evento : eventos) {
            if (evento.getNomeEvento().equalsIgnoreCase(nomeEvento)) {
                return evento;
            }
        }
        return null;
    }
}