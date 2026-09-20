package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum lwo0 implements od50 {
    PLAYBACK_CONTROL_UNSPECIFIED(0),
    PLAYBACK_CONTROL_CHAPTER_SKIP(1),
    PLAYBACK_CONTROL_DEFAULT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f137613a;

    lwo0(int i) {
        this.f137613a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f137613a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
