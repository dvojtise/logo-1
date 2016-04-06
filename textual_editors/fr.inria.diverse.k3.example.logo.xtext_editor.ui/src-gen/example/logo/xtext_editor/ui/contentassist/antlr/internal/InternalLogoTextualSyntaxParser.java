package example.logo.xtext_editor.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import example.logo.xtext_editor.services.LogoTextualSyntaxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogoTextualSyntaxParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'back'", "'forward'", "'left'", "'right'", "'pendown'", "'penup'", "'clear'", "'('", "')'", "','", "'to'", "'end'", "'['", "']'", "'ifelse'", "'if'", "'repeat'", "'While'", "':'", "'='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLogoTextualSyntaxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogoTextualSyntaxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogoTextualSyntaxParser.tokenNames; }
    public String getGrammarFileName() { return "../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g"; }


     
     	private LogoTextualSyntaxGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LogoTextualSyntaxGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleLogoProgram"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:60:1: entryRuleLogoProgram : ruleLogoProgram EOF ;
    public final void entryRuleLogoProgram() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:61:1: ( ruleLogoProgram EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:62:1: ruleLogoProgram EOF
            {
             before(grammarAccess.getLogoProgramRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogoProgram_in_entryRuleLogoProgram61);
            ruleLogoProgram();

            state._fsp--;

             after(grammarAccess.getLogoProgramRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogoProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogoProgram"


    // $ANTLR start "ruleLogoProgram"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:69:1: ruleLogoProgram : ( ( rule__LogoProgram__Group__0 ) ) ;
    public final void ruleLogoProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:73:2: ( ( ( rule__LogoProgram__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:74:1: ( ( rule__LogoProgram__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:74:1: ( ( rule__LogoProgram__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:75:1: ( rule__LogoProgram__Group__0 )
            {
             before(grammarAccess.getLogoProgramAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:76:1: ( rule__LogoProgram__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:76:2: rule__LogoProgram__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogoProgram__Group__0_in_ruleLogoProgram94);
            rule__LogoProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogoProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogoProgram"


    // $ANTLR start "entryRuleInstruction"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:88:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:89:1: ( ruleInstruction EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:90:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_entryRuleInstruction121);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInstruction128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:97:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:101:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:102:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:102:1: ( ( rule__Instruction__Alternatives ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:103:1: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:104:1: ( rule__Instruction__Alternatives )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:104:2: rule__Instruction__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction154);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleBInstruction"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:116:1: entryRuleBInstruction : ruleBInstruction EOF ;
    public final void entryRuleBInstruction() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:117:1: ( ruleBInstruction EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:118:1: ruleBInstruction EOF
            {
             before(grammarAccess.getBInstructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBInstruction_in_entryRuleBInstruction181);
            ruleBInstruction();

            state._fsp--;

             after(grammarAccess.getBInstructionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBInstruction188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBInstruction"


    // $ANTLR start "ruleBInstruction"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:125:1: ruleBInstruction : ( ( rule__BInstruction__Alternatives ) ) ;
    public final void ruleBInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:129:2: ( ( ( rule__BInstruction__Alternatives ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:130:1: ( ( rule__BInstruction__Alternatives ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:130:1: ( ( rule__BInstruction__Alternatives ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:131:1: ( rule__BInstruction__Alternatives )
            {
             before(grammarAccess.getBInstructionAccess().getAlternatives()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:132:1: ( rule__BInstruction__Alternatives )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:132:2: rule__BInstruction__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BInstruction__Alternatives_in_ruleBInstruction214);
            rule__BInstruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBInstruction"


    // $ANTLR start "entryRuleBack"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:144:1: entryRuleBack : ruleBack EOF ;
    public final void entryRuleBack() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:145:1: ( ruleBack EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:146:1: ruleBack EOF
            {
             before(grammarAccess.getBackRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBack_in_entryRuleBack241);
            ruleBack();

            state._fsp--;

             after(grammarAccess.getBackRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBack248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBack"


    // $ANTLR start "ruleBack"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:153:1: ruleBack : ( ( rule__Back__Group__0 ) ) ;
    public final void ruleBack() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:157:2: ( ( ( rule__Back__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:158:1: ( ( rule__Back__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:158:1: ( ( rule__Back__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:159:1: ( rule__Back__Group__0 )
            {
             before(grammarAccess.getBackAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:160:1: ( rule__Back__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:160:2: rule__Back__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Back__Group__0_in_ruleBack274);
            rule__Back__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBack"


    // $ANTLR start "entryRuleForward"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:172:1: entryRuleForward : ruleForward EOF ;
    public final void entryRuleForward() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:173:1: ( ruleForward EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:174:1: ruleForward EOF
            {
             before(grammarAccess.getForwardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForward_in_entryRuleForward301);
            ruleForward();

            state._fsp--;

             after(grammarAccess.getForwardRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForward308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:181:1: ruleForward : ( ( rule__Forward__Group__0 ) ) ;
    public final void ruleForward() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:185:2: ( ( ( rule__Forward__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:186:1: ( ( rule__Forward__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:186:1: ( ( rule__Forward__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:187:1: ( rule__Forward__Group__0 )
            {
             before(grammarAccess.getForwardAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:188:1: ( rule__Forward__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:188:2: rule__Forward__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Forward__Group__0_in_ruleForward334);
            rule__Forward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleLeft"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:200:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:201:1: ( ruleLeft EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:202:1: ruleLeft EOF
            {
             before(grammarAccess.getLeftRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeft_in_entryRuleLeft361);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getLeftRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeft368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:209:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:213:2: ( ( ( rule__Left__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:214:1: ( ( rule__Left__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:214:1: ( ( rule__Left__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:215:1: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:216:1: ( rule__Left__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:216:2: rule__Left__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Left__Group__0_in_ruleLeft394);
            rule__Left__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:228:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:229:1: ( ruleRight EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:230:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRight_in_entryRuleRight421);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRight428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:237:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:241:2: ( ( ( rule__Right__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:242:1: ( ( rule__Right__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:242:1: ( ( rule__Right__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:243:1: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:244:1: ( rule__Right__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:244:2: rule__Right__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Right__Group__0_in_ruleRight454);
            rule__Right__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRulePenDown"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:256:1: entryRulePenDown : rulePenDown EOF ;
    public final void entryRulePenDown() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:257:1: ( rulePenDown EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:258:1: rulePenDown EOF
            {
             before(grammarAccess.getPenDownRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePenDown_in_entryRulePenDown481);
            rulePenDown();

            state._fsp--;

             after(grammarAccess.getPenDownRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePenDown488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePenDown"


    // $ANTLR start "rulePenDown"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:265:1: rulePenDown : ( ( rule__PenDown__Group__0 ) ) ;
    public final void rulePenDown() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:269:2: ( ( ( rule__PenDown__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:270:1: ( ( rule__PenDown__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:270:1: ( ( rule__PenDown__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:271:1: ( rule__PenDown__Group__0 )
            {
             before(grammarAccess.getPenDownAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:272:1: ( rule__PenDown__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:272:2: rule__PenDown__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PenDown__Group__0_in_rulePenDown514);
            rule__PenDown__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPenDownAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePenDown"


    // $ANTLR start "entryRulePenUp"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:284:1: entryRulePenUp : rulePenUp EOF ;
    public final void entryRulePenUp() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:285:1: ( rulePenUp EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:286:1: rulePenUp EOF
            {
             before(grammarAccess.getPenUpRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePenUp_in_entryRulePenUp541);
            rulePenUp();

            state._fsp--;

             after(grammarAccess.getPenUpRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePenUp548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePenUp"


    // $ANTLR start "rulePenUp"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:293:1: rulePenUp : ( ( rule__PenUp__Group__0 ) ) ;
    public final void rulePenUp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:297:2: ( ( ( rule__PenUp__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:298:1: ( ( rule__PenUp__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:298:1: ( ( rule__PenUp__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:299:1: ( rule__PenUp__Group__0 )
            {
             before(grammarAccess.getPenUpAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:300:1: ( rule__PenUp__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:300:2: rule__PenUp__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PenUp__Group__0_in_rulePenUp574);
            rule__PenUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPenUpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePenUp"


    // $ANTLR start "entryRuleClear"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:312:1: entryRuleClear : ruleClear EOF ;
    public final void entryRuleClear() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:313:1: ( ruleClear EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:314:1: ruleClear EOF
            {
             before(grammarAccess.getClearRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClear_in_entryRuleClear601);
            ruleClear();

            state._fsp--;

             after(grammarAccess.getClearRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClear608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClear"


    // $ANTLR start "ruleClear"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:321:1: ruleClear : ( ( rule__Clear__Group__0 ) ) ;
    public final void ruleClear() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:325:2: ( ( ( rule__Clear__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:326:1: ( ( rule__Clear__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:326:1: ( ( rule__Clear__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:327:1: ( rule__Clear__Group__0 )
            {
             before(grammarAccess.getClearAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:328:1: ( rule__Clear__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:328:2: rule__Clear__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clear__Group__0_in_ruleClear634);
            rule__Clear__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClearAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleConstant"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:340:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:341:1: ( ruleConstant EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:342:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_entryRuleConstant661);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstant668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:349:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:353:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:354:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:354:1: ( ( rule__Constant__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:355:1: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:356:1: ( rule__Constant__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:356:2: rule__Constant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__0_in_ruleConstant694);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleProcCall"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:368:1: entryRuleProcCall : ruleProcCall EOF ;
    public final void entryRuleProcCall() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:369:1: ( ruleProcCall EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:370:1: ruleProcCall EOF
            {
             before(grammarAccess.getProcCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcCall_in_entryRuleProcCall721);
            ruleProcCall();

            state._fsp--;

             after(grammarAccess.getProcCallRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcCall728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcCall"


    // $ANTLR start "ruleProcCall"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:377:1: ruleProcCall : ( ( rule__ProcCall__Group__0 ) ) ;
    public final void ruleProcCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:381:2: ( ( ( rule__ProcCall__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:382:1: ( ( rule__ProcCall__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:382:1: ( ( rule__ProcCall__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:383:1: ( rule__ProcCall__Group__0 )
            {
             before(grammarAccess.getProcCallAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:384:1: ( rule__ProcCall__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:384:2: rule__ProcCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group__0_in_ruleProcCall754);
            rule__ProcCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcCall"


    // $ANTLR start "entryRuleProcDeclaration"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:396:1: entryRuleProcDeclaration : ruleProcDeclaration EOF ;
    public final void entryRuleProcDeclaration() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:397:1: ( ruleProcDeclaration EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:398:1: ruleProcDeclaration EOF
            {
             before(grammarAccess.getProcDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcDeclaration_in_entryRuleProcDeclaration781);
            ruleProcDeclaration();

            state._fsp--;

             after(grammarAccess.getProcDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcDeclaration788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcDeclaration"


    // $ANTLR start "ruleProcDeclaration"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:405:1: ruleProcDeclaration : ( ( rule__ProcDeclaration__Group__0 ) ) ;
    public final void ruleProcDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:409:2: ( ( ( rule__ProcDeclaration__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:410:1: ( ( rule__ProcDeclaration__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:410:1: ( ( rule__ProcDeclaration__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:411:1: ( rule__ProcDeclaration__Group__0 )
            {
             before(grammarAccess.getProcDeclarationAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:412:1: ( rule__ProcDeclaration__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:412:2: rule__ProcDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__0_in_ruleProcDeclaration814);
            rule__ProcDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcDeclaration"


    // $ANTLR start "entryRuleBlock"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:424:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:425:1: ( ruleBlock EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:426:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock841);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlock848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:433:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:437:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:438:1: ( ( rule__Block__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:438:1: ( ( rule__Block__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:439:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:440:1: ( rule__Block__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:440:2: rule__Block__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__0_in_ruleBlock874);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleIf"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:452:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:453:1: ( ruleIf EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:454:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIf_in_entryRuleIf901);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIf908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:461:1: ruleIf : ( ( rule__If__Alternatives ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:465:2: ( ( ( rule__If__Alternatives ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:466:1: ( ( rule__If__Alternatives ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:466:1: ( ( rule__If__Alternatives ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:467:1: ( rule__If__Alternatives )
            {
             before(grammarAccess.getIfAccess().getAlternatives()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:468:1: ( rule__If__Alternatives )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:468:2: rule__If__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__Alternatives_in_ruleIf934);
            rule__If__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleRepeat"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:480:1: entryRuleRepeat : ruleRepeat EOF ;
    public final void entryRuleRepeat() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:481:1: ( ruleRepeat EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:482:1: ruleRepeat EOF
            {
             before(grammarAccess.getRepeatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRepeat_in_entryRuleRepeat961);
            ruleRepeat();

            state._fsp--;

             after(grammarAccess.getRepeatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRepeat968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:489:1: ruleRepeat : ( ( rule__Repeat__Group__0 ) ) ;
    public final void ruleRepeat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:493:2: ( ( ( rule__Repeat__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:494:1: ( ( rule__Repeat__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:494:1: ( ( rule__Repeat__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:495:1: ( rule__Repeat__Group__0 )
            {
             before(grammarAccess.getRepeatAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:496:1: ( rule__Repeat__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:496:2: rule__Repeat__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repeat__Group__0_in_ruleRepeat994);
            rule__Repeat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleWhile"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:508:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:509:1: ( ruleWhile EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:510:1: ruleWhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhile_in_entryRuleWhile1021);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getWhileRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhile1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:517:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:521:2: ( ( ( rule__While__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:522:1: ( ( rule__While__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:522:1: ( ( rule__While__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:523:1: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:524:1: ( rule__While__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:524:2: rule__While__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__While__Group__0_in_ruleWhile1054);
            rule__While__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleParameterCall"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:536:1: entryRuleParameterCall : ruleParameterCall EOF ;
    public final void entryRuleParameterCall() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:537:1: ( ruleParameterCall EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:538:1: ruleParameterCall EOF
            {
             before(grammarAccess.getParameterCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterCall_in_entryRuleParameterCall1081);
            ruleParameterCall();

            state._fsp--;

             after(grammarAccess.getParameterCallRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterCall1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterCall"


    // $ANTLR start "ruleParameterCall"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:545:1: ruleParameterCall : ( ( rule__ParameterCall__Group__0 ) ) ;
    public final void ruleParameterCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:549:2: ( ( ( rule__ParameterCall__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:550:1: ( ( rule__ParameterCall__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:550:1: ( ( rule__ParameterCall__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:551:1: ( rule__ParameterCall__Group__0 )
            {
             before(grammarAccess.getParameterCallAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:552:1: ( rule__ParameterCall__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:552:2: rule__ParameterCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterCall__Group__0_in_ruleParameterCall1114);
            rule__ParameterCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterCall"


    // $ANTLR start "entryRuleEqualExpression"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:564:1: entryRuleEqualExpression : ruleEqualExpression EOF ;
    public final void entryRuleEqualExpression() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:565:1: ( ruleEqualExpression EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:566:1: ruleEqualExpression EOF
            {
             before(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression1141);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualExpression"


    // $ANTLR start "ruleEqualExpression"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:573:1: ruleEqualExpression : ( ( rule__EqualExpression__Group__0 ) ) ;
    public final void ruleEqualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:577:2: ( ( ( rule__EqualExpression__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:578:1: ( ( rule__EqualExpression__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:578:1: ( ( rule__EqualExpression__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:579:1: ( rule__EqualExpression__Group__0 )
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:580:1: ( rule__EqualExpression__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:580:2: rule__EqualExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__0_in_ruleEqualExpression1174);
            rule__EqualExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:592:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:593:1: ( ruleComparisonExpression EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:594:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1201);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:601:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:605:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:606:1: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:606:1: ( ( rule__ComparisonExpression__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:607:1: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:608:1: ( rule__ComparisonExpression__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:608:2: rule__ComparisonExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression1234);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:620:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:621:1: ( ruleAddExpression EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:622:1: ruleAddExpression EOF
            {
             before(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression1261);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:629:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:633:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:634:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:634:1: ( ( rule__AddExpression__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:635:1: ( rule__AddExpression__Group__0 )
            {
             before(grammarAccess.getAddExpressionAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:636:1: ( rule__AddExpression__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:636:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression1294);
            rule__AddExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:648:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:649:1: ( ruleMultExpression EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:650:1: ruleMultExpression EOF
            {
             before(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression1321);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:657:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:661:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:662:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:662:1: ( ( rule__MultExpression__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:663:1: ( rule__MultExpression__Group__0 )
            {
             before(grammarAccess.getMultExpressionAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:664:1: ( rule__MultExpression__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:664:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression1354);
            rule__MultExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleLiteralsExpression"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:676:1: entryRuleLiteralsExpression : ruleLiteralsExpression EOF ;
    public final void entryRuleLiteralsExpression() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:677:1: ( ruleLiteralsExpression EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:678:1: ruleLiteralsExpression EOF
            {
             before(grammarAccess.getLiteralsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression1381);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getLiteralsExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralsExpression1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralsExpression"


    // $ANTLR start "ruleLiteralsExpression"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:685:1: ruleLiteralsExpression : ( ( rule__LiteralsExpression__Alternatives ) ) ;
    public final void ruleLiteralsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:689:2: ( ( ( rule__LiteralsExpression__Alternatives ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:690:1: ( ( rule__LiteralsExpression__Alternatives ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:690:1: ( ( rule__LiteralsExpression__Alternatives ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:691:1: ( rule__LiteralsExpression__Alternatives )
            {
             before(grammarAccess.getLiteralsExpressionAccess().getAlternatives()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:692:1: ( rule__LiteralsExpression__Alternatives )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:692:2: rule__LiteralsExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Alternatives_in_ruleLiteralsExpression1414);
            rule__LiteralsExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralsExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralsExpression"


    // $ANTLR start "entryRuleEInt"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:704:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:705:1: ( ruleEInt EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:706:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1441);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:713:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:717:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:718:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:718:1: ( ( rule__EInt__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:719:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:720:1: ( rule__EInt__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:720:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1474);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:732:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:733:1: ( ruleEString EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:734:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1501);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:741:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:745:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:746:1: ( ( rule__EString__Alternatives ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:746:1: ( ( rule__EString__Alternatives ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:747:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:748:1: ( rule__EString__Alternatives )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:748:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1534);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleParameter"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:760:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:761:1: ( ruleParameter EOF )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:762:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter1561);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:769:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:773:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:774:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:774:1: ( ( rule__Parameter__Group__0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:775:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:776:1: ( rule__Parameter__Group__0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:776:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0_in_ruleParameter1594);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "rule__Instruction__Alternatives"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:788:1: rule__Instruction__Alternatives : ( ( ruleBack ) | ( ruleForward ) | ( ruleLeft ) | ( ruleRight ) | ( rulePenDown ) | ( rulePenUp ) | ( ruleClear ) | ( ruleProcCall ) | ( ruleProcDeclaration ) | ( ruleBlock ) | ( ruleIf ) | ( ruleRepeat ) | ( ruleWhile ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:792:1: ( ( ruleBack ) | ( ruleForward ) | ( ruleLeft ) | ( ruleRight ) | ( rulePenDown ) | ( rulePenUp ) | ( ruleClear ) | ( ruleProcCall ) | ( ruleProcDeclaration ) | ( ruleBlock ) | ( ruleIf ) | ( ruleRepeat ) | ( ruleWhile ) )
            int alt1=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt1=8;
                }
                break;
            case 21:
                {
                alt1=9;
                }
                break;
            case 23:
                {
                alt1=10;
                }
                break;
            case 25:
            case 26:
                {
                alt1=11;
                }
                break;
            case 27:
                {
                alt1=12;
                }
                break;
            case 28:
                {
                alt1=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:793:1: ( ruleBack )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:793:1: ( ruleBack )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:794:1: ruleBack
                    {
                     before(grammarAccess.getInstructionAccess().getBackParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBack_in_rule__Instruction__Alternatives1630);
                    ruleBack();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getBackParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:799:6: ( ruleForward )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:799:6: ( ruleForward )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:800:1: ruleForward
                    {
                     before(grammarAccess.getInstructionAccess().getForwardParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleForward_in_rule__Instruction__Alternatives1647);
                    ruleForward();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getForwardParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:805:6: ( ruleLeft )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:805:6: ( ruleLeft )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:806:1: ruleLeft
                    {
                     before(grammarAccess.getInstructionAccess().getLeftParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLeft_in_rule__Instruction__Alternatives1664);
                    ruleLeft();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getLeftParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:811:6: ( ruleRight )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:811:6: ( ruleRight )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:812:1: ruleRight
                    {
                     before(grammarAccess.getInstructionAccess().getRightParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRight_in_rule__Instruction__Alternatives1681);
                    ruleRight();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getRightParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:817:6: ( rulePenDown )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:817:6: ( rulePenDown )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:818:1: rulePenDown
                    {
                     before(grammarAccess.getInstructionAccess().getPenDownParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_rulePenDown_in_rule__Instruction__Alternatives1698);
                    rulePenDown();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getPenDownParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:823:6: ( rulePenUp )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:823:6: ( rulePenUp )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:824:1: rulePenUp
                    {
                     before(grammarAccess.getInstructionAccess().getPenUpParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_rulePenUp_in_rule__Instruction__Alternatives1715);
                    rulePenUp();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getPenUpParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:829:6: ( ruleClear )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:829:6: ( ruleClear )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:830:1: ruleClear
                    {
                     before(grammarAccess.getInstructionAccess().getClearParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleClear_in_rule__Instruction__Alternatives1732);
                    ruleClear();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getClearParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:835:6: ( ruleProcCall )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:835:6: ( ruleProcCall )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:836:1: ruleProcCall
                    {
                     before(grammarAccess.getInstructionAccess().getProcCallParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleProcCall_in_rule__Instruction__Alternatives1749);
                    ruleProcCall();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getProcCallParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:841:6: ( ruleProcDeclaration )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:841:6: ( ruleProcDeclaration )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:842:1: ruleProcDeclaration
                    {
                     before(grammarAccess.getInstructionAccess().getProcDeclarationParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleProcDeclaration_in_rule__Instruction__Alternatives1766);
                    ruleProcDeclaration();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getProcDeclarationParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:847:6: ( ruleBlock )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:847:6: ( ruleBlock )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:848:1: ruleBlock
                    {
                     before(grammarAccess.getInstructionAccess().getBlockParserRuleCall_9()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__Instruction__Alternatives1783);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getBlockParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:853:6: ( ruleIf )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:853:6: ( ruleIf )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:854:1: ruleIf
                    {
                     before(grammarAccess.getInstructionAccess().getIfParserRuleCall_10()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIf_in_rule__Instruction__Alternatives1800);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getIfParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:859:6: ( ruleRepeat )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:859:6: ( ruleRepeat )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:860:1: ruleRepeat
                    {
                     before(grammarAccess.getInstructionAccess().getRepeatParserRuleCall_11()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRepeat_in_rule__Instruction__Alternatives1817);
                    ruleRepeat();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getRepeatParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:865:6: ( ruleWhile )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:865:6: ( ruleWhile )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:866:1: ruleWhile
                    {
                     before(grammarAccess.getInstructionAccess().getWhileParserRuleCall_12()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWhile_in_rule__Instruction__Alternatives1834);
                    ruleWhile();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getWhileParserRuleCall_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__BInstruction__Alternatives"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:876:1: rule__BInstruction__Alternatives : ( ( ruleBack ) | ( ruleForward ) | ( ruleLeft ) | ( ruleRight ) | ( rulePenDown ) | ( rulePenUp ) | ( ruleClear ) | ( ruleProcCall ) | ( ruleParameterCall ) | ( ruleIf ) | ( ruleRepeat ) | ( ruleWhile ) );
    public final void rule__BInstruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:880:1: ( ( ruleBack ) | ( ruleForward ) | ( ruleLeft ) | ( ruleRight ) | ( rulePenDown ) | ( rulePenUp ) | ( ruleClear ) | ( ruleProcCall ) | ( ruleParameterCall ) | ( ruleIf ) | ( ruleRepeat ) | ( ruleWhile ) )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=8;
                }
                break;
            case 29:
                {
                alt2=9;
                }
                break;
            case 25:
            case 26:
                {
                alt2=10;
                }
                break;
            case 27:
                {
                alt2=11;
                }
                break;
            case 28:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:881:1: ( ruleBack )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:881:1: ( ruleBack )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:882:1: ruleBack
                    {
                     before(grammarAccess.getBInstructionAccess().getBackParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBack_in_rule__BInstruction__Alternatives1866);
                    ruleBack();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getBackParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:887:6: ( ruleForward )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:887:6: ( ruleForward )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:888:1: ruleForward
                    {
                     before(grammarAccess.getBInstructionAccess().getForwardParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleForward_in_rule__BInstruction__Alternatives1883);
                    ruleForward();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getForwardParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:893:6: ( ruleLeft )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:893:6: ( ruleLeft )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:894:1: ruleLeft
                    {
                     before(grammarAccess.getBInstructionAccess().getLeftParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLeft_in_rule__BInstruction__Alternatives1900);
                    ruleLeft();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getLeftParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:899:6: ( ruleRight )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:899:6: ( ruleRight )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:900:1: ruleRight
                    {
                     before(grammarAccess.getBInstructionAccess().getRightParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRight_in_rule__BInstruction__Alternatives1917);
                    ruleRight();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getRightParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:905:6: ( rulePenDown )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:905:6: ( rulePenDown )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:906:1: rulePenDown
                    {
                     before(grammarAccess.getBInstructionAccess().getPenDownParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_rulePenDown_in_rule__BInstruction__Alternatives1934);
                    rulePenDown();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getPenDownParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:911:6: ( rulePenUp )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:911:6: ( rulePenUp )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:912:1: rulePenUp
                    {
                     before(grammarAccess.getBInstructionAccess().getPenUpParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_rulePenUp_in_rule__BInstruction__Alternatives1951);
                    rulePenUp();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getPenUpParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:917:6: ( ruleClear )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:917:6: ( ruleClear )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:918:1: ruleClear
                    {
                     before(grammarAccess.getBInstructionAccess().getClearParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleClear_in_rule__BInstruction__Alternatives1968);
                    ruleClear();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getClearParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:923:6: ( ruleProcCall )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:923:6: ( ruleProcCall )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:924:1: ruleProcCall
                    {
                     before(grammarAccess.getBInstructionAccess().getProcCallParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleProcCall_in_rule__BInstruction__Alternatives1985);
                    ruleProcCall();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getProcCallParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:929:6: ( ruleParameterCall )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:929:6: ( ruleParameterCall )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:930:1: ruleParameterCall
                    {
                     before(grammarAccess.getBInstructionAccess().getParameterCallParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameterCall_in_rule__BInstruction__Alternatives2002);
                    ruleParameterCall();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getParameterCallParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:935:6: ( ruleIf )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:935:6: ( ruleIf )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:936:1: ruleIf
                    {
                     before(grammarAccess.getBInstructionAccess().getIfParserRuleCall_9()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIf_in_rule__BInstruction__Alternatives2019);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getIfParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:941:6: ( ruleRepeat )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:941:6: ( ruleRepeat )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:942:1: ruleRepeat
                    {
                     before(grammarAccess.getBInstructionAccess().getRepeatParserRuleCall_10()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRepeat_in_rule__BInstruction__Alternatives2036);
                    ruleRepeat();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getRepeatParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:947:6: ( ruleWhile )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:947:6: ( ruleWhile )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:948:1: ruleWhile
                    {
                     before(grammarAccess.getBInstructionAccess().getWhileParserRuleCall_11()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWhile_in_rule__BInstruction__Alternatives2053);
                    ruleWhile();

                    state._fsp--;

                     after(grammarAccess.getBInstructionAccess().getWhileParserRuleCall_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BInstruction__Alternatives"


    // $ANTLR start "rule__If__Alternatives"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:958:1: rule__If__Alternatives : ( ( ( rule__If__Group_0__0 ) ) | ( ( rule__If__Group_1__0 ) ) );
    public final void rule__If__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:962:1: ( ( ( rule__If__Group_0__0 ) ) | ( ( rule__If__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:963:1: ( ( rule__If__Group_0__0 ) )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:963:1: ( ( rule__If__Group_0__0 ) )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:964:1: ( rule__If__Group_0__0 )
                    {
                     before(grammarAccess.getIfAccess().getGroup_0()); 
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:965:1: ( rule__If__Group_0__0 )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:965:2: rule__If__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__If__Group_0__0_in_rule__If__Alternatives2085);
                    rule__If__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:969:6: ( ( rule__If__Group_1__0 ) )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:969:6: ( ( rule__If__Group_1__0 ) )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:970:1: ( rule__If__Group_1__0 )
                    {
                     before(grammarAccess.getIfAccess().getGroup_1()); 
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:971:1: ( rule__If__Group_1__0 )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:971:2: rule__If__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__If__Group_1__0_in_rule__If__Alternatives2103);
                    rule__If__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Alternatives"


    // $ANTLR start "rule__ComparisonExpression__Alternatives_1_0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:980:1: rule__ComparisonExpression__Alternatives_1_0 : ( ( ( rule__ComparisonExpression__Group_1_0_0__0 ) ) | ( ( rule__ComparisonExpression__Group_1_0_1__0 ) ) );
    public final void rule__ComparisonExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:984:1: ( ( ( rule__ComparisonExpression__Group_1_0_0__0 ) ) | ( ( rule__ComparisonExpression__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:985:1: ( ( rule__ComparisonExpression__Group_1_0_0__0 ) )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:985:1: ( ( rule__ComparisonExpression__Group_1_0_0__0 ) )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:986:1: ( rule__ComparisonExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0()); 
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:987:1: ( rule__ComparisonExpression__Group_1_0_0__0 )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:987:2: rule__ComparisonExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__0_in_rule__ComparisonExpression__Alternatives_1_02136);
                    rule__ComparisonExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:991:6: ( ( rule__ComparisonExpression__Group_1_0_1__0 ) )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:991:6: ( ( rule__ComparisonExpression__Group_1_0_1__0 ) )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:992:1: ( rule__ComparisonExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_1()); 
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:993:1: ( rule__ComparisonExpression__Group_1_0_1__0 )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:993:2: rule__ComparisonExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__0_in_rule__ComparisonExpression__Alternatives_1_02154);
                    rule__ComparisonExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Alternatives_1_0"


    // $ANTLR start "rule__AddExpression__Alternatives_1_0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1002:1: rule__AddExpression__Alternatives_1_0 : ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) );
    public final void rule__AddExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1006:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1007:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1007:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1008:1: ( rule__AddExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1009:1: ( rule__AddExpression__Group_1_0_0__0 )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1009:2: rule__AddExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__0_in_rule__AddExpression__Alternatives_1_02187);
                    rule__AddExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1013:6: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1013:6: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1014:1: ( rule__AddExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAddExpressionAccess().getGroup_1_0_1()); 
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1015:1: ( rule__AddExpression__Group_1_0_1__0 )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1015:2: rule__AddExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__0_in_rule__AddExpression__Alternatives_1_02205);
                    rule__AddExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Alternatives_1_0"


    // $ANTLR start "rule__MultExpression__Alternatives_1_0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1024:1: rule__MultExpression__Alternatives_1_0 : ( ( ( rule__MultExpression__Group_1_0_0__0 ) ) | ( ( rule__MultExpression__Group_1_0_1__0 ) ) );
    public final void rule__MultExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1028:1: ( ( ( rule__MultExpression__Group_1_0_0__0 ) ) | ( ( rule__MultExpression__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            else if ( (LA6_0==36) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1029:1: ( ( rule__MultExpression__Group_1_0_0__0 ) )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1029:1: ( ( rule__MultExpression__Group_1_0_0__0 ) )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1030:1: ( rule__MultExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_0()); 
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1031:1: ( rule__MultExpression__Group_1_0_0__0 )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1031:2: rule__MultExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__0_in_rule__MultExpression__Alternatives_1_02238);
                    rule__MultExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1035:6: ( ( rule__MultExpression__Group_1_0_1__0 ) )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1035:6: ( ( rule__MultExpression__Group_1_0_1__0 ) )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1036:1: ( rule__MultExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_1()); 
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1037:1: ( rule__MultExpression__Group_1_0_1__0 )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1037:2: rule__MultExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__0_in_rule__MultExpression__Alternatives_1_02256);
                    rule__MultExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Alternatives_1_0"


    // $ANTLR start "rule__LiteralsExpression__Alternatives"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1046:1: rule__LiteralsExpression__Alternatives : ( ( ruleParameterCall ) | ( ruleConstant ) | ( ( rule__LiteralsExpression__Group_2__0 ) ) );
    public final void rule__LiteralsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1050:1: ( ( ruleParameterCall ) | ( ruleConstant ) | ( ( rule__LiteralsExpression__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
            case 34:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1051:1: ( ruleParameterCall )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1051:1: ( ruleParameterCall )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1052:1: ruleParameterCall
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getParameterCallParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameterCall_in_rule__LiteralsExpression__Alternatives2289);
                    ruleParameterCall();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getParameterCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1057:6: ( ruleConstant )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1057:6: ( ruleConstant )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1058:1: ruleConstant
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getConstantParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConstant_in_rule__LiteralsExpression__Alternatives2306);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getConstantParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1063:6: ( ( rule__LiteralsExpression__Group_2__0 ) )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1063:6: ( ( rule__LiteralsExpression__Group_2__0 ) )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1064:1: ( rule__LiteralsExpression__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getGroup_2()); 
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1065:1: ( rule__LiteralsExpression__Group_2__0 )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1065:2: rule__LiteralsExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_2__0_in_rule__LiteralsExpression__Alternatives2323);
                    rule__LiteralsExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralsExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1074:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1078:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1079:1: ( RULE_STRING )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1079:1: ( RULE_STRING )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1080:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2356); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1085:6: ( RULE_ID )
                    {
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1085:6: ( RULE_ID )
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1086:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2373); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__LogoProgram__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1098:1: rule__LogoProgram__Group__0 : rule__LogoProgram__Group__0__Impl rule__LogoProgram__Group__1 ;
    public final void rule__LogoProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1102:1: ( rule__LogoProgram__Group__0__Impl rule__LogoProgram__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1103:2: rule__LogoProgram__Group__0__Impl rule__LogoProgram__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogoProgram__Group__0__Impl_in_rule__LogoProgram__Group__02403);
            rule__LogoProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LogoProgram__Group__1_in_rule__LogoProgram__Group__02406);
            rule__LogoProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogoProgram__Group__0"


    // $ANTLR start "rule__LogoProgram__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1110:1: rule__LogoProgram__Group__0__Impl : ( () ) ;
    public final void rule__LogoProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1114:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1115:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1115:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1116:1: ()
            {
             before(grammarAccess.getLogoProgramAccess().getLogoProgramAction_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1117:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1119:1: 
            {
            }

             after(grammarAccess.getLogoProgramAccess().getLogoProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogoProgram__Group__0__Impl"


    // $ANTLR start "rule__LogoProgram__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1129:1: rule__LogoProgram__Group__1 : rule__LogoProgram__Group__1__Impl rule__LogoProgram__Group__2 ;
    public final void rule__LogoProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1133:1: ( rule__LogoProgram__Group__1__Impl rule__LogoProgram__Group__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1134:2: rule__LogoProgram__Group__1__Impl rule__LogoProgram__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogoProgram__Group__1__Impl_in_rule__LogoProgram__Group__12464);
            rule__LogoProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LogoProgram__Group__2_in_rule__LogoProgram__Group__12467);
            rule__LogoProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogoProgram__Group__1"


    // $ANTLR start "rule__LogoProgram__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1141:1: rule__LogoProgram__Group__1__Impl : ( ( rule__LogoProgram__InstructionsAssignment_1 ) ) ;
    public final void rule__LogoProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1145:1: ( ( ( rule__LogoProgram__InstructionsAssignment_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1146:1: ( ( rule__LogoProgram__InstructionsAssignment_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1146:1: ( ( rule__LogoProgram__InstructionsAssignment_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1147:1: ( rule__LogoProgram__InstructionsAssignment_1 )
            {
             before(grammarAccess.getLogoProgramAccess().getInstructionsAssignment_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1148:1: ( rule__LogoProgram__InstructionsAssignment_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1148:2: rule__LogoProgram__InstructionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogoProgram__InstructionsAssignment_1_in_rule__LogoProgram__Group__1__Impl2494);
            rule__LogoProgram__InstructionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogoProgramAccess().getInstructionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogoProgram__Group__1__Impl"


    // $ANTLR start "rule__LogoProgram__Group__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1158:1: rule__LogoProgram__Group__2 : rule__LogoProgram__Group__2__Impl ;
    public final void rule__LogoProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1162:1: ( rule__LogoProgram__Group__2__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1163:2: rule__LogoProgram__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogoProgram__Group__2__Impl_in_rule__LogoProgram__Group__22524);
            rule__LogoProgram__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogoProgram__Group__2"


    // $ANTLR start "rule__LogoProgram__Group__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1169:1: rule__LogoProgram__Group__2__Impl : ( ( rule__LogoProgram__InstructionsAssignment_2 )* ) ;
    public final void rule__LogoProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1173:1: ( ( ( rule__LogoProgram__InstructionsAssignment_2 )* ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1174:1: ( ( rule__LogoProgram__InstructionsAssignment_2 )* )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1174:1: ( ( rule__LogoProgram__InstructionsAssignment_2 )* )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1175:1: ( rule__LogoProgram__InstructionsAssignment_2 )*
            {
             before(grammarAccess.getLogoProgramAccess().getInstructionsAssignment_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1176:1: ( rule__LogoProgram__InstructionsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||(LA9_0>=11 && LA9_0<=17)||LA9_0==21||LA9_0==23||(LA9_0>=25 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1176:2: rule__LogoProgram__InstructionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__LogoProgram__InstructionsAssignment_2_in_rule__LogoProgram__Group__2__Impl2551);
            	    rule__LogoProgram__InstructionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLogoProgramAccess().getInstructionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogoProgram__Group__2__Impl"


    // $ANTLR start "rule__Back__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1192:1: rule__Back__Group__0 : rule__Back__Group__0__Impl rule__Back__Group__1 ;
    public final void rule__Back__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1196:1: ( rule__Back__Group__0__Impl rule__Back__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1197:2: rule__Back__Group__0__Impl rule__Back__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Back__Group__0__Impl_in_rule__Back__Group__02588);
            rule__Back__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Back__Group__1_in_rule__Back__Group__02591);
            rule__Back__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Back__Group__0"


    // $ANTLR start "rule__Back__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1204:1: rule__Back__Group__0__Impl : ( 'back' ) ;
    public final void rule__Back__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1208:1: ( ( 'back' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1209:1: ( 'back' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1209:1: ( 'back' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1210:1: 'back'
            {
             before(grammarAccess.getBackAccess().getBackKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Back__Group__0__Impl2619); 
             after(grammarAccess.getBackAccess().getBackKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Back__Group__0__Impl"


    // $ANTLR start "rule__Back__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1223:1: rule__Back__Group__1 : rule__Back__Group__1__Impl ;
    public final void rule__Back__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1227:1: ( rule__Back__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1228:2: rule__Back__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Back__Group__1__Impl_in_rule__Back__Group__12650);
            rule__Back__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Back__Group__1"


    // $ANTLR start "rule__Back__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1234:1: rule__Back__Group__1__Impl : ( ( rule__Back__StepsAssignment_1 ) ) ;
    public final void rule__Back__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1238:1: ( ( ( rule__Back__StepsAssignment_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1239:1: ( ( rule__Back__StepsAssignment_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1239:1: ( ( rule__Back__StepsAssignment_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1240:1: ( rule__Back__StepsAssignment_1 )
            {
             before(grammarAccess.getBackAccess().getStepsAssignment_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1241:1: ( rule__Back__StepsAssignment_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1241:2: rule__Back__StepsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Back__StepsAssignment_1_in_rule__Back__Group__1__Impl2677);
            rule__Back__StepsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackAccess().getStepsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Back__Group__1__Impl"


    // $ANTLR start "rule__Forward__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1255:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1259:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1260:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Forward__Group__0__Impl_in_rule__Forward__Group__02711);
            rule__Forward__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Forward__Group__1_in_rule__Forward__Group__02714);
            rule__Forward__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__0"


    // $ANTLR start "rule__Forward__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1267:1: rule__Forward__Group__0__Impl : ( 'forward' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1271:1: ( ( 'forward' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1272:1: ( 'forward' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1272:1: ( 'forward' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1273:1: 'forward'
            {
             before(grammarAccess.getForwardAccess().getForwardKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Forward__Group__0__Impl2742); 
             after(grammarAccess.getForwardAccess().getForwardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__0__Impl"


    // $ANTLR start "rule__Forward__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1286:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1290:1: ( rule__Forward__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1291:2: rule__Forward__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Forward__Group__1__Impl_in_rule__Forward__Group__12773);
            rule__Forward__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__1"


    // $ANTLR start "rule__Forward__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1297:1: rule__Forward__Group__1__Impl : ( ( rule__Forward__StepsAssignment_1 ) ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1301:1: ( ( ( rule__Forward__StepsAssignment_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1302:1: ( ( rule__Forward__StepsAssignment_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1302:1: ( ( rule__Forward__StepsAssignment_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1303:1: ( rule__Forward__StepsAssignment_1 )
            {
             before(grammarAccess.getForwardAccess().getStepsAssignment_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1304:1: ( rule__Forward__StepsAssignment_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1304:2: rule__Forward__StepsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Forward__StepsAssignment_1_in_rule__Forward__Group__1__Impl2800);
            rule__Forward__StepsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getStepsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__1__Impl"


    // $ANTLR start "rule__Left__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1318:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1322:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1323:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Left__Group__0__Impl_in_rule__Left__Group__02834);
            rule__Left__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Left__Group__1_in_rule__Left__Group__02837);
            rule__Left__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__0"


    // $ANTLR start "rule__Left__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1330:1: rule__Left__Group__0__Impl : ( () ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1334:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1335:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1335:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1336:1: ()
            {
             before(grammarAccess.getLeftAccess().getLeftAction_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1337:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1339:1: 
            {
            }

             after(grammarAccess.getLeftAccess().getLeftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__0__Impl"


    // $ANTLR start "rule__Left__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1349:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1353:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1354:2: rule__Left__Group__1__Impl rule__Left__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Left__Group__1__Impl_in_rule__Left__Group__12895);
            rule__Left__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Left__Group__2_in_rule__Left__Group__12898);
            rule__Left__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__1"


    // $ANTLR start "rule__Left__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1361:1: rule__Left__Group__1__Impl : ( 'left' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1365:1: ( ( 'left' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1366:1: ( 'left' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1366:1: ( 'left' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1367:1: 'left'
            {
             before(grammarAccess.getLeftAccess().getLeftKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Left__Group__1__Impl2926); 
             after(grammarAccess.getLeftAccess().getLeftKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__1__Impl"


    // $ANTLR start "rule__Left__Group__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1380:1: rule__Left__Group__2 : rule__Left__Group__2__Impl ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1384:1: ( rule__Left__Group__2__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1385:2: rule__Left__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Left__Group__2__Impl_in_rule__Left__Group__22957);
            rule__Left__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__2"


    // $ANTLR start "rule__Left__Group__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1391:1: rule__Left__Group__2__Impl : ( ( rule__Left__AngleAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1395:1: ( ( ( rule__Left__AngleAssignment_2 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1396:1: ( ( rule__Left__AngleAssignment_2 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1396:1: ( ( rule__Left__AngleAssignment_2 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1397:1: ( rule__Left__AngleAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getAngleAssignment_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1398:1: ( rule__Left__AngleAssignment_2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1398:2: rule__Left__AngleAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Left__AngleAssignment_2_in_rule__Left__Group__2__Impl2984);
            rule__Left__AngleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getAngleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__2__Impl"


    // $ANTLR start "rule__Right__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1414:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1418:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1419:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Right__Group__0__Impl_in_rule__Right__Group__03020);
            rule__Right__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Right__Group__1_in_rule__Right__Group__03023);
            rule__Right__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__0"


    // $ANTLR start "rule__Right__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1426:1: rule__Right__Group__0__Impl : ( () ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1430:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1431:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1431:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1432:1: ()
            {
             before(grammarAccess.getRightAccess().getRightAction_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1433:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1435:1: 
            {
            }

             after(grammarAccess.getRightAccess().getRightAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__0__Impl"


    // $ANTLR start "rule__Right__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1445:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1449:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1450:2: rule__Right__Group__1__Impl rule__Right__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Right__Group__1__Impl_in_rule__Right__Group__13081);
            rule__Right__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Right__Group__2_in_rule__Right__Group__13084);
            rule__Right__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__1"


    // $ANTLR start "rule__Right__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1457:1: rule__Right__Group__1__Impl : ( 'right' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1461:1: ( ( 'right' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1462:1: ( 'right' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1462:1: ( 'right' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1463:1: 'right'
            {
             before(grammarAccess.getRightAccess().getRightKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Right__Group__1__Impl3112); 
             after(grammarAccess.getRightAccess().getRightKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__1__Impl"


    // $ANTLR start "rule__Right__Group__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1476:1: rule__Right__Group__2 : rule__Right__Group__2__Impl ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1480:1: ( rule__Right__Group__2__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1481:2: rule__Right__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Right__Group__2__Impl_in_rule__Right__Group__23143);
            rule__Right__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__2"


    // $ANTLR start "rule__Right__Group__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1487:1: rule__Right__Group__2__Impl : ( ( rule__Right__AngleAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1491:1: ( ( ( rule__Right__AngleAssignment_2 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1492:1: ( ( rule__Right__AngleAssignment_2 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1492:1: ( ( rule__Right__AngleAssignment_2 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1493:1: ( rule__Right__AngleAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getAngleAssignment_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1494:1: ( rule__Right__AngleAssignment_2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1494:2: rule__Right__AngleAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Right__AngleAssignment_2_in_rule__Right__Group__2__Impl3170);
            rule__Right__AngleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getAngleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__2__Impl"


    // $ANTLR start "rule__PenDown__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1510:1: rule__PenDown__Group__0 : rule__PenDown__Group__0__Impl rule__PenDown__Group__1 ;
    public final void rule__PenDown__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1514:1: ( rule__PenDown__Group__0__Impl rule__PenDown__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1515:2: rule__PenDown__Group__0__Impl rule__PenDown__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PenDown__Group__0__Impl_in_rule__PenDown__Group__03206);
            rule__PenDown__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PenDown__Group__1_in_rule__PenDown__Group__03209);
            rule__PenDown__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__0"


    // $ANTLR start "rule__PenDown__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1522:1: rule__PenDown__Group__0__Impl : ( () ) ;
    public final void rule__PenDown__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1526:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1527:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1527:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1528:1: ()
            {
             before(grammarAccess.getPenDownAccess().getPenDownAction_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1529:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1531:1: 
            {
            }

             after(grammarAccess.getPenDownAccess().getPenDownAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__0__Impl"


    // $ANTLR start "rule__PenDown__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1541:1: rule__PenDown__Group__1 : rule__PenDown__Group__1__Impl ;
    public final void rule__PenDown__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1545:1: ( rule__PenDown__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1546:2: rule__PenDown__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PenDown__Group__1__Impl_in_rule__PenDown__Group__13267);
            rule__PenDown__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__1"


    // $ANTLR start "rule__PenDown__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1552:1: rule__PenDown__Group__1__Impl : ( 'pendown' ) ;
    public final void rule__PenDown__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1556:1: ( ( 'pendown' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1557:1: ( 'pendown' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1557:1: ( 'pendown' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1558:1: 'pendown'
            {
             before(grammarAccess.getPenDownAccess().getPendownKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__PenDown__Group__1__Impl3295); 
             after(grammarAccess.getPenDownAccess().getPendownKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__1__Impl"


    // $ANTLR start "rule__PenUp__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1575:1: rule__PenUp__Group__0 : rule__PenUp__Group__0__Impl rule__PenUp__Group__1 ;
    public final void rule__PenUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1579:1: ( rule__PenUp__Group__0__Impl rule__PenUp__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1580:2: rule__PenUp__Group__0__Impl rule__PenUp__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PenUp__Group__0__Impl_in_rule__PenUp__Group__03330);
            rule__PenUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PenUp__Group__1_in_rule__PenUp__Group__03333);
            rule__PenUp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__0"


    // $ANTLR start "rule__PenUp__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1587:1: rule__PenUp__Group__0__Impl : ( () ) ;
    public final void rule__PenUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1591:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1592:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1592:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1593:1: ()
            {
             before(grammarAccess.getPenUpAccess().getPenUpAction_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1594:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1596:1: 
            {
            }

             after(grammarAccess.getPenUpAccess().getPenUpAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__0__Impl"


    // $ANTLR start "rule__PenUp__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1606:1: rule__PenUp__Group__1 : rule__PenUp__Group__1__Impl ;
    public final void rule__PenUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1610:1: ( rule__PenUp__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1611:2: rule__PenUp__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PenUp__Group__1__Impl_in_rule__PenUp__Group__13391);
            rule__PenUp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__1"


    // $ANTLR start "rule__PenUp__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1617:1: rule__PenUp__Group__1__Impl : ( 'penup' ) ;
    public final void rule__PenUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1621:1: ( ( 'penup' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1622:1: ( 'penup' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1622:1: ( 'penup' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1623:1: 'penup'
            {
             before(grammarAccess.getPenUpAccess().getPenupKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__PenUp__Group__1__Impl3419); 
             after(grammarAccess.getPenUpAccess().getPenupKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__1__Impl"


    // $ANTLR start "rule__Clear__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1640:1: rule__Clear__Group__0 : rule__Clear__Group__0__Impl rule__Clear__Group__1 ;
    public final void rule__Clear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1644:1: ( rule__Clear__Group__0__Impl rule__Clear__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1645:2: rule__Clear__Group__0__Impl rule__Clear__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clear__Group__0__Impl_in_rule__Clear__Group__03454);
            rule__Clear__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Clear__Group__1_in_rule__Clear__Group__03457);
            rule__Clear__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__0"


    // $ANTLR start "rule__Clear__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1652:1: rule__Clear__Group__0__Impl : ( () ) ;
    public final void rule__Clear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1656:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1657:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1657:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1658:1: ()
            {
             before(grammarAccess.getClearAccess().getClearAction_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1659:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1661:1: 
            {
            }

             after(grammarAccess.getClearAccess().getClearAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__0__Impl"


    // $ANTLR start "rule__Clear__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1671:1: rule__Clear__Group__1 : rule__Clear__Group__1__Impl ;
    public final void rule__Clear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1675:1: ( rule__Clear__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1676:2: rule__Clear__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Clear__Group__1__Impl_in_rule__Clear__Group__13515);
            rule__Clear__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__1"


    // $ANTLR start "rule__Clear__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1682:1: rule__Clear__Group__1__Impl : ( 'clear' ) ;
    public final void rule__Clear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1686:1: ( ( 'clear' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1687:1: ( 'clear' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1687:1: ( 'clear' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1688:1: 'clear'
            {
             before(grammarAccess.getClearAccess().getClearKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Clear__Group__1__Impl3543); 
             after(grammarAccess.getClearAccess().getClearKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clear__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1705:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1709:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1710:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__03578);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__03581);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1717:1: rule__Constant__Group__0__Impl : ( () ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1721:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1722:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1722:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1723:1: ()
            {
             before(grammarAccess.getConstantAccess().getConstantAction_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1724:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1726:1: 
            {
            }

             after(grammarAccess.getConstantAccess().getConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1736:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1740:1: ( rule__Constant__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1741:2: rule__Constant__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__13639);
            rule__Constant__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1747:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__IntegerValueAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1751:1: ( ( ( rule__Constant__IntegerValueAssignment_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1752:1: ( ( rule__Constant__IntegerValueAssignment_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1752:1: ( ( rule__Constant__IntegerValueAssignment_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1753:1: ( rule__Constant__IntegerValueAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getIntegerValueAssignment_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1754:1: ( rule__Constant__IntegerValueAssignment_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1754:2: rule__Constant__IntegerValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constant__IntegerValueAssignment_1_in_rule__Constant__Group__1__Impl3666);
            rule__Constant__IntegerValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getIntegerValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__ProcCall__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1768:1: rule__ProcCall__Group__0 : rule__ProcCall__Group__0__Impl rule__ProcCall__Group__1 ;
    public final void rule__ProcCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1772:1: ( rule__ProcCall__Group__0__Impl rule__ProcCall__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1773:2: rule__ProcCall__Group__0__Impl rule__ProcCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group__0__Impl_in_rule__ProcCall__Group__03700);
            rule__ProcCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group__1_in_rule__ProcCall__Group__03703);
            rule__ProcCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group__0"


    // $ANTLR start "rule__ProcCall__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1780:1: rule__ProcCall__Group__0__Impl : ( ( rule__ProcCall__DeclarationAssignment_0 ) ) ;
    public final void rule__ProcCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1784:1: ( ( ( rule__ProcCall__DeclarationAssignment_0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1785:1: ( ( rule__ProcCall__DeclarationAssignment_0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1785:1: ( ( rule__ProcCall__DeclarationAssignment_0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1786:1: ( rule__ProcCall__DeclarationAssignment_0 )
            {
             before(grammarAccess.getProcCallAccess().getDeclarationAssignment_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1787:1: ( rule__ProcCall__DeclarationAssignment_0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1787:2: rule__ProcCall__DeclarationAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__DeclarationAssignment_0_in_rule__ProcCall__Group__0__Impl3730);
            rule__ProcCall__DeclarationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProcCallAccess().getDeclarationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group__0__Impl"


    // $ANTLR start "rule__ProcCall__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1797:1: rule__ProcCall__Group__1 : rule__ProcCall__Group__1__Impl rule__ProcCall__Group__2 ;
    public final void rule__ProcCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1801:1: ( rule__ProcCall__Group__1__Impl rule__ProcCall__Group__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1802:2: rule__ProcCall__Group__1__Impl rule__ProcCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group__1__Impl_in_rule__ProcCall__Group__13760);
            rule__ProcCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group__2_in_rule__ProcCall__Group__13763);
            rule__ProcCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group__1"


    // $ANTLR start "rule__ProcCall__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1809:1: rule__ProcCall__Group__1__Impl : ( '(' ) ;
    public final void rule__ProcCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1813:1: ( ( '(' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1814:1: ( '(' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1814:1: ( '(' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1815:1: '('
            {
             before(grammarAccess.getProcCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ProcCall__Group__1__Impl3791); 
             after(grammarAccess.getProcCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group__1__Impl"


    // $ANTLR start "rule__ProcCall__Group__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1828:1: rule__ProcCall__Group__2 : rule__ProcCall__Group__2__Impl rule__ProcCall__Group__3 ;
    public final void rule__ProcCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1832:1: ( rule__ProcCall__Group__2__Impl rule__ProcCall__Group__3 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1833:2: rule__ProcCall__Group__2__Impl rule__ProcCall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group__2__Impl_in_rule__ProcCall__Group__23822);
            rule__ProcCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group__3_in_rule__ProcCall__Group__23825);
            rule__ProcCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group__2"


    // $ANTLR start "rule__ProcCall__Group__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1840:1: rule__ProcCall__Group__2__Impl : ( ( rule__ProcCall__ActualArgsAssignment_2 )? ) ;
    public final void rule__ProcCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1844:1: ( ( ( rule__ProcCall__ActualArgsAssignment_2 )? ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1845:1: ( ( rule__ProcCall__ActualArgsAssignment_2 )? )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1845:1: ( ( rule__ProcCall__ActualArgsAssignment_2 )? )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1846:1: ( rule__ProcCall__ActualArgsAssignment_2 )?
            {
             before(grammarAccess.getProcCallAccess().getActualArgsAssignment_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1847:1: ( rule__ProcCall__ActualArgsAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==18||LA10_0==29||LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1847:2: rule__ProcCall__ActualArgsAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ProcCall__ActualArgsAssignment_2_in_rule__ProcCall__Group__2__Impl3852);
                    rule__ProcCall__ActualArgsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcCallAccess().getActualArgsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group__2__Impl"


    // $ANTLR start "rule__ProcCall__Group__3"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1857:1: rule__ProcCall__Group__3 : rule__ProcCall__Group__3__Impl rule__ProcCall__Group__4 ;
    public final void rule__ProcCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1861:1: ( rule__ProcCall__Group__3__Impl rule__ProcCall__Group__4 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1862:2: rule__ProcCall__Group__3__Impl rule__ProcCall__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group__3__Impl_in_rule__ProcCall__Group__33883);
            rule__ProcCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group__4_in_rule__ProcCall__Group__33886);
            rule__ProcCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group__3"


    // $ANTLR start "rule__ProcCall__Group__3__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1869:1: rule__ProcCall__Group__3__Impl : ( ( rule__ProcCall__Group_3__0 )* ) ;
    public final void rule__ProcCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1873:1: ( ( ( rule__ProcCall__Group_3__0 )* ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1874:1: ( ( rule__ProcCall__Group_3__0 )* )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1874:1: ( ( rule__ProcCall__Group_3__0 )* )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1875:1: ( rule__ProcCall__Group_3__0 )*
            {
             before(grammarAccess.getProcCallAccess().getGroup_3()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1876:1: ( rule__ProcCall__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1876:2: rule__ProcCall__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group_3__0_in_rule__ProcCall__Group__3__Impl3913);
            	    rule__ProcCall__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProcCallAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group__3__Impl"


    // $ANTLR start "rule__ProcCall__Group__4"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1886:1: rule__ProcCall__Group__4 : rule__ProcCall__Group__4__Impl ;
    public final void rule__ProcCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1890:1: ( rule__ProcCall__Group__4__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1891:2: rule__ProcCall__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group__4__Impl_in_rule__ProcCall__Group__43944);
            rule__ProcCall__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group__4"


    // $ANTLR start "rule__ProcCall__Group__4__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1897:1: rule__ProcCall__Group__4__Impl : ( ')' ) ;
    public final void rule__ProcCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1901:1: ( ( ')' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1902:1: ( ')' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1902:1: ( ')' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1903:1: ')'
            {
             before(grammarAccess.getProcCallAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ProcCall__Group__4__Impl3972); 
             after(grammarAccess.getProcCallAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group__4__Impl"


    // $ANTLR start "rule__ProcCall__Group_3__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1926:1: rule__ProcCall__Group_3__0 : rule__ProcCall__Group_3__0__Impl rule__ProcCall__Group_3__1 ;
    public final void rule__ProcCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1930:1: ( rule__ProcCall__Group_3__0__Impl rule__ProcCall__Group_3__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1931:2: rule__ProcCall__Group_3__0__Impl rule__ProcCall__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group_3__0__Impl_in_rule__ProcCall__Group_3__04013);
            rule__ProcCall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group_3__1_in_rule__ProcCall__Group_3__04016);
            rule__ProcCall__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group_3__0"


    // $ANTLR start "rule__ProcCall__Group_3__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1938:1: rule__ProcCall__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ProcCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1942:1: ( ( ',' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1943:1: ( ',' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1943:1: ( ',' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1944:1: ','
            {
             before(grammarAccess.getProcCallAccess().getCommaKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ProcCall__Group_3__0__Impl4044); 
             after(grammarAccess.getProcCallAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group_3__0__Impl"


    // $ANTLR start "rule__ProcCall__Group_3__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1957:1: rule__ProcCall__Group_3__1 : rule__ProcCall__Group_3__1__Impl ;
    public final void rule__ProcCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1961:1: ( rule__ProcCall__Group_3__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1962:2: rule__ProcCall__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__Group_3__1__Impl_in_rule__ProcCall__Group_3__14075);
            rule__ProcCall__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group_3__1"


    // $ANTLR start "rule__ProcCall__Group_3__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1968:1: rule__ProcCall__Group_3__1__Impl : ( ( rule__ProcCall__ActualArgsAssignment_3_1 ) ) ;
    public final void rule__ProcCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1972:1: ( ( ( rule__ProcCall__ActualArgsAssignment_3_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1973:1: ( ( rule__ProcCall__ActualArgsAssignment_3_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1973:1: ( ( rule__ProcCall__ActualArgsAssignment_3_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1974:1: ( rule__ProcCall__ActualArgsAssignment_3_1 )
            {
             before(grammarAccess.getProcCallAccess().getActualArgsAssignment_3_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1975:1: ( rule__ProcCall__ActualArgsAssignment_3_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1975:2: rule__ProcCall__ActualArgsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcCall__ActualArgsAssignment_3_1_in_rule__ProcCall__Group_3__1__Impl4102);
            rule__ProcCall__ActualArgsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcCallAccess().getActualArgsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__Group_3__1__Impl"


    // $ANTLR start "rule__ProcDeclaration__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1989:1: rule__ProcDeclaration__Group__0 : rule__ProcDeclaration__Group__0__Impl rule__ProcDeclaration__Group__1 ;
    public final void rule__ProcDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1993:1: ( rule__ProcDeclaration__Group__0__Impl rule__ProcDeclaration__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:1994:2: rule__ProcDeclaration__Group__0__Impl rule__ProcDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__0__Impl_in_rule__ProcDeclaration__Group__04136);
            rule__ProcDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__1_in_rule__ProcDeclaration__Group__04139);
            rule__ProcDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__0"


    // $ANTLR start "rule__ProcDeclaration__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2001:1: rule__ProcDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ProcDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2005:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2006:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2006:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2007:1: ()
            {
             before(grammarAccess.getProcDeclarationAccess().getProcDeclarationAction_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2008:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2010:1: 
            {
            }

             after(grammarAccess.getProcDeclarationAccess().getProcDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ProcDeclaration__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2020:1: rule__ProcDeclaration__Group__1 : rule__ProcDeclaration__Group__1__Impl rule__ProcDeclaration__Group__2 ;
    public final void rule__ProcDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2024:1: ( rule__ProcDeclaration__Group__1__Impl rule__ProcDeclaration__Group__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2025:2: rule__ProcDeclaration__Group__1__Impl rule__ProcDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__1__Impl_in_rule__ProcDeclaration__Group__14197);
            rule__ProcDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__2_in_rule__ProcDeclaration__Group__14200);
            rule__ProcDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__1"


    // $ANTLR start "rule__ProcDeclaration__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2032:1: rule__ProcDeclaration__Group__1__Impl : ( 'to' ) ;
    public final void rule__ProcDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2036:1: ( ( 'to' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2037:1: ( 'to' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2037:1: ( 'to' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2038:1: 'to'
            {
             before(grammarAccess.getProcDeclarationAccess().getToKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ProcDeclaration__Group__1__Impl4228); 
             after(grammarAccess.getProcDeclarationAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ProcDeclaration__Group__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2051:1: rule__ProcDeclaration__Group__2 : rule__ProcDeclaration__Group__2__Impl rule__ProcDeclaration__Group__3 ;
    public final void rule__ProcDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2055:1: ( rule__ProcDeclaration__Group__2__Impl rule__ProcDeclaration__Group__3 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2056:2: rule__ProcDeclaration__Group__2__Impl rule__ProcDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__2__Impl_in_rule__ProcDeclaration__Group__24259);
            rule__ProcDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__3_in_rule__ProcDeclaration__Group__24262);
            rule__ProcDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__2"


    // $ANTLR start "rule__ProcDeclaration__Group__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2063:1: rule__ProcDeclaration__Group__2__Impl : ( ( rule__ProcDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ProcDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2067:1: ( ( ( rule__ProcDeclaration__NameAssignment_2 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2068:1: ( ( rule__ProcDeclaration__NameAssignment_2 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2068:1: ( ( rule__ProcDeclaration__NameAssignment_2 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2069:1: ( rule__ProcDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getProcDeclarationAccess().getNameAssignment_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2070:1: ( rule__ProcDeclaration__NameAssignment_2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2070:2: rule__ProcDeclaration__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__NameAssignment_2_in_rule__ProcDeclaration__Group__2__Impl4289);
            rule__ProcDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ProcDeclaration__Group__3"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2080:1: rule__ProcDeclaration__Group__3 : rule__ProcDeclaration__Group__3__Impl rule__ProcDeclaration__Group__4 ;
    public final void rule__ProcDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2084:1: ( rule__ProcDeclaration__Group__3__Impl rule__ProcDeclaration__Group__4 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2085:2: rule__ProcDeclaration__Group__3__Impl rule__ProcDeclaration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__3__Impl_in_rule__ProcDeclaration__Group__34319);
            rule__ProcDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__4_in_rule__ProcDeclaration__Group__34322);
            rule__ProcDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__3"


    // $ANTLR start "rule__ProcDeclaration__Group__3__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2092:1: rule__ProcDeclaration__Group__3__Impl : ( ( rule__ProcDeclaration__ArgsAssignment_3 )* ) ;
    public final void rule__ProcDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2096:1: ( ( ( rule__ProcDeclaration__ArgsAssignment_3 )* ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2097:1: ( ( rule__ProcDeclaration__ArgsAssignment_3 )* )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2097:1: ( ( rule__ProcDeclaration__ArgsAssignment_3 )* )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2098:1: ( rule__ProcDeclaration__ArgsAssignment_3 )*
            {
             before(grammarAccess.getProcDeclarationAccess().getArgsAssignment_3()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2099:1: ( rule__ProcDeclaration__ArgsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2099:2: rule__ProcDeclaration__ArgsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__ArgsAssignment_3_in_rule__ProcDeclaration__Group__3__Impl4349);
            	    rule__ProcDeclaration__ArgsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProcDeclarationAccess().getArgsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ProcDeclaration__Group__4"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2109:1: rule__ProcDeclaration__Group__4 : rule__ProcDeclaration__Group__4__Impl rule__ProcDeclaration__Group__5 ;
    public final void rule__ProcDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2113:1: ( rule__ProcDeclaration__Group__4__Impl rule__ProcDeclaration__Group__5 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2114:2: rule__ProcDeclaration__Group__4__Impl rule__ProcDeclaration__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__4__Impl_in_rule__ProcDeclaration__Group__44380);
            rule__ProcDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__5_in_rule__ProcDeclaration__Group__44383);
            rule__ProcDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__4"


    // $ANTLR start "rule__ProcDeclaration__Group__4__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2121:1: rule__ProcDeclaration__Group__4__Impl : ( ( rule__ProcDeclaration__InstructionsAssignment_4 ) ) ;
    public final void rule__ProcDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2125:1: ( ( ( rule__ProcDeclaration__InstructionsAssignment_4 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2126:1: ( ( rule__ProcDeclaration__InstructionsAssignment_4 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2126:1: ( ( rule__ProcDeclaration__InstructionsAssignment_4 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2127:1: ( rule__ProcDeclaration__InstructionsAssignment_4 )
            {
             before(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_4()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2128:1: ( rule__ProcDeclaration__InstructionsAssignment_4 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2128:2: rule__ProcDeclaration__InstructionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__InstructionsAssignment_4_in_rule__ProcDeclaration__Group__4__Impl4410);
            rule__ProcDeclaration__InstructionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ProcDeclaration__Group__5"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2138:1: rule__ProcDeclaration__Group__5 : rule__ProcDeclaration__Group__5__Impl rule__ProcDeclaration__Group__6 ;
    public final void rule__ProcDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2142:1: ( rule__ProcDeclaration__Group__5__Impl rule__ProcDeclaration__Group__6 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2143:2: rule__ProcDeclaration__Group__5__Impl rule__ProcDeclaration__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__5__Impl_in_rule__ProcDeclaration__Group__54440);
            rule__ProcDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__6_in_rule__ProcDeclaration__Group__54443);
            rule__ProcDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__5"


    // $ANTLR start "rule__ProcDeclaration__Group__5__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2150:1: rule__ProcDeclaration__Group__5__Impl : ( ( rule__ProcDeclaration__InstructionsAssignment_5 )* ) ;
    public final void rule__ProcDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2154:1: ( ( ( rule__ProcDeclaration__InstructionsAssignment_5 )* ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2155:1: ( ( rule__ProcDeclaration__InstructionsAssignment_5 )* )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2155:1: ( ( rule__ProcDeclaration__InstructionsAssignment_5 )* )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2156:1: ( rule__ProcDeclaration__InstructionsAssignment_5 )*
            {
             before(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_5()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2157:1: ( rule__ProcDeclaration__InstructionsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||(LA13_0>=11 && LA13_0<=17)||LA13_0==21||LA13_0==23||(LA13_0>=25 && LA13_0<=28)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2157:2: rule__ProcDeclaration__InstructionsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__InstructionsAssignment_5_in_rule__ProcDeclaration__Group__5__Impl4470);
            	    rule__ProcDeclaration__InstructionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ProcDeclaration__Group__6"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2167:1: rule__ProcDeclaration__Group__6 : rule__ProcDeclaration__Group__6__Impl ;
    public final void rule__ProcDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2171:1: ( rule__ProcDeclaration__Group__6__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2172:2: rule__ProcDeclaration__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcDeclaration__Group__6__Impl_in_rule__ProcDeclaration__Group__64501);
            rule__ProcDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__6"


    // $ANTLR start "rule__ProcDeclaration__Group__6__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2178:1: rule__ProcDeclaration__Group__6__Impl : ( 'end' ) ;
    public final void rule__ProcDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2182:1: ( ( 'end' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2183:1: ( 'end' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2183:1: ( 'end' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2184:1: 'end'
            {
             before(grammarAccess.getProcDeclarationAccess().getEndKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ProcDeclaration__Group__6__Impl4529); 
             after(grammarAccess.getProcDeclarationAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__Group__6__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2211:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2215:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2216:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__04574);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__1_in_rule__Block__Group__04577);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2223:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2227:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2228:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2228:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2229:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2230:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2232:1: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2242:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2246:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2247:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__14635);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__2_in_rule__Block__Group__14638);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2254:1: rule__Block__Group__1__Impl : ( '[' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2258:1: ( ( '[' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2259:1: ( '[' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2259:1: ( '[' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2260:1: '['
            {
             before(grammarAccess.getBlockAccess().getLeftSquareBracketKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Block__Group__1__Impl4666); 
             after(grammarAccess.getBlockAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2273:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2277:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2278:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__24697);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__3_in_rule__Block__Group__24700);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2285:1: rule__Block__Group__2__Impl : ( ( rule__Block__InstructionsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2289:1: ( ( ( rule__Block__InstructionsAssignment_2 )* ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2290:1: ( ( rule__Block__InstructionsAssignment_2 )* )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2290:1: ( ( rule__Block__InstructionsAssignment_2 )* )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2291:1: ( rule__Block__InstructionsAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2292:1: ( rule__Block__InstructionsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||(LA14_0>=11 && LA14_0<=17)||(LA14_0>=25 && LA14_0<=29)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2292:2: rule__Block__InstructionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl4727);
            	    rule__Block__InstructionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2302:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2306:1: ( rule__Block__Group__3__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2307:2: rule__Block__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__34758);
            rule__Block__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2313:1: rule__Block__Group__3__Impl : ( ']' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2317:1: ( ( ']' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2318:1: ( ']' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2318:1: ( ']' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2319:1: ']'
            {
             before(grammarAccess.getBlockAccess().getRightSquareBracketKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Block__Group__3__Impl4786); 
             after(grammarAccess.getBlockAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__If__Group_0__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2340:1: rule__If__Group_0__0 : rule__If__Group_0__0__Impl rule__If__Group_0__1 ;
    public final void rule__If__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2344:1: ( rule__If__Group_0__0__Impl rule__If__Group_0__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2345:2: rule__If__Group_0__0__Impl rule__If__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__Group_0__0__Impl_in_rule__If__Group_0__04825);
            rule__If__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__If__Group_0__1_in_rule__If__Group_0__04828);
            rule__If__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_0__0"


    // $ANTLR start "rule__If__Group_0__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2352:1: rule__If__Group_0__0__Impl : ( 'ifelse' ) ;
    public final void rule__If__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2356:1: ( ( 'ifelse' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2357:1: ( 'ifelse' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2357:1: ( 'ifelse' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2358:1: 'ifelse'
            {
             before(grammarAccess.getIfAccess().getIfelseKeyword_0_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__If__Group_0__0__Impl4856); 
             after(grammarAccess.getIfAccess().getIfelseKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_0__0__Impl"


    // $ANTLR start "rule__If__Group_0__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2371:1: rule__If__Group_0__1 : rule__If__Group_0__1__Impl rule__If__Group_0__2 ;
    public final void rule__If__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2375:1: ( rule__If__Group_0__1__Impl rule__If__Group_0__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2376:2: rule__If__Group_0__1__Impl rule__If__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__Group_0__1__Impl_in_rule__If__Group_0__14887);
            rule__If__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__If__Group_0__2_in_rule__If__Group_0__14890);
            rule__If__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_0__1"


    // $ANTLR start "rule__If__Group_0__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2383:1: rule__If__Group_0__1__Impl : ( ( rule__If__ConditionAssignment_0_1 ) ) ;
    public final void rule__If__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2387:1: ( ( ( rule__If__ConditionAssignment_0_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2388:1: ( ( rule__If__ConditionAssignment_0_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2388:1: ( ( rule__If__ConditionAssignment_0_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2389:1: ( rule__If__ConditionAssignment_0_1 )
            {
             before(grammarAccess.getIfAccess().getConditionAssignment_0_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2390:1: ( rule__If__ConditionAssignment_0_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2390:2: rule__If__ConditionAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__ConditionAssignment_0_1_in_rule__If__Group_0__1__Impl4917);
            rule__If__ConditionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getConditionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_0__1__Impl"


    // $ANTLR start "rule__If__Group_0__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2400:1: rule__If__Group_0__2 : rule__If__Group_0__2__Impl rule__If__Group_0__3 ;
    public final void rule__If__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2404:1: ( rule__If__Group_0__2__Impl rule__If__Group_0__3 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2405:2: rule__If__Group_0__2__Impl rule__If__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__Group_0__2__Impl_in_rule__If__Group_0__24947);
            rule__If__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__If__Group_0__3_in_rule__If__Group_0__24950);
            rule__If__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_0__2"


    // $ANTLR start "rule__If__Group_0__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2412:1: rule__If__Group_0__2__Impl : ( ( rule__If__ThenPartAssignment_0_2 ) ) ;
    public final void rule__If__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2416:1: ( ( ( rule__If__ThenPartAssignment_0_2 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2417:1: ( ( rule__If__ThenPartAssignment_0_2 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2417:1: ( ( rule__If__ThenPartAssignment_0_2 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2418:1: ( rule__If__ThenPartAssignment_0_2 )
            {
             before(grammarAccess.getIfAccess().getThenPartAssignment_0_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2419:1: ( rule__If__ThenPartAssignment_0_2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2419:2: rule__If__ThenPartAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__ThenPartAssignment_0_2_in_rule__If__Group_0__2__Impl4977);
            rule__If__ThenPartAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getThenPartAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_0__2__Impl"


    // $ANTLR start "rule__If__Group_0__3"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2429:1: rule__If__Group_0__3 : rule__If__Group_0__3__Impl ;
    public final void rule__If__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2433:1: ( rule__If__Group_0__3__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2434:2: rule__If__Group_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__Group_0__3__Impl_in_rule__If__Group_0__35007);
            rule__If__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_0__3"


    // $ANTLR start "rule__If__Group_0__3__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2440:1: rule__If__Group_0__3__Impl : ( ( rule__If__ElsePartAssignment_0_3 ) ) ;
    public final void rule__If__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2444:1: ( ( ( rule__If__ElsePartAssignment_0_3 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2445:1: ( ( rule__If__ElsePartAssignment_0_3 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2445:1: ( ( rule__If__ElsePartAssignment_0_3 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2446:1: ( rule__If__ElsePartAssignment_0_3 )
            {
             before(grammarAccess.getIfAccess().getElsePartAssignment_0_3()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2447:1: ( rule__If__ElsePartAssignment_0_3 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2447:2: rule__If__ElsePartAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__ElsePartAssignment_0_3_in_rule__If__Group_0__3__Impl5034);
            rule__If__ElsePartAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getElsePartAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_0__3__Impl"


    // $ANTLR start "rule__If__Group_1__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2465:1: rule__If__Group_1__0 : rule__If__Group_1__0__Impl rule__If__Group_1__1 ;
    public final void rule__If__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2469:1: ( rule__If__Group_1__0__Impl rule__If__Group_1__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2470:2: rule__If__Group_1__0__Impl rule__If__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__Group_1__0__Impl_in_rule__If__Group_1__05072);
            rule__If__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__If__Group_1__1_in_rule__If__Group_1__05075);
            rule__If__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1__0"


    // $ANTLR start "rule__If__Group_1__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2477:1: rule__If__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__If__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2481:1: ( ( 'if' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2482:1: ( 'if' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2482:1: ( 'if' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2483:1: 'if'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__If__Group_1__0__Impl5103); 
             after(grammarAccess.getIfAccess().getIfKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1__0__Impl"


    // $ANTLR start "rule__If__Group_1__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2496:1: rule__If__Group_1__1 : rule__If__Group_1__1__Impl rule__If__Group_1__2 ;
    public final void rule__If__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2500:1: ( rule__If__Group_1__1__Impl rule__If__Group_1__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2501:2: rule__If__Group_1__1__Impl rule__If__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__Group_1__1__Impl_in_rule__If__Group_1__15134);
            rule__If__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__If__Group_1__2_in_rule__If__Group_1__15137);
            rule__If__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1__1"


    // $ANTLR start "rule__If__Group_1__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2508:1: rule__If__Group_1__1__Impl : ( ( rule__If__ConditionAssignment_1_1 ) ) ;
    public final void rule__If__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2512:1: ( ( ( rule__If__ConditionAssignment_1_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2513:1: ( ( rule__If__ConditionAssignment_1_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2513:1: ( ( rule__If__ConditionAssignment_1_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2514:1: ( rule__If__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getIfAccess().getConditionAssignment_1_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2515:1: ( rule__If__ConditionAssignment_1_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2515:2: rule__If__ConditionAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__ConditionAssignment_1_1_in_rule__If__Group_1__1__Impl5164);
            rule__If__ConditionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getConditionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1__1__Impl"


    // $ANTLR start "rule__If__Group_1__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2525:1: rule__If__Group_1__2 : rule__If__Group_1__2__Impl ;
    public final void rule__If__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2529:1: ( rule__If__Group_1__2__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2530:2: rule__If__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__Group_1__2__Impl_in_rule__If__Group_1__25194);
            rule__If__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1__2"


    // $ANTLR start "rule__If__Group_1__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2536:1: rule__If__Group_1__2__Impl : ( ( rule__If__ThenPartAssignment_1_2 ) ) ;
    public final void rule__If__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2540:1: ( ( ( rule__If__ThenPartAssignment_1_2 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2541:1: ( ( rule__If__ThenPartAssignment_1_2 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2541:1: ( ( rule__If__ThenPartAssignment_1_2 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2542:1: ( rule__If__ThenPartAssignment_1_2 )
            {
             before(grammarAccess.getIfAccess().getThenPartAssignment_1_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2543:1: ( rule__If__ThenPartAssignment_1_2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2543:2: rule__If__ThenPartAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__If__ThenPartAssignment_1_2_in_rule__If__Group_1__2__Impl5221);
            rule__If__ThenPartAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getThenPartAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1__2__Impl"


    // $ANTLR start "rule__Repeat__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2559:1: rule__Repeat__Group__0 : rule__Repeat__Group__0__Impl rule__Repeat__Group__1 ;
    public final void rule__Repeat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2563:1: ( rule__Repeat__Group__0__Impl rule__Repeat__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2564:2: rule__Repeat__Group__0__Impl rule__Repeat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repeat__Group__0__Impl_in_rule__Repeat__Group__05257);
            rule__Repeat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repeat__Group__1_in_rule__Repeat__Group__05260);
            rule__Repeat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__0"


    // $ANTLR start "rule__Repeat__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2571:1: rule__Repeat__Group__0__Impl : ( 'repeat' ) ;
    public final void rule__Repeat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2575:1: ( ( 'repeat' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2576:1: ( 'repeat' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2576:1: ( 'repeat' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2577:1: 'repeat'
            {
             before(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Repeat__Group__0__Impl5288); 
             after(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__0__Impl"


    // $ANTLR start "rule__Repeat__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2590:1: rule__Repeat__Group__1 : rule__Repeat__Group__1__Impl rule__Repeat__Group__2 ;
    public final void rule__Repeat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2594:1: ( rule__Repeat__Group__1__Impl rule__Repeat__Group__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2595:2: rule__Repeat__Group__1__Impl rule__Repeat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repeat__Group__1__Impl_in_rule__Repeat__Group__15319);
            rule__Repeat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Repeat__Group__2_in_rule__Repeat__Group__15322);
            rule__Repeat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__1"


    // $ANTLR start "rule__Repeat__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2602:1: rule__Repeat__Group__1__Impl : ( ( rule__Repeat__ConditionAssignment_1 ) ) ;
    public final void rule__Repeat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2606:1: ( ( ( rule__Repeat__ConditionAssignment_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2607:1: ( ( rule__Repeat__ConditionAssignment_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2607:1: ( ( rule__Repeat__ConditionAssignment_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2608:1: ( rule__Repeat__ConditionAssignment_1 )
            {
             before(grammarAccess.getRepeatAccess().getConditionAssignment_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2609:1: ( rule__Repeat__ConditionAssignment_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2609:2: rule__Repeat__ConditionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repeat__ConditionAssignment_1_in_rule__Repeat__Group__1__Impl5349);
            rule__Repeat__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__1__Impl"


    // $ANTLR start "rule__Repeat__Group__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2619:1: rule__Repeat__Group__2 : rule__Repeat__Group__2__Impl ;
    public final void rule__Repeat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2623:1: ( rule__Repeat__Group__2__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2624:2: rule__Repeat__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repeat__Group__2__Impl_in_rule__Repeat__Group__25379);
            rule__Repeat__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__2"


    // $ANTLR start "rule__Repeat__Group__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2630:1: rule__Repeat__Group__2__Impl : ( ( rule__Repeat__BlockAssignment_2 ) ) ;
    public final void rule__Repeat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2634:1: ( ( ( rule__Repeat__BlockAssignment_2 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2635:1: ( ( rule__Repeat__BlockAssignment_2 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2635:1: ( ( rule__Repeat__BlockAssignment_2 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2636:1: ( rule__Repeat__BlockAssignment_2 )
            {
             before(grammarAccess.getRepeatAccess().getBlockAssignment_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2637:1: ( rule__Repeat__BlockAssignment_2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2637:2: rule__Repeat__BlockAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Repeat__BlockAssignment_2_in_rule__Repeat__Group__2__Impl5406);
            rule__Repeat__BlockAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRepeatAccess().getBlockAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__2__Impl"


    // $ANTLR start "rule__While__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2653:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2657:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2658:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__05442);
            rule__While__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__While__Group__1_in_rule__While__Group__05445);
            rule__While__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2665:1: rule__While__Group__0__Impl : ( 'While' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2669:1: ( ( 'While' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2670:1: ( 'While' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2670:1: ( 'While' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2671:1: 'While'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__While__Group__0__Impl5473); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2684:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2688:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2689:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__15504);
            rule__While__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__While__Group__2_in_rule__While__Group__15507);
            rule__While__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2696:1: rule__While__Group__1__Impl : ( ( rule__While__ConditionAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2700:1: ( ( ( rule__While__ConditionAssignment_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2701:1: ( ( rule__While__ConditionAssignment_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2701:1: ( ( rule__While__ConditionAssignment_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2702:1: ( rule__While__ConditionAssignment_1 )
            {
             before(grammarAccess.getWhileAccess().getConditionAssignment_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2703:1: ( rule__While__ConditionAssignment_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2703:2: rule__While__ConditionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__While__ConditionAssignment_1_in_rule__While__Group__1__Impl5534);
            rule__While__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2713:1: rule__While__Group__2 : rule__While__Group__2__Impl ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2717:1: ( rule__While__Group__2__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2718:2: rule__While__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__25564);
            rule__While__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2724:1: rule__While__Group__2__Impl : ( ( rule__While__BlockAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2728:1: ( ( ( rule__While__BlockAssignment_2 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2729:1: ( ( rule__While__BlockAssignment_2 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2729:1: ( ( rule__While__BlockAssignment_2 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2730:1: ( rule__While__BlockAssignment_2 )
            {
             before(grammarAccess.getWhileAccess().getBlockAssignment_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2731:1: ( rule__While__BlockAssignment_2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2731:2: rule__While__BlockAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__While__BlockAssignment_2_in_rule__While__Group__2__Impl5591);
            rule__While__BlockAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getBlockAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__ParameterCall__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2747:1: rule__ParameterCall__Group__0 : rule__ParameterCall__Group__0__Impl rule__ParameterCall__Group__1 ;
    public final void rule__ParameterCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2751:1: ( rule__ParameterCall__Group__0__Impl rule__ParameterCall__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2752:2: rule__ParameterCall__Group__0__Impl rule__ParameterCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterCall__Group__0__Impl_in_rule__ParameterCall__Group__05627);
            rule__ParameterCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParameterCall__Group__1_in_rule__ParameterCall__Group__05630);
            rule__ParameterCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__0"


    // $ANTLR start "rule__ParameterCall__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2759:1: rule__ParameterCall__Group__0__Impl : ( ':' ) ;
    public final void rule__ParameterCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2763:1: ( ( ':' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2764:1: ( ':' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2764:1: ( ':' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2765:1: ':'
            {
             before(grammarAccess.getParameterCallAccess().getColonKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ParameterCall__Group__0__Impl5658); 
             after(grammarAccess.getParameterCallAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__0__Impl"


    // $ANTLR start "rule__ParameterCall__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2778:1: rule__ParameterCall__Group__1 : rule__ParameterCall__Group__1__Impl ;
    public final void rule__ParameterCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2782:1: ( rule__ParameterCall__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2783:2: rule__ParameterCall__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterCall__Group__1__Impl_in_rule__ParameterCall__Group__15689);
            rule__ParameterCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__1"


    // $ANTLR start "rule__ParameterCall__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2789:1: rule__ParameterCall__Group__1__Impl : ( ( rule__ParameterCall__ParameterAssignment_1 ) ) ;
    public final void rule__ParameterCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2793:1: ( ( ( rule__ParameterCall__ParameterAssignment_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2794:1: ( ( rule__ParameterCall__ParameterAssignment_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2794:1: ( ( rule__ParameterCall__ParameterAssignment_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2795:1: ( rule__ParameterCall__ParameterAssignment_1 )
            {
             before(grammarAccess.getParameterCallAccess().getParameterAssignment_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2796:1: ( rule__ParameterCall__ParameterAssignment_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2796:2: rule__ParameterCall__ParameterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParameterCall__ParameterAssignment_1_in_rule__ParameterCall__Group__1__Impl5716);
            rule__ParameterCall__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterCallAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__Group__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2810:1: rule__EqualExpression__Group__0 : rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 ;
    public final void rule__EqualExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2814:1: ( rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2815:2: rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__0__Impl_in_rule__EqualExpression__Group__05750);
            rule__EqualExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__1_in_rule__EqualExpression__Group__05753);
            rule__EqualExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__0"


    // $ANTLR start "rule__EqualExpression__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2822:1: rule__EqualExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__EqualExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2826:1: ( ( ruleComparisonExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2827:1: ( ruleComparisonExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2827:1: ( ruleComparisonExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2828:1: ruleComparisonExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__Group__0__Impl5780);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualExpression__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2839:1: rule__EqualExpression__Group__1 : rule__EqualExpression__Group__1__Impl ;
    public final void rule__EqualExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2843:1: ( rule__EqualExpression__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2844:2: rule__EqualExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__1__Impl_in_rule__EqualExpression__Group__15809);
            rule__EqualExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__1"


    // $ANTLR start "rule__EqualExpression__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2850:1: rule__EqualExpression__Group__1__Impl : ( ( rule__EqualExpression__Group_1__0 )* ) ;
    public final void rule__EqualExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2854:1: ( ( ( rule__EqualExpression__Group_1__0 )* ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2855:1: ( ( rule__EqualExpression__Group_1__0 )* )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2855:1: ( ( rule__EqualExpression__Group_1__0 )* )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2856:1: ( rule__EqualExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2857:1: ( rule__EqualExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2857:2: rule__EqualExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__0_in_rule__EqualExpression__Group__1__Impl5836);
            	    rule__EqualExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEqualExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2871:1: rule__EqualExpression__Group_1__0 : rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 ;
    public final void rule__EqualExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2875:1: ( rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2876:2: rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__0__Impl_in_rule__EqualExpression__Group_1__05871);
            rule__EqualExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__1_in_rule__EqualExpression__Group_1__05874);
            rule__EqualExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__0"


    // $ANTLR start "rule__EqualExpression__Group_1__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2883:1: rule__EqualExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2887:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2888:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2888:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2889:1: ()
            {
             before(grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2890:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2892:1: 
            {
            }

             after(grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2902:1: rule__EqualExpression__Group_1__1 : rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 ;
    public final void rule__EqualExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2906:1: ( rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2907:2: rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__1__Impl_in_rule__EqualExpression__Group_1__15932);
            rule__EqualExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__2_in_rule__EqualExpression__Group_1__15935);
            rule__EqualExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__1"


    // $ANTLR start "rule__EqualExpression__Group_1__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2914:1: rule__EqualExpression__Group_1__1__Impl : ( '=' ) ;
    public final void rule__EqualExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2918:1: ( ( '=' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2919:1: ( '=' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2919:1: ( '=' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2920:1: '='
            {
             before(grammarAccess.getEqualExpressionAccess().getEqualsSignKeyword_1_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EqualExpression__Group_1__1__Impl5963); 
             after(grammarAccess.getEqualExpressionAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2933:1: rule__EqualExpression__Group_1__2 : rule__EqualExpression__Group_1__2__Impl ;
    public final void rule__EqualExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2937:1: ( rule__EqualExpression__Group_1__2__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2938:2: rule__EqualExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__2__Impl_in_rule__EqualExpression__Group_1__25994);
            rule__EqualExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__2"


    // $ANTLR start "rule__EqualExpression__Group_1__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2944:1: rule__EqualExpression__Group_1__2__Impl : ( ( rule__EqualExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__EqualExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2948:1: ( ( ( rule__EqualExpression__RhsAssignment_1_2 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2949:1: ( ( rule__EqualExpression__RhsAssignment_1_2 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2949:1: ( ( rule__EqualExpression__RhsAssignment_1_2 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2950:1: ( rule__EqualExpression__RhsAssignment_1_2 )
            {
             before(grammarAccess.getEqualExpressionAccess().getRhsAssignment_1_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2951:1: ( rule__EqualExpression__RhsAssignment_1_2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2951:2: rule__EqualExpression__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__RhsAssignment_1_2_in_rule__EqualExpression__Group_1__2__Impl6021);
            rule__EqualExpression__RhsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getRhsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2967:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2971:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2972:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__06057);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__06060);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2979:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2983:1: ( ( ruleAddExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2984:1: ( ruleAddExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2984:1: ( ruleAddExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2985:1: ruleAddExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__Group__0__Impl6087);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:2996:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3000:1: ( rule__ComparisonExpression__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3001:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__16116);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3007:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3011:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3012:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3012:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3013:1: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3014:1: ( rule__ComparisonExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=31 && LA16_0<=32)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3014:2: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl6143);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3028:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3032:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3033:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__06178);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__06181);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3040:1: rule__ComparisonExpression__Group_1__0__Impl : ( ( rule__ComparisonExpression__Alternatives_1_0 ) ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3044:1: ( ( ( rule__ComparisonExpression__Alternatives_1_0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3045:1: ( ( rule__ComparisonExpression__Alternatives_1_0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3045:1: ( ( rule__ComparisonExpression__Alternatives_1_0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3046:1: ( rule__ComparisonExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3047:1: ( rule__ComparisonExpression__Alternatives_1_0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3047:2: rule__ComparisonExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Alternatives_1_0_in_rule__ComparisonExpression__Group_1__0__Impl6208);
            rule__ComparisonExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3057:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3061:1: ( rule__ComparisonExpression__Group_1__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3062:2: rule__ComparisonExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__16238);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3068:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__RhsAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3072:1: ( ( ( rule__ComparisonExpression__RhsAssignment_1_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3073:1: ( ( rule__ComparisonExpression__RhsAssignment_1_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3073:1: ( ( rule__ComparisonExpression__RhsAssignment_1_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3074:1: ( rule__ComparisonExpression__RhsAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3075:1: ( rule__ComparisonExpression__RhsAssignment_1_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3075:2: rule__ComparisonExpression__RhsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__RhsAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl6265);
            rule__ComparisonExpression__RhsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRhsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3089:1: rule__ComparisonExpression__Group_1_0_0__0 : rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1 ;
    public final void rule__ComparisonExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3093:1: ( rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3094:2: rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__0__Impl_in_rule__ComparisonExpression__Group_1_0_0__06299);
            rule__ComparisonExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__1_in_rule__ComparisonExpression__Group_1_0_0__06302);
            rule__ComparisonExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3101:1: rule__ComparisonExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3105:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3106:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3106:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3107:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3108:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3110:1: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3120:1: rule__ComparisonExpression__Group_1_0_0__1 : rule__ComparisonExpression__Group_1_0_0__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3124:1: ( rule__ComparisonExpression__Group_1_0_0__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3125:2: rule__ComparisonExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__1__Impl_in_rule__ComparisonExpression__Group_1_0_0__16360);
            rule__ComparisonExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3131:1: rule__ComparisonExpression__Group_1_0_0__1__Impl : ( '>' ) ;
    public final void rule__ComparisonExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3135:1: ( ( '>' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3136:1: ( '>' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3136:1: ( '>' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3137:1: '>'
            {
             before(grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ComparisonExpression__Group_1_0_0__1__Impl6388); 
             after(grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3154:1: rule__ComparisonExpression__Group_1_0_1__0 : rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1 ;
    public final void rule__ComparisonExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3158:1: ( rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3159:2: rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__0__Impl_in_rule__ComparisonExpression__Group_1_0_1__06423);
            rule__ComparisonExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__1_in_rule__ComparisonExpression__Group_1_0_1__06426);
            rule__ComparisonExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3166:1: rule__ComparisonExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3170:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3171:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3171:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3172:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3173:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3175:1: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3185:1: rule__ComparisonExpression__Group_1_0_1__1 : rule__ComparisonExpression__Group_1_0_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3189:1: ( rule__ComparisonExpression__Group_1_0_1__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3190:2: rule__ComparisonExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__1__Impl_in_rule__ComparisonExpression__Group_1_0_1__16484);
            rule__ComparisonExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3196:1: rule__ComparisonExpression__Group_1_0_1__1__Impl : ( '<' ) ;
    public final void rule__ComparisonExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3200:1: ( ( '<' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3201:1: ( '<' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3201:1: ( '<' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3202:1: '<'
            {
             before(grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ComparisonExpression__Group_1_0_1__1__Impl6512); 
             after(grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3219:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3223:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3224:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__06547);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__06550);
            rule__AddExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__0"


    // $ANTLR start "rule__AddExpression__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3231:1: rule__AddExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3235:1: ( ( ruleMultExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3236:1: ( ruleMultExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3236:1: ( ruleMultExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3237:1: ruleMultExpression
            {
             before(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__AddExpression__Group__0__Impl6577);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__0__Impl"


    // $ANTLR start "rule__AddExpression__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3248:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3252:1: ( rule__AddExpression__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3253:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__16606);
            rule__AddExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__1"


    // $ANTLR start "rule__AddExpression__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3259:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3263:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3264:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3264:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3265:1: ( rule__AddExpression__Group_1__0 )*
            {
             before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3266:1: ( rule__AddExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=33 && LA17_0<=34)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3266:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl6633);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAddExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3280:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3284:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3285:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__06668);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06671);
            rule__AddExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__0"


    // $ANTLR start "rule__AddExpression__Group_1__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3292:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Alternatives_1_0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3296:1: ( ( ( rule__AddExpression__Alternatives_1_0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3297:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3297:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3298:1: ( rule__AddExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getAddExpressionAccess().getAlternatives_1_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3299:1: ( rule__AddExpression__Alternatives_1_0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3299:2: rule__AddExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Alternatives_1_0_in_rule__AddExpression__Group_1__0__Impl6698);
            rule__AddExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3309:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3313:1: ( rule__AddExpression__Group_1__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3314:2: rule__AddExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16728);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__1"


    // $ANTLR start "rule__AddExpression__Group_1__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3320:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RhsAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3324:1: ( ( ( rule__AddExpression__RhsAssignment_1_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3325:1: ( ( rule__AddExpression__RhsAssignment_1_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3325:1: ( ( rule__AddExpression__RhsAssignment_1_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3326:1: ( rule__AddExpression__RhsAssignment_1_1 )
            {
             before(grammarAccess.getAddExpressionAccess().getRhsAssignment_1_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3327:1: ( rule__AddExpression__RhsAssignment_1_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3327:2: rule__AddExpression__RhsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__RhsAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6755);
            rule__AddExpression__RhsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddExpressionAccess().getRhsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3341:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3345:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3346:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__0__Impl_in_rule__AddExpression__Group_1_0_0__06789);
            rule__AddExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__1_in_rule__AddExpression__Group_1_0_0__06792);
            rule__AddExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__0"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3353:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3357:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3358:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3358:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3359:1: ()
            {
             before(grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3360:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3362:1: 
            {
            }

             after(grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3372:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3376:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3377:2: rule__AddExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__1__Impl_in_rule__AddExpression__Group_1_0_0__16850);
            rule__AddExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__1"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3383:1: rule__AddExpression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3387:1: ( ( '+' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3388:1: ( '+' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3388:1: ( '+' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3389:1: '+'
            {
             before(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AddExpression__Group_1_0_0__1__Impl6878); 
             after(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3406:1: rule__AddExpression__Group_1_0_1__0 : rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 ;
    public final void rule__AddExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3410:1: ( rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3411:2: rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__0__Impl_in_rule__AddExpression__Group_1_0_1__06913);
            rule__AddExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__1_in_rule__AddExpression__Group_1_0_1__06916);
            rule__AddExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__0"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3418:1: rule__AddExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3422:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3423:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3423:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3424:1: ()
            {
             before(grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3425:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3427:1: 
            {
            }

             after(grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3437:1: rule__AddExpression__Group_1_0_1__1 : rule__AddExpression__Group_1_0_1__1__Impl ;
    public final void rule__AddExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3441:1: ( rule__AddExpression__Group_1_0_1__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3442:2: rule__AddExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__1__Impl_in_rule__AddExpression__Group_1_0_1__16974);
            rule__AddExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__1"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3448:1: rule__AddExpression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__AddExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3452:1: ( ( '-' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3453:1: ( '-' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3453:1: ( '-' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3454:1: '-'
            {
             before(grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AddExpression__Group_1_0_1__1__Impl7002); 
             after(grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3471:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3475:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3476:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__07037);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__07040);
            rule__MultExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__0"


    // $ANTLR start "rule__MultExpression__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3483:1: rule__MultExpression__Group__0__Impl : ( ruleLiteralsExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3487:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3488:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3488:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3489:1: ruleLiteralsExpression
            {
             before(grammarAccess.getMultExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__MultExpression__Group__0__Impl7067);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__0__Impl"


    // $ANTLR start "rule__MultExpression__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3500:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3504:1: ( rule__MultExpression__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3505:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__17096);
            rule__MultExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__1"


    // $ANTLR start "rule__MultExpression__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3511:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3515:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3516:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3516:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3517:1: ( rule__MultExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3518:1: ( rule__MultExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=35 && LA18_0<=36)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3518:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl7123);
            	    rule__MultExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMultExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3532:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3536:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3537:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__07158);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__07161);
            rule__MultExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__0"


    // $ANTLR start "rule__MultExpression__Group_1__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3544:1: rule__MultExpression__Group_1__0__Impl : ( ( rule__MultExpression__Alternatives_1_0 ) ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3548:1: ( ( ( rule__MultExpression__Alternatives_1_0 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3549:1: ( ( rule__MultExpression__Alternatives_1_0 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3549:1: ( ( rule__MultExpression__Alternatives_1_0 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3550:1: ( rule__MultExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getMultExpressionAccess().getAlternatives_1_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3551:1: ( rule__MultExpression__Alternatives_1_0 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3551:2: rule__MultExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Alternatives_1_0_in_rule__MultExpression__Group_1__0__Impl7188);
            rule__MultExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3561:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3565:1: ( rule__MultExpression__Group_1__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3566:2: rule__MultExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__17218);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__1"


    // $ANTLR start "rule__MultExpression__Group_1__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3572:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__RhsAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3576:1: ( ( ( rule__MultExpression__RhsAssignment_1_1 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3577:1: ( ( rule__MultExpression__RhsAssignment_1_1 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3577:1: ( ( rule__MultExpression__RhsAssignment_1_1 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3578:1: ( rule__MultExpression__RhsAssignment_1_1 )
            {
             before(grammarAccess.getMultExpressionAccess().getRhsAssignment_1_1()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3579:1: ( rule__MultExpression__RhsAssignment_1_1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3579:2: rule__MultExpression__RhsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__RhsAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl7245);
            rule__MultExpression__RhsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultExpressionAccess().getRhsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3593:1: rule__MultExpression__Group_1_0_0__0 : rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1 ;
    public final void rule__MultExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3597:1: ( rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3598:2: rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__0__Impl_in_rule__MultExpression__Group_1_0_0__07279);
            rule__MultExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__1_in_rule__MultExpression__Group_1_0_0__07282);
            rule__MultExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__0"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3605:1: rule__MultExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3609:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3610:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3610:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3611:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3612:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3614:1: 
            {
            }

             after(grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3624:1: rule__MultExpression__Group_1_0_0__1 : rule__MultExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3628:1: ( rule__MultExpression__Group_1_0_0__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3629:2: rule__MultExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__1__Impl_in_rule__MultExpression__Group_1_0_0__17340);
            rule__MultExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__1"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3635:1: rule__MultExpression__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3639:1: ( ( '*' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3640:1: ( '*' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3640:1: ( '*' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3641:1: '*'
            {
             before(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MultExpression__Group_1_0_0__1__Impl7368); 
             after(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3658:1: rule__MultExpression__Group_1_0_1__0 : rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1 ;
    public final void rule__MultExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3662:1: ( rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3663:2: rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__0__Impl_in_rule__MultExpression__Group_1_0_1__07403);
            rule__MultExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__1_in_rule__MultExpression__Group_1_0_1__07406);
            rule__MultExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__0"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3670:1: rule__MultExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3674:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3675:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3675:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3676:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3677:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3679:1: 
            {
            }

             after(grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3689:1: rule__MultExpression__Group_1_0_1__1 : rule__MultExpression__Group_1_0_1__1__Impl ;
    public final void rule__MultExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3693:1: ( rule__MultExpression__Group_1_0_1__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3694:2: rule__MultExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__1__Impl_in_rule__MultExpression__Group_1_0_1__17464);
            rule__MultExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__1"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3700:1: rule__MultExpression__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3704:1: ( ( '/' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3705:1: ( '/' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3705:1: ( '/' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3706:1: '/'
            {
             before(grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MultExpression__Group_1_0_1__1__Impl7492); 
             after(grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__LiteralsExpression__Group_2__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3723:1: rule__LiteralsExpression__Group_2__0 : rule__LiteralsExpression__Group_2__0__Impl rule__LiteralsExpression__Group_2__1 ;
    public final void rule__LiteralsExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3727:1: ( rule__LiteralsExpression__Group_2__0__Impl rule__LiteralsExpression__Group_2__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3728:2: rule__LiteralsExpression__Group_2__0__Impl rule__LiteralsExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_2__0__Impl_in_rule__LiteralsExpression__Group_2__07527);
            rule__LiteralsExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_2__1_in_rule__LiteralsExpression__Group_2__07530);
            rule__LiteralsExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_2__0"


    // $ANTLR start "rule__LiteralsExpression__Group_2__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3735:1: rule__LiteralsExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__LiteralsExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3739:1: ( ( '(' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3740:1: ( '(' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3740:1: ( '(' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3741:1: '('
            {
             before(grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__LiteralsExpression__Group_2__0__Impl7558); 
             after(grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_2__0__Impl"


    // $ANTLR start "rule__LiteralsExpression__Group_2__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3754:1: rule__LiteralsExpression__Group_2__1 : rule__LiteralsExpression__Group_2__1__Impl rule__LiteralsExpression__Group_2__2 ;
    public final void rule__LiteralsExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3758:1: ( rule__LiteralsExpression__Group_2__1__Impl rule__LiteralsExpression__Group_2__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3759:2: rule__LiteralsExpression__Group_2__1__Impl rule__LiteralsExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_2__1__Impl_in_rule__LiteralsExpression__Group_2__17589);
            rule__LiteralsExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_2__2_in_rule__LiteralsExpression__Group_2__17592);
            rule__LiteralsExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_2__1"


    // $ANTLR start "rule__LiteralsExpression__Group_2__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3766:1: rule__LiteralsExpression__Group_2__1__Impl : ( ruleEqualExpression ) ;
    public final void rule__LiteralsExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3770:1: ( ( ruleEqualExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3771:1: ( ruleEqualExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3771:1: ( ruleEqualExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3772:1: ruleEqualExpression
            {
             before(grammarAccess.getLiteralsExpressionAccess().getEqualExpressionParserRuleCall_2_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_rule__LiteralsExpression__Group_2__1__Impl7619);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getLiteralsExpressionAccess().getEqualExpressionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_2__1__Impl"


    // $ANTLR start "rule__LiteralsExpression__Group_2__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3783:1: rule__LiteralsExpression__Group_2__2 : rule__LiteralsExpression__Group_2__2__Impl ;
    public final void rule__LiteralsExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3787:1: ( rule__LiteralsExpression__Group_2__2__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3788:2: rule__LiteralsExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_2__2__Impl_in_rule__LiteralsExpression__Group_2__27648);
            rule__LiteralsExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_2__2"


    // $ANTLR start "rule__LiteralsExpression__Group_2__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3794:1: rule__LiteralsExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__LiteralsExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3798:1: ( ( ')' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3799:1: ( ')' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3799:1: ( ')' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3800:1: ')'
            {
             before(grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__LiteralsExpression__Group_2__2__Impl7676); 
             after(grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_2__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3819:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3823:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3824:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07713);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07716);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3831:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3835:1: ( ( ( '-' )? ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3836:1: ( ( '-' )? )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3836:1: ( ( '-' )? )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3837:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3838:1: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3839:2: '-'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__EInt__Group__0__Impl7745); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3850:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3854:1: ( rule__EInt__Group__1__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3855:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17778);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3861:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3865:1: ( ( RULE_INT ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3866:1: ( RULE_INT )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3866:1: ( RULE_INT )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3867:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7805); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3882:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3886:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3887:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__07838);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__07841);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3894:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3898:1: ( ( () ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3899:1: ( () )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3899:1: ( () )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3900:1: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3901:1: ()
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3903:1: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3913:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3917:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3918:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__17899);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__17902);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3925:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3929:1: ( ( ':' ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3930:1: ( ':' )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3930:1: ( ':' )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3931:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Parameter__Group__1__Impl7930); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3944:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3948:1: ( rule__Parameter__Group__2__Impl )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3949:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__27961);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3955:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3959:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3960:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3960:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3961:1: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3962:1: ( rule__Parameter__NameAssignment_2 )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3962:2: rule__Parameter__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_2_in_rule__Parameter__Group__2__Impl7988);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__LogoProgram__InstructionsAssignment_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3979:1: rule__LogoProgram__InstructionsAssignment_1 : ( ruleInstruction ) ;
    public final void rule__LogoProgram__InstructionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3983:1: ( ( ruleInstruction ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3984:1: ( ruleInstruction )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3984:1: ( ruleInstruction )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3985:1: ruleInstruction
            {
             before(grammarAccess.getLogoProgramAccess().getInstructionsInstructionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_rule__LogoProgram__InstructionsAssignment_18029);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getLogoProgramAccess().getInstructionsInstructionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogoProgram__InstructionsAssignment_1"


    // $ANTLR start "rule__LogoProgram__InstructionsAssignment_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3994:1: rule__LogoProgram__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__LogoProgram__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3998:1: ( ( ruleInstruction ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3999:1: ( ruleInstruction )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:3999:1: ( ruleInstruction )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4000:1: ruleInstruction
            {
             before(grammarAccess.getLogoProgramAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_rule__LogoProgram__InstructionsAssignment_28060);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getLogoProgramAccess().getInstructionsInstructionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogoProgram__InstructionsAssignment_2"


    // $ANTLR start "rule__Back__StepsAssignment_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4009:1: rule__Back__StepsAssignment_1 : ( ruleLiteralsExpression ) ;
    public final void rule__Back__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4013:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4014:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4014:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4015:1: ruleLiteralsExpression
            {
             before(grammarAccess.getBackAccess().getStepsLiteralsExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__Back__StepsAssignment_18091);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getBackAccess().getStepsLiteralsExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Back__StepsAssignment_1"


    // $ANTLR start "rule__Forward__StepsAssignment_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4024:1: rule__Forward__StepsAssignment_1 : ( ruleLiteralsExpression ) ;
    public final void rule__Forward__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4028:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4029:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4029:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4030:1: ruleLiteralsExpression
            {
             before(grammarAccess.getForwardAccess().getStepsLiteralsExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__Forward__StepsAssignment_18122);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getForwardAccess().getStepsLiteralsExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__StepsAssignment_1"


    // $ANTLR start "rule__Left__AngleAssignment_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4039:1: rule__Left__AngleAssignment_2 : ( ruleLiteralsExpression ) ;
    public final void rule__Left__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4043:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4044:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4044:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4045:1: ruleLiteralsExpression
            {
             before(grammarAccess.getLeftAccess().getAngleLiteralsExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__Left__AngleAssignment_28153);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getLeftAccess().getAngleLiteralsExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__AngleAssignment_2"


    // $ANTLR start "rule__Right__AngleAssignment_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4054:1: rule__Right__AngleAssignment_2 : ( ruleLiteralsExpression ) ;
    public final void rule__Right__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4058:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4059:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4059:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4060:1: ruleLiteralsExpression
            {
             before(grammarAccess.getRightAccess().getAngleLiteralsExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__Right__AngleAssignment_28184);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getRightAccess().getAngleLiteralsExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__AngleAssignment_2"


    // $ANTLR start "rule__Constant__IntegerValueAssignment_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4069:1: rule__Constant__IntegerValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__Constant__IntegerValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4073:1: ( ( ruleEInt ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4074:1: ( ruleEInt )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4074:1: ( ruleEInt )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4075:1: ruleEInt
            {
             before(grammarAccess.getConstantAccess().getIntegerValueEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Constant__IntegerValueAssignment_18215);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getIntegerValueEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__IntegerValueAssignment_1"


    // $ANTLR start "rule__ProcCall__DeclarationAssignment_0"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4084:1: rule__ProcCall__DeclarationAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__ProcCall__DeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4088:1: ( ( ( ruleEString ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4089:1: ( ( ruleEString ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4089:1: ( ( ruleEString ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4090:1: ( ruleEString )
            {
             before(grammarAccess.getProcCallAccess().getDeclarationProcDeclarationCrossReference_0_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4091:1: ( ruleEString )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4092:1: ruleEString
            {
             before(grammarAccess.getProcCallAccess().getDeclarationProcDeclarationEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ProcCall__DeclarationAssignment_08250);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcCallAccess().getDeclarationProcDeclarationEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getProcCallAccess().getDeclarationProcDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__DeclarationAssignment_0"


    // $ANTLR start "rule__ProcCall__ActualArgsAssignment_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4103:1: rule__ProcCall__ActualArgsAssignment_2 : ( ruleLiteralsExpression ) ;
    public final void rule__ProcCall__ActualArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4107:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4108:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4108:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4109:1: ruleLiteralsExpression
            {
             before(grammarAccess.getProcCallAccess().getActualArgsLiteralsExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__ProcCall__ActualArgsAssignment_28285);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getProcCallAccess().getActualArgsLiteralsExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__ActualArgsAssignment_2"


    // $ANTLR start "rule__ProcCall__ActualArgsAssignment_3_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4118:1: rule__ProcCall__ActualArgsAssignment_3_1 : ( ruleLiteralsExpression ) ;
    public final void rule__ProcCall__ActualArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4122:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4123:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4123:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4124:1: ruleLiteralsExpression
            {
             before(grammarAccess.getProcCallAccess().getActualArgsLiteralsExpressionParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__ProcCall__ActualArgsAssignment_3_18316);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getProcCallAccess().getActualArgsLiteralsExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcCall__ActualArgsAssignment_3_1"


    // $ANTLR start "rule__ProcDeclaration__NameAssignment_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4133:1: rule__ProcDeclaration__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ProcDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4137:1: ( ( ruleEString ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4138:1: ( ruleEString )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4138:1: ( ruleEString )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4139:1: ruleEString
            {
             before(grammarAccess.getProcDeclarationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ProcDeclaration__NameAssignment_28347);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcDeclarationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ProcDeclaration__ArgsAssignment_3"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4148:1: rule__ProcDeclaration__ArgsAssignment_3 : ( ruleParameter ) ;
    public final void rule__ProcDeclaration__ArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4152:1: ( ( ruleParameter ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4153:1: ( ruleParameter )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4153:1: ( ruleParameter )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4154:1: ruleParameter
            {
             before(grammarAccess.getProcDeclarationAccess().getArgsParameterParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__ProcDeclaration__ArgsAssignment_38378);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getProcDeclarationAccess().getArgsParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__ArgsAssignment_3"


    // $ANTLR start "rule__ProcDeclaration__InstructionsAssignment_4"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4163:1: rule__ProcDeclaration__InstructionsAssignment_4 : ( ruleInstruction ) ;
    public final void rule__ProcDeclaration__InstructionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4167:1: ( ( ruleInstruction ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4168:1: ( ruleInstruction )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4168:1: ( ruleInstruction )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4169:1: ruleInstruction
            {
             before(grammarAccess.getProcDeclarationAccess().getInstructionsInstructionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_rule__ProcDeclaration__InstructionsAssignment_48409);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getProcDeclarationAccess().getInstructionsInstructionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__InstructionsAssignment_4"


    // $ANTLR start "rule__ProcDeclaration__InstructionsAssignment_5"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4178:1: rule__ProcDeclaration__InstructionsAssignment_5 : ( ruleInstruction ) ;
    public final void rule__ProcDeclaration__InstructionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4182:1: ( ( ruleInstruction ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4183:1: ( ruleInstruction )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4183:1: ( ruleInstruction )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4184:1: ruleInstruction
            {
             before(grammarAccess.getProcDeclarationAccess().getInstructionsInstructionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_rule__ProcDeclaration__InstructionsAssignment_58440);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getProcDeclarationAccess().getInstructionsInstructionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcDeclaration__InstructionsAssignment_5"


    // $ANTLR start "rule__Block__InstructionsAssignment_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4193:1: rule__Block__InstructionsAssignment_2 : ( ruleBInstruction ) ;
    public final void rule__Block__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4197:1: ( ( ruleBInstruction ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4198:1: ( ruleBInstruction )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4198:1: ( ruleBInstruction )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4199:1: ruleBInstruction
            {
             before(grammarAccess.getBlockAccess().getInstructionsBInstructionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBInstruction_in_rule__Block__InstructionsAssignment_28471);
            ruleBInstruction();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getInstructionsBInstructionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__InstructionsAssignment_2"


    // $ANTLR start "rule__If__ConditionAssignment_0_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4208:1: rule__If__ConditionAssignment_0_1 : ( ruleLiteralsExpression ) ;
    public final void rule__If__ConditionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4212:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4213:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4213:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4214:1: ruleLiteralsExpression
            {
             before(grammarAccess.getIfAccess().getConditionLiteralsExpressionParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__If__ConditionAssignment_0_18502);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getConditionLiteralsExpressionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionAssignment_0_1"


    // $ANTLR start "rule__If__ThenPartAssignment_0_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4223:1: rule__If__ThenPartAssignment_0_2 : ( ruleBlock ) ;
    public final void rule__If__ThenPartAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4227:1: ( ( ruleBlock ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4228:1: ( ruleBlock )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4228:1: ( ruleBlock )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4229:1: ruleBlock
            {
             before(grammarAccess.getIfAccess().getThenPartBlockParserRuleCall_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__If__ThenPartAssignment_0_28533);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfAccess().getThenPartBlockParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ThenPartAssignment_0_2"


    // $ANTLR start "rule__If__ElsePartAssignment_0_3"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4238:1: rule__If__ElsePartAssignment_0_3 : ( ruleBlock ) ;
    public final void rule__If__ElsePartAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4242:1: ( ( ruleBlock ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4243:1: ( ruleBlock )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4243:1: ( ruleBlock )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4244:1: ruleBlock
            {
             before(grammarAccess.getIfAccess().getElsePartBlockParserRuleCall_0_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__If__ElsePartAssignment_0_38564);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfAccess().getElsePartBlockParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ElsePartAssignment_0_3"


    // $ANTLR start "rule__If__ConditionAssignment_1_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4253:1: rule__If__ConditionAssignment_1_1 : ( ruleLiteralsExpression ) ;
    public final void rule__If__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4257:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4258:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4258:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4259:1: ruleLiteralsExpression
            {
             before(grammarAccess.getIfAccess().getConditionLiteralsExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__If__ConditionAssignment_1_18595);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getConditionLiteralsExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionAssignment_1_1"


    // $ANTLR start "rule__If__ThenPartAssignment_1_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4268:1: rule__If__ThenPartAssignment_1_2 : ( ruleBlock ) ;
    public final void rule__If__ThenPartAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4272:1: ( ( ruleBlock ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4273:1: ( ruleBlock )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4273:1: ( ruleBlock )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4274:1: ruleBlock
            {
             before(grammarAccess.getIfAccess().getThenPartBlockParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__If__ThenPartAssignment_1_28626);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfAccess().getThenPartBlockParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ThenPartAssignment_1_2"


    // $ANTLR start "rule__Repeat__ConditionAssignment_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4283:1: rule__Repeat__ConditionAssignment_1 : ( ruleLiteralsExpression ) ;
    public final void rule__Repeat__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4287:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4288:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4288:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4289:1: ruleLiteralsExpression
            {
             before(grammarAccess.getRepeatAccess().getConditionLiteralsExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__Repeat__ConditionAssignment_18657);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getRepeatAccess().getConditionLiteralsExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__ConditionAssignment_1"


    // $ANTLR start "rule__Repeat__BlockAssignment_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4298:1: rule__Repeat__BlockAssignment_2 : ( ruleBlock ) ;
    public final void rule__Repeat__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4302:1: ( ( ruleBlock ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4303:1: ( ruleBlock )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4303:1: ( ruleBlock )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4304:1: ruleBlock
            {
             before(grammarAccess.getRepeatAccess().getBlockBlockParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__Repeat__BlockAssignment_28688);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getRepeatAccess().getBlockBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__BlockAssignment_2"


    // $ANTLR start "rule__While__ConditionAssignment_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4313:1: rule__While__ConditionAssignment_1 : ( ruleLiteralsExpression ) ;
    public final void rule__While__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4317:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4318:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4318:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4319:1: ruleLiteralsExpression
            {
             before(grammarAccess.getWhileAccess().getConditionLiteralsExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__While__ConditionAssignment_18719);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getConditionLiteralsExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ConditionAssignment_1"


    // $ANTLR start "rule__While__BlockAssignment_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4328:1: rule__While__BlockAssignment_2 : ( ruleBlock ) ;
    public final void rule__While__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4332:1: ( ( ruleBlock ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4333:1: ( ruleBlock )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4333:1: ( ruleBlock )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4334:1: ruleBlock
            {
             before(grammarAccess.getWhileAccess().getBlockBlockParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__While__BlockAssignment_28750);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getBlockBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__BlockAssignment_2"


    // $ANTLR start "rule__ParameterCall__ParameterAssignment_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4343:1: rule__ParameterCall__ParameterAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__ParameterCall__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4347:1: ( ( ( ruleEString ) ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4348:1: ( ( ruleEString ) )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4348:1: ( ( ruleEString ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4349:1: ( ruleEString )
            {
             before(grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_1_0()); 
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4350:1: ( ruleEString )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4351:1: ruleEString
            {
             before(grammarAccess.getParameterCallAccess().getParameterParameterEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ParameterCall__ParameterAssignment_18785);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterCallAccess().getParameterParameterEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterCall__ParameterAssignment_1"


    // $ANTLR start "rule__EqualExpression__RhsAssignment_1_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4362:1: rule__EqualExpression__RhsAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__EqualExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4366:1: ( ( ruleComparisonExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4367:1: ( ruleComparisonExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4367:1: ( ruleComparisonExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4368:1: ruleComparisonExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getRhsComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__RhsAssignment_1_28820);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getRhsComparisonExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__RhsAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__RhsAssignment_1_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4377:1: rule__ComparisonExpression__RhsAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__ComparisonExpression__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4381:1: ( ( ruleAddExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4382:1: ( ruleAddExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4382:1: ( ruleAddExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4383:1: ruleAddExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRhsAddExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__RhsAssignment_1_18851);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRhsAddExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RhsAssignment_1_1"


    // $ANTLR start "rule__AddExpression__RhsAssignment_1_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4392:1: rule__AddExpression__RhsAssignment_1_1 : ( ruleMultExpression ) ;
    public final void rule__AddExpression__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4396:1: ( ( ruleMultExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4397:1: ( ruleMultExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4397:1: ( ruleMultExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4398:1: ruleMultExpression
            {
             before(grammarAccess.getAddExpressionAccess().getRhsMultExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__AddExpression__RhsAssignment_1_18882);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionAccess().getRhsMultExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__RhsAssignment_1_1"


    // $ANTLR start "rule__MultExpression__RhsAssignment_1_1"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4407:1: rule__MultExpression__RhsAssignment_1_1 : ( ruleLiteralsExpression ) ;
    public final void rule__MultExpression__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4411:1: ( ( ruleLiteralsExpression ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4412:1: ( ruleLiteralsExpression )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4412:1: ( ruleLiteralsExpression )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4413:1: ruleLiteralsExpression
            {
             before(grammarAccess.getMultExpressionAccess().getRhsLiteralsExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__MultExpression__RhsAssignment_1_18913);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionAccess().getRhsLiteralsExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__RhsAssignment_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4422:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4426:1: ( ( ruleEString ) )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4427:1: ( ruleEString )
            {
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4427:1: ( ruleEString )
            // ../example.logo.xtext_editor.ui/src-gen/example/logo/xtext_editor/ui/contentassist/antlr/internal/InternalLogoTextualSyntax.g:4428:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_28944);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleLogoProgram_in_entryRuleLogoProgram61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogoProgram68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogoProgram__Group__0_in_ruleLogoProgram94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInstruction128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBInstruction_in_entryRuleBInstruction181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBInstruction188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BInstruction__Alternatives_in_ruleBInstruction214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBack_in_entryRuleBack241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBack248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Back__Group__0_in_ruleBack274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForward_in_entryRuleForward301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForward308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Forward__Group__0_in_ruleForward334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeft_in_entryRuleLeft361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeft368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Left__Group__0_in_ruleLeft394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRight_in_entryRuleRight421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRight428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Right__Group__0_in_ruleRight454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenDown_in_entryRulePenDown481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePenDown488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PenDown__Group__0_in_rulePenDown514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenUp_in_entryRulePenUp541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePenUp548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PenUp__Group__0_in_rulePenUp574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClear_in_entryRuleClear601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClear608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clear__Group__0_in_ruleClear634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstant668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcCall_in_entryRuleProcCall721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcCall728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__Group__0_in_ruleProcCall754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcDeclaration_in_entryRuleProcDeclaration781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcDeclaration788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__0_in_ruleProcDeclaration814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIf_in_entryRuleIf901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIf908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__Alternatives_in_ruleIf934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRepeat_in_entryRuleRepeat961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRepeat968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repeat__Group__0_in_ruleRepeat994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhile1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterCall_in_entryRuleParameterCall1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterCall1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterCall__Group__0_in_ruleParameterCall1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression1141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__0_in_ruleEqualExpression1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression1261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression1381 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralsExpression1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Alternatives_in_ruleLiteralsExpression1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBack_in_rule__Instruction__Alternatives1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForward_in_rule__Instruction__Alternatives1647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeft_in_rule__Instruction__Alternatives1664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRight_in_rule__Instruction__Alternatives1681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenDown_in_rule__Instruction__Alternatives1698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenUp_in_rule__Instruction__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClear_in_rule__Instruction__Alternatives1732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcCall_in_rule__Instruction__Alternatives1749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcDeclaration_in_rule__Instruction__Alternatives1766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__Instruction__Alternatives1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIf_in_rule__Instruction__Alternatives1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRepeat_in_rule__Instruction__Alternatives1817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhile_in_rule__Instruction__Alternatives1834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBack_in_rule__BInstruction__Alternatives1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForward_in_rule__BInstruction__Alternatives1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeft_in_rule__BInstruction__Alternatives1900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRight_in_rule__BInstruction__Alternatives1917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenDown_in_rule__BInstruction__Alternatives1934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenUp_in_rule__BInstruction__Alternatives1951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClear_in_rule__BInstruction__Alternatives1968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcCall_in_rule__BInstruction__Alternatives1985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterCall_in_rule__BInstruction__Alternatives2002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIf_in_rule__BInstruction__Alternatives2019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRepeat_in_rule__BInstruction__Alternatives2036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhile_in_rule__BInstruction__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__Group_0__0_in_rule__If__Alternatives2085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__Group_1__0_in_rule__If__Alternatives2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__0_in_rule__ComparisonExpression__Alternatives_1_02136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__0_in_rule__ComparisonExpression__Alternatives_1_02154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__0_in_rule__AddExpression__Alternatives_1_02187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__0_in_rule__AddExpression__Alternatives_1_02205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__0_in_rule__MultExpression__Alternatives_1_02238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__0_in_rule__MultExpression__Alternatives_1_02256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterCall_in_rule__LiteralsExpression__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_rule__LiteralsExpression__Alternatives2306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_2__0_in_rule__LiteralsExpression__Alternatives2323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogoProgram__Group__0__Impl_in_rule__LogoProgram__Group__02403 = new BitSet(new long[]{0x000000001EA3F830L});
        public static final BitSet FOLLOW_rule__LogoProgram__Group__1_in_rule__LogoProgram__Group__02406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogoProgram__Group__1__Impl_in_rule__LogoProgram__Group__12464 = new BitSet(new long[]{0x000000001EA3F830L});
        public static final BitSet FOLLOW_rule__LogoProgram__Group__2_in_rule__LogoProgram__Group__12467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogoProgram__InstructionsAssignment_1_in_rule__LogoProgram__Group__1__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogoProgram__Group__2__Impl_in_rule__LogoProgram__Group__22524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogoProgram__InstructionsAssignment_2_in_rule__LogoProgram__Group__2__Impl2551 = new BitSet(new long[]{0x000000001EA3F832L});
        public static final BitSet FOLLOW_rule__Back__Group__0__Impl_in_rule__Back__Group__02588 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__Back__Group__1_in_rule__Back__Group__02591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Back__Group__0__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Back__Group__1__Impl_in_rule__Back__Group__12650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Back__StepsAssignment_1_in_rule__Back__Group__1__Impl2677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Forward__Group__0__Impl_in_rule__Forward__Group__02711 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__Forward__Group__1_in_rule__Forward__Group__02714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Forward__Group__0__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Forward__Group__1__Impl_in_rule__Forward__Group__12773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Forward__StepsAssignment_1_in_rule__Forward__Group__1__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Left__Group__0__Impl_in_rule__Left__Group__02834 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Left__Group__1_in_rule__Left__Group__02837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Left__Group__1__Impl_in_rule__Left__Group__12895 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__Left__Group__2_in_rule__Left__Group__12898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Left__Group__1__Impl2926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Left__Group__2__Impl_in_rule__Left__Group__22957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Left__AngleAssignment_2_in_rule__Left__Group__2__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Right__Group__0__Impl_in_rule__Right__Group__03020 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Right__Group__1_in_rule__Right__Group__03023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Right__Group__1__Impl_in_rule__Right__Group__13081 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__Right__Group__2_in_rule__Right__Group__13084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Right__Group__1__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Right__Group__2__Impl_in_rule__Right__Group__23143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Right__AngleAssignment_2_in_rule__Right__Group__2__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PenDown__Group__0__Impl_in_rule__PenDown__Group__03206 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__PenDown__Group__1_in_rule__PenDown__Group__03209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PenDown__Group__1__Impl_in_rule__PenDown__Group__13267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__PenDown__Group__1__Impl3295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PenUp__Group__0__Impl_in_rule__PenUp__Group__03330 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__PenUp__Group__1_in_rule__PenUp__Group__03333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PenUp__Group__1__Impl_in_rule__PenUp__Group__13391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__PenUp__Group__1__Impl3419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clear__Group__0__Impl_in_rule__Clear__Group__03454 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Clear__Group__1_in_rule__Clear__Group__03457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Clear__Group__1__Impl_in_rule__Clear__Group__13515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Clear__Group__1__Impl3543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__03578 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__03581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__13639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constant__IntegerValueAssignment_1_in_rule__Constant__Group__1__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__Group__0__Impl_in_rule__ProcCall__Group__03700 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ProcCall__Group__1_in_rule__ProcCall__Group__03703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__DeclarationAssignment_0_in_rule__ProcCall__Group__0__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__Group__1__Impl_in_rule__ProcCall__Group__13760 = new BitSet(new long[]{0x00000004201C0040L});
        public static final BitSet FOLLOW_rule__ProcCall__Group__2_in_rule__ProcCall__Group__13763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ProcCall__Group__1__Impl3791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__Group__2__Impl_in_rule__ProcCall__Group__23822 = new BitSet(new long[]{0x00000004201C0040L});
        public static final BitSet FOLLOW_rule__ProcCall__Group__3_in_rule__ProcCall__Group__23825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__ActualArgsAssignment_2_in_rule__ProcCall__Group__2__Impl3852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__Group__3__Impl_in_rule__ProcCall__Group__33883 = new BitSet(new long[]{0x00000004201C0040L});
        public static final BitSet FOLLOW_rule__ProcCall__Group__4_in_rule__ProcCall__Group__33886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__Group_3__0_in_rule__ProcCall__Group__3__Impl3913 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__ProcCall__Group__4__Impl_in_rule__ProcCall__Group__43944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ProcCall__Group__4__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__Group_3__0__Impl_in_rule__ProcCall__Group_3__04013 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__ProcCall__Group_3__1_in_rule__ProcCall__Group_3__04016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ProcCall__Group_3__0__Impl4044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__Group_3__1__Impl_in_rule__ProcCall__Group_3__14075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcCall__ActualArgsAssignment_3_1_in_rule__ProcCall__Group_3__1__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__0__Impl_in_rule__ProcDeclaration__Group__04136 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__1_in_rule__ProcDeclaration__Group__04139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__1__Impl_in_rule__ProcDeclaration__Group__14197 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__2_in_rule__ProcDeclaration__Group__14200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ProcDeclaration__Group__1__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__2__Impl_in_rule__ProcDeclaration__Group__24259 = new BitSet(new long[]{0x000000003EA3F830L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__3_in_rule__ProcDeclaration__Group__24262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__NameAssignment_2_in_rule__ProcDeclaration__Group__2__Impl4289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__3__Impl_in_rule__ProcDeclaration__Group__34319 = new BitSet(new long[]{0x000000003EA3F830L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__4_in_rule__ProcDeclaration__Group__34322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__ArgsAssignment_3_in_rule__ProcDeclaration__Group__3__Impl4349 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__4__Impl_in_rule__ProcDeclaration__Group__44380 = new BitSet(new long[]{0x000000001EE3F830L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__5_in_rule__ProcDeclaration__Group__44383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__InstructionsAssignment_4_in_rule__ProcDeclaration__Group__4__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__5__Impl_in_rule__ProcDeclaration__Group__54440 = new BitSet(new long[]{0x000000001EE3F830L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__6_in_rule__ProcDeclaration__Group__54443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__InstructionsAssignment_5_in_rule__ProcDeclaration__Group__5__Impl4470 = new BitSet(new long[]{0x000000001EA3F832L});
        public static final BitSet FOLLOW_rule__ProcDeclaration__Group__6__Impl_in_rule__ProcDeclaration__Group__64501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ProcDeclaration__Group__6__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__04574 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__04577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__14635 = new BitSet(new long[]{0x000000003FA3F830L});
        public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__14638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Block__Group__1__Impl4666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__24697 = new BitSet(new long[]{0x000000003FA3F830L});
        public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__24700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl4727 = new BitSet(new long[]{0x000000003EA3F832L});
        public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__34758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Block__Group__3__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__Group_0__0__Impl_in_rule__If__Group_0__04825 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__If__Group_0__1_in_rule__If__Group_0__04828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__If__Group_0__0__Impl4856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__Group_0__1__Impl_in_rule__If__Group_0__14887 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__If__Group_0__2_in_rule__If__Group_0__14890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__ConditionAssignment_0_1_in_rule__If__Group_0__1__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__Group_0__2__Impl_in_rule__If__Group_0__24947 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__If__Group_0__3_in_rule__If__Group_0__24950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__ThenPartAssignment_0_2_in_rule__If__Group_0__2__Impl4977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__Group_0__3__Impl_in_rule__If__Group_0__35007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__ElsePartAssignment_0_3_in_rule__If__Group_0__3__Impl5034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__Group_1__0__Impl_in_rule__If__Group_1__05072 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__If__Group_1__1_in_rule__If__Group_1__05075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__If__Group_1__0__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__Group_1__1__Impl_in_rule__If__Group_1__15134 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__If__Group_1__2_in_rule__If__Group_1__15137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__ConditionAssignment_1_1_in_rule__If__Group_1__1__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__Group_1__2__Impl_in_rule__If__Group_1__25194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__If__ThenPartAssignment_1_2_in_rule__If__Group_1__2__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repeat__Group__0__Impl_in_rule__Repeat__Group__05257 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__Repeat__Group__1_in_rule__Repeat__Group__05260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Repeat__Group__0__Impl5288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repeat__Group__1__Impl_in_rule__Repeat__Group__15319 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Repeat__Group__2_in_rule__Repeat__Group__15322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repeat__ConditionAssignment_1_in_rule__Repeat__Group__1__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repeat__Group__2__Impl_in_rule__Repeat__Group__25379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Repeat__BlockAssignment_2_in_rule__Repeat__Group__2__Impl5406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__05442 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__05445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__While__Group__0__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__15504 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__15507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__While__ConditionAssignment_1_in_rule__While__Group__1__Impl5534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__25564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__While__BlockAssignment_2_in_rule__While__Group__2__Impl5591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterCall__Group__0__Impl_in_rule__ParameterCall__Group__05627 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParameterCall__Group__1_in_rule__ParameterCall__Group__05630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ParameterCall__Group__0__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterCall__Group__1__Impl_in_rule__ParameterCall__Group__15689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParameterCall__ParameterAssignment_1_in_rule__ParameterCall__Group__1__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__0__Impl_in_rule__EqualExpression__Group__05750 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__1_in_rule__EqualExpression__Group__05753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__Group__0__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__1__Impl_in_rule__EqualExpression__Group__15809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__0_in_rule__EqualExpression__Group__1__Impl5836 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__0__Impl_in_rule__EqualExpression__Group_1__05871 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__1_in_rule__EqualExpression__Group_1__05874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__1__Impl_in_rule__EqualExpression__Group_1__15932 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__2_in_rule__EqualExpression__Group_1__15935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EqualExpression__Group_1__1__Impl5963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__2__Impl_in_rule__EqualExpression__Group_1__25994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__RhsAssignment_1_2_in_rule__EqualExpression__Group_1__2__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__06057 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__06060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__Group__0__Impl6087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__16116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl6143 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__06178 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__06181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Alternatives_1_0_in_rule__ComparisonExpression__Group_1__0__Impl6208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__16238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__RhsAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl6265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__0__Impl_in_rule__ComparisonExpression__Group_1_0_0__06299 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__1_in_rule__ComparisonExpression__Group_1_0_0__06302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__1__Impl_in_rule__ComparisonExpression__Group_1_0_0__16360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ComparisonExpression__Group_1_0_0__1__Impl6388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__0__Impl_in_rule__ComparisonExpression__Group_1_0_1__06423 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__1_in_rule__ComparisonExpression__Group_1_0_1__06426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__1__Impl_in_rule__ComparisonExpression__Group_1_0_1__16484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ComparisonExpression__Group_1_0_1__1__Impl6512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__06547 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__06550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__AddExpression__Group__0__Impl6577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__16606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl6633 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__06668 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Alternatives_1_0_in_rule__AddExpression__Group_1__0__Impl6698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__RhsAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__0__Impl_in_rule__AddExpression__Group_1_0_0__06789 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__1_in_rule__AddExpression__Group_1_0_0__06792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__1__Impl_in_rule__AddExpression__Group_1_0_0__16850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AddExpression__Group_1_0_0__1__Impl6878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__0__Impl_in_rule__AddExpression__Group_1_0_1__06913 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__1_in_rule__AddExpression__Group_1_0_1__06916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__1__Impl_in_rule__AddExpression__Group_1_0_1__16974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AddExpression__Group_1_0_1__1__Impl7002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__07037 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__07040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__MultExpression__Group__0__Impl7067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__17096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl7123 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__07158 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__07161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Alternatives_1_0_in_rule__MultExpression__Group_1__0__Impl7188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__17218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__RhsAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl7245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__0__Impl_in_rule__MultExpression__Group_1_0_0__07279 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__1_in_rule__MultExpression__Group_1_0_0__07282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__1__Impl_in_rule__MultExpression__Group_1_0_0__17340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MultExpression__Group_1_0_0__1__Impl7368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__0__Impl_in_rule__MultExpression__Group_1_0_1__07403 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__1_in_rule__MultExpression__Group_1_0_1__07406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__1__Impl_in_rule__MultExpression__Group_1_0_1__17464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MultExpression__Group_1_0_1__1__Impl7492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_2__0__Impl_in_rule__LiteralsExpression__Group_2__07527 = new BitSet(new long[]{0x0000000420040040L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_2__1_in_rule__LiteralsExpression__Group_2__07530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__LiteralsExpression__Group_2__0__Impl7558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_2__1__Impl_in_rule__LiteralsExpression__Group_2__17589 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_2__2_in_rule__LiteralsExpression__Group_2__17592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_rule__LiteralsExpression__Group_2__1__Impl7619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_2__2__Impl_in_rule__LiteralsExpression__Group_2__27648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__LiteralsExpression__Group_2__2__Impl7676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07713 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EInt__Group__0__Impl7745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__07838 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__07841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__17899 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__17902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Parameter__Group__1__Impl7930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__27961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_2_in_rule__Parameter__Group__2__Impl7988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstruction_in_rule__LogoProgram__InstructionsAssignment_18029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstruction_in_rule__LogoProgram__InstructionsAssignment_28060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__Back__StepsAssignment_18091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__Forward__StepsAssignment_18122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__Left__AngleAssignment_28153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__Right__AngleAssignment_28184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Constant__IntegerValueAssignment_18215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ProcCall__DeclarationAssignment_08250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__ProcCall__ActualArgsAssignment_28285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__ProcCall__ActualArgsAssignment_3_18316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ProcDeclaration__NameAssignment_28347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__ProcDeclaration__ArgsAssignment_38378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstruction_in_rule__ProcDeclaration__InstructionsAssignment_48409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstruction_in_rule__ProcDeclaration__InstructionsAssignment_58440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBInstruction_in_rule__Block__InstructionsAssignment_28471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__If__ConditionAssignment_0_18502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__If__ThenPartAssignment_0_28533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__If__ElsePartAssignment_0_38564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__If__ConditionAssignment_1_18595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__If__ThenPartAssignment_1_28626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__Repeat__ConditionAssignment_18657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__Repeat__BlockAssignment_28688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__While__ConditionAssignment_18719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__While__BlockAssignment_28750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ParameterCall__ParameterAssignment_18785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__RhsAssignment_1_28820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__RhsAssignment_1_18851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__AddExpression__RhsAssignment_1_18882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__MultExpression__RhsAssignment_1_18913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_28944 = new BitSet(new long[]{0x0000000000000002L});
    }


}