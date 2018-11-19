package j.j2020;

import java.io.FileReader;
import java.io.Reader;

public class Java2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Reader fileReader = new FileReader("/Users/janak.soni/work/wf/qaf-blank-project-maven/src/test/java/j/j2020/input-text.txt");
			int data =  fileReader.read();
			while(data != -1) {
				System.out.println(data);
				data = fileReader.read();
			}
			fileReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
