import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Lesson;
import br.com.dio.desafio.dominio.Mentoring;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course();
        course1.setTitle("java basico");
        course1.setDescription("descricao 1");
        course1.setLessons(new Lesson(3, "Aula 1", 40), new Lesson(2.5, "Aula 2", 40), new Lesson(4, "Aula 3", 50));

        Course course2 = new Course();
        course2.setTitle("git basico");
        course2.setDescription("descricao 2");
        course2.setLessons(new Lesson(4, "Aula 1", 40), new Lesson(4, "Aula 2", 50), new Lesson(2, "Aula 3", 60));

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("desenvolvimento de projetos");
        mentoring1.setDescription("descricao 2");

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setName("Bootcamp java");
        bootcamp1.setDescription("");
        bootcamp1.setContents(course1);
        bootcamp1.setContents(course1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setName("Bootcamp java");
        bootcamp2.setDescription("");
        bootcamp2.setContents(course1);
        bootcamp2.setContents(course1);

        Dev dev1 = new Dev();
        dev1.setName("Eduardo");
        dev1.subscribeBootcamp(bootcamp1);
        dev1.subscribeBootcamp(bootcamp2);
        System.out.println("\n"+dev1);
        
        dev1.progress();
        dev1.progress();
        dev1.progress();

        Dev dev2 = new Dev();
        dev2.setName("Beatriz");
        dev2.subscribeBootcamp(bootcamp2);
        System.out.println("\n"+dev2);
        
        dev2.progress();
        dev2.progress();

        System.out.println("-----------Status Final-------------");
        System.out.println("\n"+dev1);
        System.out.println("\n"+dev2);

    }
}
