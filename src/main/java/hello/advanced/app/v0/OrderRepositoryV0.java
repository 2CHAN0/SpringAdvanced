package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {

    public void save(String itemId) throws IllegalAccessException {
        if (itemId.equals("ex")) {
            throw new IllegalAccessException("예외 발생!");
        }
        sleep(1000);
    }

    private void sleep(int milleSec) {
        try {
            Thread.sleep(milleSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
