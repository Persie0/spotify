package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum lq6 implements od50 {
    UNKNOWN_ATTRIBUTE(0),
    DERIVATIVE(1),
    OWNED_BY_USER(2),
    MADE_FOR_USER(3),
    EXPLICIT_CONTENT(4),
    PAY_WALLED(5),
    GENERATIVE(6),
    GEN_SESSION_HINT_FREE(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f135964a;

    lq6(int i) {
        this.f135964a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f135964a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
