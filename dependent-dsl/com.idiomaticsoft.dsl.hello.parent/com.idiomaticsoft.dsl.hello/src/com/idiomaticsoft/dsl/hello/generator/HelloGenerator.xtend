/*
 * generated by Xtext 2.26.0
 */
package com.idiomaticsoft.dsl.hello.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.idiomaticsoft.dsl.hello.hello.Greeting

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class HelloGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('Greetings.txt', '''
			«FOR name : resource.allContents.filter(Greeting).map[name].toList»
				«name» was saluted!
			«ENDFOR»
		''')
	}
}
