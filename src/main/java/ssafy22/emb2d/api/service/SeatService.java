package ssafy22.emb2d.api.service;

import static ssafy22.emb2d.Application.SEAT_FIXED;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ssafy22.emb2d.api.dto.SeatDTO;

@Service
@AllArgsConstructor
public class SeatService {
  public SeatDTO getSeatInfo() {
    List<String> seatInfo = SEAT_FIXED;
    return new SeatDTO(seatInfo);
  }

  public SeatDTO updateSeat(SeatDTO newSeatInfo) {
    throw new UnsupportedOperationException();
  }
}
