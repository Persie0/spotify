package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum m87 implements od50 {
    UNKNOWN(0),
    PRERELEASE(1),
    LIVE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f140936a;

    m87(int i) {
        this.f140936a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f140936a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
