package ru.itis.inform;


import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
    // Поле - инстанс(экземпляр) нашей фабрики
    private static MessageSupportFactory instance;

    // здесь будут храниться параметры наших классов
    private Properties properties;

    private MessageProvider provider;
    private MessageRenderer renderer;

    private MessageSupportFactory() {
        properties = new Properties();

        try {
            properties.load(
                    new FileInputStream("C:\\Users\\Irinoise\\ITIS\\TestSpring\\src\\main\\resources\\messages.properties"));

            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");

            this.renderer = (MessageRenderer)Class.forName(rendererClass).newInstance();
            this.provider = (MessageProvider)Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException(ex);
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageProvider getProvider() {
        return provider;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }
}
