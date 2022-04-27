import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscriverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("----------");

        Dev devDanilo = new Dev();
        devDanilo.setNome("Danilo");
        devDanilo.inscriverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Danilo:" + devDanilo.getConteudosInscritos());
        devDanilo.progredir();
        devDanilo.progredir();
        devDanilo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Danilo:" + devDanilo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Danilo:" + devDanilo.getConteudosConcluidos());
        System.out.println("XP:" + devDanilo.calcularTotalXp());

    }
}
