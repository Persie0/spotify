package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum nv0 implements od50 {
    AVAILABLE(0),
    PLAY(1),
    DISCARD(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f158751a;

    nv0(int i) {
        this.f158751a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f158751a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
