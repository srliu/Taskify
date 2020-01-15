/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.InkApp
import java.util.HashSet
import org.xtext.example.mydsl.myDsl.GlobalVariableExpression
import java.util.HashMap

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {
	private final static String APPINIT = "appinit.c"
	private final static String THREAD = "thread1.c"

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		initialize(fsa)
		var model = resource.contents.head as InkApp
		
		if (model !== null) {
			fsa.generateFile(APPINIT, appinit())
			
			var String threadContent = ""
			val GeneratorSwitcher generator = new GeneratorSwitcher()
			
			var String includeContent = ""
			var String globalContent = ""
			var String constantContent = ""
			var String tasksContent = ""
			
			
			try {
				for (GlobalVariableExpression global: model.globals) {
	//				val String scope = SymbolTable.GLOBAL
	//				val String name = global.declarationExpression.name
	//				val String type = global.declarationExpression.type.type
	//				SymbolTable.addSymbol(name, type, scope)
					
					val aa = generator.generate(global)
					println(aa)
					
				}
				
//				println(SymbolTable.toStringg())
			
			
			} catch (Exception e) {
				e.printStackTrace()
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(InkApp)
//				.map[name]
//				.join(', '))

	}
	
	def void initialize(IFileSystemAccess2 fsa) {
		fsa.deleteFile(APPINIT)
		
		SymbolTable.resetTable()
	}
	
	def appinit() {
		val init = '''
		extern void thread1_init();
		
		// this is the function that will be called only at initial boot by the runtime.
		void __app_init(){
		    thread1_init();
		}
		'''
		return init
	}	
}
