import java.util.Scanner;
import java.net.Inet4Address;
import java.net.Socket;

public class Game {

	private Scanner sc = new Scanner(System.in);
	
	public Game() {
		
	}
	
	private void connectToServer(Scanner sc) {
		try {
			Socket sock = new Socket(getIP(sc), getPort(sc));
			Inet4Address addr = (Inet4Address) sock.getInetAddress();
			System.out.println("Connected to " + addr);
		}catch(Exception e) {
			System.out.println("Couldn't connect to server.");
			connectToServer(sc);
		}
		
	}
	
	private String getIP(Scanner sc) {
		System.out.print("Please enter the ip of the game server you wish to connect to: ");
		return sc.next();
	}
	
	private int getPort(Scanner sc) {
		System.out.print("Please enter a port you wish to use for your connection: ");
		try {
			return Integer.parseInt(sc.next());
		}catch(Exception e) {
			System.out.print("That was an invalid port #! ");
			return getPort(sc);
		}
	}
	
	public void startGame() {
		connectToServer(sc);
	}
}
