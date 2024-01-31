package ssafy22.emb2d.api.vo.request;

import java.util.List;

import lombok.Data;
import ssafy22.emb2d.api.dto.SeatDTO;

@Data
public class SeatRequest {
  private List<String> users;
  private String password;

  public SeatDTO toDTO() {
    return SeatDTO.builder().users(users).build();
  }
}
