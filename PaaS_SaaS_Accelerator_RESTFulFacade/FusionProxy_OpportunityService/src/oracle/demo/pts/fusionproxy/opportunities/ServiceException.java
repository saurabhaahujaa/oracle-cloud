package oracle.demo.pts.fusionproxy.opportunities;

import javax.xml.ws.WebFault;

@WebFault(faultBean="com.oracle.xmlns.adf.svc.errors.ServiceErrorMessage",
  targetNamespace="http://xmlns.oracle.com/adf/svc/errors/", name="ServiceErrorMessage")
public class ServiceException
  extends Exception
{
  private com.oracle.xmlns.adf.svc.errors.ServiceErrorMessage faultInfo;

  public ServiceException(String message,
                          com.oracle.xmlns.adf.svc.errors.ServiceErrorMessage faultInfo)
  {
    super(message);
    this.faultInfo = faultInfo;
  }

  public ServiceException(String message,
                          com.oracle.xmlns.adf.svc.errors.ServiceErrorMessage faultInfo,
                          Throwable t)
  {
    super(message,t);
    this.faultInfo = faultInfo;
  }

  public com.oracle.xmlns.adf.svc.errors.ServiceErrorMessage getFaultInfo()
  {
    return faultInfo;
  }

  public void setFaultInfo(com.oracle.xmlns.adf.svc.errors.ServiceErrorMessage faultInfo)
  {
    this.faultInfo = faultInfo;
  }
}
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)
