package models;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seat {
	private int seatnumber;
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	private int position;
	
BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	
	public Seat() throws IOException {
		System.out.println("ÁÂ¼®¹øÈ£");
		seatnumber=in.read();
		System.out.println("ÁÂ¼®À§Ä¡");
		position=in.read();
	
	}
}
