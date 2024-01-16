package ssafy22.emb2d;

import java.time.LocalDate;
import java.util.*;

import static ssafy22.emb2d.Application.MEMBERS;


public class TeamAllocator {
    public static Map<LocalDate, List<String>> teams = new LinkedHashMap<>();

    public static List<String> makeTeam() {
        List<String> team = new ArrayList<>(27);
        team.addAll(MEMBERS);
        Collections.shuffle(team);
        teams.put(LocalDate.now() ,team);
        return team;
    }

}
