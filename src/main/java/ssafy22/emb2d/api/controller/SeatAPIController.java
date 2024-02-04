package ssafy22.emb2d.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import ssafy22.emb2d.api.dto.SeatDTO;
import ssafy22.emb2d.api.service.AuthenticateService;
import ssafy22.emb2d.api.service.SeatService;
import ssafy22.emb2d.api.vo.request.SeatRequest;
import ssafy22.emb2d.api.vo.response.SeatResponse;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class SeatAPIController {

  private final AuthenticateService authService;
  private final SeatService seatService;
  
  @GetMapping("/seat")
  public SeatResponse getSeat() {
    SeatDTO seatInfo = seatService.getSeatInfo();
    return new SeatResponse(seatInfo);
  }

  @PostMapping("/seat")
  public ResponseEntity<?> updateSeat(@RequestBody SeatRequest request) {
    String password = request.getPassword();
    SeatDTO seatInfo = request.toDTO();

    if (!authService.checkPassword(password))
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    
    seatService.updateSeat(seatInfo);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
