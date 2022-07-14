package pattern.behavioral.mediator.after;

import java.time.LocalDateTime;

public class Guest {

    private FrontDesk frontDesk = new FrontDesk();

    private Integer id;

    public Integer getId() {
        return id;
    }

    private void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }

    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }
}
