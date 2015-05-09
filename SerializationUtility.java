import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class SerializationUtility {

	private SerializationUtility() {
	// TODO Auto-generated constructor stub
	}
	
	public static Object deserialze(byte[] serializedForm){
		try{

			InputStream is=new ByteArrayInputStream(serializedForm);
			ObjectInputStream ois=new ObjectInputStream(is);
			return ois.readObject();
			
		}catch(Exception exp){
			throw new IllegalArgumentException(exp);
		}
		
	}
}
