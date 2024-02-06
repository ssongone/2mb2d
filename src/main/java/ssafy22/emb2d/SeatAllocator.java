package ssafy22.emb2d;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

import static ssafy22.emb2d.Application.*;

@Component
public class SeatAllocator {

    private final int LEADER_COUNT = 7;
    private final int[] LEADER_SEAT = {3,7,11,15,17,23,26};

    private List<String> seat;
    private Set<String> seven;

    @Autowired
    public SeatAllocator() {
        seat = new ArrayList<>();
        for (int i = 0; i < MEMBERS_COUNT; i++) {
            seat.add(SEAT_FIXED.get(i));
        }
        seven = new HashSet<>(Set.of("김인겸", "김준홍", "문세진", "박승헌", "변재혁", "성열민", "송민석"));
    }

    public List<String> getSeat() {
        return seat;
    }

    public void setSeat(List<String> seat) {
        this.seat.clear();
        this.seat.addAll(seat);
    }

    public void setSevenMember(List<String> list) {
        seven = new HashSet<>(list);
    }


    public void randomExcludingSeven() {
        Collections.shuffle(seat);

        List<Integer> leaderIdxList = new ArrayList<>(LEADER_COUNT);
        for (int i = 0 ; i < MEMBERS_COUNT ; i++) {
            if (seven.contains(seat.get(i))) {
                leaderIdxList.add(i);
            }
        }

        List<String> result = new ArrayList<>(MEMBERS_COUNT);
        int listIdx = 0;
        int leaderSeatIdx = 0;
        int normalIdx = 0;
        for (int i = 0 ; i < MEMBERS_COUNT ; i++) {
            if (leaderSeatIdx < LEADER_COUNT && i == LEADER_SEAT[leaderSeatIdx]-1) { // 리더자리일 경우
                result.add(seat.get(leaderIdxList.get(listIdx)));
                listIdx++;
                leaderSeatIdx++;
            } else { // 리더자리가 아닐경우
                while (seven.contains(seat.get(normalIdx))) {
                    normalIdx++;
                }
                result.add(seat.get(normalIdx++));
            }

        }
        seat = result;
        printSeats();
    }

    public void allRandom() {
        Collections.shuffle(seat);
    }



    public void printSeats() {
        for (int i = 0 ; i < MEMBERS_COUNT ; i++) {
            System.out.println(i+1 + ": " + seat.get(i));
        }
    }
}
