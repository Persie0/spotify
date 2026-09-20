package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum q300 implements od50 {
    FORMAT_UNSPECIFIED(0),
    FORMAT_AUDIO(1),
    FORMAT_VIDEO(2),
    FORMAT_PARROT(3),
    FORMAT_LOSSLESS(4),
    FORMAT_GENERATED(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f184769a;

    q300(int i) {
        this.f184769a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f184769a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
