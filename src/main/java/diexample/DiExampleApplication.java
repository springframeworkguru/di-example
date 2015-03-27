package diexample;

import guru.springframework.controllers.MyController;
import guru.springframework.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan("guru.springframework")
public class DiExampleApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        List<Product> products = controller.getProducts();

        for(Product product : products){
            System.out.println(product.getDescription());
        }
    }
}
