package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum nw8 implements od50 {
    UNDEFINED_BANNER(0),
    ALL_CAUGHT_UP(1),
    NEW_MUSIC_FRIDAY_CAUGHT_UP_BANNER(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f159046a;

    nw8(int i) {
        this.f159046a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f159046a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
