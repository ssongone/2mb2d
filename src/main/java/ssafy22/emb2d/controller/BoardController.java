package ssafy22.emb2d.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ssafy22.emb2d.SeatAllocator;

import static ssafy22.emb2d.Application.SEAT_FIXED;

@RequiredArgsConstructor
@Controller
public class BoardController {
    private final SeatAllocator seatAllocator;

    @GetMapping("/seat")
    public String seatingChart(Model model) {
        model.addAttribute("seatFixed", seatAllocator.getSeat());
        return "seat";
    }

    @GetMapping("/lunch")
    public String randomTable() {
        return "lunch";
    }

}
