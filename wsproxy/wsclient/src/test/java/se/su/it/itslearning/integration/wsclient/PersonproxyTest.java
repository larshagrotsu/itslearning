package se.su.it.itslearning.integration.wsclient;
import junit.framework.TestCase;
import se.su.it.itslearning.extendedpersonproxyws.generated.ExtendedPersonManagementServiceSync;
import se.su.it.itslearning.extendedpersonproxyws.generated.ReadAllPersonsRequest;
import se.su.it.itslearning.extendedpersonproxyws.generated.ReadAllPersonsResponse;
import se.su.it.itslearning.integration.wsclient.util.CxfClient;
import se.su.it.itslearning.personproxyws.generated.*;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Created by lhagr on 2017-08-23.
 */

public class PersonproxyTest extends TestCase {

    public void testReadPerson() {
       /* // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                    public void checkClientTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                    public void checkServerTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
        };

// Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
        }
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        System.setProperty("javax.net.ssl.trustStore", "/Library/Java/JavaVirtualMachines/jdk1.8.0_60.jdk/Contents/Home/jre/lib/security/cacerts");*/
        CxfClient cxfClient = new CxfClient();
        PersonManagementServiceSync personManagementServiceSync =
                cxfClient.getPersonManagementServiceSync();
        ReadPersonRequest readPersonRequest = new ReadPersonRequest();
        ReadPersonRequest.SourcedId sourcedId = new ReadPersonRequest.SourcedId();
        sourcedId.setIdentifier("sutest");
        readPersonRequest.setSourcedId(sourcedId);
        ReadPersonResponse readPersonResponse = personManagementServiceSync.readPerson(readPersonRequest);
        System.out.println("XXX " + readPersonResponse.toString());
    }

    public void testCreatePerson() {
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        System.setProperty("javax.net.ssl.trustStore", "/Library/Java/JavaVirtualMachines/jdk1.8.0_60.jdk/Contents/Home/jre/lib/security/cacerts");
        CxfClient cxfClient = new CxfClient();
        PersonManagementServiceSync personManagementServiceSync =
                cxfClient.getPersonManagementServiceSync();
        CreatePersonRequest createPersonRequest = new CreatePersonRequest();
        Person person = new Person();
        UserIdDType userIdDType = new UserIdDType();
        userIdDType.setUserIdValue("lhagr");
        person.setUserId(userIdDType);
        person.setEmail("xyz@abc.se");
        createPersonRequest.setPerson(person);
        CreatePersonRequest.SourcedId sourcedId = new CreatePersonRequest.SourcedId();
        sourcedId.setIdentifier("123");
        createPersonRequest.setSourcedId(sourcedId);
        CreatePersonResponse readPersonResponse = personManagementServiceSync.createPerson(createPersonRequest);
        System.out.println('z' + readPersonResponse.toString());
    }

    public void testDeletePerson() {
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        System.setProperty("javax.net.ssl.trustStore", "/Library/Java/JavaVirtualMachines/jdk1.8.0_60.jdk/Contents/Home/jre/lib/security/cacerts");
        CxfClient cxfClient = new CxfClient();
        PersonManagementServiceSync personManagementServiceSync =
                cxfClient.getPersonManagementServiceSync();
        DeletePersonRequest deletePersonRequest = new ObjectFactory().createDeletePersonRequest();
        DeletePersonRequest.SourcedId sourcedId = new DeletePersonRequest.SourcedId();
        sourcedId.setIdentifier("123");
        deletePersonRequest.setSourcedId(sourcedId);
        DeletePersonResponse deletePersonResponse = personManagementServiceSync.deletePerson(deletePersonRequest);
        System.out.println("www " + deletePersonResponse.toString());
    }

    public void testReadAllPersons() throws DatatypeConfigurationException {
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        System.setProperty("javax.net.ssl.trustStore", "/Library/Java/JavaVirtualMachines/jdk1.8.0_60.jdk/Contents/Home/jre/lib/security/cacerts");
        CxfClient cxfClient = new CxfClient();
        ExtendedPersonManagementServiceSync personManagementServiceSync =
                cxfClient.getExtendedPersonManagementServiceSync();
        ReadAllPersonsRequest readPersonRequest = new ReadAllPersonsRequest();
        XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar();
        xmlGregorianCalendar.setYear(1);
        xmlGregorianCalendar.setMonth(1);
        xmlGregorianCalendar.setDay(1);
        xmlGregorianCalendar.setHour(1);
        xmlGregorianCalendar.setMinute(1);
        xmlGregorianCalendar.setSecond(1);
        readPersonRequest.setPageIndex(1);
        readPersonRequest.setPageSize(100);
        readPersonRequest.setCreatedFrom(xmlGregorianCalendar);
        ReadAllPersonsResponse readPersonResponse = personManagementServiceSync.readAllPersons(readPersonRequest);
        readPersonResponse.getPersonIdPairSet();
        System.out.println("Yeaahh " + readPersonResponse);
    }
}
