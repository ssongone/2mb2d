package ssafy22.emb2d.api.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ssafy22.emb2d.TeamAllocator;
import ssafy22.emb2d.api.dto.TeamDTO;

@Service
@AllArgsConstructor
public class TeamService {
  public TeamDTO getTeamInfo() {
    Map<LocalDate, List<String>> teams = TeamAllocator.teams;
    return new TeamDTO(teams);
  }

  public TeamDTO updateTeam(TeamDTO newTeamInfo) {
    throw new UnsupportedOperationException();
  }
}
