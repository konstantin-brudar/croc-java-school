package task_5_star;

import task_5_star.LogTimeType;

class TimeValue {
    private final long time;
    private final LogTimeType type;

    public TimeValue(long time, LogTimeType type) {
        this.time = time;
        this.type = type;
    }

    public long getTime() {
        return time;
    }

    public LogTimeType getType() {
        return type;
    }
}
