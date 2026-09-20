package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum tkw implements od50 {
    OK(0),
    FAILED(1),
    SUNSET(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f221234a;

    tkw(int i) {
        this.f221234a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f221234a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
