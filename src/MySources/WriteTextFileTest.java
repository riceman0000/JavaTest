package MySources;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteTextFileTest {
	public static void main(String[] args) {
		var list = new ArrayList<String>(Arrays.asList(
				"新しい文字列を挿入！！",
				"aaaaを召喚！！",
				"ターンエンド！！",
				"俺の勝ちだっ！！！！",
				LocalDateTime.now().toString()//いつ実行されたものが保存されているかの確認用タイムスタンプ
				));

        //出力ストリーム
		try{
			Files.write(Paths.get("C:\\pleiades\\test\\sample2.txt"),
					list,
					StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//(出力されたテキストファイルを、コンソールで即座に確認するための)入力ストリーム
		try( BufferedReader reader = Files.newBufferedReader(
			    Paths.get("C:\\pleiades\\test\\sample2.txt"))){
	       	 var line = "";
	       	 while((line = reader.readLine()) != null) {
	       	   System.out.println(line);
	       	 }
	        }catch(IOException e){
		     e.printStackTrace();
	        }
	}
}
