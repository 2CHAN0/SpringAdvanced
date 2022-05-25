package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {
    public void execute() {
        long startTime = System.currentTimeMillis();    //부가기능
        //비즈니스 로직 실행
        call();                                         //상속(변하는 부분은 자식클래스에서)
        //비즈니스 로직 종료
        long endTime = System.currentTimeMillis();      //부가기능
        log.info("resultTime={}", endTime - startTime); //부가기능
    }

    protected abstract void call();

}
