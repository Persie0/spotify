package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum dzv implements od50 {
    ENTRY_STATE_UNSPECIFIED(0),
    ENTRY_STATE_UPCOMING(1),
    ENTRY_STATE_ACTIVE(2),
    ENTRY_STATE_ENDED(3),
    ENTRY_STATE_SOLD_OUT(4),
    ENTRY_STATE_CANCELLED(5),
    ENTRY_STATE_PURCHASED(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f54756a;

    dzv(int i) {
        this.f54756a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f54756a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
