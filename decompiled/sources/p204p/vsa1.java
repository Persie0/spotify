package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum vsa1 implements od50 {
    UNSPECIFIED(0),
    NO_LISTENING_HISTORY(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f244397a;

    vsa1(int i) {
        this.f244397a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f244397a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
