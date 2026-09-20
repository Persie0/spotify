package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum dr51 implements od50 {
    OK(0),
    INVALID_SLOT(1),
    INVALID_FORMAT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f52176a;

    dr51(int i) {
        this.f52176a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f52176a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
