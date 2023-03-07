package org.example;



import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

//This is my Java server class that starts the Javalin server on port 5000
//to the console when it is started.
//The code starts the server on port 5000.

public class MyServer {

    private static final String PAGES_PATH = "/path";

    private final Javalin server1;


    //We create a server called "MyServer" and assign it the configuration object.
    //The config object is then used to add static files to the classpath, which are located in the directory "PAGES_PATH".
    //We create a server instance with the name "MyServer" and listen on port 8080

    public MyServer() {
        server1 = Javalin.create(config -> config.addStaticFiles(PAGES_PATH, Location.CLASSPATH));
    }

    public static void main(String[] args) {
        MyServer server = new MyServer();
        server.start();


    }

    private void start() {
        server1.start(5000);
    }

    private void stop(){
        server1.stop();
    }

    public int port(){
        return server1.port();
    }

}