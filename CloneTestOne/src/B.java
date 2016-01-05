
public class B implements Cloneable{
	public String bStr;

	@Override
	protected Object clone(){
		B b = null;
		try {
			b = (B) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	
}
