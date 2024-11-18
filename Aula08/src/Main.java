import model.*;
import enums.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instancias
        Paciente pacienteMedico = new Paciente("Ana Beatriz", 32, "Pressão baixa");
        Medico medico = new Medico("Júlio Belmiro", 35, Especializacao.CARDIOLOGISTA);
        Consulta consultaMedica = new Consulta(LocalDate.of(2024,12,05),
                medico, pacienteMedico, medico.getEspecializacao(), pacienteMedico.getCondicao());
        Paciente pacienteEnfermagem = new Paciente("Raíssa Cunha", 32, "Dançou muito e cansou");
        Enfermeiro enfermeiro = new Enfermeiro("Rita de Cássia", 62);
        Consulta consultaEnfermagem = new Consulta(LocalDate.of(2024,12,01),
                enfermeiro, pacienteEnfermagem, null, pacienteEnfermagem.getCondicao());

        System.out.println("--------------------------CONSULTA MÉDICA------------------------------");
        System.out.println(consultaMedica);
        System.out.println("------------------------CONSULTA ENFERMAGEM----------------------------");
        System.out.println(consultaEnfermagem);
        System.out.println("-----------------------------------------------------------------------");

    }
}