package exception;

import java.text.ParseException;

public class MyException extends ParseException {

    public MyException(String s, int i) {
        super(s, i);
    }
}
