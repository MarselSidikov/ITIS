package ru.itis.inform;

/**
 * Компонент, отвечающий за ПОЛУЧЕНИЕ сообщения
 */
public interface MessageProvider {
    /**
     * Функция получения сообщения
     * @return текст сообщения
     */
    String getMessage();
}
