import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_yeongbin {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DB db= new DB();
		while(true) {
			System.out.println("1.ȸ������ 2.�¼� �Է� 3.ȸ���Է����� Ȯ��0.����");
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
