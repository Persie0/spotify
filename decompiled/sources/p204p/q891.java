package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum q891 implements od50 {
    TRANSITION_MODE_UNSPECIFIED(0),
    TRANSITION_MODE_INSTANT(1),
    TRANSITION_MODE_SEAMLESS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f186269a;

    q891(int i) {
        this.f186269a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f186269a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
