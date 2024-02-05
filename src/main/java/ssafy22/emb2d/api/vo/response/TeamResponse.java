package ssafy22.emb2d.api.vo.response;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ssafy22.emb2d.api.dto.TeamDTO;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TeamResponse {
  private List<LocalDate> dates;

  public TeamResponse(TeamDTO dto) {
    this.dates = dto.getKeyList();
  }
}
