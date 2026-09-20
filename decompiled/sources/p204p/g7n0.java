package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum g7n0 implements od50 {
    UNKNOWN_PARTY_STATUS(0),
    SCHEDULED(1),
    UPCOMING(2),
    READY(3),
    LIVE(4),
    CLOSED(5),
    ARCHIVED(6),
    SCRAPPED(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f77312a;

    g7n0(int i) {
        this.f77312a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f77312a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
