package fete.bird;

import javax.inject.Singleton;
import java.util.Locale;

@Singleton
public class Product implements IProduct{
    @Override
    public String convertToUpperCase(String value) {
        return value.toUpperCase(Locale.ROOT);
    }
}
