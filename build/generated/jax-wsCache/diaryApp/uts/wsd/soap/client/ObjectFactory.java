
package uts.wsd.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uts.wsd.soap.client package. 
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

    private final static QName _Exception_QNAME = new QName("http://soap.wsd.uts/", "Exception");
    private final static QName _IOException_QNAME = new QName("http://soap.wsd.uts/", "IOException");
    private final static QName _FetchUser_QNAME = new QName("http://soap.wsd.uts/", "fetchUser");
    private final static QName _FetchUserResponse_QNAME = new QName("http://soap.wsd.uts/", "fetchUserResponse");
    private final static QName _FetchUsers_QNAME = new QName("http://soap.wsd.uts/", "fetchUsers");
    private final static QName _FetchUsersResponse_QNAME = new QName("http://soap.wsd.uts/", "fetchUsersResponse");
    private final static QName _User_QNAME = new QName("http://soap.wsd.uts/", "user");
    private final static QName _Users_QNAME = new QName("http://soap.wsd.uts/", "users");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uts.wsd.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link FetchUser }
     * 
     */
    public FetchUser createFetchUser() {
        return new FetchUser();
    }

    /**
     * Create an instance of {@link FetchUserResponse }
     * 
     */
    public FetchUserResponse createFetchUserResponse() {
        return new FetchUserResponse();
    }

    /**
     * Create an instance of {@link FetchUsers }
     * 
     */
    public FetchUsers createFetchUsers() {
        return new FetchUsers();
    }

    /**
     * Create an instance of {@link FetchUsersResponse }
     * 
     */
    public FetchUsersResponse createFetchUsersResponse() {
        return new FetchUsersResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "fetchUser")
    public JAXBElement<FetchUser> createFetchUser(FetchUser value) {
        return new JAXBElement<FetchUser>(_FetchUser_QNAME, FetchUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "fetchUserResponse")
    public JAXBElement<FetchUserResponse> createFetchUserResponse(FetchUserResponse value) {
        return new JAXBElement<FetchUserResponse>(_FetchUserResponse_QNAME, FetchUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "fetchUsers")
    public JAXBElement<FetchUsers> createFetchUsers(FetchUsers value) {
        return new JAXBElement<FetchUsers>(_FetchUsers_QNAME, FetchUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "fetchUsersResponse")
    public JAXBElement<FetchUsersResponse> createFetchUsersResponse(FetchUsersResponse value) {
        return new JAXBElement<FetchUsersResponse>(_FetchUsersResponse_QNAME, FetchUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Users }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.wsd.uts/", name = "users")
    public JAXBElement<Users> createUsers(Users value) {
        return new JAXBElement<Users>(_Users_QNAME, Users.class, null, value);
    }

}
