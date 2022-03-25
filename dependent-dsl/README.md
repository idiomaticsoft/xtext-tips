# Dependent DSL

This is a small demostration of how to configure maven to generate code from an Xtext DSL and then have another DSL consume it in the same run.

### Explanation

To test the example you need to do the following:

- Do a `mvn clean install` on project `com.idiomaticsoft.dsl.hellogenn.parent`
- Do a `mvn clean install` on project `com.idiomaticsoft.dsl.hello.parent`
- Do a `mvn clean install` on project `dependentdsl`

At the end you should should have the files `Greetings.txt` and `greetings.hello` in the `/target/generated-sources/xtext` folder.