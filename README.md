# Model Elements Library

Generates a java lib in model-elements.jar that can be used for networks and their elements, data profiles, scenarios, and so on. These classes are very lightweight and can be used as mock classes in testing. They also can be serialized (binary or json) via avro.

See the tests for some examples.

## Requirements

The project should build with maven.

## Avro tools

If you installed avro through maven, you should be able to access the command-line tools by writing a simple shell script, called "avro":

    java -jar ~/.m2/repository/org/apache/avro/avro-tools/1.7.1/avro-tools-1.7.1.jar $*

Then you can do:

    avro --help

This includes commands to convert between binary avro and json.

## Javadocs

The Avro IDL compiler transfers comments from the IDL definitions to the Java source files. Javadoc reads these commands to generate docs for the project. To run javadoc, do any of:

    mvn site
    
    mvn javadoc:javadoc
    
    mvn javadoc:jar
