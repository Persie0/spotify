package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum ufy0 implements od50 {
    SCHEDULE_TYPE_UNSPECIFIED(0),
    SCHEDULE_TYPE_NONE(1),
    SCHEDULE_TYPE_DAILY(2),
    SCHEDULE_TYPE_WEEKLY(3),
    SCHEDULE_TYPE_MONTHLY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f229929a;

    ufy0(int i) {
        this.f229929a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f229929a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
