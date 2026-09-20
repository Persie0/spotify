package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum cnw implements od50 {
    IMMEDIATELY(0),
    ADVANCED_PAST_TRACK(1),
    ADVANCED_PAST_CONTEXT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f40105a;

    cnw(int i) {
        this.f40105a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40105a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
