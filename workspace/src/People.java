
public class People implements Comparable<Object>{

	private String name;
	private int id;
	
	public People(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Object arg0) {
		if(this == arg0){
			return 0;
		}else if(arg0 != null && arg0 instanceof People ){
			//这个else if里面不一定有返回，所以最后要再返回一个
			People p = (People)arg0;
			if(id < p.id){
				return -1;
			}
		}else{
			return 1;
		}
		//为什么最后一定要再给个返回值
		return -1;
	}

}
