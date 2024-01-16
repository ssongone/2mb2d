package ssafy22.emb2d.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssafy22.emb2d.TeamAllocator;

import static ssafy22.emb2d.TeamAllocator.teams;

@RestController
@RequestMapping("/lunch")
public class LunchController {

    @GetMapping("/make")
    public ResponseEntity<String> makeTeam() {
        TeamAllocator.makeTeam();
        return ResponseEntity.ok("성공");
    }

    @GetMapping("/delete")
    public ResponseEntity<String> deleteTeam() {
        teams.entrySet().stream().skip(teams.size() - 1).findFirst()
                .ifPresent(entry -> teams.remove(entry.getKey()));
        return ResponseEntity.ok("성공");
    }
}
