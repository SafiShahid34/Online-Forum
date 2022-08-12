package Model;
import java.io.Serializable;

public class Base implements Serializable {
	private int id;
	private String name;
	private String mess;
	
	public void setId(int d) {this.id = d;}
	
	public int getId() {return id;}
	
	public void setName(String n) {this.name = n;}
	
	public String getName() {return name;}
	
	public void setMess(String m) {this.mess = m;}
	
	public String getMess() {return mess;}
	

}
