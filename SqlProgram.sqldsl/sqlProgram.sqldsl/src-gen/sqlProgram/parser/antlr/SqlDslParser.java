/*
 * generated by Xtext 2.30.0.M3
 */
package sqlProgram.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import sqlProgram.parser.antlr.internal.InternalSqlDslParser;
import sqlProgram.services.SqlDslGrammarAccess;

public class SqlDslParser extends AbstractAntlrParser {

	@Inject
	private SqlDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSqlDslParser createParser(XtextTokenStream stream) {
		return new InternalSqlDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SqlProgram";
	}

	public SqlDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SqlDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
