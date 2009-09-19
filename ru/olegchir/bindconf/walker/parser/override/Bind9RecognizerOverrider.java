package ru.olegchir.bindconf.walker.parser.override;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.BaseRecognizer;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Olga
 * Date: 17.09.2009
 * Time: 20:48:31
 * To change this template use File | Settings | File Templates.
 */
public abstract class Bind9RecognizerOverrider {
    private BaseRecognizer owner = null;
    private int lexicalErrorCount = 0;
    private int semanticErrorCount = 0;

    public abstract String getInstanceClass();
    public abstract String getInstanceName();

    public static final String RECOGNIZER_CLASS_LEXER = "Lexer";
    public static final String RECOGNIZER_CLASS_PARSER = "Parser";

    public static final int ERROR_REPORTING_VERBOSE = 0;
    public static final int ERROR_REPORTING_SILENT = 1;

    private int errorReportingVisibility = ERROR_REPORTING_VERBOSE;

    public BaseRecognizer getOwner() {
        return owner;
    }

    public void setOwner(BaseRecognizer owner) {
        this.owner = owner;
    }

    public int getErrorReportingVisibility() {
        return errorReportingVisibility;
    }

    public void setErrorReportingVisibility(int errorReportingVisibility) {
        this.errorReportingVisibility = errorReportingVisibility;
    }

    private ArrayList<String> stackTrace = new ArrayList<String>();
    private ArrayList<String> systemStackTrace = new ArrayList<String>();

    public ArrayList<String> getStackTrace() {
        return stackTrace;
    }

    public void resetStackTrace() {
        this.stackTrace = new ArrayList<String>();
    }

    public ArrayList<String> getSystemStackTrace() {
        return systemStackTrace;
    }

    public void resetSystemStackTrace() {
        this.systemStackTrace = new ArrayList<String>();
    }

    public String getIdentity() {
        return getInstanceClass()+"/"+getInstanceName();
    }

     public String getIdentityManifest() {
        return getInstanceClass()+"/"+getInstanceName()+": ";
    }
    
    public void println(String msg) {
        System.out.println(msg);
    }

public void registerLexicalError(String comment, RecognitionException e){
        String hdr = getOwner().getErrorHeader(e);
        String msg = getOwner().getErrorMessage(e, getOwner().getTokenNames());
        String errorText = '('+comment+") "+(new StringBuilder()).append(hdr).append(" ").append(msg).toString();
        registerLexicalError(errorText);
    }

    public void registerLexicalError(String text) {
        lexicalErrorCount++;
        stackTrace.add(text);
        reportError(text);
    }

    public void registerSemanticError(String comment, RecognitionException e){
        String hdr = getOwner().getErrorHeader(e);
        String msg = getOwner().getErrorMessage(e, getOwner().getTokenNames());
        String errorText = '('+comment+") "+(new StringBuilder()).append(hdr).append(" ").append(msg).toString();
        registerSemanticError(errorText);
    }
    public void registerSemanticError(String text) {
        semanticErrorCount++;
        stackTrace.add(text);
        reportError(text);
    }

    public void reportError(String text) {
        if (errorReportingVisibility == Bind9RecognizerOverrider.ERROR_REPORTING_VERBOSE) {
            System.err.println(getIdentityManifest()+text);
        }
    }

    public void resetLexicalErrorCount() {
        lexicalErrorCount = 0;
    }

    public int getLexicalErrorCount() {
        return lexicalErrorCount;
    }

    public void resetSemanticErrorCount() {
        semanticErrorCount = 0;
    }

    public int getSemanticErrorCount() {
        return semanticErrorCount;
    }
}
