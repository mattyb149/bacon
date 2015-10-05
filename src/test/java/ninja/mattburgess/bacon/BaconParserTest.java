package ninja.mattburgess.bacon;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;

/**
 * Created by mburgess on 10/4/15.
 */
public class BaconParserTest {

  BaconParser baconParser;
  ANTLRInputStream inputStream;

  @Before
  public void setUp() {
    inputStream = new ANTLRInputStream();
    BaconLexer lexer = new BaconLexer( inputStream );
    baconParser = new BaconParser( new CommonTokenStream( lexer ) );
  }
}
