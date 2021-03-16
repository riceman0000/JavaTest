package MySources;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextFileTest {
	public static void main(String[] args) {
		//入力ストリーム(お守りtry君)
        try( BufferedReader reader = Files.newBufferedReader(
		    Paths.get("C:\\pleiades\\test\\sample.txt"))){
       	 var line = "";
       	 //sample.txt内の文字列をコンソールに出力する
       	 while((line = reader.readLine()) != null){
       	   System.out.println(line);
       	 }
        }catch(IOException e){
	     e.printStackTrace();
        }
    }
}
