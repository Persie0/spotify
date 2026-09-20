package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum wu11 implements od50 {
    UNSET(0),
    SHOWCASE_DEFAULT(1),
    SHOWCASE_VIDEO(2),
    SHOWCASE_PRERELEASE(3),
    SHOWCASE_MUSIC_VIDEO(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f255060a;

    wu11(int i) {
        this.f255060a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f255060a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
