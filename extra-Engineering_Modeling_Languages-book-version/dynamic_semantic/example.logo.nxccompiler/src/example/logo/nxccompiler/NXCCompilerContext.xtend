package example.logo.nxccompiler

import example.logo.model.logoASM.LogoProgram
import java.util.ArrayList

class NXCCompilerContext {
	public LogoProgram root
	// 
	public ArrayList<String> subs = new ArrayList<String>()
	public Integer depth
	
	
	def String getPrefix(){
		var StringBuffer result = new StringBuffer
		for(i : 1..depth){
			result.append("/t")
		}
		return result.toString
	}

	def void incDepth(){
		depth = depth+1
	}

	def void decDepth(){
		depth = depth-1
	}
}