package ssafy22.emb2d.api.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamDTO {

  @Getter
  @Setter
  @AllArgsConstructor
  public static class TeamInfo {
    private LocalDate date;
    private List<String> users;
  }

  private LocalDate latestDate;
  private List<TeamInfo> teamList;
  public TeamDTO(Map<LocalDate, List<String>> teams) {
    List<LocalDate> keySet = new ArrayList<>(teams.keySet());
    Collections.sort(keySet);

    for (LocalDate key : keySet) {
      TeamInfo teamEntry = new TeamInfo(key, teams.get(key));
      teamList.add(teamEntry);
    }

    latestDate = teamList.get(teamList.size() - 1).getDate();
  }

  public List<LocalDate> getKeyList() {
    return teamList.stream().map(team -> team.getDate()).collect(Collectors.toList());
  }

  public TeamInfo getTeamInfo() {
    return teamList.stream().filter(team -> team.getDate().equals(latestDate)).findFirst().orElse(null);
  }
}