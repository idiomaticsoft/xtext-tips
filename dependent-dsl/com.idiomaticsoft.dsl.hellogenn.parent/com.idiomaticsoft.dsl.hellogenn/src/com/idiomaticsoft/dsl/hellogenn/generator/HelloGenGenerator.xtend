/*
 * generated by Xtext 2.26.0
 */
package com.idiomaticsoft.dsl.hellogenn.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.idiomaticsoft.dsl.hellogenn.helloGen.GreetingGen

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class HelloGenGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('greetings.hello', resource.allContents.filter(GreetingGen).map["Hello " + it.name + "!"].join('\n'))
	}
}
