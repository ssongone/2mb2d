package ssafy22.emb2d;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

	final public static List<String> MEMBERS = Arrays.asList(
			"김송원", "김인겸", "김준홍", "문세진", "박승헌", "변재혁", "성열민", "송민석", "송제강", "여종원",
			"오정현", "이유단", "이지예", "이훈재", "장건수", "장윤석", "전다윤", "전보름", "전혜림", "정윤호",
			"주호성", "진홍엽", "최용현", "최유정", "하성표", "한영찬", "홍예원");

	public static List<String> SEAT_FIXED = new ArrayList<>(List.of(
			"김송원", "김인겸", "김준홍", "문세진", "박승헌", "변재혁", "성열민", "송민석", "송제강", "여종원",
			"오정현", "이유단", "이지예", "이훈재", "장건수", "장윤석", "전다윤", "전보름", "전혜림", "정윤호",
			"주호성", "진홍엽", "최용현", "최유정", "하성표", "한영찬", "홍예원"));
	final public static int MEMBERS_COUNT = MEMBERS.size();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
