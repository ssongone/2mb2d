package ssafy22.emb2d.api.vo.request;

import java.time.LocalDate;

import lombok.Data;
import ssafy22.emb2d.api.dto.TeamDTO;

@Data
public class TeamRequest {
  private LocalDate date;

  public TeamDTO toDTO() {
    return TeamDTO.builder().latestDate(date).build();
  }
}
