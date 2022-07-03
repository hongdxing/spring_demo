

import beans.MyBean;
import config.AnotherConfig;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        try{
            //var context = new AnnotationConfigApplicationContext(AppConfig.class, AnotherConfig.class);

            // use scan
            var context = new AnnotationConfigApplicationContext();
            context.scan("beans");
            context.refresh();

            // use ComponentScan

            var myBean = context.getBean(MyBean.class);
            myBean.hello();
            var myBean2 = context.getBean(MyBean.class);

            // get them same instance
            if(myBean2 == myBean){
                System.out.println("myBean == myBean2");
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
