package ssafy22.emb2d;

import java.time.LocalDate;
import java.util.*;

import static ssafy22.emb2d.Application.MEMBERS;


public class TeamAllocator {
    public static Map<LocalDate, List<String>> teams = new LinkedHashMap<>();

    public static void init() {
        List<String> team1 = new ArrayList<>(Arrays.asList(
                "여종원", "한영찬", "김준홍", "이훈재", "송제강", "주호성", "김인겸",
                "이지예", "전다윤", "변재혁", "정윤호", "홍예원", "장건수", "김송원",
                "성열민", "최유정", "박승헌", "최용현", "송민석", "전혜림", "하성표",
                "문세진"
        ));

        List<String> team2 = new ArrayList<>(Arrays.asList(
                "문세진", "이지예", "여종원", "전혜림", "박승헌", "최용현", "송제강",
                "최유정", "전보름", "이훈재", "이유단", "변재혁", "정윤호", "전다윤",
                "김인겸", "김송원", "장윤석", "송민석", "오정현", "하성표", "진홍엽",
                "김준홍", "홍예원", "장건수", "한영찬", "주호성", "성열민"
        ));

        List<String> team3 = new ArrayList<>(Arrays.asList(
                "송민석", "장건수", "김송원", "최용현", "전다윤", "이유단", "진홍엽",
                "여종원", "전혜림", "김준홍", "변재혁", "성열민", "주호성", "송제강",
                "최유정", "오정현", "문세진", "김인겸", "한영찬", "홍예원", "장윤석",
                "전보름", "하성표", "박승헌", "정윤호", "이지예", "이훈재"
        ));

        List<String> team4 = new ArrayList<>(Arrays.asList(
                "주호성", "하성표", "변재혁", "송민석", "한영찬", "여종원", "장건수",
                "장윤석", "홍예원", "송제강", "성열민", "박승헌", "이지예", "문세진",
                "김인겸", "전보름", "전혜림", "오정현", "최유정", "이훈재", "최용현",
                "전다윤", "진홍엽", "김준홍", "김송원", "이유단"
        ));

        teams.put(LocalDate.of(2024, 1, 16), team1);
        teams.put(LocalDate.of(2024, 1, 23), team2);
        teams.put(LocalDate.of(2024, 1, 31), team3);
        teams.put(LocalDate.of(2024, 2, 7), team4);

    }
    public static List<String> makeTeam() {
        List<String> team = new ArrayList<>(26);
        team.addAll(MEMBERS);
        Collections.shuffle(team);
        teams.put(LocalDate.now() ,team);
        return team;
    }

}
