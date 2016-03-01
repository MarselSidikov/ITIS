package ru.itis.inform;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        /* Для propeties-файла
        MessageRenderer messageRenderer =
                MessageSupportFactory.getInstance().getRenderer();

        MessageProvider messageProvider =
                MessageSupportFactory.getInstance().getProvider();

        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
        */
        ApplicationContext context =
                new ClassPathXmlApplicationContext("app-context.xml");

        MessageRenderer messageRenderer =
                context.getBean("renderer", MessageRenderer.class);

        messageRenderer.render();
    }

}
