package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum dyd0 implements od50 {
    AUDIO(0),
    VIDEO(1),
    MEDIA_TYPE_UNKNOWN(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f54301a;

    dyd0(int i) {
        this.f54301a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f54301a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
