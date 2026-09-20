package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum dj90 implements od50 {
    UNKNOWN_LISTENING_PARTY_RESTRICTION(0),
    NO_RESTRICTION(1),
    NON_PREMIUM(2),
    GEO_BLOCKED(3),
    AGE_GATED(4),
    NOT_REGISTERED(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f49624a;

    dj90(int i) {
        this.f49624a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f49624a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
