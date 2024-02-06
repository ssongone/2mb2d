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
			"오정현", "이유단", "이지예", "이훈재", "장건수", "장윤석", "전다윤", "전보름", "전혜림",
			"주호성", "진홍엽", "최용현", "최유정", "하성표", "한영찬", "홍예원");

	public static List<String> SEAT_FIXED = new ArrayList<>(List.of(
			"장건수", "성열민", "송제강", "김준홍", "최유정", "진홍엽", "여종원", "이지예", "이유단", "전보름",
			"김송원", "하성표", "김인겸", "홍예원", "송민석", "박승헌", "최용현", "한영찬", "오정현",
			"변재혁", "전혜림", "전다윤", "장윤석", "문세진", "주호성", "이훈재"
	));

	final public static int MEMBERS_COUNT = MEMBERS.size();

	public static void main(String[] args) {
		TeamAllocator.init();
		SpringApplication.run(Application.class, args);
	}

}
