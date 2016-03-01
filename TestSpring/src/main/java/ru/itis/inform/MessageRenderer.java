package ru.itis.inform;

/**
 * Отвечает за ВЫВОД сообщения
 */
public interface MessageRenderer {
    /**
     * Метод вывода информации
     */
    void render();

    /**
     * Задает компонент, который получает сообщения
     * @param provider
     */
    void setMessageProvider(MessageProvider provider);

    /**
     * Получает компонент, отвечающий за ввод сообщений
     * @return
     */
    MessageProvider getMessageProvider();
}
