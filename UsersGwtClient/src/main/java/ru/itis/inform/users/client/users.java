package ru.itis.inform.users.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import org.fusesource.restygwt.client.Defaults;
import com.google.gwt.core.client.GWT;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
import ru.itis.inform.users.client.api.UsersClient;
import ru.itis.inform.users.models.User;

import java.util.List;

public class users implements EntryPoint {

    private static final String SERVICE_ROOT_URL = "http://localhost:8080/users-0.1/";

    public void onModuleLoad() {
        Defaults.setServiceRoot(SERVICE_ROOT_URL);

        UsersClient client = GWT.create(UsersClient.class);

        client.getUsers(new MethodCallback<List<User>>() {
            public void onSuccess(Method method, List<User> response) {
                VerticalPanel panel = new VerticalPanel();
                for (User user : response) {
                    Label label = new Label(user.getName() + " " + user.getAge());
                    label.setStyleName("serverResponseLabel");
                    panel.add(label);
                }
                RootLayoutPanel.get().add(panel);
            }

            public void onFailure(Method method, Throwable exception) {
                Label label = new Label("Error");
                RootLayoutPanel.get().add(label);
            }
        });
    }
}
