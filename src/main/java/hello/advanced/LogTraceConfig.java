package hello.advanced;

import hello.advanced.trace.logtrace.FieldLogTrace;
import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() { //인터페이스 타입(역할)
        //구현체 바꿔치기 가능~
//        return new FieldLogTrace(); //싱글톤으로 Bean 등록됨
        return new ThreadLocalLogTrace(); //쓰레드로컬 적용된 Bean으로 주입되도록
    }

}
