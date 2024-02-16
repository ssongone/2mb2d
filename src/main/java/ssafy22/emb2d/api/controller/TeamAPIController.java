package ssafy22.emb2d.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import ssafy22.emb2d.api.dto.TeamDTO;
import ssafy22.emb2d.api.service.TeamService;
import ssafy22.emb2d.api.vo.request.TeamRequest;
import ssafy22.emb2d.api.vo.response.TeamDetailResponse;
import ssafy22.emb2d.api.vo.response.TeamResponse;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class TeamAPIController {
  private final TeamService teamService;
  
  @GetMapping("/team")
  public TeamResponse getTeamList() {
    TeamDTO teamInfo = teamService.getTeamInfo();
    return new TeamResponse(teamInfo);
  }

  @GetMapping("/team/{date}")
  public TeamDetailResponse getTeam(TeamRequest request) {
    TeamDTO teamInfo = teamService.getTeamInfo();
    teamInfo.setLatestDate(request.getDate());
    return new TeamDetailResponse(teamInfo.getTeamInfo());
  }
}
