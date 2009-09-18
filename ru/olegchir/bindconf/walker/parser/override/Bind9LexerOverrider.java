package ru.olegchir.bindconf.walker.parser.override;

/**
 * Created by IntelliJ IDEA.
 * User: Olga
 * Date: 16.09.2009
 * Time: 12:22:49
 * To change this template use File | Settings | File Templates.
 */
public class Bind9LexerOverrider extends Bind9RecognizerOverrider {
    public String getInstanceClass() {
        return RECOGNIZER_CLASS_LEXER;
    }

    public String getInstanceName() {
        return "stage1";
    }
}