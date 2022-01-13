package desafiodioPOO;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o do curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descri��o do curso JavaScript");
		curso2.setCargaHoraria(6);
		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descri��o mentoria Java");
		mentoria1.setData(LocalDate.now());
		

		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("Mentoria JavaScript");
		mentoria2.setDescricao("Descri��o mentoria JavaScript");
		mentoria2.setData(LocalDate.now());
			
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java Developer Bootcamp");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
	
		bootcamp.getConteudos().add(mentoria1);
	
		
		Devs dev = new Devs();
		dev.setNome("Phelipe");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Phelipe: " + dev.getConteudosIncritos());
		
		dev.progredir();
		dev.progredir();
		System.out.println("--");
		System.out.println("Conte�dos Inscritos Phelipe: " + dev.getConteudosIncritos());
		System.out.println("Conte�dos Conclu�dos Phelipe: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularTotalxp());
		
		System.out.println("---------------------------");
		
		Devs devAmigo = new Devs();
		devAmigo.setNome("Jo�o");
		devAmigo.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Jo�o: " + devAmigo.getConteudosIncritos());
		
		devAmigo.progredir();
		System.out.println("--");
		System.out.println("Conte�dos Inscritos Jo�o: " + devAmigo.getConteudosIncritos());
		System.out.println("Conte�dos Conclu�dos: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + devAmigo.calcularTotalxp());
		
	}

}
