package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum jr90 implements od50 {
    UNKNOWN(0),
    SCHEDULED(1),
    LIVE(2),
    ENDED(3),
    CANCELLED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f115119a;

    jr90(int i) {
        this.f115119a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f115119a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
