package practicum.madlibs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class MadLibsServer {
    private ServerSocket serverSocket;
    private Duplexer duplexer;
    private String filename;
    private Scanner in;
    private PrintWriter out;
    

    public MadLibsServer(int port) throws IOException{
        this.serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        this.duplexer = new Duplexer(socket);
        in = new Scanner(socket.getInputStream());
        out = new PrintWriter(socket.getOutputStream());
        createStory();
    }

    public void createStory() throws IOException{
        Random rand = new Random();
        int i = rand.nextInt(0,4);
        filename = MadLibsUtil.STORY_FIELS[i];
        File file = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        String tokens[] = line.split(" ");
        for(String token : tokens){
            for(String value : MadLibsUtil.PLACEHOLDERS.keySet()){
                if(value == token){
                    out.println(value);
                    out.flush();
                    token = in.nextLine();

                }else{
                    token = token  + " ";
                }
            }
        }
        duplexer.send("Done");
        duplexer.send(tokens.toString());
        duplexer.close();
        reader.close();
        serverSocket.close();
    }


    public static void main(String[] args){
        try{
        MadLibsServer madLibsServer = new MadLibsServer(54321);
        }catch(IOException ioe){};
    }
}
