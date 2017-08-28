package se.su.it.itslearning.integration.wsclient.util;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import se.su.it.itslearning.extendedpersonproxyws.generated.ExtendedPersonManagementServiceSync;
import se.su.it.itslearning.extendedpersonproxyws.generated.ExtendedPersonManagementServiceSync_Service;
import se.su.it.itslearning.personproxyws.generated.PersonManagementServiceSync;
import se.su.it.itslearning.personproxyws.generated.PersonManagementServiceSync_Service;
//import sun.jvm.hotspot.HotSpotTypeDataBase;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CxfClient {
    private static final String HOST =  "https://enterprise.itsltest.com";

    private WsConfig wsConfig = new WsConfig();


   /* public class ClientPasswordHandler implements CallbackHandler {
        public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
            WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
            pc.setPassword("Password");
        }
    }*/

    public PersonManagementServiceSync getPersonManagementServiceSync() {
        PersonManagementServiceSync_Service ss = null;
        try {
            ss = new PersonManagementServiceSync_Service(/*new URL("https://enterprise.itsltest.com/WCFServiceLibrary/PersonManagementServiceSync.svc")*/);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        PersonManagementServiceSync port = ss.getBasicHttpBindingPersonManagementServiceSync();
        configure((BindingProvider) port);
        return port;
    }


    public ExtendedPersonManagementServiceSync getExtendedPersonManagementServiceSync() {
        ExtendedPersonManagementServiceSync_Service ss = null;
        try {
            ss = new ExtendedPersonManagementServiceSync_Service();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        ExtendedPersonManagementServiceSync port = ss.getBasicHttpBindingExtendedPersonManagementServiceSync();
        configure((BindingProvider) port);
        return port;
    }

    private void configure(BindingProvider port) {
        Map ctx = ((BindingProvider) port).getRequestContext();
        //ctx.put(BindingProvider.USERNAME_PROPERTY, wsConfig.getUser());
        //ctx.put(BindingProvider.PASSWORD_PROPERTY, wsConfig.getPwd());
        //ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://c
        ctx.put("ws-security.username", wsConfig.getUser());
        ctx.put("ws-security.password", wsConfig.getPwd());

        BindingProvider bindingProvider = port;

        @SuppressWarnings("rawtypes")
        List<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new WSSecurityHeaderSOAPHandler(wsConfig.getUser(),wsConfig.getPwd()));
        bindingProvider.getBinding().setHandlerChain(handlerChain);

        Client client = ClientProxy.getClient(port);
        configureConduit(client);
    }


    private void configureConduit(Client client) {
        HTTPConduit conduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(36000);
        httpClientPolicy.setAllowChunking(false);
        httpClientPolicy.setReceiveTimeout(32000);
        TLSClientParameters TlsClientParameters = new TLSClientParameters();
        TlsClientParameters.setDisableCNCheck(true);


        conduit.setTlsClientParameters(TlsClientParameters);
        conduit.setClient(httpClientPolicy);
        //conduit.getAuthorization().setUserName(wsConfig.getUser());
        //conduit.getAuthorization().setPassword(wsConfig.getPwd());
        AuthorizationPolicy auth = new AuthorizationPolicy();
        auth.setAuthorizationType("Basic");
        auth.setUserName(wsConfig.getUser());
        auth.setPassword(wsConfig.getPwd());
        conduit.setAuthorization(auth);


    }
}