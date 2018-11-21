//MDE_BOOK_START
package example.logo.interpreter
//MDE_BOOK_END

import com.google.inject.Injector

import example.logo.model.logoASM.LogoASMPackage
import example.logo.model.logoASM.LogoProgram
import example.logo.xtext_editor.LogoTextualSyntaxStandaloneSetup
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
//MDE_BOOK_START
import static extension example.logo.interpreter.LogoProgramAspect.*
class LogoInterpreter{
	public def run(String fileName) {
		var LogoProgram prog
		if(fileName.endsWith(".logo")){
			prog = load(fileName)
		}
		else{
			prog = loadXMI(fileName)
		}
		var Context context = new Context()
		prog.eval(context)
		new Window(context.turtle)
	}
//MDE_BOOK_END
	def static void main(String[] args) {
		println('Logo interpreter in K3!')
		registerStandalone()
		var String fileName = "src/main/examples/hexa.logoasm"
		if(args.size == 1){
			fileName = args.get(0)
		}
		else{
			println('No valid parameter passed, starting interpreter on '+fileName)
		}
		println('running '+fileName)
		new LogoInterpreter().run(fileName)
	}
	
	public static def void registerStandalone(){
		LogoASMPackage.eINSTANCE.class
	}
//MDE_BOOK_START	
	public def  LogoProgram load(String fileName){
		var Injector injector = new LogoTextualSyntaxStandaloneSetup().createInjectorAndDoEMFRegistration()
		
		var XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		val Resource res = resourceSet.getResource(URI.createURI(fileName), true);
		
		return res.contents.get(0) as LogoProgram
	}	
//MDE_BOOK_END	
	public def  LogoProgram loadXMI(String fileName){
		
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(LogoASMPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(LogoASMPackage.eNS_URI, LogoASMPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);

		var rs = new ResourceSetImpl()

		//var uri = URI.createURI(args.get(0));
		var uri = URI.createURI(fileName);
		var res = rs.getResource(uri, true);
		return res.contents.get(0) as LogoProgram
	}

}

