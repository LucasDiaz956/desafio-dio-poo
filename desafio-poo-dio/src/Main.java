import br.Bootcamp;
import br.Curso;
import br.Dev;
import br.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descri��o curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descri��o curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descri��o mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAugusto = new Dev();
        devAugusto.setNome("Augusto");
        devAugusto.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Camila:" + devAugusto.getConteudosInscritos());
        devAugusto.progredir();
        devAugusto.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Camila:" + devAugusto.getConteudosInscritos());
        System.out.println("Conte�dos Conclu�dos Camila:" + devAugusto.getConteudosConcluidos());
        System.out.println("XP:" + devAugusto.calcularTotalXp());

        System.out.println("-------");

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Jessica:" + devJessica.getConteudosInscritos());
        devJessica.progredir();
        devJessica.progredir();
        devJessica.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Jo�o:" + devJessica.getConteudosInscritos());
        System.out.println("Conte�dos Concluidos Jo�o:" + devJessica.getConteudosConcluidos());
        System.out.println("XP:" + devJessica.calcularTotalXp());

    }

}