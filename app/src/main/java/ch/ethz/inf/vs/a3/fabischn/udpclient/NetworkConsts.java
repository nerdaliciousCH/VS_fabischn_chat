package ch.ethz.inf.vs.a3.fabischn.udpclient;

public final class NetworkConsts {

    /**
     * UDP Port
     */
    public static int UDP_PORT = 4446;

    /**
     * Address of the chat server
     * <p>
     * This address is for the emulator.
     */
    public static String SERVER_ADDRESS = "10.0.2.2";

    /**
     * Size of UDP payload in bytes
     */
    public static int PAYLOAD_SIZE = 1024;

    /**
     * Time to wait for a message in ms
     */
    // TODO back to 10000
    public static int SOCKET_TIMEOUT = 30000;
}
