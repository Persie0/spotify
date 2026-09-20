package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum xu11 implements od50 {
    UNSET(0),
    SHOWCASE_DEFAULT(1),
    SHOWCASE_VIDEO(2),
    SHOWCASE_PRERELEASE(3),
    SHOWCASE_MUSIC_VIDEO(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f265982a;

    xu11(int i) {
        this.f265982a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f265982a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
