package exercise.connections;

public interface Connection {
    // BEGIN
    void connect();
    void disconnect();
    void write(String data);
    String getName();
    // END
}
