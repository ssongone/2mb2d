package ssafy22.emb2d.api.vo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ssafy22.emb2d.api.dto.TeamDTO.TeamInfo;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TeamDetailResponse {
  private TeamInfo team;
}
