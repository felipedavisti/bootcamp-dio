import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 =  new Curso();
        curso1.setTitulo("Curso JavaEE");
        curso1.setDescricao("Descricao Curso Java para Iniciantes");
        curso1.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java POO");
        mentoria.setDescricao("Descrição de mentoria javaPOO");

        Curso curso2 =  new Curso();
        curso2.setTitulo("Curso JAVA");
        curso2.setDescricao("Descricao Curso JAVA Avançado");
        curso2.setCargaHoraria(4);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso2);


        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+ devFelipe.getNome() + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        System.out.println("Conteudos concluidos: "+ devFelipe.getNome() + devFelipe.getConteudosConcluidos());
        System.out.println("XP " + devFelipe.calcularTotalXp());

        System.out.println();
        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+ devJose.getNome() + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println("-----------");

        System.out.println("Conteudos inscritos: "+ devJose.getNome() + devJose.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+ devJose.getNome() + devJose.getConteudosConcluidos());





    }//fim do metodo main
}
