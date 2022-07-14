package pattern.behavioral.mediator.after;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    // Guest에 대한 의존성이 사라짐, 필수 정보만을 받음
    public void getTowers(Integer guestId, int numberOfTowers) {
        String roomNumber = this.frontDesk.getRoomNumber(guestId);
        System.out.println("provide " + numberOfTowers + " to" + roomNumber);
    }
}
