package desafiodioPOO;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição do curso JavaScript");
		curso2.setCargaHoraria(6);
		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		

		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("Mentoria JavaScript");
		mentoria2.setDescricao("Descrição mentoria JavaScript");
		mentoria2.setData(LocalDate.now());
			
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java Developer Bootcamp");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
	
		bootcamp.getConteudos().add(mentoria1);
	
		
		Devs dev = new Devs();
		dev.setNome("Phelipe");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Phelipe: " + dev.getConteudosIncritos());
		
		dev.progredir();
		dev.progredir();
		System.out.println("--");
		System.out.println("Conteúdos Inscritos Phelipe: " + dev.getConteudosIncritos());
		System.out.println("Conteúdos Concluídos Phelipe: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularTotalxp());
		
		System.out.println("---------------------------");
		
		Devs devAmigo = new Devs();
		devAmigo.setNome("João");
		devAmigo.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos João: " + devAmigo.getConteudosIncritos());
		
		devAmigo.progredir();
		System.out.println("--");
		System.out.println("Conteúdos Inscritos João: " + devAmigo.getConteudosIncritos());
		System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + devAmigo.calcularTotalxp());
		
	}

}
