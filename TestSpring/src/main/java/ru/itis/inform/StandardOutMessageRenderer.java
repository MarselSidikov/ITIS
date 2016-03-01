package ru.itis.inform;

public class StandardOutMessageRenderer
        implements MessageRenderer  {
    // Поле, которое хранит компонент для получения
    // сообщения
    private MessageProvider provider;

    public void render() {
        // проверяем, что компонент
        // для получения сообщений
        // задан, а затем выводим сообщение
        if (provider != null) {
            System.out.println(provider.getMessage());
        } else throw new RuntimeException();
    }

    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
