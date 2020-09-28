import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_yeongbin {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DB db= new DB();
		while(true) {
			System.out.println("1.회원가입 2.좌석 입력 3.회원입력정보 확인0.종료");
			int s=Integer.parseInt(in.readLine());
			if(s==1) {
				db.insert(new Ex());
				
				
		}
			if(s==2) {
				db.insert2(new SEAT());
			}
			if(s==3) {
				db.select_EX();
			}
		
	}

}
}
