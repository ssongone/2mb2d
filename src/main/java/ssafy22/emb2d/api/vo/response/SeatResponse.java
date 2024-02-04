package ssafy22.emb2d.api.vo.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ssafy22.emb2d.api.dto.SeatDTO;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SeatResponse {
  private List<String> users;

  public SeatResponse(SeatDTO dto) {
    this.users = dto.getUsers();
  }
}
