package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum qkv0 implements od50 {
    REDEMPTION_STATE_UNSPECIFIED(0),
    REDEMPTION_STATE_PENDING(1),
    REDEMPTION_STATE_SUCCESS(2),
    REDEMPTION_STATE_INVALID_CODE(3),
    REDEMPTION_STATE_REDEEMED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f189659a;

    qkv0(int i) {
        this.f189659a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f189659a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
