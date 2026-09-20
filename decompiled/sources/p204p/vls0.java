package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum vls0 implements od50 {
    MUSIC_DISCOVERY(0),
    PODCAST_DISCOVERY(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f242592a;

    vls0(int i) {
        this.f242592a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f242592a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
