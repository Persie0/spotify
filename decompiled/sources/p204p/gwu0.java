package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum gwu0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_REASON_END(0),
    REASON_END_END_READ(1),
    /* JADX INFO: Fake field, exist only in values array */
    REASON_END_PAGE_TURN(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f85106a;

    gwu0(int i) {
        this.f85106a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f85106a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
