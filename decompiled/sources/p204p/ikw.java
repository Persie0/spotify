package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum ikw implements od50 {
    VIDEO(0),
    AUDIO(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f103219a;

    ikw(int i) {
        this.f103219a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f103219a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
