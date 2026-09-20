package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum b051 implements od50 {
    STATS_AVAILABLE(0),
    STATS_EMPTY(1),
    STATS_EMPTY_CURRENT_PERIOD(2),
    STATS_DATA_PROCESSING(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f21776a;

    b051(int i) {
        this.f21776a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f21776a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
