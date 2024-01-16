package ssafy22.emb2d.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssafy22.emb2d.SeatAllocator;

import java.util.ArrayList;
import java.util.List;

import static ssafy22.emb2d.Application.SEAT_FIXED;

@RestController
@RequestMapping("/seat")
@RequiredArgsConstructor
public class SeatController {

    private final SeatAllocator seatAllocator;

    @GetMapping("/now")
    public ResponseEntity<String> now() {
        seatAllocator.setSeat(SEAT_FIXED);
        return ResponseEntity.ok("성공");
    }

    @GetMapping("/random")
    public ResponseEntity<String> random() {
        seatAllocator.allRandom();
        return ResponseEntity.ok("성공");
    }

    @GetMapping("/leader")
    public ResponseEntity<String> leader() {
        seatAllocator.randomExcludingSeven();
        return ResponseEntity.ok("성공");
    }

    @PostMapping("/setting")
    public ResponseEntity<String> setting(@RequestBody List<String> selectedMembers) {
        System.out.println("Selected Members: " + selectedMembers);
        seatAllocator.setSevenMember(selectedMembers);
        return ResponseEntity.ok("성공");
    }

    @GetMapping("/confirm")
    public ResponseEntity<String> confirm() {
        SEAT_FIXED.clear();
        SEAT_FIXED.addAll(seatAllocator.getSeat());
        return ResponseEntity.ok("성공");
    }


}
