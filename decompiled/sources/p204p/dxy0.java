package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum dxy0 implements od50 {
    DEFAULT(0),
    ARTIST(1),
    SHOW(2),
    TRACK(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f54122a;

    dxy0(int i) {
        this.f54122a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f54122a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
