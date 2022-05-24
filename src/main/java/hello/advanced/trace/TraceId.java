package hello.advanced.trace;

import java.util.UUID;

public class TraceId {
    private String id; //트랜잭션 아이디
    private int level; //호출 depth 레벨

    //생성자
    public TraceId() {
        this.id = createId();
        this.level = 0;
    }

    private TraceId(String id, int level) {
        this.id = id;
        this.level = level;

    }
    //UUID 일부만 짤라서 사용
    public String createId() {
        return UUID.randomUUID().toString().substring(0,8);
    }

    public TraceId createNextId() {
        return new TraceId(id, level+1);
    }

    public TraceId createPreviousId(){
        return new TraceId(id, level-1);
    }

    public boolean isFirstLevel() {
        return level == 0;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }
}
