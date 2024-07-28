import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(helloWorld == helloWorld1);

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");

        System.out.println(cat == cat1);
    }
}