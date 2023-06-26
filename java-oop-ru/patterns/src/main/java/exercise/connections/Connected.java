package exercise.connections;

// BEGIN
import exercise.TcpConnection;

public class Connected implements Connection {
    private TcpConnection connection;

    Connected(TcpConnection connection) {
        this.connection = connection;
    }

    public void connect() {
        System.out.println("Error! Connection has established already");
    }

    public void disconnect() {
        connection.setState(new Disconnected(connection));
    }

    public void write(String data) {
        connection.addToBuffer(data);
    }

    public String getName() {
        return "connected";
    }
}
// END
