/*
 * 
 */
package ch.loway.oss.ari4java;

import ch.loway.oss.ari4java.tools.ARIException;
import ch.loway.oss.ari4java.tools.http.NettyHttpClient;
import java.net.URISyntaxException;

/**
 *
 * @author lenz
 */
public class AriFactory {

    /**
     * Your default HTTP connector through Netty.
     * 
     * @param uri
     * @param login
     * @param pass
     * @param version
     * @return
     * @throws ARIException
     * @throws URISyntaxException 
     */
    
    
    public static ARI nettyHttp(String uri, String login, String pass, AriVersion version) throws ARIException, URISyntaxException {
        ARI ari = new ARI();
        NettyHttpClient hc = new NettyHttpClient();

        ari.setHttpClient(hc);
        ari.setWsClient(hc);

        ari.setVersion(version);

        hc.initialize(uri, login, pass);
        return ari;
    }

}