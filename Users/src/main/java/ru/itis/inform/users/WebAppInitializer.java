package ru.itis.inform.users;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Component
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebAppContext.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
