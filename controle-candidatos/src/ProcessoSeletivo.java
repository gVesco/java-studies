import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE", "JOAO", "MARIA", "JOSE", "ANA", "PEDRO", "PAULO", "LUCAS", "MARCOS", "MATEUS"};
        for(String candidato : candidatos) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        }
        
        selecaoCandidatos();

        imprimirSelecionados();

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("O candidato " + candidato + " atendeu a ligação");
            }

        } while(continuarTentando && tentativasRealizadas < 3);
    }

    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }


    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "ANA", "PEDRO", "PAULO", "LUCAS"};

        System.out.println("Imprimindo a lista de candidatos informando o indice:");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato " + (indice+1) + " foi selecionado para a vaga");
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        }



    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "JOAO", "MARIA", "JOSE", "ANA", "PEDRO", "PAULO", "LUCAS", "MARCOS", "MATEUS"};
        
        int candadidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while(candadidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " pretende ganhar " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candadidatosSelecionados++;
            }

            candidatoAtual++;
        }
    
    
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

}
