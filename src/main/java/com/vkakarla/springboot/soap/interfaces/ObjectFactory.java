//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.15 at 04:55:31 PM IST 
//


package com.vkakarla.springboot.soap.interfaces;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vkakarla.springboot.soap.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vkakarla.springboot.soap.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddEmployeeRequest }
     * 
     */
    public AddEmployeeRequest createAddEmployeeRequest() {
        return new AddEmployeeRequest();
    }

    /**
     * Create an instance of {@link EmployeeInfo }
     * 
     */
    public EmployeeInfo createEmployeeInfo() {
        return new EmployeeInfo();
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link GetEmployeeByIdRequest }
     * 
     */
    public GetEmployeeByIdRequest createGetEmployeeByIdRequest() {
        return new GetEmployeeByIdRequest();
    }

    /**
     * Create an instance of {@link DeleteEmployeeRequest }
     * 
     */
    public DeleteEmployeeRequest createDeleteEmployeeRequest() {
        return new DeleteEmployeeRequest();
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

    /**
     * Create an instance of {@link UpdateEmployeeRequest }
     * 
     */
    public UpdateEmployeeRequest createUpdateEmployeeRequest() {
        return new UpdateEmployeeRequest();
    }

    /**
     * Create an instance of {@link UpdateEmployeeResponse }
     * 
     */
    public UpdateEmployeeResponse createUpdateEmployeeResponse() {
        return new UpdateEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

}
