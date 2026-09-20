package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum e3o0 implements od50 {
    UNKNOWN(0),
    PINNED(1),
    NOT_PINNED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f55839a;

    e3o0(int i) {
        this.f55839a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f55839a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
