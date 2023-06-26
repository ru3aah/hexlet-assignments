package exercise.connections;

// BEGIN
import exercise.TcpConnection;

public class Disconnected implements Connection {
    private TcpConnection connection;

    public Disconnected(TcpConnection connection) {
        this.connection = connection;
    }

    public void connect() {
        connection.setState(new Connected(connection));
    }

    public void disconnect() {
        System.out.println("Error! Connection already disconnected");
    }

    public void write(String data) {
        System.out.println("Error! It is not posible write to closed connection");
    }

    public String getName() {
        return "disconnected";
    }
}
// END
