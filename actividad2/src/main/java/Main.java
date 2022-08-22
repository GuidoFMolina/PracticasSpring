import com.example.NotificationService;
import com.example.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService user = (UserService) context.getBean("userService");
        NotificationService notified = (NotificationService) context.getBean("notificationService");

        user.setNotified(notified);
        user.getNotified().saludar();


    }
}
