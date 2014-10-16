package oracle.demo.pts.fusionproxy.location;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="https://dummy-crm-crm-ext.oracle.com/foundationParties/LocationService?wsdl",
  targetNamespace="http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/",
  name="LocationService")
public class LocationService_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {  logger = Logger.getLogger("oracle.demo.pts.fusionproxy.location.LocationService_Service");
   /*  try
    {
    
      URL baseUrl = LocationService_Service.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            LocationService_Service.class.getResource("https://dummy-crm-crm-ext.oracle.com/foundationParties/LocationService?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "https://dummy.oracle.com/foundationParties/LocationService?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "https://dummy.oracle.com/foundationParties/LocationService?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using https://dummy.oracle.com/foundationParties/LocationService?wsdl",
          e);
    } */
  }

  public LocationService_Service()
  {
    super(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/",
                    "LocationService"));
  }

  public LocationService_Service(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="LocationServiceSoapHttpPort")
  public LocationService getLocationServiceSoapHttpPort()
  {
    return (LocationService) super.getPort(new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/",
                                                     "LocationServiceSoapHttpPort"),
                                           LocationService.class);
  }

  @WebEndpoint(name="LocationServiceSoapHttpPort")
  public LocationService getLocationServiceSoapHttpPort(WebServiceFeature... features)
  {
    return (LocationService) super.getPort(new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/",
                                                     "LocationServiceSoapHttpPort"),
                                           LocationService.class,
                                           features);
  }
}
