package ninja.mattburgess.bacon;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by mburgess on 10/3/15.
 */
@RunWith( Parameterized.class )
public class BaconLexerIdentifierTest {

  BaconLexer lexer;
  ANTLRInputStream inputStream;
  boolean expectedResult;
  String body;
  private Boolean consumesInput;

  public BaconLexerIdentifierTest( String body, Boolean consumesInput, Boolean expectedResult ) {
    inputStream = new ANTLRInputStream( body );
    lexer = new BaconLexer( inputStream );
    this.body = body;
    this.consumesInput = consumesInput;
    this.expectedResult = expectedResult;
  }

  @Parameterized.Parameters
  public static Collection tokens() {
    return Arrays.asList( new Object[][]{
      { "x", true, true },
      { "6", false, false },
      { "y1", true, true },
      { "4E", false, false },
      { "My_Identifier", true, true },
      { "My_SuperIdentifier!", false, true },
      { "null", true, false }
    } );
  }


  @Test
  public void testIdentifier() {
    Token token = lexer.nextToken();
    boolean gotToken = ( ( BaconLexer.Identifier == token.getType() ) == expectedResult );
    assertTrue( gotToken );
    if ( consumesInput ) {
      Token next = lexer.nextToken();
      System.out.println( next.getText() );
      assertEquals( "Expected " + BaconLexer.EOF, BaconLexer.EOF, next.getType() );
    }
  }
}
