package practicum.madlibs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * A helper class for implementing text-based protocols over a TCP/IP socket.
 * This class assumes that protocol messages are newline-terminated.
 */
public class Duplexer {
    /**
     * The socket used for communicating with the other end of the connection.
     */
    private Socket socket;

    /**
     * Used to read one line of incoming text at a time.
     */
    private BufferedReader in;

    /**
     * Used to write one line of outgoing text at a time.
     */
    private PrintWriter out;
    
    /**
     * Creates a new duplexer that uses the specified socket to send and read
     * data.
     * 
     * @param socket The socket used to communicate with the other end of the
     * connection.
     * 
     * @throws IOException If there is a problem creating the duplexer with the
     * specified socket, e.g. the socket is closed.
     */
    public Duplexer (Socket socket)  throws IOException {
        this.socket = socket;
        InputStreamReader inputStreamReader = 
            new InputStreamReader(socket.getInputStream());
        in = new BufferedReader(inputStreamReader);
        out = new PrintWriter(socket.getOutputStream ());
    }

    /**
     * Returns the socket used by this duplexer.
     * 
     * @return The socket used by this duplexer.
     */
    public Socket getSocket() {
        return this.socket;
    }

    /**
     * Closes the socket and any other I/O resources.
     */
    public void close() {
        try {
            socket.close();
            out.close();
            in.close();
        } catch(IOException ioe) {}
    }

    /**
     * Sends a newline-terminated line of text to the other end of the 
     * connection.
     * 
     * @param message The message to send. A newline will be added to the end
     * of the message.
     */
    public void send(String message) {
        out.println(message);
        out.flush();
    }

    /**
     * Reads a line of text from the other end of the connection and returns 
     * it.
     * 
     * @return The next singe line of text read from the other end of the 
     * connection.
     */
    public String receive() {
        try {
            return in.readLine();
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Reads a line of text from the other end of the connection and returns 
     * it.
     * 
     * @return The next singe line of text read from the other end of the 
     * connection.
     */
    public String read() {
        return receive();
    }
}
