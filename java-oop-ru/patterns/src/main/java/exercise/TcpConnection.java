package exercise;
import java.util.List;
import java.util.ArrayList;

// BEGIN
import exercise.connections.Disconnected;
import exercise.connections.Connection;

public class TcpConnection {

    private String ip;
    private int port;
    private Connection state;
    private List<String> buffer = new ArrayList<>();

    TcpConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        this.state = new Disconnected(this);
    }

    public String getCurrentState() {
        return this.state.getName();
    }

    public void connect() {
        state.connect();
    }

    public void disconnect() {
        state.disconnect();
    }

    public void write(String data) {
        state.write(data);
    }

    public void setState(Connection stateObject) {
        state = stateObject;
    }

    public void addToBuffer(String data) {
        buffer.add(data);
    }
}
// END
