# OntoSTEP code
This is an extraction of OntoSTEP code that can run without painful process of finding jars and reading unfriendly docs.
OntoSTEP is a plugin of Protégé, the source code is implemented by NIST. For detail please visit https://www.nist.gov/services-resources/software/ontostep-plugin
# Usage
Clone this repository and open it with IntelliJ IDEA and run TranslationTest.java.
# Details
## setup environment
1. JDK. I used JDK17 and didn't test other versions. 
2. antlr-3.1.3.jar
## generate parser files
1. write .g(grammar) files or use .g files provided by NIST, which is located in src/grammar
2. use `java -jar path-to-jar/antlr-3.1.3.jar *.g` to generate necessary java files. 
## other
- copy the generated java files to src 
- other files such as OWLHelper, ExternalId, etc. are also provided by NIST.
- there will also be some warnings or errors, it can be fixed by the prompts of IDEA, you will probably want to remove `package gov.nist.msid.ontostep.schema` or some other code like this in generated files. I have removed them in this project.

# REAFFIRM
This is just an extraction of NIST OntoSTEP, the whole code are carried from OntoSTEP with little modification. 

I have struggled with how to reproduce OntoSTEP's plugin of Protégé, this is just more clear and easy to understand.
