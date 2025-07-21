import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoring;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Course course1 = new Course();
        course1.setTitle("curso java");
        course1.setDescription("descricao");
        course1.setWorkload(100);
        
        Course course2 = new Course();
        course2.setTitle("curso java");
        course2.setDescription("descricao");
        course2.setWorkload(100);
        
        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("curso java");
        mentoring.setDescription("descricao");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp java");
        bootcamp.setDescription("");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Dev dev1 = new Dev();
        dev1.setName("Eduardo");
        dev1.subscribeBootcamp(bootcamp);
        System.out.println("Conteudos de "+dev1.getName()+": "+dev1.getSubscribeContents());
        System.out.println("XP de "+dev1.getName()+": "+dev1.xpCalculate());
        
        dev1.progress();
        dev1.progress();
        dev1.progress();
        
        System.out.println("Conteudos de "+dev1.getName()+": "+dev1.getSubscribeContents());
        System.out.println("Conteudos conluídos de "+dev1.getName()+": "+dev1.getDoneContents());
        System.out.println("XP de "+dev1.getName()+": "+dev1.xpCalculate());

    }
}
