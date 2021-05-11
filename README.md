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


