package fr.inria.diverse.k3.example.logo.xtext_editor.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.k3.example.logo.xtext_editor.services.LogoTextualSyntaxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogoTextualSyntaxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'back'", "'forward'", "'left'", "'right'", "'pendown'", "'penup'", "'clear'", "'('", "','", "')'", "'to'", "'end'", "'['", "']'", "'ifelse'", "'if'", "'repeat'", "'While'", "':'", "'='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLogoTextualSyntaxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogoTextualSyntaxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogoTextualSyntaxParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g"; }



     	private LogoTextualSyntaxGrammarAccess grammarAccess;
     	
        public InternalLogoTextualSyntaxParser(TokenStream input, LogoTextualSyntaxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LogoProgram";	
       	}
       	
       	@Override
       	protected LogoTextualSyntaxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLogoProgram"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:67:1: entryRuleLogoProgram returns [EObject current=null] : iv_ruleLogoProgram= ruleLogoProgram EOF ;
    public final EObject entryRuleLogoProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogoProgram = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:68:2: (iv_ruleLogoProgram= ruleLogoProgram EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:69:2: iv_ruleLogoProgram= ruleLogoProgram EOF
            {
             newCompositeNode(grammarAccess.getLogoProgramRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogoProgram_in_entryRuleLogoProgram75);
            iv_ruleLogoProgram=ruleLogoProgram();

            state._fsp--;

             current =iv_ruleLogoProgram; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogoProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogoProgram"


    // $ANTLR start "ruleLogoProgram"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:76:1: ruleLogoProgram returns [EObject current=null] : ( () ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* ) ;
    public final EObject ruleLogoProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_1_0 = null;

        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:79:28: ( ( () ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:80:1: ( () ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:80:1: ( () ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )* )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:80:2: () ( (lv_instructions_1_0= ruleInstruction ) ) ( (lv_instructions_2_0= ruleInstruction ) )*
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:80:2: ()
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLogoProgramAccess().getLogoProgramAction_0(),
                        current);
                

            }

            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:86:2: ( (lv_instructions_1_0= ruleInstruction ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:87:1: (lv_instructions_1_0= ruleInstruction )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:87:1: (lv_instructions_1_0= ruleInstruction )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:88:3: lv_instructions_1_0= ruleInstruction
            {
             
            	        newCompositeNode(grammarAccess.getLogoProgramAccess().getInstructionsInstructionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_ruleLogoProgram140);
            lv_instructions_1_0=ruleInstruction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogoProgramRule());
            	        }
                   		add(
                   			current, 
                   			"instructions",
                    		lv_instructions_1_0, 
                    		"Instruction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:104:2: ( (lv_instructions_2_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)||(LA1_0>=11 && LA1_0<=17)||LA1_0==21||LA1_0==23||(LA1_0>=25 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:105:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:105:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:106:3: lv_instructions_2_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogoProgramAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_ruleLogoProgram161);
            	    lv_instructions_2_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogoProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_2_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogoProgram"


    // $ANTLR start "entryRuleInstruction"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:130:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:131:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:132:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_entryRuleInstruction198);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInstruction208); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:139:1: ruleInstruction returns [EObject current=null] : (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_ProcCall_7= ruleProcCall | this_ProcDeclaration_8= ruleProcDeclaration | this_Block_9= ruleBlock | this_If_10= ruleIf | this_Repeat_11= ruleRepeat | this_While_12= ruleWhile ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Back_0 = null;

        EObject this_Forward_1 = null;

        EObject this_Left_2 = null;

        EObject this_Right_3 = null;

        EObject this_PenDown_4 = null;

        EObject this_PenUp_5 = null;

        EObject this_Clear_6 = null;

        EObject this_ProcCall_7 = null;

        EObject this_ProcDeclaration_8 = null;

        EObject this_Block_9 = null;

        EObject this_If_10 = null;

        EObject this_Repeat_11 = null;

        EObject this_While_12 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:142:28: ( (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_ProcCall_7= ruleProcCall | this_ProcDeclaration_8= ruleProcDeclaration | this_Block_9= ruleBlock | this_If_10= ruleIf | this_Repeat_11= ruleRepeat | this_While_12= ruleWhile ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:143:1: (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_ProcCall_7= ruleProcCall | this_ProcDeclaration_8= ruleProcDeclaration | this_Block_9= ruleBlock | this_If_10= ruleIf | this_Repeat_11= ruleRepeat | this_While_12= ruleWhile )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:143:1: (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_ProcCall_7= ruleProcCall | this_ProcDeclaration_8= ruleProcDeclaration | this_Block_9= ruleBlock | this_If_10= ruleIf | this_Repeat_11= ruleRepeat | this_While_12= ruleWhile )
            int alt2=13;
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
            case 21:
                {
                alt2=9;
                }
                break;
            case 23:
                {
                alt2=10;
                }
                break;
            case 25:
            case 26:
                {
                alt2=11;
                }
                break;
            case 27:
                {
                alt2=12;
                }
                break;
            case 28:
                {
                alt2=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:144:5: this_Back_0= ruleBack
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getBackParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBack_in_ruleInstruction255);
                    this_Back_0=ruleBack();

                    state._fsp--;

                     
                            current = this_Back_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:154:5: this_Forward_1= ruleForward
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getForwardParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleForward_in_ruleInstruction282);
                    this_Forward_1=ruleForward();

                    state._fsp--;

                     
                            current = this_Forward_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:164:5: this_Left_2= ruleLeft
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLeftParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeft_in_ruleInstruction309);
                    this_Left_2=ruleLeft();

                    state._fsp--;

                     
                            current = this_Left_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:174:5: this_Right_3= ruleRight
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getRightParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRight_in_ruleInstruction336);
                    this_Right_3=ruleRight();

                    state._fsp--;

                     
                            current = this_Right_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:184:5: this_PenDown_4= rulePenDown
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPenDownParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePenDown_in_ruleInstruction363);
                    this_PenDown_4=rulePenDown();

                    state._fsp--;

                     
                            current = this_PenDown_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:194:5: this_PenUp_5= rulePenUp
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPenUpParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePenUp_in_ruleInstruction390);
                    this_PenUp_5=rulePenUp();

                    state._fsp--;

                     
                            current = this_PenUp_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:204:5: this_Clear_6= ruleClear
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getClearParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClear_in_ruleInstruction417);
                    this_Clear_6=ruleClear();

                    state._fsp--;

                     
                            current = this_Clear_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:214:5: this_ProcCall_7= ruleProcCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getProcCallParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcCall_in_ruleInstruction444);
                    this_ProcCall_7=ruleProcCall();

                    state._fsp--;

                     
                            current = this_ProcCall_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:224:5: this_ProcDeclaration_8= ruleProcDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getProcDeclarationParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcDeclaration_in_ruleInstruction471);
                    this_ProcDeclaration_8=ruleProcDeclaration();

                    state._fsp--;

                     
                            current = this_ProcDeclaration_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:234:5: this_Block_9= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getBlockParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleInstruction498);
                    this_Block_9=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:244:5: this_If_10= ruleIf
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getIfParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIf_in_ruleInstruction525);
                    this_If_10=ruleIf();

                    state._fsp--;

                     
                            current = this_If_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:254:5: this_Repeat_11= ruleRepeat
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getRepeatParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRepeat_in_ruleInstruction552);
                    this_Repeat_11=ruleRepeat();

                    state._fsp--;

                     
                            current = this_Repeat_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:264:5: this_While_12= ruleWhile
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getWhileParserRuleCall_12()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWhile_in_ruleInstruction579);
                    this_While_12=ruleWhile();

                    state._fsp--;

                     
                            current = this_While_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleBInstruction"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:280:1: entryRuleBInstruction returns [EObject current=null] : iv_ruleBInstruction= ruleBInstruction EOF ;
    public final EObject entryRuleBInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBInstruction = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:281:2: (iv_ruleBInstruction= ruleBInstruction EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:282:2: iv_ruleBInstruction= ruleBInstruction EOF
            {
             newCompositeNode(grammarAccess.getBInstructionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBInstruction_in_entryRuleBInstruction614);
            iv_ruleBInstruction=ruleBInstruction();

            state._fsp--;

             current =iv_ruleBInstruction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBInstruction624); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBInstruction"


    // $ANTLR start "ruleBInstruction"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:289:1: ruleBInstruction returns [EObject current=null] : (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_ProcCall_7= ruleProcCall | this_ParameterCall_8= ruleParameterCall | this_If_9= ruleIf | this_Repeat_10= ruleRepeat | this_While_11= ruleWhile ) ;
    public final EObject ruleBInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Back_0 = null;

        EObject this_Forward_1 = null;

        EObject this_Left_2 = null;

        EObject this_Right_3 = null;

        EObject this_PenDown_4 = null;

        EObject this_PenUp_5 = null;

        EObject this_Clear_6 = null;

        EObject this_ProcCall_7 = null;

        EObject this_ParameterCall_8 = null;

        EObject this_If_9 = null;

        EObject this_Repeat_10 = null;

        EObject this_While_11 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:292:28: ( (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_ProcCall_7= ruleProcCall | this_ParameterCall_8= ruleParameterCall | this_If_9= ruleIf | this_Repeat_10= ruleRepeat | this_While_11= ruleWhile ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:293:1: (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_ProcCall_7= ruleProcCall | this_ParameterCall_8= ruleParameterCall | this_If_9= ruleIf | this_Repeat_10= ruleRepeat | this_While_11= ruleWhile )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:293:1: (this_Back_0= ruleBack | this_Forward_1= ruleForward | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_PenDown_4= rulePenDown | this_PenUp_5= rulePenUp | this_Clear_6= ruleClear | this_ProcCall_7= ruleProcCall | this_ParameterCall_8= ruleParameterCall | this_If_9= ruleIf | this_Repeat_10= ruleRepeat | this_While_11= ruleWhile )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt3=8;
                }
                break;
            case 29:
                {
                alt3=9;
                }
                break;
            case 25:
            case 26:
                {
                alt3=10;
                }
                break;
            case 27:
                {
                alt3=11;
                }
                break;
            case 28:
                {
                alt3=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:294:5: this_Back_0= ruleBack
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getBackParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBack_in_ruleBInstruction671);
                    this_Back_0=ruleBack();

                    state._fsp--;

                     
                            current = this_Back_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:304:5: this_Forward_1= ruleForward
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getForwardParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleForward_in_ruleBInstruction698);
                    this_Forward_1=ruleForward();

                    state._fsp--;

                     
                            current = this_Forward_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:314:5: this_Left_2= ruleLeft
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getLeftParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeft_in_ruleBInstruction725);
                    this_Left_2=ruleLeft();

                    state._fsp--;

                     
                            current = this_Left_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:324:5: this_Right_3= ruleRight
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getRightParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRight_in_ruleBInstruction752);
                    this_Right_3=ruleRight();

                    state._fsp--;

                     
                            current = this_Right_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:334:5: this_PenDown_4= rulePenDown
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getPenDownParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePenDown_in_ruleBInstruction779);
                    this_PenDown_4=rulePenDown();

                    state._fsp--;

                     
                            current = this_PenDown_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:344:5: this_PenUp_5= rulePenUp
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getPenUpParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePenUp_in_ruleBInstruction806);
                    this_PenUp_5=rulePenUp();

                    state._fsp--;

                     
                            current = this_PenUp_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:354:5: this_Clear_6= ruleClear
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getClearParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClear_in_ruleBInstruction833);
                    this_Clear_6=ruleClear();

                    state._fsp--;

                     
                            current = this_Clear_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:364:5: this_ProcCall_7= ruleProcCall
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getProcCallParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcCall_in_ruleBInstruction860);
                    this_ProcCall_7=ruleProcCall();

                    state._fsp--;

                     
                            current = this_ProcCall_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:374:5: this_ParameterCall_8= ruleParameterCall
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getParameterCallParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameterCall_in_ruleBInstruction887);
                    this_ParameterCall_8=ruleParameterCall();

                    state._fsp--;

                     
                            current = this_ParameterCall_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:384:5: this_If_9= ruleIf
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getIfParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIf_in_ruleBInstruction914);
                    this_If_9=ruleIf();

                    state._fsp--;

                     
                            current = this_If_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:394:5: this_Repeat_10= ruleRepeat
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getRepeatParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRepeat_in_ruleBInstruction941);
                    this_Repeat_10=ruleRepeat();

                    state._fsp--;

                     
                            current = this_Repeat_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:404:5: this_While_11= ruleWhile
                    {
                     
                            newCompositeNode(grammarAccess.getBInstructionAccess().getWhileParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWhile_in_ruleBInstruction968);
                    this_While_11=ruleWhile();

                    state._fsp--;

                     
                            current = this_While_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBInstruction"


    // $ANTLR start "entryRuleBack"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:420:1: entryRuleBack returns [EObject current=null] : iv_ruleBack= ruleBack EOF ;
    public final EObject entryRuleBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBack = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:421:2: (iv_ruleBack= ruleBack EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:422:2: iv_ruleBack= ruleBack EOF
            {
             newCompositeNode(grammarAccess.getBackRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBack_in_entryRuleBack1003);
            iv_ruleBack=ruleBack();

            state._fsp--;

             current =iv_ruleBack; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBack1013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBack"


    // $ANTLR start "ruleBack"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:429:1: ruleBack returns [EObject current=null] : (otherlv_0= 'back' ( (lv_steps_1_0= ruleLiteralsExpression ) ) ) ;
    public final EObject ruleBack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_steps_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:432:28: ( (otherlv_0= 'back' ( (lv_steps_1_0= ruleLiteralsExpression ) ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:433:1: (otherlv_0= 'back' ( (lv_steps_1_0= ruleLiteralsExpression ) ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:433:1: (otherlv_0= 'back' ( (lv_steps_1_0= ruleLiteralsExpression ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:433:3: otherlv_0= 'back' ( (lv_steps_1_0= ruleLiteralsExpression ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBack1050); 

                	newLeafNode(otherlv_0, grammarAccess.getBackAccess().getBackKeyword_0());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:437:1: ( (lv_steps_1_0= ruleLiteralsExpression ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:438:1: (lv_steps_1_0= ruleLiteralsExpression )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:438:1: (lv_steps_1_0= ruleLiteralsExpression )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:439:3: lv_steps_1_0= ruleLiteralsExpression
            {
             
            	        newCompositeNode(grammarAccess.getBackAccess().getStepsLiteralsExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleBack1071);
            lv_steps_1_0=ruleLiteralsExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBackRule());
            	        }
                   		set(
                   			current, 
                   			"steps",
                    		lv_steps_1_0, 
                    		"LiteralsExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBack"


    // $ANTLR start "entryRuleForward"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:463:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:464:2: (iv_ruleForward= ruleForward EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:465:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForward_in_entryRuleForward1107);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForward1117); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:472:1: ruleForward returns [EObject current=null] : (otherlv_0= 'forward' ( (lv_steps_1_0= ruleLiteralsExpression ) ) ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_steps_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:475:28: ( (otherlv_0= 'forward' ( (lv_steps_1_0= ruleLiteralsExpression ) ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:476:1: (otherlv_0= 'forward' ( (lv_steps_1_0= ruleLiteralsExpression ) ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:476:1: (otherlv_0= 'forward' ( (lv_steps_1_0= ruleLiteralsExpression ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:476:3: otherlv_0= 'forward' ( (lv_steps_1_0= ruleLiteralsExpression ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleForward1154); 

                	newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getForwardKeyword_0());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:480:1: ( (lv_steps_1_0= ruleLiteralsExpression ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:481:1: (lv_steps_1_0= ruleLiteralsExpression )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:481:1: (lv_steps_1_0= ruleLiteralsExpression )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:482:3: lv_steps_1_0= ruleLiteralsExpression
            {
             
            	        newCompositeNode(grammarAccess.getForwardAccess().getStepsLiteralsExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleForward1175);
            lv_steps_1_0=ruleLiteralsExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForwardRule());
            	        }
                   		set(
                   			current, 
                   			"steps",
                    		lv_steps_1_0, 
                    		"LiteralsExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleLeft"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:506:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:507:2: (iv_ruleLeft= ruleLeft EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:508:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeft_in_entryRuleLeft1211);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeft1221); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:515:1: ruleLeft returns [EObject current=null] : ( () otherlv_1= 'left' ( (lv_angle_2_0= ruleLiteralsExpression ) ) ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_angle_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:518:28: ( ( () otherlv_1= 'left' ( (lv_angle_2_0= ruleLiteralsExpression ) ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:519:1: ( () otherlv_1= 'left' ( (lv_angle_2_0= ruleLiteralsExpression ) ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:519:1: ( () otherlv_1= 'left' ( (lv_angle_2_0= ruleLiteralsExpression ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:519:2: () otherlv_1= 'left' ( (lv_angle_2_0= ruleLiteralsExpression ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:519:2: ()
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:520:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLeftAccess().getLeftAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLeft1267); 

                	newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftKeyword_1());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:529:1: ( (lv_angle_2_0= ruleLiteralsExpression ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:530:1: (lv_angle_2_0= ruleLiteralsExpression )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:530:1: (lv_angle_2_0= ruleLiteralsExpression )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:531:3: lv_angle_2_0= ruleLiteralsExpression
            {
             
            	        newCompositeNode(grammarAccess.getLeftAccess().getAngleLiteralsExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleLeft1288);
            lv_angle_2_0=ruleLiteralsExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeftRule());
            	        }
                   		set(
                   			current, 
                   			"angle",
                    		lv_angle_2_0, 
                    		"LiteralsExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:555:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:556:2: (iv_ruleRight= ruleRight EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:557:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRight_in_entryRuleRight1324);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRight1334); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:564:1: ruleRight returns [EObject current=null] : ( () otherlv_1= 'right' ( (lv_angle_2_0= ruleLiteralsExpression ) ) ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_angle_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:567:28: ( ( () otherlv_1= 'right' ( (lv_angle_2_0= ruleLiteralsExpression ) ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:568:1: ( () otherlv_1= 'right' ( (lv_angle_2_0= ruleLiteralsExpression ) ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:568:1: ( () otherlv_1= 'right' ( (lv_angle_2_0= ruleLiteralsExpression ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:568:2: () otherlv_1= 'right' ( (lv_angle_2_0= ruleLiteralsExpression ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:568:2: ()
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:569:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRightAccess().getRightAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRight1380); 

                	newLeafNode(otherlv_1, grammarAccess.getRightAccess().getRightKeyword_1());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:578:1: ( (lv_angle_2_0= ruleLiteralsExpression ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:579:1: (lv_angle_2_0= ruleLiteralsExpression )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:579:1: (lv_angle_2_0= ruleLiteralsExpression )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:580:3: lv_angle_2_0= ruleLiteralsExpression
            {
             
            	        newCompositeNode(grammarAccess.getRightAccess().getAngleLiteralsExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleRight1401);
            lv_angle_2_0=ruleLiteralsExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRightRule());
            	        }
                   		set(
                   			current, 
                   			"angle",
                    		lv_angle_2_0, 
                    		"LiteralsExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRulePenDown"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:604:1: entryRulePenDown returns [EObject current=null] : iv_rulePenDown= rulePenDown EOF ;
    public final EObject entryRulePenDown() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenDown = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:605:2: (iv_rulePenDown= rulePenDown EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:606:2: iv_rulePenDown= rulePenDown EOF
            {
             newCompositeNode(grammarAccess.getPenDownRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePenDown_in_entryRulePenDown1437);
            iv_rulePenDown=rulePenDown();

            state._fsp--;

             current =iv_rulePenDown; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePenDown1447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePenDown"


    // $ANTLR start "rulePenDown"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:613:1: rulePenDown returns [EObject current=null] : ( () otherlv_1= 'pendown' ) ;
    public final EObject rulePenDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:616:28: ( ( () otherlv_1= 'pendown' ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:617:1: ( () otherlv_1= 'pendown' )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:617:1: ( () otherlv_1= 'pendown' )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:617:2: () otherlv_1= 'pendown'
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:617:2: ()
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:618:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPenDownAccess().getPenDownAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePenDown1493); 

                	newLeafNode(otherlv_1, grammarAccess.getPenDownAccess().getPendownKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePenDown"


    // $ANTLR start "entryRulePenUp"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:635:1: entryRulePenUp returns [EObject current=null] : iv_rulePenUp= rulePenUp EOF ;
    public final EObject entryRulePenUp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenUp = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:636:2: (iv_rulePenUp= rulePenUp EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:637:2: iv_rulePenUp= rulePenUp EOF
            {
             newCompositeNode(grammarAccess.getPenUpRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePenUp_in_entryRulePenUp1529);
            iv_rulePenUp=rulePenUp();

            state._fsp--;

             current =iv_rulePenUp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePenUp1539); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePenUp"


    // $ANTLR start "rulePenUp"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:644:1: rulePenUp returns [EObject current=null] : ( () otherlv_1= 'penup' ) ;
    public final EObject rulePenUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:647:28: ( ( () otherlv_1= 'penup' ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:648:1: ( () otherlv_1= 'penup' )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:648:1: ( () otherlv_1= 'penup' )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:648:2: () otherlv_1= 'penup'
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:648:2: ()
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:649:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPenUpAccess().getPenUpAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePenUp1585); 

                	newLeafNode(otherlv_1, grammarAccess.getPenUpAccess().getPenupKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePenUp"


    // $ANTLR start "entryRuleClear"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:666:1: entryRuleClear returns [EObject current=null] : iv_ruleClear= ruleClear EOF ;
    public final EObject entryRuleClear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClear = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:667:2: (iv_ruleClear= ruleClear EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:668:2: iv_ruleClear= ruleClear EOF
            {
             newCompositeNode(grammarAccess.getClearRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClear_in_entryRuleClear1621);
            iv_ruleClear=ruleClear();

            state._fsp--;

             current =iv_ruleClear; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClear1631); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClear"


    // $ANTLR start "ruleClear"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:675:1: ruleClear returns [EObject current=null] : ( () otherlv_1= 'clear' ) ;
    public final EObject ruleClear() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:678:28: ( ( () otherlv_1= 'clear' ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:679:1: ( () otherlv_1= 'clear' )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:679:1: ( () otherlv_1= 'clear' )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:679:2: () otherlv_1= 'clear'
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:679:2: ()
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:680:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClearAccess().getClearAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClear1677); 

                	newLeafNode(otherlv_1, grammarAccess.getClearAccess().getClearKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClear"


    // $ANTLR start "entryRuleConstant"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:697:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:698:2: (iv_ruleConstant= ruleConstant EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:699:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_entryRuleConstant1713);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstant1723); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:706:1: ruleConstant returns [EObject current=null] : ( () ( (lv_integerValue_1_0= ruleEInt ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_integerValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:709:28: ( ( () ( (lv_integerValue_1_0= ruleEInt ) ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:710:1: ( () ( (lv_integerValue_1_0= ruleEInt ) ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:710:1: ( () ( (lv_integerValue_1_0= ruleEInt ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:710:2: () ( (lv_integerValue_1_0= ruleEInt ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:710:2: ()
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:711:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantAccess().getConstantAction_0(),
                        current);
                

            }

            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:716:2: ( (lv_integerValue_1_0= ruleEInt ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:717:1: (lv_integerValue_1_0= ruleEInt )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:717:1: (lv_integerValue_1_0= ruleEInt )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:718:3: lv_integerValue_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getIntegerValueEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConstant1778);
            lv_integerValue_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantRule());
            	        }
                   		set(
                   			current, 
                   			"integerValue",
                    		lv_integerValue_1_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleProcCall"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:742:1: entryRuleProcCall returns [EObject current=null] : iv_ruleProcCall= ruleProcCall EOF ;
    public final EObject entryRuleProcCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcCall = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:743:2: (iv_ruleProcCall= ruleProcCall EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:744:2: iv_ruleProcCall= ruleProcCall EOF
            {
             newCompositeNode(grammarAccess.getProcCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcCall_in_entryRuleProcCall1814);
            iv_ruleProcCall=ruleProcCall();

            state._fsp--;

             current =iv_ruleProcCall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcCall1824); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcCall"


    // $ANTLR start "ruleProcCall"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:751:1: ruleProcCall returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_actualArgs_2_0= ruleLiteralsExpression ) )? (otherlv_3= ',' ( (lv_actualArgs_4_0= ruleLiteralsExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleProcCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actualArgs_2_0 = null;

        EObject lv_actualArgs_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:754:28: ( ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_actualArgs_2_0= ruleLiteralsExpression ) )? (otherlv_3= ',' ( (lv_actualArgs_4_0= ruleLiteralsExpression ) ) )* otherlv_5= ')' ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:755:1: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_actualArgs_2_0= ruleLiteralsExpression ) )? (otherlv_3= ',' ( (lv_actualArgs_4_0= ruleLiteralsExpression ) ) )* otherlv_5= ')' )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:755:1: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_actualArgs_2_0= ruleLiteralsExpression ) )? (otherlv_3= ',' ( (lv_actualArgs_4_0= ruleLiteralsExpression ) ) )* otherlv_5= ')' )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:755:2: ( ( ruleEString ) ) otherlv_1= '(' ( (lv_actualArgs_2_0= ruleLiteralsExpression ) )? (otherlv_3= ',' ( (lv_actualArgs_4_0= ruleLiteralsExpression ) ) )* otherlv_5= ')'
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:755:2: ( ( ruleEString ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:756:1: ( ruleEString )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:756:1: ( ruleEString )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:757:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProcCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getProcCallAccess().getDeclarationProcDeclarationCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcCall1872);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProcCall1884); 

                	newLeafNode(otherlv_1, grammarAccess.getProcCallAccess().getLeftParenthesisKeyword_1());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:774:1: ( (lv_actualArgs_2_0= ruleLiteralsExpression ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==18||LA4_0==29||LA4_0==34) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:775:1: (lv_actualArgs_2_0= ruleLiteralsExpression )
                    {
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:775:1: (lv_actualArgs_2_0= ruleLiteralsExpression )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:776:3: lv_actualArgs_2_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcCallAccess().getActualArgsLiteralsExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleProcCall1905);
                    lv_actualArgs_2_0=ruleLiteralsExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcCallRule());
                    	        }
                           		add(
                           			current, 
                           			"actualArgs",
                            		lv_actualArgs_2_0, 
                            		"LiteralsExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:792:3: (otherlv_3= ',' ( (lv_actualArgs_4_0= ruleLiteralsExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:792:5: otherlv_3= ',' ( (lv_actualArgs_4_0= ruleLiteralsExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProcCall1919); 

            	        	newLeafNode(otherlv_3, grammarAccess.getProcCallAccess().getCommaKeyword_3_0());
            	        
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:796:1: ( (lv_actualArgs_4_0= ruleLiteralsExpression ) )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:797:1: (lv_actualArgs_4_0= ruleLiteralsExpression )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:797:1: (lv_actualArgs_4_0= ruleLiteralsExpression )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:798:3: lv_actualArgs_4_0= ruleLiteralsExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcCallAccess().getActualArgsLiteralsExpressionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleProcCall1940);
            	    lv_actualArgs_4_0=ruleLiteralsExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcCallRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actualArgs",
            	            		lv_actualArgs_4_0, 
            	            		"LiteralsExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleProcCall1954); 

                	newLeafNode(otherlv_5, grammarAccess.getProcCallAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcCall"


    // $ANTLR start "entryRuleProcDeclaration"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:826:1: entryRuleProcDeclaration returns [EObject current=null] : iv_ruleProcDeclaration= ruleProcDeclaration EOF ;
    public final EObject entryRuleProcDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcDeclaration = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:827:2: (iv_ruleProcDeclaration= ruleProcDeclaration EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:828:2: iv_ruleProcDeclaration= ruleProcDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProcDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcDeclaration_in_entryRuleProcDeclaration1990);
            iv_ruleProcDeclaration=ruleProcDeclaration();

            state._fsp--;

             current =iv_ruleProcDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcDeclaration2000); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcDeclaration"


    // $ANTLR start "ruleProcDeclaration"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:835:1: ruleProcDeclaration returns [EObject current=null] : ( () otherlv_1= 'to' ( (lv_name_2_0= ruleEString ) ) ( (lv_args_3_0= ruleParameter ) )* ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* otherlv_6= 'end' ) ;
    public final EObject ruleProcDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_args_3_0 = null;

        EObject lv_instructions_4_0 = null;

        EObject lv_instructions_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:838:28: ( ( () otherlv_1= 'to' ( (lv_name_2_0= ruleEString ) ) ( (lv_args_3_0= ruleParameter ) )* ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* otherlv_6= 'end' ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:839:1: ( () otherlv_1= 'to' ( (lv_name_2_0= ruleEString ) ) ( (lv_args_3_0= ruleParameter ) )* ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* otherlv_6= 'end' )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:839:1: ( () otherlv_1= 'to' ( (lv_name_2_0= ruleEString ) ) ( (lv_args_3_0= ruleParameter ) )* ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* otherlv_6= 'end' )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:839:2: () otherlv_1= 'to' ( (lv_name_2_0= ruleEString ) ) ( (lv_args_3_0= ruleParameter ) )* ( (lv_instructions_4_0= ruleInstruction ) ) ( (lv_instructions_5_0= ruleInstruction ) )* otherlv_6= 'end'
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:839:2: ()
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:840:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcDeclarationAccess().getProcDeclarationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleProcDeclaration2046); 

                	newLeafNode(otherlv_1, grammarAccess.getProcDeclarationAccess().getToKeyword_1());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:849:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:850:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:850:1: (lv_name_2_0= ruleEString )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:851:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcDeclaration2067);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:867:2: ( (lv_args_3_0= ruleParameter ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:868:1: (lv_args_3_0= ruleParameter )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:868:1: (lv_args_3_0= ruleParameter )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:869:3: lv_args_3_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getArgsParameterParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleProcDeclaration2088);
            	    lv_args_3_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"args",
            	            		lv_args_3_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:885:3: ( (lv_instructions_4_0= ruleInstruction ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:886:1: (lv_instructions_4_0= ruleInstruction )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:886:1: (lv_instructions_4_0= ruleInstruction )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:887:3: lv_instructions_4_0= ruleInstruction
            {
             
            	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getInstructionsInstructionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_ruleProcDeclaration2110);
            lv_instructions_4_0=ruleInstruction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"instructions",
                    		lv_instructions_4_0, 
                    		"Instruction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:903:2: ( (lv_instructions_5_0= ruleInstruction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||(LA7_0>=11 && LA7_0<=17)||LA7_0==21||LA7_0==23||(LA7_0>=25 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:904:1: (lv_instructions_5_0= ruleInstruction )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:904:1: (lv_instructions_5_0= ruleInstruction )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:905:3: lv_instructions_5_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcDeclarationAccess().getInstructionsInstructionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleInstruction_in_ruleProcDeclaration2131);
            	    lv_instructions_5_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_5_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleProcDeclaration2144); 

                	newLeafNode(otherlv_6, grammarAccess.getProcDeclarationAccess().getEndKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcDeclaration"


    // $ANTLR start "entryRuleBlock"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:933:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:934:2: (iv_ruleBlock= ruleBlock EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:935:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock2180);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlock2190); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:942:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_instructions_2_0= ruleBInstruction ) )* otherlv_3= ']' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:945:28: ( ( () otherlv_1= '[' ( (lv_instructions_2_0= ruleBInstruction ) )* otherlv_3= ']' ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:946:1: ( () otherlv_1= '[' ( (lv_instructions_2_0= ruleBInstruction ) )* otherlv_3= ']' )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:946:1: ( () otherlv_1= '[' ( (lv_instructions_2_0= ruleBInstruction ) )* otherlv_3= ']' )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:946:2: () otherlv_1= '[' ( (lv_instructions_2_0= ruleBInstruction ) )* otherlv_3= ']'
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:946:2: ()
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:947:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBlock2236); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftSquareBracketKeyword_1());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:956:1: ( (lv_instructions_2_0= ruleBInstruction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||(LA8_0>=11 && LA8_0<=17)||(LA8_0>=25 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:957:1: (lv_instructions_2_0= ruleBInstruction )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:957:1: (lv_instructions_2_0= ruleBInstruction )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:958:3: lv_instructions_2_0= ruleBInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getInstructionsBInstructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBInstruction_in_ruleBlock2257);
            	    lv_instructions_2_0=ruleBInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_2_0, 
            	            		"BInstruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBlock2270); 

                	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleIf"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:986:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:987:2: (iv_ruleIf= ruleIf EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:988:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIf_in_entryRuleIf2306);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIf2316); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:995:1: ruleIf returns [EObject current=null] : ( (otherlv_0= 'ifelse' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_thenPart_2_0= ruleBlock ) ) ( (lv_elsePart_3_0= ruleBlock ) ) ) | (otherlv_4= 'if' ( (lv_condition_5_0= ruleLiteralsExpression ) ) ( (lv_thenPart_6_0= ruleBlock ) ) ) ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenPart_2_0 = null;

        EObject lv_elsePart_3_0 = null;

        EObject lv_condition_5_0 = null;

        EObject lv_thenPart_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:998:28: ( ( (otherlv_0= 'ifelse' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_thenPart_2_0= ruleBlock ) ) ( (lv_elsePart_3_0= ruleBlock ) ) ) | (otherlv_4= 'if' ( (lv_condition_5_0= ruleLiteralsExpression ) ) ( (lv_thenPart_6_0= ruleBlock ) ) ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:999:1: ( (otherlv_0= 'ifelse' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_thenPart_2_0= ruleBlock ) ) ( (lv_elsePart_3_0= ruleBlock ) ) ) | (otherlv_4= 'if' ( (lv_condition_5_0= ruleLiteralsExpression ) ) ( (lv_thenPart_6_0= ruleBlock ) ) ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:999:1: ( (otherlv_0= 'ifelse' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_thenPart_2_0= ruleBlock ) ) ( (lv_elsePart_3_0= ruleBlock ) ) ) | (otherlv_4= 'if' ( (lv_condition_5_0= ruleLiteralsExpression ) ) ( (lv_thenPart_6_0= ruleBlock ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:999:2: (otherlv_0= 'ifelse' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_thenPart_2_0= ruleBlock ) ) ( (lv_elsePart_3_0= ruleBlock ) ) )
                    {
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:999:2: (otherlv_0= 'ifelse' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_thenPart_2_0= ruleBlock ) ) ( (lv_elsePart_3_0= ruleBlock ) ) )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:999:4: otherlv_0= 'ifelse' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_thenPart_2_0= ruleBlock ) ) ( (lv_elsePart_3_0= ruleBlock ) )
                    {
                    otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIf2354); 

                        	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfelseKeyword_0_0());
                        
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1003:1: ( (lv_condition_1_0= ruleLiteralsExpression ) )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1004:1: (lv_condition_1_0= ruleLiteralsExpression )
                    {
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1004:1: (lv_condition_1_0= ruleLiteralsExpression )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1005:3: lv_condition_1_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfAccess().getConditionLiteralsExpressionParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleIf2375);
                    lv_condition_1_0=ruleLiteralsExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_1_0, 
                            		"LiteralsExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1021:2: ( (lv_thenPart_2_0= ruleBlock ) )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1022:1: (lv_thenPart_2_0= ruleBlock )
                    {
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1022:1: (lv_thenPart_2_0= ruleBlock )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1023:3: lv_thenPart_2_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfAccess().getThenPartBlockParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIf2396);
                    lv_thenPart_2_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfRule());
                    	        }
                           		set(
                           			current, 
                           			"thenPart",
                            		lv_thenPart_2_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1039:2: ( (lv_elsePart_3_0= ruleBlock ) )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1040:1: (lv_elsePart_3_0= ruleBlock )
                    {
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1040:1: (lv_elsePart_3_0= ruleBlock )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1041:3: lv_elsePart_3_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfAccess().getElsePartBlockParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIf2417);
                    lv_elsePart_3_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfRule());
                    	        }
                           		set(
                           			current, 
                           			"elsePart",
                            		lv_elsePart_3_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1058:6: (otherlv_4= 'if' ( (lv_condition_5_0= ruleLiteralsExpression ) ) ( (lv_thenPart_6_0= ruleBlock ) ) )
                    {
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1058:6: (otherlv_4= 'if' ( (lv_condition_5_0= ruleLiteralsExpression ) ) ( (lv_thenPart_6_0= ruleBlock ) ) )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1058:8: otherlv_4= 'if' ( (lv_condition_5_0= ruleLiteralsExpression ) ) ( (lv_thenPart_6_0= ruleBlock ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleIf2437); 

                        	newLeafNode(otherlv_4, grammarAccess.getIfAccess().getIfKeyword_1_0());
                        
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1062:1: ( (lv_condition_5_0= ruleLiteralsExpression ) )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1063:1: (lv_condition_5_0= ruleLiteralsExpression )
                    {
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1063:1: (lv_condition_5_0= ruleLiteralsExpression )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1064:3: lv_condition_5_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfAccess().getConditionLiteralsExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleIf2458);
                    lv_condition_5_0=ruleLiteralsExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_5_0, 
                            		"LiteralsExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1080:2: ( (lv_thenPart_6_0= ruleBlock ) )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1081:1: (lv_thenPart_6_0= ruleBlock )
                    {
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1081:1: (lv_thenPart_6_0= ruleBlock )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1082:3: lv_thenPart_6_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfAccess().getThenPartBlockParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIf2479);
                    lv_thenPart_6_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfRule());
                    	        }
                           		set(
                           			current, 
                           			"thenPart",
                            		lv_thenPart_6_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleRepeat"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1106:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1107:2: (iv_ruleRepeat= ruleRepeat EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1108:2: iv_ruleRepeat= ruleRepeat EOF
            {
             newCompositeNode(grammarAccess.getRepeatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRepeat_in_entryRuleRepeat2516);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;

             current =iv_ruleRepeat; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRepeat2526); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1115:1: ruleRepeat returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_block_2_0= ruleBlock ) ) ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1118:28: ( (otherlv_0= 'repeat' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_block_2_0= ruleBlock ) ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1119:1: (otherlv_0= 'repeat' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_block_2_0= ruleBlock ) ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1119:1: (otherlv_0= 'repeat' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_block_2_0= ruleBlock ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1119:3: otherlv_0= 'repeat' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_block_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRepeat2563); 

                	newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1123:1: ( (lv_condition_1_0= ruleLiteralsExpression ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1124:1: (lv_condition_1_0= ruleLiteralsExpression )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1124:1: (lv_condition_1_0= ruleLiteralsExpression )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1125:3: lv_condition_1_0= ruleLiteralsExpression
            {
             
            	        newCompositeNode(grammarAccess.getRepeatAccess().getConditionLiteralsExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleRepeat2584);
            lv_condition_1_0=ruleLiteralsExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepeatRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"LiteralsExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1141:2: ( (lv_block_2_0= ruleBlock ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1142:1: (lv_block_2_0= ruleBlock )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1142:1: (lv_block_2_0= ruleBlock )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1143:3: lv_block_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getRepeatAccess().getBlockBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleRepeat2605);
            lv_block_2_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepeatRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_2_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleWhile"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1167:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1168:2: (iv_ruleWhile= ruleWhile EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1169:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhile_in_entryRuleWhile2641);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhile2651); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1176:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'While' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_block_2_0= ruleBlock ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1179:28: ( (otherlv_0= 'While' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_block_2_0= ruleBlock ) ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1180:1: (otherlv_0= 'While' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_block_2_0= ruleBlock ) ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1180:1: (otherlv_0= 'While' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_block_2_0= ruleBlock ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1180:3: otherlv_0= 'While' ( (lv_condition_1_0= ruleLiteralsExpression ) ) ( (lv_block_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleWhile2688); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1184:1: ( (lv_condition_1_0= ruleLiteralsExpression ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1185:1: (lv_condition_1_0= ruleLiteralsExpression )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1185:1: (lv_condition_1_0= ruleLiteralsExpression )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1186:3: lv_condition_1_0= ruleLiteralsExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileAccess().getConditionLiteralsExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleWhile2709);
            lv_condition_1_0=ruleLiteralsExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"LiteralsExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1202:2: ( (lv_block_2_0= ruleBlock ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1203:1: (lv_block_2_0= ruleBlock )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1203:1: (lv_block_2_0= ruleBlock )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1204:3: lv_block_2_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getWhileAccess().getBlockBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleWhile2730);
            lv_block_2_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_2_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleParameterCall"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1228:1: entryRuleParameterCall returns [EObject current=null] : iv_ruleParameterCall= ruleParameterCall EOF ;
    public final EObject entryRuleParameterCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCall = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1229:2: (iv_ruleParameterCall= ruleParameterCall EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1230:2: iv_ruleParameterCall= ruleParameterCall EOF
            {
             newCompositeNode(grammarAccess.getParameterCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterCall_in_entryRuleParameterCall2766);
            iv_ruleParameterCall=ruleParameterCall();

            state._fsp--;

             current =iv_ruleParameterCall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterCall2776); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterCall"


    // $ANTLR start "ruleParameterCall"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1237:1: ruleParameterCall returns [EObject current=null] : (otherlv_0= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleParameterCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1240:28: ( (otherlv_0= ':' ( ( ruleEString ) ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1241:1: (otherlv_0= ':' ( ( ruleEString ) ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1241:1: (otherlv_0= ':' ( ( ruleEString ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1241:3: otherlv_0= ':' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleParameterCall2813); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterCallAccess().getColonKeyword_0());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1245:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1246:1: ( ruleEString )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1246:1: ( ruleEString )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1247:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterCallAccess().getParameterParameterCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameterCall2836);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterCall"


    // $ANTLR start "entryRuleEqualExpression"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1268:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1269:2: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1270:2: iv_ruleEqualExpression= ruleEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression2872);
            iv_ruleEqualExpression=ruleEqualExpression();

            state._fsp--;

             current =iv_ruleEqualExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression2882); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualExpression"


    // $ANTLR start "ruleEqualExpression"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1277:1: ruleEqualExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '=' ( (lv_rhs_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1280:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '=' ( (lv_rhs_3_0= ruleComparisonExpression ) ) )* ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1281:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '=' ( (lv_rhs_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1281:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '=' ( (lv_rhs_3_0= ruleComparisonExpression ) ) )* )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1282:5: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '=' ( (lv_rhs_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression2929);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1290:1: ( () otherlv_2= '=' ( (lv_rhs_3_0= ruleComparisonExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1290:2: () otherlv_2= '=' ( (lv_rhs_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1290:2: ()
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1291:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEqualExpression2950); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEqualExpressionAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1300:1: ( (lv_rhs_3_0= ruleComparisonExpression ) )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1301:1: (lv_rhs_3_0= ruleComparisonExpression )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1301:1: (lv_rhs_3_0= ruleComparisonExpression )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1302:3: lv_rhs_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualExpressionAccess().getRhsComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression2971);
            	    lv_rhs_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rhs",
            	            		lv_rhs_3_0, 
            	            		"ComparisonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1326:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1327:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1328:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression3009);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression3019); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1335:1: ruleComparisonExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_rhs_5_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddExpression_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1338:28: ( (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_rhs_5_0= ruleAddExpression ) ) )* ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1339:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_rhs_5_0= ruleAddExpression ) ) )* )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1339:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_rhs_5_0= ruleAddExpression ) ) )* )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1340:5: this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_rhs_5_0= ruleAddExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression3066);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;

             
                    current = this_AddExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1348:1: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_rhs_5_0= ruleAddExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=31 && LA12_0<=32)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1348:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_rhs_5_0= ruleAddExpression ) )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1348:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==31) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==32) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1348:3: ( () otherlv_2= '>' )
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1348:3: ( () otherlv_2= '>' )
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1348:4: () otherlv_2= '>'
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1348:4: ()
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1349:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComparisonExpression3089); 

            	                	newLeafNode(otherlv_2, grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1359:6: ( () otherlv_4= '<' )
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1359:6: ( () otherlv_4= '<' )
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1359:7: () otherlv_4= '<'
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1359:7: ()
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1360:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleComparisonExpression3118); 

            	                	newLeafNode(otherlv_4, grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1369:3: ( (lv_rhs_5_0= ruleAddExpression ) )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1370:1: (lv_rhs_5_0= ruleAddExpression )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1370:1: (lv_rhs_5_0= ruleAddExpression )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1371:3: lv_rhs_5_0= ruleAddExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRhsAddExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression3141);
            	    lv_rhs_5_0=ruleAddExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rhs",
            	            		lv_rhs_5_0, 
            	            		"AddExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1395:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1396:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1397:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
             newCompositeNode(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression3179);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;

             current =iv_ruleAddExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression3189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1404:1: ruleAddExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1407:28: ( (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMultExpression ) ) )* ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1408:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMultExpression ) ) )* )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1408:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMultExpression ) ) )* )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1409:5: this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMultExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression3236);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;

             
                    current = this_MultExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1417:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMultExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=33 && LA14_0<=34)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1417:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rhs_5_0= ruleMultExpression ) )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1417:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==33) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==34) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1417:3: ( () otherlv_2= '+' )
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1417:3: ( () otherlv_2= '+' )
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1417:4: () otherlv_2= '+'
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1417:4: ()
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1418:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAddExpression3259); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1428:6: ( () otherlv_4= '-' )
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1428:6: ( () otherlv_4= '-' )
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1428:7: () otherlv_4= '-'
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1428:7: ()
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1429:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAddExpression3288); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1438:3: ( (lv_rhs_5_0= ruleMultExpression ) )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1439:1: (lv_rhs_5_0= ruleMultExpression )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1439:1: (lv_rhs_5_0= ruleMultExpression )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1440:3: lv_rhs_5_0= ruleMultExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpressionAccess().getRhsMultExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression3311);
            	    lv_rhs_5_0=ruleMultExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rhs",
            	            		lv_rhs_5_0, 
            	            		"MultExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1464:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1465:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1466:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
             newCompositeNode(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression3349);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;

             current =iv_ruleMultExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression3359); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1473:1: ruleMultExpression returns [EObject current=null] : (this_LiteralsExpression_0= ruleLiteralsExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= ruleLiteralsExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LiteralsExpression_0 = null;

        EObject lv_rhs_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1476:28: ( (this_LiteralsExpression_0= ruleLiteralsExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= ruleLiteralsExpression ) ) )* ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1477:1: (this_LiteralsExpression_0= ruleLiteralsExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= ruleLiteralsExpression ) ) )* )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1477:1: (this_LiteralsExpression_0= ruleLiteralsExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= ruleLiteralsExpression ) ) )* )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1478:5: this_LiteralsExpression_0= ruleLiteralsExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= ruleLiteralsExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleMultExpression3406);
            this_LiteralsExpression_0=ruleLiteralsExpression();

            state._fsp--;

             
                    current = this_LiteralsExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1486:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= ruleLiteralsExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=35 && LA16_0<=36)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1486:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rhs_5_0= ruleLiteralsExpression ) )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1486:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==35) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==36) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1486:3: ( () otherlv_2= '*' )
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1486:3: ( () otherlv_2= '*' )
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1486:4: () otherlv_2= '*'
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1486:4: ()
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1487:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultExpression3429); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1497:6: ( () otherlv_4= '/' )
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1497:6: ( () otherlv_4= '/' )
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1497:7: () otherlv_4= '/'
            	            {
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1497:7: ()
            	            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1498:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultExpression3458); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1507:3: ( (lv_rhs_5_0= ruleLiteralsExpression ) )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1508:1: (lv_rhs_5_0= ruleLiteralsExpression )
            	    {
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1508:1: (lv_rhs_5_0= ruleLiteralsExpression )
            	    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1509:3: lv_rhs_5_0= ruleLiteralsExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultExpressionAccess().getRhsLiteralsExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleMultExpression3481);
            	    lv_rhs_5_0=ruleLiteralsExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rhs",
            	            		lv_rhs_5_0, 
            	            		"LiteralsExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleLiteralsExpression"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1533:1: entryRuleLiteralsExpression returns [EObject current=null] : iv_ruleLiteralsExpression= ruleLiteralsExpression EOF ;
    public final EObject entryRuleLiteralsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralsExpression = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1534:2: (iv_ruleLiteralsExpression= ruleLiteralsExpression EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1535:2: iv_ruleLiteralsExpression= ruleLiteralsExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression3519);
            iv_ruleLiteralsExpression=ruleLiteralsExpression();

            state._fsp--;

             current =iv_ruleLiteralsExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralsExpression3529); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralsExpression"


    // $ANTLR start "ruleLiteralsExpression"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1542:1: ruleLiteralsExpression returns [EObject current=null] : (this_ParameterCall_0= ruleParameterCall | this_Constant_1= ruleConstant | (otherlv_2= '(' this_EqualExpression_3= ruleEqualExpression otherlv_4= ')' ) ) ;
    public final EObject ruleLiteralsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ParameterCall_0 = null;

        EObject this_Constant_1 = null;

        EObject this_EqualExpression_3 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1545:28: ( (this_ParameterCall_0= ruleParameterCall | this_Constant_1= ruleConstant | (otherlv_2= '(' this_EqualExpression_3= ruleEqualExpression otherlv_4= ')' ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1546:1: (this_ParameterCall_0= ruleParameterCall | this_Constant_1= ruleConstant | (otherlv_2= '(' this_EqualExpression_3= ruleEqualExpression otherlv_4= ')' ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1546:1: (this_ParameterCall_0= ruleParameterCall | this_Constant_1= ruleConstant | (otherlv_2= '(' this_EqualExpression_3= ruleEqualExpression otherlv_4= ')' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case RULE_INT:
            case 34:
                {
                alt17=2;
                }
                break;
            case 18:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1547:5: this_ParameterCall_0= ruleParameterCall
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getParameterCallParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameterCall_in_ruleLiteralsExpression3576);
                    this_ParameterCall_0=ruleParameterCall();

                    state._fsp--;

                     
                            current = this_ParameterCall_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1557:5: this_Constant_1= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getConstantParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstant_in_ruleLiteralsExpression3603);
                    this_Constant_1=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1566:6: (otherlv_2= '(' this_EqualExpression_3= ruleEqualExpression otherlv_4= ')' )
                    {
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1566:6: (otherlv_2= '(' this_EqualExpression_3= ruleEqualExpression otherlv_4= ')' )
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1566:8: otherlv_2= '(' this_EqualExpression_3= ruleEqualExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLiteralsExpression3621); 

                        	newLeafNode(otherlv_2, grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getEqualExpressionParserRuleCall_2_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleLiteralsExpression3643);
                    this_EqualExpression_3=ruleEqualExpression();

                    state._fsp--;

                     
                            current = this_EqualExpression_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLiteralsExpression3654); 

                        	newLeafNode(otherlv_4, grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_2_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralsExpression"


    // $ANTLR start "entryRuleEInt"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1591:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1592:2: (iv_ruleEInt= ruleEInt EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1593:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3692);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3703); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1600:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1603:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1604:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1604:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1604:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1604:2: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1605:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEInt3742); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3759); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1625:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1626:2: (iv_ruleEString= ruleEString EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1627:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString3805);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString3816); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1634:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1637:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1638:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1638:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1638:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString3856); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1646:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString3882); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleParameter"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1661:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1662:2: (iv_ruleParameter= ruleParameter EOF )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1663:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter3927);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter3937); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1670:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1673:28: ( ( () otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1674:1: ( () otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1674:1: ( () otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1674:2: () otherlv_1= ':' ( (lv_name_2_0= ruleEString ) )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1674:2: ()
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1675:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterAccess().getParameterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleParameter3983); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1684:1: ( (lv_name_2_0= ruleEString ) )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1685:1: (lv_name_2_0= ruleEString )
            {
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1685:1: (lv_name_2_0= ruleEString )
            // ../fr.inria.diverse.k3.example.logo.xtext_editor/src-gen/fr/inria/diverse/k3/example/logo/xtext_editor/parser/antlr/internal/InternalLogoTextualSyntax.g:1686:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter4004);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleLogoProgram_in_entryRuleLogoProgram75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogoProgram85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstruction_in_ruleLogoProgram140 = new BitSet(new long[]{0x000000001EA3F862L});
        public static final BitSet FOLLOW_ruleInstruction_in_ruleLogoProgram161 = new BitSet(new long[]{0x000000001EA3F862L});
        public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInstruction208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBack_in_ruleInstruction255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForward_in_ruleInstruction282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeft_in_ruleInstruction309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRight_in_ruleInstruction336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenDown_in_ruleInstruction363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenUp_in_ruleInstruction390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClear_in_ruleInstruction417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcCall_in_ruleInstruction444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcDeclaration_in_ruleInstruction471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleInstruction498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIf_in_ruleInstruction525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRepeat_in_ruleInstruction552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhile_in_ruleInstruction579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBInstruction_in_entryRuleBInstruction614 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBInstruction624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBack_in_ruleBInstruction671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForward_in_ruleBInstruction698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeft_in_ruleBInstruction725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRight_in_ruleBInstruction752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenDown_in_ruleBInstruction779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenUp_in_ruleBInstruction806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClear_in_ruleBInstruction833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcCall_in_ruleBInstruction860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterCall_in_ruleBInstruction887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIf_in_ruleBInstruction914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRepeat_in_ruleBInstruction941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhile_in_ruleBInstruction968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBack_in_entryRuleBack1003 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBack1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleBack1050 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleBack1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForward_in_entryRuleForward1107 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForward1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleForward1154 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleForward1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeft_in_entryRuleLeft1211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeft1221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleLeft1267 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleLeft1288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRight_in_entryRuleRight1324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRight1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRight1380 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleRight1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenDown_in_entryRulePenDown1437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePenDown1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rulePenDown1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePenUp_in_entryRulePenUp1529 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePenUp1539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePenUp1585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClear_in_entryRuleClear1621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClear1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleClear1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstant1723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConstant1778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcCall_in_entryRuleProcCall1814 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcCall1824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcCall1872 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleProcCall1884 = new BitSet(new long[]{0x00000004201C0010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleProcCall1905 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleProcCall1919 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleProcCall1940 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleProcCall1954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcDeclaration_in_entryRuleProcDeclaration1990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcDeclaration2000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleProcDeclaration2046 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcDeclaration2067 = new BitSet(new long[]{0x000000003EA3F860L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleProcDeclaration2088 = new BitSet(new long[]{0x000000003EA3F860L});
        public static final BitSet FOLLOW_ruleInstruction_in_ruleProcDeclaration2110 = new BitSet(new long[]{0x000000001EE3F860L});
        public static final BitSet FOLLOW_ruleInstruction_in_ruleProcDeclaration2131 = new BitSet(new long[]{0x000000001EE3F860L});
        public static final BitSet FOLLOW_22_in_ruleProcDeclaration2144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock2180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleBlock2236 = new BitSet(new long[]{0x000000003FA3F860L});
        public static final BitSet FOLLOW_ruleBInstruction_in_ruleBlock2257 = new BitSet(new long[]{0x000000003FA3F860L});
        public static final BitSet FOLLOW_24_in_ruleBlock2270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIf_in_entryRuleIf2306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIf2316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleIf2354 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleIf2375 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIf2396 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIf2417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleIf2437 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleIf2458 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIf2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRepeat_in_entryRuleRepeat2516 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRepeat2526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleRepeat2563 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleRepeat2584 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleRepeat2605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile2641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhile2651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleWhile2688 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleWhile2709 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleWhile2730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterCall_in_entryRuleParameterCall2766 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterCall2776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleParameterCall2813 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameterCall2836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression2872 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression2929 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleEqualExpression2950 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression2971 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression3009 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression3019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression3066 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_31_in_ruleComparisonExpression3089 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_32_in_ruleComparisonExpression3118 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression3141 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression3179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression3189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression3236 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_33_in_ruleAddExpression3259 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_34_in_ruleAddExpression3288 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression3311 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression3349 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression3359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleMultExpression3406 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_35_in_ruleMultExpression3429 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_36_in_ruleMultExpression3458 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleMultExpression3481 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression3519 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralsExpression3529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterCall_in_ruleLiteralsExpression3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_ruleLiteralsExpression3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleLiteralsExpression3621 = new BitSet(new long[]{0x0000000420040010L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleLiteralsExpression3643 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleLiteralsExpression3654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3692 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEInt3742 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString3805 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString3816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString3856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString3882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3927 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter3937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleParameter3983 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter4004 = new BitSet(new long[]{0x0000000000000002L});
    }


}