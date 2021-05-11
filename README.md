maven-code-generator-wsdl-to-java

SOAP-Simple Object Access Protocol

WSDL-Web Service Description Language: xml based decription language for web servieces. It is used to define the web service interface that provides information about what services are provied by the server and how they can be called.
Typical WSDL:

    1. Service: Define the service
    2. Endpoint: Define connection point for the service
    3. Binding: Specifies the interface and binding style and transport mechanism 
    4. Interface: Defines the web service operation and message used to execute the operation
    5. Operation: Is the soap method that gets called on the server
    6. Message: Defines the structure of the message
    7. Type: Defines the xml schema of the message indicating which properties are which types
 
NOTE: Usually WSDL file are not written but generated from the code. When a webserviec is configured JAXB annotations are used to indicate         the service, endpoint, operations etc and the server returns the generated WSDL for the web service and then the wsdl file is given to       teams or clients who wish to communicate with the web service.

Tools and Technologies: IntelliJ, Java 8, Maven

1. Create a empty maven project using IntelliJ IDEA.
2. To generate java class from wsdl we need wsdl file. For example here: https://www.dataaccess.com/webservicesserver/numberconversion.wso 
   copy souce code and paste it in after crating a wsdl file in the resources folder of our project.
3. Need plugin in pom.xml to generate java class from wsdl file. 
   Most populer: https://cxf.apache.org/docs/maven-cxf-codegen-plugin-wsdl-to-java.html 
   Copy and paste it in build plugins. Create a property <cxf.version>3.4.2</cxf.version> in properties tag.
   and in <wsdl> tag give the wsdl file path e.g., <wsdl>${basedir}/src/main/resources/dataaccess-numberconversion.wsdl</wsdl>
4. To create package which will contains all java files: goto wsdlOption tag in pom.xml create packagenames and packagename tags and gibe the    package name you want.
5. Add dependency in pom.xml from https://mvnrepository.com/artifact/com.sun.xml.ws/jaxws-rt/2.3.3  in case if you use java version 11 or        latest.
6. To test it create a simple Runner class after creating a same package name in main java folder which we already used to keep our java        files in target folder.
7. Runner class: create endpoint: which is https://www.dataaccess.com/webservicesserver/numberconversion.wso (address from where you copied      the wsdl file)
