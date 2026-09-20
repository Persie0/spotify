package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum h67 implements od50 {
    MONO(0),
    STEREO(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f88021a;

    h67(int i) {
        this.f88021a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f88021a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
