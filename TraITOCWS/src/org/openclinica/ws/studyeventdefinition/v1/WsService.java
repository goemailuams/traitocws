
package org.openclinica.ws.studyeventdefinition.v1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "wsService", targetNamespace = "http://openclinica.org/ws/studyEventDefinition/v1", wsdlLocation = "file://tmp/studyEventDefinitionWsdl.wsdl")
@SuppressWarnings("javadoc")
public class WsService
    extends Service
{

    private final static URL WSSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.openclinica.ws.studyeventdefinition.v1.WsService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.openclinica.ws.studyeventdefinition.v1.WsService.class.getResource(".");
            url = new URL(baseUrl, "file://tmp/studyEventDefinitionWsdl.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file://tmp/studyEventDefinitionWsdl.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WSSERVICE_WSDL_LOCATION = url;
    }

    public WsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsService() {
        super(WSSERVICE_WSDL_LOCATION, new QName("http://openclinica.org/ws/studyEventDefinition/v1", "wsService"));
    }

    /**
     * 
     * @return
     *     returns Ws
     */
    @WebEndpoint(name = "wsSoap11")
    public Ws getWsSoap11() {
        return super.getPort(new QName("http://openclinica.org/ws/studyEventDefinition/v1", "wsSoap11"), Ws.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Ws
     */
    @WebEndpoint(name = "wsSoap11")
    public Ws getWsSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://openclinica.org/ws/studyEventDefinition/v1", "wsSoap11"), Ws.class, features);
    }

}
