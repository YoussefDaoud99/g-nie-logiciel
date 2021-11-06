package fr.ensimag.deca.syntax;

import org.antlr.v4.runtime.IntStream;

/**
 * Exception raised when a lexical error is found.
 *
 * @author gl49
 * @date 16/01/2021
 */

public class UnterminatedString extends DecaRecognitionException{
	private static final long serialVersionUID = -8122514996569278575L;

    public UnterminatedString(AbstractDecaLexer recognizer, IntStream input) {
    	super(recognizer, input);
    }
    
    @Override
    public String getMessage() {
        return "String is not terminated !";
    }
}