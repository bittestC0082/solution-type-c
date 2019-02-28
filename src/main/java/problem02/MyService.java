package problem02;

public class MyService extends BaseService {
	public void service(String state) {
		String result = "";
		if (state.equals("낮")) 
			result = day();
		if (state.equals("밤")) 
			result = night();
		if (state.equals("오후")) 
			result = afternoon();
			
		System.out.println(result);
	}
	
	public String afternoon() {
		return "오후서비스시작";
	}
	
	public String day() {
		return "낮서비스 시작";
	}

	public String night() {
		return "밤서비스시작";
	}
}
